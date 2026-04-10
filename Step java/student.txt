package com.example.student;

class Data{
    int i=10;
    string name="Hello";
	
	public Data (int i,string name){
	   system.out.println("This is a constructor");
	   
	}
	
  public void dispaly(){
       system.out.println("This is a method");
	   
  }


public class Student {
public static void main(String[] args) {
     Data ref = new Data();
	 ref.display();


} 