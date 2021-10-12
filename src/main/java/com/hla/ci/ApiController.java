package com.hla.ci;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api")
@RestController
@Component
public class ApiController {

    @GetMapping("uuid")
    public String uuid() {
        return UUID.randomUUID().toString();
    }
}
