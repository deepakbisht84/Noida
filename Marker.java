class Marker
{
	String color;
	int price;
	final String brand="cello";

public static void main(String[] args) {
	Marker m=new Marker();
	m.color="blue";
	m.price=20;

	System.out.println("color= "+m.color);
	System.out.println("price= "+m.price);
	System.out.println("brand= "+m.brand);
	
	}}