

package com.project.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Calculator
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.project.composecalculator.ui.theme.CalculatorUI
import com.project.composecalculator.ui.theme.ComposeCalculatorTheme
import com.project.composecalculator.ui.theme.Midiumgray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
                val viewModel = viewModels<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                // A surface container using the 'background' color from the theme
            CalculatorUI(state = state, onAction = viewModel::onAction,
            buttonSpacing = buttonSpacing,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Midiumgray)
                    .padding(16.dp)
            )
            }
        }
    }
}

