package com.eduard.CourseWork.CW.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DCM")
public class MainController {
    @GetMapping("/MainPage")
    public String getMainPage(){
        return "main";
    }
}
