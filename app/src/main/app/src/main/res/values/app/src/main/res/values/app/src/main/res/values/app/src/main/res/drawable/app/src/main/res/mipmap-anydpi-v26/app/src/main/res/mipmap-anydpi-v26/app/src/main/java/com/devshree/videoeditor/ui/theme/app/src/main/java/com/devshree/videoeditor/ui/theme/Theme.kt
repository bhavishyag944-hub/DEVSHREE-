package com.devshree.videoeditor.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DevshreeColorScheme = darkColorScheme(
    primary = DevGold,
    onPrimary = DevBlack,
    secondary = DevViolet,
    onSecondary = DevBlack,
    background = DevBlack,
    onBackground = DevOnSurface,
    surface = DevSurface,
    onSurface = DevOnSurface,
    surfaceVariant = DevSurfaceVariant,
    onSurfaceVariant = DevOnSurfaceMuted,
    outline = DevOutline
)

@Composable
fun DevshreeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DevshreeColorScheme,
        content = content
    )
}
