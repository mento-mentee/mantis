package com.mentos.mantis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MantisApplication

fun main(args: Array<String>) {
    runApplication<MantisApplication>(*args)
}
