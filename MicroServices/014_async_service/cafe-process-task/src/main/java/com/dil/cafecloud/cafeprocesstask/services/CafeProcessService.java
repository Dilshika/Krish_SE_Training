package com.dil.cafecloud.cafeprocesstask.services;

import org.springframework.stereotype.Service;

@Service
public interface CafeProcessService {
    boolean validatePhNumber(String phNumber);
}
