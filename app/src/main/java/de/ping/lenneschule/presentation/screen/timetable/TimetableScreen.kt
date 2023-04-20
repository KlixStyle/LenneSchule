package de.ping.lenneschule.presentation.screen.timetable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import de.ping.lenneschule.R

@Composable
fun TimetableScreen(
    onButtonClick: () -> Unit,
) {

    Column {
        Text(text = stringResource(id = R.string.timetable))

        Button(onClick = onButtonClick) {
            Text(text = stringResource(id = R.string.next))
        }
    }
}