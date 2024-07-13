package com.study.bookclean.bukpal.domain

import java.time.LocalDateTime


data class Money(private val name: String)

data class Activity(private val id: Int, private val targetId: Int, private val dateTime: LocalDateTime)



class Account(
    private val id,
    private val baselineBalance: String,
    private val activityWindow,
) {

    fun calculateBalance() {
        r
    }

}