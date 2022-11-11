package com.sparta.mg.rest2web.controller;

import com.sparta.mg.rest2web.model.ActivityDTO;
import com.sparta.mg.rest2web.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActivityController {
    ActivityService service; //should not be private

    @Autowired
    public ActivityController(ActivityService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getActivity(Model model) {
        ActivityDTO dto = service.getActivityDTO();
        model.addAttribute("activity", dto);
        return "activity";
    }
}
