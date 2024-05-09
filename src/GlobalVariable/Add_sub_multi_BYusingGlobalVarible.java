package GlobalVariable;

import java.util.Scanner;

public class Add_sub_multi_BYusingGlobalVarible {
  int a= 700;
 float b = 500;
		 void addtion() {
	 
	 System.out.println(a+b);
 }
		 void sub() {
			 System.out.println(a-b);
		 }
		 void multi() {
			 System.out.println(a*b);
		 }
		 void modulo() {
			 System.out.println(a%b);
		 }
		 void div() {
			 System.out.println(a/b);
		 }
		 
	public static void main(String[] args) {
		Add_sub_multi_BYusingGlobalVarible addtion = new Add_sub_multi_BYusingGlobalVarible();
		System.out.println(addtion.a);
		addtion.addtion();
		addtion.sub();
		addtion.multi();
		addtion.modulo();
		addtion.div();
		
		System.out.println();
		
	}}