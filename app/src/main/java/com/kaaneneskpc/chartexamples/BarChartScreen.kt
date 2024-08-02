package com.kaaneneskpc.chartexamples


import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.yml.charts.axis.AxisData
import co.yml.charts.axis.DataCategoryOptions
import co.yml.charts.common.utils.DataUtils
import co.yml.charts.ui.barchart.BarChart
import co.yml.charts.ui.barchart.models.BarChartData
import co.yml.charts.ui.barchart.models.BarChartType

@Composable
fun BarChartScreen(modifier: Modifier) {
    val stepSize = 5
    val barsData = DataUtils.getBarChartData(
        listSize = 8,
        maxRange = 8,
        barChartType = BarChartType.VERTICAL,
        dataCategoryOptions = DataCategoryOptions()
    )

    val xAxisData = AxisData.Builder()
        .axisStepSize(100.dp)
        .bottomPadding(40.dp)
        .steps(barsData.size - 1)
        .labelData { i -> barsData[i].label }
        .axisLabelAngle(20f)
        .axisLineColor(MaterialTheme.colorScheme.tertiary)
        .axisLabelColor(MaterialTheme.colorScheme.tertiary)
        .build()


    val yAxisData = AxisData.Builder()
        .steps(stepSize)
        .axisOffset(20.dp)
        .labelData { i -> (i * (100 / stepSize)).toString() }
        .labelAndAxisLinePadding(20.dp)
        .axisLineColor(MaterialTheme.colorScheme.tertiary)
        .axisLabelColor(MaterialTheme.colorScheme.tertiary)
        .build()

    val barChartData = BarChartData(
        chartData = barsData,
        xAxisData = xAxisData,
        yAxisData = yAxisData,
        backgroundColor = MaterialTheme.colorScheme.surface
    )

    BarChart(modifier = Modifier.height(350.dp), barChartData = barChartData)
}