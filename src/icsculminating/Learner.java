package icsculminating;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342392941
 */
public class Learner extends User{
    //making the attributes
    private String knowledgeBefore;
    private String knowledgeAfter;
    
    //making constructor
    public Learner(String name, int age, String knowledge_before){
        super(name,age);
        knowledgeBefore = knowledge_before;
    }
    public Learner(){
        super();
        knowledgeBefore="basic";
    }
    //making setters
    public void setKnowledgeAfter(String k){
        knowledgeAfter = k;
    }
    public void setKnowlegeBefore(String k){
        knowledgeBefore = k;
    }
    //making getters
    public String getKnowledgeBefore(){
        return knowledgeBefore;
    }
    public String getKnowledgeAfter(){
        return knowledgeAfter;
    }
}
