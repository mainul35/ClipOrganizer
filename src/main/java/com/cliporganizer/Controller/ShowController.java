package com.cliporganizer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/show")
public class ShowController {

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createShow(Model model){
        return "shows/create-show";
    }
}
