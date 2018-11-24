package com.app.SandboxOne.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        log.info((Integer.toString((int)request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE))));
        return "error";
    }

    @Override
    public String getErrorPath() {


        return "/error";
    }
}
