package com.example.healthtrack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthtrack")
public class HealthTrackController {
    @GetMapping("/ping")
    public String ping() {
        return "HealthTrack endpoint is up!";
    }
}
