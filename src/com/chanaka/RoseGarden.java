package com.chanaka;

import java.util.ArrayList;

public class RoseGarden {
	public static ArrayList <Rose> roses;
	
	/*static {
		roses = new ArrayList<>();
		roses.add(new Rose("Red","Lover Rose"));
		roses.add(new Rose("white","Friendship Rose"));
		roses.add(new Rose("Pink","Rose"));
	}*/
	
	{
		roses = new ArrayList<>();
		roses.add(new Rose("Red","Lovers Rose"));
	}
	
	public RoseGarden() {
		
	}
	
	public RoseGarden(String name, String color, int nor) {
		for(int x = 0; x<nor; x++) {
			roses.add(new Rose(color,name));
		}
		
	}
	
	
	
	public void getRoses() {
		
		/*class RoseValidator{
				private void validator(String name) {
					if("RED".equalsIgnoreCase(name)) {
						System.out.println("Valid");
					}else {
						System.out.println("invalid");
					}

				}
		}*/
		
		new Object(){
			private void validator(String name) {
				if("RED".equalsIgnoreCase(name)) {
					System.out.println("Valid");
				}else {
					System.out.println("invalid");
				}

			}
	}.validator("Red");
			for (Rose rose:roses) {
					System.out.println(rose.toString());
			}
			
			//                        new RoseValidator().validator("red");
	}
	
	public void addRose(String color, String name) {
		roses.add(new Rose(color,name));
		// newRosevalidator();
	}
	
	class Rose {
		String color;
		String name;
		
		public Rose(String color, String name) {
			this.color = color;
			this.name = name;
		}
		
		public String toString(){
			return "name :"+name+" Color : "+color;
		}
		
	}

}
