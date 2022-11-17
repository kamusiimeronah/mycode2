 package Ronah5;

import java.util.Scanner;

public class Mycodes2022 {

	public static void main(String[] args) {
	


			//program to get student details
		
			
			 Scanner sc = new Scanner(System.in);
			 
			          String name;
			          String registration_number;
			          
			          int marks = 0 ,a,b,c,d;
			         int total;
			          System.out.print("Enter Name: ");
			          name=sc.nextLine();
			          System.out.print("Enter registration number: ");
			          registration_number = sc.nextLine();
			          System.out.println("Enter marks for:");
			          System.out.println("Linear programming:");
			          a = sc.nextInt();
			          System.out.println("Object Oriented Programming:");
			          b = sc.nextInt();
			          System.out.println("data structures and algorithm:");
			          c = sc.nextInt();
			          System.out.println("scripting languages:");
			          d = sc.nextInt();
			          total=a+b+c+d;
			      System.out.println("the total is :"+total);
			      if(total<200){
						System.out.println("poor");
					}else{
						System.out.println("good");
					}
				}
				
			           
			           
			          
			          
			        		  
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			         
			           
			         }
			       
			      
