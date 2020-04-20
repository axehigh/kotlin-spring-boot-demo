package com.axehigh.kotlin.springbootdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringBootDemoApplication>(*args)
}
