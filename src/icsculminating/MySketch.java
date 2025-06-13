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
    private User user;
    private PImage backgroundImg;
    private PImage welcomePage;
    private PImage namePage;
    private PImage learn1;
    private PImage learn2;
    private PImage learn3;
    private PImage learn4;
    private PImage proceedPage;
    private PImage ratingButton;
    private PImage playButton;
    
    private PImage star1;
    private PImage star2;
    private PImage star3;
    private PImage star4;
    private PImage star5;
    
    
    private int stage =0;
    private String name= "";
    //private Car car2;
    //private boolean showInfo=false;
    //private Car carClicked;
    
    public void settings(){
        size(700,700);
    }
    public void setup(){
        user = new User();
        backgroundImg = loadImage("images/start.png");
        welcomePage = loadImage("images/welcomePage.png");
        namePage = loadImage("images/namePage.png");
        //loading learning pages
        learn1 = loadImage("images/learn1.png");
        learn2 = loadImage("images/learn2.png");
        learn3 = loadImage("images/learn3.png");
        learn4 = loadImage("images/learn4.png");
        //loading buttons
        proceedPage = loadImage("images/proceedPage.png");
        ratingButton = loadImage("images/ratingButton.png");
        ratingButton.resize(0, 80);
        playButton = loadImage("images/playButton.png");
        //setting my textsize 
        textSize(60);
        //starting will all emoty stars
        star1=loadImage("images/emptyStar.png");
        star2=loadImage("images/emptyStar.png");
        star3=loadImage("images/emptyStar.png");
        star4=loadImage("images/emptyStar.png");
        star5=loadImage("images/emptyStar.png");
    }
    
    public void keyPressed(){
       if (stage!=7&&keyCode==ENTER){
           stage++;
       } else if(key!=CODED&&stage==2){
           if(key==BACKSPACE){
               //removing last character in the string 
               name = name.substring(0,name.length()-1);
           } else{
             name+=key;  
           }
       }
    }
    
    public void draw(){
        background(255);
        //title page
        if (stage==0){
            //showing the start page
            background(255);
            image(backgroundImg,0,0);
        //intro page
        } else if (stage==1){
            //clear();
            //showing the home page
            image(welcomePage,0,0);
            //showing the buttons
        
        //name page
        } else if (stage==2){
            image(namePage,0,0);
            //setting text
            fill(0);
            text(name,300,355);
        //START OF LEARNING SECTION
        } else if(stage==3){
            //assigning name from previoys section to the user
            user.setName(name);
            //showing first lesson page
            image(learn1,0,0);
            
        } else if(stage==4){
            //showing second lesson page
            image(learn2,0,0);
            
        } else if(stage==5){
            //showing third lesson page
            image(learn3,0,0);
            
        }else if(stage==6){
            //showing fourth lesson page
            image(learn4,0,0);
        
        //proceed page
        }else if(stage==7){
            image(proceedPage,0,0);
            image(ratingButton,230,350);
            image(playButton,260,430);
        }
        //RATING PORTION
        else if(stage==8){
            //stating with all empty stars
            imagestar
        }
    }  
    public boolean isClicked(int mouseX, int mouseY, PImage image, int x, int y){
            int imageWidth = image.width;
            int imageHeight = image.height;
            // Check if the mouse is within the rectangular bounds
            return mouseX >= x && mouseX <= x + imageWidth && mouseY >= y && mouseY <= y + imageHeight;
    }
    
    public void mousePressed(){
        //if start screen is clicked, move to home screen 
        if(stage==0 && isClicked(mouseX,mouseY,backgroundImg,0,0)){
            stage=1;
        } else if (stage==7){
            if(isClicked(mouseX,mouseY,ratingButton,280,350)){
            //setting stage to rating portion
            stage=8;
            } else if (isClicked(mouseX,mouseY,playButton,260,430)){
                //setting to playing portion
                stage =0;
            }
        }
    }
}

