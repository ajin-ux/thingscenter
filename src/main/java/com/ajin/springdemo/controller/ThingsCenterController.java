package com.ajin.springdemo.controller;


import com.ajin.springdemo.common.wrapper.WrapMapper;
import com.ajin.springdemo.common.wrapper.Wrapper;
import com.ajin.springdemo.model.vo.DataBoardVo;
import com.ajin.springdemo.model.vo.PacketMonitoringVo;
import com.ajin.springdemo.model.vo.TimeParamVo;
import com.ajin.springdemo.service.CommandLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thingscenter")
public class ThingsCenterController {
    private final CommandLogService commandLogService;

    @Autowired
    public ThingsCenterController(CommandLogService commandLogService) {
        this.commandLogService = commandLogService;
    }

    /**
     * 功能描述 ：数据包实时监控，显示累计数据包总数（分上行、下行），显示今日数据包总数（分上行、下行），滚动显示今日最新100条采集数据包
     * @return: com.example.thingscenter.model.vo.PacketMonitoringVo
     * @Version: V1.0
     * @Author: ngy
     * @Date: 2019年8月11日20:58:17
     * @UpdateAuthor: 无(如果该方法有修改则填写修改人)
     * @UpdateDate:   无(如果该方法有修改则填写修改时间例如 xxxx/x/xx)
     */
    @RequestMapping(value = "/packetMonitoring",method = RequestMethod.GET)
    public Wrapper<PacketMonitoringVo> packetMonitoring(){
        PacketMonitoringVo vo = commandLogService.packetMonitoring();
        return WrapMapper.ok(vo);
    }


    /**
     * 功能描述 ：数据包统计看板（按时间范围统计日数据包数【上行、下行】，默认最近7天）
     * @return: com.example.thingscenter.model.vo.DataBoardVo
     * @Version: V1.0
     * @Author: ngy
     * @Date: 2019年8月12日17:26:35
     * @UpdateAuthor: 无(如果该方法有修改则填写修改人)
     * @UpdateDate:   无(如果该方法有修改则填写修改时间例如 xxxx/x/xx)
     */
    @RequestMapping(value = "/dataBoard",method = RequestMethod.POST)
    public Wrapper<DataBoardVo> dataBoard(@RequestBody(required = false) TimeParamVo timeParamVo){
//        DataBoardVo vo = commandLogService.dataBoard(timeParamVo);
//        return WrapMapper.ok(vo);
        return null;
    }
}
