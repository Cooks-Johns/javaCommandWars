'use strict';



var suits = ["Spades", "Hearts", "Diamonds", "Clubs"];

var values = ["2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"];

var deck = new Array();



function creatDeck() {


    for (var i = 0;i < values.length; i++) {

        for(var x = 0; x < suits.length; i++) {


            var weight = parseInt(values[i]);
            if(values[i] == "J" || values[i] == "Q" || values[i] == "K")
                weight = 10;

        }
    }



}