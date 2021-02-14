package com.dil.cafecloud.cafeprocesstask.services;

import com.dil.cafecloud.cafeprocesstask.CafeProcessTaskRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CafeProcessServiceImpl implements CafeProcessService{


    public boolean validatePhNumber(String phNumber){
        return phNumber.length()==10;
    }

}
