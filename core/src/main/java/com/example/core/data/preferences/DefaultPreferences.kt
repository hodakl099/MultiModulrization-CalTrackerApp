package com.example.core.data.preferences

import android.content.SharedPreferences
import com.example.core.domain.model.ActivityLevel
import com.example.core.domain.model.Gender
import com.example.core.domain.model.GoalType
import com.example.core.domain.model.UserInfo
import com.example.core.domain.prefrences.Preferences

class DefaultPreferences(
    private val sharedPReferences : SharedPreferences
) : Preferences {
    override fun saveGender(gender: Gender) {
        sharedPReferences.edit()
            .putString(Preferences.KEY_GENDER, gender.name)
            .apply()
    }

    override fun saveAge(age: Int) {
        sharedPReferences.edit()
            .putInt(Preferences.KEY_AGE, age)
            .apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPReferences.edit()
            .putFloat(Preferences.KEY_WEIGHT, weight)
            .apply()
    }

    override fun saveHeight(height: Int) {
        sharedPReferences.edit()
            .putInt(Preferences.KEY_HEIGHT, height)
            .apply()
    }

    override fun saveActivityLevel(level: ActivityLevel) {
        sharedPReferences.edit()
            .putString(Preferences.KEY_ACTIVITY_LEVEL, level.type)
            .apply()
    }

    override fun saveGoalType(type: GoalType) {
        sharedPReferences.edit()
            .putString(Preferences.KEY_GOAL_TYPE, type.type)
            .apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        sharedPReferences.edit()
            .putFloat(Preferences.KEY_CARB_RATIO, ratio)
            .apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        sharedPReferences.edit()
            .putFloat(Preferences.KEY_PROTEIN_RATIO, ratio)
            .apply()
    }

    override fun saveFatRatio(ratio: Float) {
        sharedPReferences.edit()
            .putFloat(Preferences.KEY_FAT_RATIO, ratio)
            .apply()
    }

    override fun loadUserInfo(): UserInfo {
        val age = sharedPReferences.getInt(Preferences.KEY_AGE, -1)
        val height = sharedPReferences.getInt(Preferences.KEY_HEIGHT, -1)
        val weight = sharedPReferences.getFloat(Preferences.KEY_WEIGHT, -1f)
        val genderString = sharedPReferences.getString(Preferences.KEY_GENDER, null)
        val activityLevelString = sharedPReferences
            .getString(Preferences.KEY_ACTIVITY_LEVEL, null)
        val goalType = sharedPReferences.getString(Preferences.KEY_GOAL_TYPE, null)
        val carbRatio = sharedPReferences.getFloat(Preferences.KEY_CARB_RATIO, -1f)
        val proteinRatio = sharedPReferences.getFloat(Preferences.KEY_PROTEIN_RATIO, -1f)
        val fatRatio = sharedPReferences.getFloat(Preferences.KEY_FAT_RATIO, -1f)

        return UserInfo(
            gender = Gender.fromString(genderString ?: "male"),
            age = age,
            weight = weight,
            height = height,
            activityLevel = ActivityLevel.fromString(activityLevelString ?: "medium"),
            goalType = GoalType.fromString(goalType ?: "keep_weight"),
            carbRatio = carbRatio,
            proteinRatio = proteinRatio,
            fatRatio = fatRatio
        )
    }
}