package com.zubajie.web;

import com.zubajie.service.DisplayOrderByUserIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/displayorderbyuserid")
public class DisplayOrderByUserIdController {
    @Autowired
    private DisplayOrderByUserIdService displayOrderByUserIdService;

    @RequestMapping(value = "/displayorderbyuserid" ,method = RequestMethod.GET)
    public Map<String,Object> displayOrderByUserId(@RequestParam Integer userId){
        Map<String,Object> res=new HashMap<String, Object>();
        res.put("resultList",displayOrderByUserIdService.displayOrderByUserId(userId));
        return res;
    }
}
