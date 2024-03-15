package org.kreier.wificar24

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
public fun ToolBar24() {
    Row(modifier = Modifier
        .padding(16.dp)
        .background(color = Color.DarkGray)
    ) {
        Icon(
            Icons.Rounded.Menu,
            contentDescription = stringResource(id = androidx.compose.material3.R.string.suggestions_available)
        )
        Text(
            text = "Connected to ESP8266",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )
        Icon(
            Icons.Rounded.ArrowBack,
            contentDescription = stringResource(id = androidx.compose.material3.R.string.suggestions_available)
        )
        Text(text = "asdf")
    }
}

@Preview
@Composable
fun ToolBarPreview() {
    ToolBar24()
}