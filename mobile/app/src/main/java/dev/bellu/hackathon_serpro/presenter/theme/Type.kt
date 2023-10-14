package dev.bellu.hackathon_serpro.presenter.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

val Typography = Typography(
    titleSmall = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight(600),
        color = onSecondary,
        textAlign = TextAlign.Center,
    ),
    displaySmall = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight(600),
        color = onPrimary,

        textAlign = TextAlign.Center,
    )
)