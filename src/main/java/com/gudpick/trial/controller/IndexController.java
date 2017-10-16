/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudpick.trial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Indu
 */
@Controller
public class IndexController {
    @RequestMapping({"","/","/index"})
    public String getPage()
    {
        return "index";
    }
}
