package com.kaaneneskpc.chartexamples

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import co.yml.charts.common.model.PlotType
import co.yml.charts.ui.piechart.charts.PieChart
import co.yml.charts.ui.piechart.models.PieChartConfig
import co.yml.charts.ui.piechart.models.PieChartData

@Composable
fun PieChartScreen(modifier: Modifier) {
    val pieChartData = PieChartData(
        slices = listOf(
            PieChartData.Slice(
                label = "Ferrari",
                value = 65f,
                color = Color.Red
            ),
            PieChartData.Slice(
                label = "Redbull",
                value = 35f,
                color = Color.Blue
            ),
            PieChartData.Slice(
                label = "Mercedes",
                value = 10f,
                color = Color.Black
            ),
            PieChartData.Slice(
                label = "Aston Martin",
                value = 40f,
                color = Color.Green
            )
        ),
        plotType = PlotType.Pie
    )

    val pieChartConfig = PieChartConfig(
        isAnimationEnable = true,
        showSliceLabels = false,
        activeSliceAlpha = 0.5f,
        animationDuration = 600
    )

    PieChart(
        modifier = Modifier
            .width(300.dp)
            .height(300.dp),
        pieChartData = pieChartData,
        pieChartConfig = pieChartConfig
    )
}