package com.example.recyclerviewdemoproject.model

import androidx.annotation.DrawableRes

data class Dog(
    val name: String,
    val age: String,
    @DrawableRes val imageResourceId: Int
){}
