package com.missionx.questloggers.domain.characterboss.controller;

import com.missionx.questloggers.domain.characterboss.service.CharacterBossService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CharacterBossController {

    private final CharacterBossService characterBossService;
}
