package com.kaaneneskpc.chartexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.kaaneneskpc.chartexamples.ui.theme.ChartExamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChartExamplesTheme {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.surface),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    item { LineChartScreen(modifier = Modifier.fillParentMaxSize(0.5f)) }
                    item { BarChartScreen(modifier = Modifier.fillParentMaxSize(0.5f)) }
                    item { PieChartScreen(modifier = Modifier.fillParentMaxSize(0.5f)) }
                }
            }
        }
    }
}