//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


// the main class
public class AarogyaHospital{

	
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
	
	    // make constructor for the class and assign it a unique Id
	    public AarogyaMember(){
	    	
	    }
    	    // for taking patient information
	    public void input(){
	    	
	    }
	      
	}

	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
            // create scanner class to take input
	    long option=ip.nextLong();
	    return option;
	}

	public static void main(String args[]){
		
		// initialise array list to store list of patients information
		
		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
			
			}
			// take the input and add in the arrayList
			else if(option==1){
	            
        	        }
			//iterate and print all the patients information
	       		 else if(option==2){
	     
	       		 }
			
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
	            
	                }
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
	        	
	               }
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
	            
	              }
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
	            
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
			      
	              }
			
	              else{
	             break;
	             }
		}
	}
}
