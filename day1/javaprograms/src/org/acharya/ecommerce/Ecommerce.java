package com.kaushalya.ecommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Ecommerce {
	ArrayList<Product> productList = null;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ecommerce ec = new Ecommerce();
		ec.productList = new ArrayList<Product>();
			
		Product prod1 = new Product(1,"Mobile",20000);
		ec.createProduct(prod1);		
		Product prod2 = new Product(2,"TV",50000);
		ec.createProduct(prod2);		
		ec.getProductList();
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the product id to be deleted");
		int productid = scr.nextInt();
		ec.deleteProduct(productid);
		ec.getProductList();
		
	}	
	
	public void createProduct(Product prd)
	{
		productList.add(prd);
	}	
	public void getProductList()
	{
		for (int i=0;i<productList.size();i++)
		{
			Product prd = productList.get(i);
			String prodInfo = prd.info();
			System.out.println("List of Products "+prodInfo);
		}
	}
	
	public void deleteProduct(int id)
	{
		int productIndex = 0;
		for (int i=0;i<productList.size();i++)
		{
			Product prd = productList.get(i);
			if (prd.productId == id)
			{
				productIndex = i;
				
				break;
			}
			
		}
		
		productList.remove(productIndex);
		
		
	}
	
	

}
