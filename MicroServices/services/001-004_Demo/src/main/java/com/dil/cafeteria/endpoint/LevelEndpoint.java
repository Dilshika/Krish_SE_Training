/**This is a demonstrator of a creation of custom end point
 * */
package com.dil.cafeteria.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id="level")
public class LevelEndpoint {


    Map<String,Level> levelMap=new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Level> getAllLevels(){
        return levelMap;
    }

    @ReadOperation
    public Level getLevel(@Selector String levelName){
        return levelMap.get(levelName);
    }

    @WriteOperation
    public void setValue(@Selector String levelName,Level level){
        levelMap.put(levelName,level);
    }


    static class Level{
        String value;

        public Level(String value){this.value=value;}

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
