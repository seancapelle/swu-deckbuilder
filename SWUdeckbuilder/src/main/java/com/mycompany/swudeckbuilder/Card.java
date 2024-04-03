/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swudeckbuilder;

/**
 *
 * @author seanc
 */
public class Card {
    // TODO:
    // event
    // upgrade
    // leader
    // base

    private Aspects aspect;
    private int cost;
    private String name;
    private String traits;
    
    Card(Aspects aspect, int cost, String name, String traits) {
        this.aspect = aspect;
        this.cost = cost;
        this.name = name;
        this.traits = traits;
    }
    
    public int getCost() {
        return this.cost;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getTraits() {
        return this.traits;
    }
}
