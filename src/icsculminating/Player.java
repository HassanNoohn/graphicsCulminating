package icsculminating;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342392941
 */

//importing packages
import processing.core.PApplet;
import processing.core.PImage;

public class Player extends User{
    public int x,y;
    private PImage character;
    private PApplet app;
    private Rating rating;
    
    //creating constructor
    public Player(PApplet p,int x, int y,String name, int age, Rating rating, String imagePath){
        super(name,age);
        app = p;
        this.x=x;
        this.y=y;
        character = app.loadImage(imagePath);
        this.rating = rating;
    }
    //allowing user to change charcter from default
    public void setCharacter(PImage character){
        this.character = character;
    }
    
    //setting the user's rating
    public void setRating(Rating rate){
        this.rating = rating;
    }
    
    //allowing player to move
    public void move(int dx, int dy){
      x+=dx;
      y+=dy;
    }
    
    //drawing the player
    public void draw(){
        app.image(character,x,y);
    }
    
    
    
}
