package com.example.testdokploy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class Controller {

    @GetMapping("/greeting")
    fun greeting() : String{
        return "Hello, World!"
    }
}