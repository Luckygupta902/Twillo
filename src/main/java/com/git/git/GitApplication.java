package com.git.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
		System.out.print("git merge");
		System.out.print("git cnflit main");
		
	}

}
