package com.baeldung.springbootsimple;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.*;

@RestController
public class TomcatController {

    @GetMapping(value = "/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10)
                .mapToObj(i -> "Hello number " + i)
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/newFeature")
    public Collection<String> newFeature() {
        return IntStream.range(0, 15)
                .mapToObj(i -> "New Feature: " + i)
                .collect(Collectors.toList());
    }

}
