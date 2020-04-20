package com.axehigh.kotlin.springbootdemo

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/demo/")
    fun demo(model: Model): String {
        return "Hello World"
    }
}