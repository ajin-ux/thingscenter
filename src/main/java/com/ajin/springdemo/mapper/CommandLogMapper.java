package com.ajin.springdemo.mapper;


import com.ajin.springdemo.model.domain.CommandLog;
import com.ajin.springdemo.model.vo.CommandLogVo;
import org.springframework.context.annotation.Primary;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author zkhd
 * @email null
 * @date 2019-08-09 16:36:37
 */
@Primary
public interface CommandLogMapper extends Mapper<CommandLog> {


    String selectHistoryCommand();

    String selectTodayCommand();

    List<CommandLogVo> selectTodayCommandLogs();

//    List<DataBoardResultVo> dataBoard(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}
