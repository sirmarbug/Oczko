/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oczko;

import java.util.Random;

/**
 *
 * @author mariuszbugajski
 */
public class Karta {
    int typ, nr, wartosc;
    
    public Karta(){
        this.typ = 0;
        this.nr = 0;
        this.wartosc = 0;
    }
    
    public Karta(int i){
        Random r = new Random();
        this.typ = r.nextInt(4);
        this.nr = r.nextInt(12)+2;
        if(this.nr == 11){
            this.wartosc = 2;
        }else if(this.nr == 12){
            this.wartosc = 3;
        }else if(this.nr == 13){
            this.wartosc = 4;
        }else if(this.nr == 14){
            this.wartosc = 11;
        }else{
            this.wartosc = this.nr;
        }
    }
    
    int getTyp(){
        return this.typ;
    }
    
    int getNr(){
        return this.nr;
    }
    
    int getWartosc(){
        return this.wartosc;
    }

}
