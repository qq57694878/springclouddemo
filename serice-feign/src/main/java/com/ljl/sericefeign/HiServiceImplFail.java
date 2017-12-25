package com.ljl.sericefeign;

import org.springframework.stereotype.Service;

@Service
public class HiServiceImplFail implements IHiService{

    @Override
    public String hi(String name) {
        return "sorry "+name;
    }
}
