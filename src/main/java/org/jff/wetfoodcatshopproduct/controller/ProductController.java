package org.jff.wetfoodcatshopproduct.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {

    @GetMapping("/")
    public String get() {
        log.info("Get request made");
        return "Product info stub";
    }
}
