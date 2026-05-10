package com.pms.app;

public class ProductMainApp {

	public static void main(String[] args) {
		 ProductDao dao = new ProductDao();

	       System.out.println("**** Insert ****");
	        Product p1 = new Product(101, "Laptop", 55000, 2);
	        dao.addProduct(p1);

	        System.out.println("**** Viwe All ****");
	        dao.getAllProducts();

	       System.out.println("**** Get By Id **** ");
	        dao.getProductById(101);

	        System.out.println("**** Update ****");
	        dao.updateProduct(101, 60000);

	       System.out.println("**** Delete ****");
	        dao.deleteProduct(101);

	    }

	}

