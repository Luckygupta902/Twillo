package com.git.git;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
		System.out.print("git merge");

		System.out.print("git cnflit main");
		System.out.print("git merge confilt master");
		System.out.println("git on main branch");
		System.out.print("Enter the input");
		System.out.print("Enter the input1");

        Scanner sc=new Scanner(System.in);
		

		int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
			boolean status=true;
			if(i==0 || i==1) {
				System.out.println("isPrime " +i);
				continue;
			}
			else {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					status=false;
					break;
				}
			}
			if(status==true) {
				System.out.println(status + " isPrime " +i );
			}
		}
		}
	//how to calculate the power		
      int power=sc.nextInt();
      int value=sc.nextInt();
      int total= power(power,value);
      System.out.print(total);
     //how to remove duplicated element from array
     int size= sc.nextInt();
     int[] arr=new int[size];
      removedDuplicated( arr);
      
		
	}
	public static int power(int power,int value) {
		if(power==0) {
			return 1;
		}
		int ab=value *power(power-1,value);
		return ab;
	}
	public static void removedDuplicated(int[] arr) {
		
		
	}

}
