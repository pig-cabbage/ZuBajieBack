package com.zubajie.web;

import com.zubajie.entity.Collect;
import com.zubajie.service.AddCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/addcollect")
public class AddCollectController {
    @Autowired
    private AddCollectService addCollectService;

    @RequestMapping(value = "/addcollect",method = RequestMethod.POST)
    public Map<String,Object> addCollect(@RequestBody Collect collect){
        Map<String,Object>res=new HashMap<String, Object>();
        if(addCollectService.addCollect(collect))
            res.put("success",1);
        else
            res.put("success",0);
        return res;

    }
}
