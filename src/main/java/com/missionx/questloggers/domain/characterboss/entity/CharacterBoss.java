package com.missionx.questloggers.domain.characterboss.entity;

import com.missionx.questloggers.domain.boss.entity.Boss;
import com.missionx.questloggers.domain.character.entity.Character;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "character_boss")
@NoArgsConstructor
public class CharacterBoss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "char_id")
    private Character character;

    @ManyToOne
    @JoinColumn(name = "boss_id")
    private Boss boss;

    private boolean isCleared;

    private int clearCount;

}
