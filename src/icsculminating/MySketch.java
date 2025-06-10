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
    private PImage homePage;
    private PImage learnButton;
    private int learnX,learnY;
    private PImage playButton;
    
    private int stage =0;
    //private Car car2;
    //private boolean showInfo=false;
    //private Car carClicked;
    
    public void settings(){
        size(700,700);
    }
    public void setup(){
        backgroundImg = loadImage("images/start.png");
        homePage = loadImage("images/home.png");
        learnButton = loadImage("images/learnButton.png");
        playButton = loadImage("images/playButton.png");
        //car = new Car(this,300,100,"images/car.png",1);
        //car2 = new Car(this,100,100,"images/car.png",2);
    }
    public void draw(){
        if (stage==0){
            //showing the start page
            background(backgroundImg);
        //home page
        } else if (stage==1){
            //showing the home page
            background(homePage);
            //showing the buttons
            learnX = 270;
            learnY=420;
            this.image(learnButton,270,420);
            this.image(playButton,270,500);
        
        //learning page
        } else if (stage==2){
            background(0);
            System.out.print("Learn");
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
    public boolean isClicked(int mouseX, int mouseY, PImage image, int x, int y){
        //if (image!=null){
           int centerX=x+(image.pixelWidth/2);
        
           int centerY= y+(image.pixelHeight/2);
           float d =PApplet.dist(mouseX,mouseY, centerX,centerY);
           float r = image.pixelWidth/2;
           System.out.println("Raidus: "+r+" Distance: "+d);
           return d<r;
    }
    
    public void mousePressed(){
        //if start screen is clicked, move to home screen 
        if(isClicked(mouseX,mouseY,backgroundImg,350,350)){
            stage=1;
        } else if (isClicked(mouseX,mouseY,learnButton,learnX,learnY)){
            //learning page
            stage =2;
        }
    }
}

