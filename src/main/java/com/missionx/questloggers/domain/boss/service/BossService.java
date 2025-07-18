package com.missionx.questloggers.domain.boss.service;

import com.missionx.questloggers.domain.boss.repository.BossRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BossService {

    public final BossRepository bossRepository;
}
