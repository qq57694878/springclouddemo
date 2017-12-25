package com.ljl.sericefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private IHiService iHiService;
    @RequestMapping("/hi")
    public String hi(@RequestParam("name")String name){
        return iHiService.hi(name);
    }
}
