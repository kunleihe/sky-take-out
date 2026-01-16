package com.sky.service;

import com.sky.vo.TurnoverReportVO;
import com.sky.vo.UserReportVO;

import java.time.LocalDate;

public interface ReportService {

    /**
     * 根据时间区间统计营业额
     *
     * @param beginTime
     * @parem endTime
     * @return
     */
    TurnoverReportVO getTurnover(LocalDate beginTime, LocalDate endTime);

    /**
     * 根据时间区间统计用户数量
     *
     * @param begin
     * @parem end
     * @return
     */
    UserReportVO getUserStatistics(LocalDate begin, LocalDate end);
}
