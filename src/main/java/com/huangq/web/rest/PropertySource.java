package com.huangq.web.rest;

import com.huangq.config.properties.HQProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hq on 17/10/23.
 */
@RestController
public class PropertySource {

    @Autowired
    private HQProperties hqProperties;

    @RequestMapping(value = "/indexProperty", method = RequestMethod.GET)
    @ResponseBody
    public HQProperties getProperty() {
        return hqProperties;
    }
}
