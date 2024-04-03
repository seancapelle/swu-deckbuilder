/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swudeckbuilder;

/**
 *
 * @author seanc
 */
public class SWUdeckbuilder {

    public static void main(String[] args) {
        User sean = new User("Sean");
        System.out.println(sean.getName());
        Card millenniumFalcon = new Unit("This unit enters play ready.\nWhen you ready cards during the regroup phase: Either pay {1} or return this unit to her owner's hand.", "Space", Aspects.CUNNING_HEROIC, 3, 4, true, 3, "Millennium Falcon, Piece of Junk", "Underworld, Vehicle, Transport");
        System.out.println(millenniumFalcon.getCost());
        
        Deck mainDeck = new Deck();
        mainDeck.addCard(millenniumFalcon);
        mainDeck.getCards();
    }
}
