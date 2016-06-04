package com.dreamonly.controller;

import com.dreamonly.db.model.City;
import com.dreamonly.service.itf.ICityService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CityController {
    private static Logger logger = Logger.getLogger(CityController.class);
    @Resource
    private ICityService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        logger.info("IN user ID: " + userId);
        City user = this.userService.getCityById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping("/hello")
    public String printHello(HttpServletRequest request, Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework");
        return "hello";
    }

}
