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
			
      int power=sc.nextInt();
      int value=sc.nextInt();
      int total= power(power,value);
      System.out.print(total);
      
		
	}
	public static int power(int power,int value) {
		if(power==0) {
			return 1;
		}
		int ab=value *power(power-1,value);
		return ab;
	}

}
