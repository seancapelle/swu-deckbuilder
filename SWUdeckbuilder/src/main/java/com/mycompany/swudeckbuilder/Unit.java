/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swudeckbuilder;

/**
 *
 * @author seanc
 */
public class Unit extends Card {
    private String ability;
    private String arena;
    private int hp;
    private boolean isUnique;
    private int power;

    Unit(String ability, String arena, Aspects aspect, int cost, int hp, boolean isUnique, int power, String title, String traits) {
        super(aspect, cost, title, traits);
        
        this.ability = ability;
        this.arena = arena;
        this.hp = hp;
        this.isUnique = isUnique;
        this.power = power;
    }
}
