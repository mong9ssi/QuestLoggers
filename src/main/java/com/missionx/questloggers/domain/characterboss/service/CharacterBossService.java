package com.missionx.questloggers.domain.characterboss.service;

import com.missionx.questloggers.domain.characterboss.repository.CharacterBossRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterBossService {

    private final CharacterBossRepository characterBossRepository;

}
