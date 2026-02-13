package com.candidate.chedly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/candidats")
public class candidatREstAPi {
    
    private String title="hello world";

    @GetMapping
    public String getHello(@RequestParam String param) {
        return this.title;
    }
    
    @GetMapping("/database")
    public String getDatabaseName() {
        return "";
    }
}
