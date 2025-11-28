package org.client;


import org.application.GSNormalAcc;
import org.application.GSPrimeAcc;
import org.application.GSShopFactory;
import org.framework.NormalAcc;
import org.framework.PrimeAcc;
import org.framework.ShopFactory;


public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(2345, "Spoorthi", 1000, true);
		NormalAcc n=new GSNormalAcc(2346, "Anu", 900, 60);
		System.out.println("Prime Account Details:");
		p.bookProduct(p.getCharges());
		
		System.out.println("Normal Account Details:");
		n.bookProduct(n.getCharges());
		
		System.out.println(p);
		System.out.println(n);
		
		

	}

}
