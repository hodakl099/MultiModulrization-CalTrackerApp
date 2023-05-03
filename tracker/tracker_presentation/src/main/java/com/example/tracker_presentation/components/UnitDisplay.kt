package com.example.tracker_presentation.components

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.core_ui.LocalSpacing


@Composable
fun UnitDisplay(
    amount : Int,
    unit : String,
    modifier: Modifier = Modifier,
    amountTextSize : TextUnit = 20.sp,
    amountColor : Color = MaterialTheme.colors.onBackground,
    unitTextSize : TextUnit = 14.sp,
    unitColor : Color = MaterialTheme.colors.onBackground
) {

    val spacing = LocalSpacing.current


}