package com.missionx.questloggers.domain.character.entity;

import com.missionx.questloggers.domain.character.enums.CharServer;
import com.missionx.questloggers.domain.characterboss.entity.CharacterBoss;
import com.missionx.questloggers.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "characters")
@NoArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "char_boss_id")
    private List<CharacterBoss> characterBoss = new ArrayList<>();

    private String charName;

    private int charLevel;

    private long charPower;

    private String charImage;

    private CharServer charServer;


}
