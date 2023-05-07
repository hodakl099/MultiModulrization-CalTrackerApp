package com.example.tracker_domain.model

import java.util.*

sealed class MealType(val type : String) {
    object Breakfast : MealType("breakfast")
    object Lunch : MealType("lunch")
    object Dinner : MealType("dinner")
    object Snack : MealType("snack")

    companion object {
        fun fromString(name: String): MealType {
            return when (name.lowercase(Locale.ROOT)) {
                "breakfast" -> Breakfast
                "lunch" -> Lunch
                "dinner" -> Dinner
                "snack" -> Snack
                else -> Breakfast
            }
        }
    }
}