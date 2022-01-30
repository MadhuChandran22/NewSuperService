package org.air;

import org.road.Road;
import org.transport.Air;
import org.water.Water;

public class Transport {

public void transportForm() {
	System.out.println("Transport forms are Road, Air and Water ways");
}
public static void main(String [] args) {
	Transport d= new Transport();
	d.transportForm();
	Road e= new Road();
	e.bike();
	e.cycle();
	e.bus();
	e.car();
	Air f=new Air();
	f.aeroplane();
	f.helicopter();
	Water g=new Water();
	g.boat();
	g.ship();
}
}
