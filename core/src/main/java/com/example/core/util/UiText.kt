package com.example.core.util

import android.content.Context

sealed class UiText {

    data class StringResource(val resId : Int) : UiText()
    data class DynamicMessage(val message : String) : UiText()


    fun asString(context : Context) : String {
        return when(this) {
            is StringResource -> context.getString(resId)
            is DynamicMessage -> message
        }
    }
}
