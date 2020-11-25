package Ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Storage {
	Collection<String> Products=new ArrayList<String>();
	Scanner in=new Scanner(System.in);
	private String Item;
	private int quantity;
	public Storage(String item, int quantity) {
		super();
		Item = item;
		this.quantity = quantity;
	}
	public Storage() {

	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void Start() {
		int add=1;
		String r;

		while (add==1) {
			System.out.println("Do you want add new products in the Storage? Answer with (Yes) or (No)");
			r=in.next();
			if(r.equals("Yes")) {
				add=1;
				System.out.println("What product?");
				Products.add(in.next());
			}
			if (r.equals("No")) {
				add=0;
			}
		}

	}
	public void rm() {
		String r;
		int add=1;
		//System.out.println("Do you want remove anything from our storage? Answer with (Yes) or (No)");
		while (add==1) {
			System.out.println("Do you want remove one item? Answer with (Yes) or (No)");
			r=in.next();
			if(r.equals("Yes")) {
				add=1;
				System.out.println("What product?");
				Products.remove(in.next());
			}

			if (r.equals("No")) {
				add=0;
			}

		}
	}
	public void update() {
		String r;
		int add=1;
		System.out.println("Do you want update any item in your list? Answer with (Yes) or (No)");
		r=in.next();
		while (add==1) {
			if(r.equals("Yes")) {
				add=1;
				System.out.println("What product? Type exactely the name of the product you want update.");
				Products.contains(in.next());
				if(Products.contains(in.next())==true) {
					Products.remove(in.next());
					in.nextLine();
					System.out.println("What product you wanna put in that place?");
					Products.add(in.next());
				}
				else
				{
					System.out.println("That product are not in our storage. Enter with one of this products: ");
					for (String i:Products) {
						System.out.println("Products"+i);
					}
				}
			}
			if (r.equals("No")) {
				add=0;
			}
		}
	}
	public void show() {
		System.out.println("Ok. Now our storage look like this: ");
		for (String i : Products) {
			System.out.println("Products: "+i);
		}
	}
}
