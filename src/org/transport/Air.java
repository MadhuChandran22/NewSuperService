package org.transport;

public class Air {
	
public void aeroplane() {
	System.out.println("Aeroplane is used to travel one to another Country ");
}
public void helicopter() {
	System.out.println("Helicopter is used to travel one to another Country with less Amount of Persons");
}
public static void main(String[] args) {
	Air f=new Air();
	f.aeroplane();
	f.helicopter();
}
}