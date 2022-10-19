package com.lincoco.linxiaoen.driver;

import com.lincoco.linxiaoen.config.LinxiaoenProperties;
import lombok.extern.slf4j.Slf4j;
import love.forte.simbot.bot.BotManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：xys
 * @description：定时喝水提醒
 * @date ：2022/10/19
 */
@Component
@Slf4j
public class DrinkNotify {

    @Autowired
    private BotManager botManager;

    @Autowired
    private LinxiaoenProperties properties;


}
