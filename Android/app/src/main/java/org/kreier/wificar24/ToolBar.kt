package org.kreier.wificar24

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ToolBar24() {
    Row(modifier = Modifier
//        .padding(horizontal = 8.dp)
        .fillMaxWidth()
        .bottomBorder(1.dp, DarkGray)
    ) {
        Icon(
            Icons.Rounded.Menu,
            contentDescription = "Menu"
        )
        Text(
            text = "Connected to ESP8266",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            imageVector = Icons.Rounded.Search,
            contentDescription = "Search"
        )
        Icon(
            imageVector = Icons.Default.Settings,
            contentDescription = "Settings"
        )
//        IconButton(onClick = { Log.d("Click", "IconExample")}) {
//            Icon(
//                imageVector = Icons.Default.Settings,
//                contentDescription = "Settings"
//            )
//        }
    }
}

fun Modifier.bottomBorder(strokeWidth: Dp, color: Color) = composed(
    factory = {
        val density = LocalDensity.current
        val strokeWidthPx = density.run { strokeWidth.toPx() }

        Modifier.drawBehind {
            val width = size.width
            val height = size.height - strokeWidthPx/2

            drawLine(
                color = color,
                start = Offset(x = 0f, y = height),
                end = Offset(x = width , y = height),
                strokeWidth = strokeWidthPx
            )
        }
    }
)

@Preview
@Composable
fun ToolBarPreview() {
    ToolBar24()
}