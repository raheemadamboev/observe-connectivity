package xyz.teamgravity.observeconnectivity.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import xyz.teamgravity.observeconnectivity.R
import xyz.teamgravity.observeconnectivity.presentation.viewmodel.ConnectionViewModel

@Composable
fun ConnectionScreen(
    viewmodel: ConnectionViewModel = hiltViewModel(),
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = stringResource(id = R.string.your_connection, viewmodel.status.toString()))
    }
}