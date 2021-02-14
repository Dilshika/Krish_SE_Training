//way to do circuit breaking still not good practice as every single
//service has to be creates as follows

package com.dil.cafecloud.orderservice.hystrix;

import com.dil.cafecloud.model.coffee.Coffee;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

public class CoffeeCommand extends HystrixCommand<Coffee> {



    RestTemplate restTemplate;
    int drinkId;

    public CoffeeCommand(RestTemplate restTemplate,int drinkId){

        super(HystrixCommandGroupKey.Factory.asKey("default"));
        this.drinkId=drinkId;
        this.restTemplate=restTemplate;
    }

    @Override
    protected Coffee run() throws Exception {
        return restTemplate.getForObject("http://coffee/services/coffees/" + drinkId, Coffee.class);
    }

    @Override
    protected Coffee getFallback() {
        System.out.println("hit on fall back");
        return new Coffee();
    }
}
