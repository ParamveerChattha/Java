package com.param.insurance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name  = sc.next();
		Inputs inp = new Inputs();
		inp.setId(id);
		inp.setName(name);
		Surv s = new Surv();
		s.test(imp);
		
	}

}
