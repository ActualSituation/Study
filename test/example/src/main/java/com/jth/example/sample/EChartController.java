package com.jth.example.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EChartController {

    private static final Logger logger = LoggerFactory.getLogger(EChartController.class);

    @GetMapping("/echartBarChart")
    public String echartBarChart(Model model) throws Exception {
        logger.info("EChartController, echartBarChart.");

        return "echart/echartBarChart";
    }

    @GetMapping("/echartSmoothLineChart")
    public String echartSmoothLineChart(Model model) throws Exception {
        logger.info("EChartController, echartSmoothLineChart.");

        return "echart/echartSmoothLineChart";
    }

    @GetMapping("/echartBasicAreaChart")
    public String echartBasicAreaChart(Model model) throws Exception {
        logger.info("EChartController, echartBasicAreaChart.");

        return "echart/echartBasicAreaChart";
    }

    @GetMapping("/echartStackedLineChart")
    public String echartStackedLineChart(Model model) throws Exception {
        logger.info("EChartController, echartStackedLineChart.");

        return "echart/echartStackedLineChart";
    }

    @GetMapping("/echartStackedColumnChart")
    public String echartStackedColumnChart(Model model) throws Exception {
        logger.info("EChartController, echartStackedColumnChart.");

        return "echart/echartStackedColumnChart";
    }

    @GetMapping("/echartStackedHorizontalBarChart")
    public String echartStackedHorizontalBarChart(Model model) throws Exception {
        logger.info("EChartController, echartStackedHorizontalBarChart.");

        return "echart/echartStackedHorizontalBarChart";
    }

    @GetMapping("/echartMixedLineAndBarChart")
    public String echartMixedLineAndBarChart(Model model) throws Exception {
        logger.info("EChartController, echartMixedLineAndBarChart.");

        return "echart/echartMixedLineAndBarChart";
    }

    @GetMapping("/echartAreaPiecesChart")
    public String echartAreaPiecesChart(Model model) throws Exception {
        logger.info("EChartController, echartAreaPiecesChart.");

        return "echart/echartAreaPiecesChart";
    }

    @GetMapping("/echartWorldTotalPopulationChart")
    public String echartWorldTotalPopulationChart(Model model) throws Exception {
        logger.info("EChartController, echartWorldTotalPopulationChart.");

        return "echart/echartWorldTotalPopulationChart";
    }

    @GetMapping("/echartBrushSelectOnColumnChart")
    public String echartBrushSelectOnColumnChart(Model model) throws Exception {
        logger.info("EChartController, echartBrushSelectOnColumnChart.");

        return "echart/echartBrushSelectOnColumnChart";
    }

}
