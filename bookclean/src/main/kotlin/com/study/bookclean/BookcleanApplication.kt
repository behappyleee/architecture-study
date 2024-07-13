package com.study.bookclean

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookcleanApplication

fun main(args: Array<String>) {
    runApplication<BookcleanApplication>(*args)
}
