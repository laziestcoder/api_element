package com.towfiq.api_element.restcontroller;

import org.springframework.web.bind.annotation.*;

/**
 * @author TOWFIQUL ISLAM
 * @since 10/07/2021 23:54
 */

@RestController
@RequestMapping("api")
public class WebElementRestController {


    @RequestMapping(method = RequestMethod.GET, value = "/button")
    @ResponseBody
    public String getButton(){
        return "This is a button";
    }

}
