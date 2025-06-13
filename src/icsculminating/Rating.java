
package icsculminating;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342392941
 */
import processing.core.PApplet;
import processing.core.PImage;
public class Rating {
    //setting my attributes
    private int rate=0;
    private PApplet app;
    
    private PImage star1;
    private PImage star2;
    private PImage star3;
    private PImage star4;
    private PImage star5;
    //making constructor
    public Rating(int rate){
        this.rate = rate;
    }
    public void setRate(int r){
        rate=r;
    }
    public int getRate(){
        return rate;
    }
}
