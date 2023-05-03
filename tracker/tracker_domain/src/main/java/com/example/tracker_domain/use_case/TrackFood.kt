package com.example.tracker_domain.use_case

import com.example.tracker_domain.model.MealType
import com.example.tracker_domain.model.TrackableFood
import com.example.tracker_domain.model.TrackedFood
import com.example.tracker_domain.repository.TrackerRepository
import java.time.LocalDate
import kotlin.math.roundToInt

class TrackFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(
        trackedFood : TrackableFood,
        amount : Int,
        mealType : MealType,
        date : LocalDate
    ) {
        repository.insertTrackedFood(
            TrackedFood(
                name = trackedFood.name,
                carbs = ((trackedFood.carbsPer100g / 100f) * amount).roundToInt(),
                protein = ((trackedFood.proteinPer100g / 100f) * amount).roundToInt(),
                fat = ((trackedFood.fatPer100g / 100f) * amount).roundToInt(),
                calories = ((trackedFood.caloriesPer100g / 100f) * amount).roundToInt(),
                imageUrl = trackedFood.imageUrl,
                mealType = mealType,
                amount = amount,
                date = date,
            )
        )
    }



}