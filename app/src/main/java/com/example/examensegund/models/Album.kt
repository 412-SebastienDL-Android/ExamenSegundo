package com.example.examensegund.models

import java.io.Serializable

data class Album(
    val id: Int,
    val title: String,
    val artist: String,
    val image: String,
    val description: String
) : Serializable