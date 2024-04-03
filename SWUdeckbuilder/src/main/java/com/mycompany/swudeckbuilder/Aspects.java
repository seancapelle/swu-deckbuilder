/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.swudeckbuilder;

/**
 *
 * @author seanc
 */
public enum Aspects {
    AGGRESSION,
    AGGRESSION_HEROIC,
    AGGRESSION_VILLANY,
    COMMAND,
    COMMAND_HEROIC,
    COMMAND_VILLANY,
    CUNNING,
    CUNNING_HEROIC,
    CUNNING_VILLANY,
    HEROIC,
    NEUTRAL,
    VIGILANCE,
    VIGILANCE_HEROIC,
    VIGILANCE_VILLANY,
    VILLAINY;
    
    public void getAspectEnum() {
        System.out.println(this);
    }
}
