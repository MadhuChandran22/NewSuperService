package org.road;

public class Road {

public void bike() {
	System.out.println("Bike only two person travel");
}
public void cycle() {
	System.out.println("Cycle Only One Person travel");
}
public void bus() {
	System.out.println("Bus Can travel more then 10 Persons");
}
public void car() {
	System.out.println("Car Can travel upto five Persons");
}
public static void main(String[] args) {
	Road e= new Road();
	e.bike();
	e.cycle();
	e.bus();
	e.car();
}
}
