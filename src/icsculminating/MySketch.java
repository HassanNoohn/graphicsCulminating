/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icsculminating;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author noohn
 */

    
public class MySketch extends PApplet {
    private PImage backgroundImg;
    private int stage =0;
    //private Car car2;
    //private boolean showInfo=false;
    //private Car carClicked;
    
    public void settings(){
        size(700,700);
    }
    public void setup(){
        backgroundImg = loadImage("images/start.png");
        //car = new Car(this,300,100,"images/car.png",1);
        //car2 = new Car(this,100,100,"images/car.png",2);
    }
    public void draw(){
        if (stage==0){
            background(backgroundImg);
        } else{
            background(0);
        }
        
        //car.draw();
//        if (keyPressed){
//            if (keyCode==LEFT){
//                car.move(-5,0);
//            } else if (keyCode==RIGHT){
//                car.move(5,0);
//            } else if (keyCode ==UP){
//                car.move(0,-5);
//            } else if (keyCode==DOWN){
//                car.move(0,5);
//            }
//        }
//        car2.draw();
//        if(showInfo){
//            carClicked.displayInfo(this);
//        }
    }
    public boolean isClicked(int mouseX, int mouseY, PImage image, int radius){
        int centerX=(image.pixelWidth/2);
        int centerY=(image.pixelHeight/2);
        
        float d =PApplet.dist(mouseX,mouseY, centerX,centerY);
        return d<radius;
    }
    
    public void mousePressed(){
        if(isClicked(mouseX,mouseY,backgroundImg,350)){
            stage=1;
        }
    }
}

