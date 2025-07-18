package com.missionx.questloggers.domain.boss.controller;

import com.missionx.questloggers.domain.boss.service.BossService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BossController {

    private final BossService bossService;

}
