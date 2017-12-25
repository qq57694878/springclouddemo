package com.ljl.sericefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = HiServiceImplFail.class)
public interface IHiService {
    @RequestMapping(value = "/hi")
    String hi(@RequestParam(value = "name") String name);
}
