package com.example.tracker_presentation.tracker_overview.components

import  androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun NutrientBarInfo(
    value : Int,
    goal : Int,
    name : String,
    color : Color,
    modifier : Modifier = Modifier,
    strokeWidth : Dp = 8.dp
) {

    val backGround = MaterialTheme.colors.background
    val goalExceedColor = MaterialTheme.colors.error
    val angleRatio = remember {
       Animatable(0f)
    }
    LaunchedEffect(key1 = value) {
        angleRatio.animateTo(
            targetValue = if(goal > 0) {
                value / goal.toFloat()
            } else {
                0f
            },
            tween(
                durationMillis = 300
            )
        )
    }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        ) {
            drawArc(
              color = if (value <= goal) backGround else goalExceedColor,
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                size = size,
                style = Stroke(
                    width = 8.dp.toPx()
                )
            )
        }

    }
}