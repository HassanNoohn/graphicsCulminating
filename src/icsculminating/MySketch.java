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
    private PImage welcomePage;
    private PImage namePage;
    
    private int stage =0;
    private String name= "";
    //private Car car2;
    //private boolean showInfo=false;
    //private Car carClicked;
    
    public void settings(){
        size(700,700);
    }
    public void setup(){
        backgroundImg = loadImage("images/start.png");
        welcomePage = loadImage("images/welcomePage.png");
        namePage = loadImage("images/namePage.png");
    }
    
    public void keyPressed(){
       if (stage==1&&keyCode==ENTER){
           stage++;
       } else if(key!=CODED&&stage==1){
           name+=key;
       }
    }
    
    public void draw(){
        background(255);
        if (stage==0){
            //showing the start page
            image(backgroundImg,0,0);
        //home page
        } if (stage==1){
            //clear();
            //showing the home page
            image(welcomePage,0,0);
            //showing the buttons
        
        //learning page
        } if (stage==2){
            //clear();
            image(namePage,0,0);
        }
        if (keyPressed){
            if (keyCode==ENTER){
                stage++;
                System.out.println("Next stage");
            
        }
    }
    }
    public boolean isClicked(int mouseX, int mouseY, PImage image, int x, int y){
        if (image != null) {
            int imageWidth = image.width;
            int imageHeight = image.height;

            // Check if the mouse is within the rectangular bounds
            return mouseX >= x && mouseX <= x + imageWidth && mouseY >= y && mouseY <= y + imageHeight;
        }
        return false; // Return false if the image is null

    }
    
    public void mousePressed(){
        //if start screen is clicked, move to home screen 
        if(isClicked(mouseX,mouseY,backgroundImg,0,0)){
            stage=1;
    }
}
}

