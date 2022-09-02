package com.example.recyclerviewdemoproject.model

import com.example.recyclerviewdemoproject.R

class DataDogClass {

    fun allDogs(): List<Dog>{
        val list_of_dogs = listOf<Dog>(
            Dog(
                "Bella",
                "8",
                R.drawable.bella
            ),
            Dog(
                "Faye",
                "12",
                R.drawable.faye
            ),
            Dog(
                "Frankie",
                "4",
                R.drawable.frankie
            ),
            Dog(
                "Leroy",
                "8",
                R.drawable.leroy
            ),
            Dog(
                "Nox",
                "7",
                R.drawable.nox
            ),
            Dog(
                "Tzeitel",
                "2",
                R.drawable.tzeitel
            ),
        )
        return list_of_dogs
    }
}