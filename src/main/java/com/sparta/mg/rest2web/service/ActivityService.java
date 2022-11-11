package com.sparta.mg.rest2web.service;

import com.sparta.mg.rest2web.model.ActivityDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ActivityService {

    private final RestTemplate template = new RestTemplate();

    public ActivityDTO getActivityDTO() {
        ActivityDTO dto = template.getForObject("https://www.boredapi.com/api/activity/", ActivityDTO.class);
        return dto;
    }
}
