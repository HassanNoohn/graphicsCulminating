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
    private PImage learn1;
    private PImage learn2;
    private PImage learn3;
    private PImage learn4;
    private PImage proceedPage;
    
    
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
        //loading learning pages
        learn1 = loadImage("images/learn1.png");
        learn2 = loadImage("images/learn2.png");
        learn3 = loadImage("images/learn3.png");
        learn4 = loadImage("images/learn4.png");
        proceedPage = loadImage("images/proceedPage.png");
        //setting my textsize 
        textSize(60);
    }
    
    public void keyPressed(){
       if (stage!=7&&keyCode==ENTER){
           stage++;
       } else if(key!=CODED&&stage==2){
           if(key==BACKSPACE){
               name = name.substring(0,name.length()-1);
           } else{
             name+=key;  
           }
       }
    }
    
    public void draw(){
        background(255);
        if (stage==0){
            //showing the start page
            background(255);
            image(backgroundImg,0,0);
        //home page
        } else if (stage==1){
            //clear();
            //showing the home page
            image(welcomePage,0,0);
            //showing the buttons
        
        //learning page
        } else if (stage==2){
            image(namePage,0,0);
            //setting text
            fill(0);
            text(name,300,355);
        
//            if (keyPressed){
//                if (keyCode==ENTER){
//                    keyPressed =false;
//                    stage++;
//                    System.out.println("Next stage");
//                }
//            }
        //START OF LEARNING SECTION
        } else if(stage==3){
            image(learn1,0,0);
            
        } else if(stage==4){
            image(learn2,0,0);
            
        } else if(stage==5){
            image(learn3,0,0);
            
        }else if(stage==6){
            image(learn4,0,0);
        
        //proceed page
        }else if(stage==7){
            image(proceedPage,0,0);
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
        if(stage==0 && isClicked(mouseX,mouseY,backgroundImg,0,0)){
            stage=1;
    }
}
}

