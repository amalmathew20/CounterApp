package com.example.composecounterapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors



private val DarkColorPalette = darkColors(
    primary = Color(0xFFBB86FC),
    primaryVariant = Color(0xFF3700B3),
    secondary = Color(0xFF03DAC5)
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF6200EE),
    primaryVariant = Color(0xFF3700B3),
    secondary = Color(0xFF03DAC5)
)


@Composable
fun CounterAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) 

{
    val colors = if (darkTheme) 
    
    {
        DarkColorPalette
    } else 
    
    {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
