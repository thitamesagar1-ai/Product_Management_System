package com.pms.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductDao {
	SessionFactory sf = HibernateConfig.getSessionFactory();

    // Insert Product
    public void addProduct(Product p) {

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(p);

        tx.commit();

        session.close();

        System.out.println("Product Added Successfully");
    }

    // View All Products
    public void getAllProducts() {

        Session session = sf.openSession();

        List<Product> list =
                session.createQuery("from Product", Product.class).list();

        for(Product p : list) {
            System.out.println(p);
        }

        session.close();
    }

    // Get Product By Id
    public void getProductById(int id) {

        Session session = sf.openSession();

        Product p = session.get(Product.class, id);

        System.out.println(p);

        session.close();
    }

    // Update Product
    public void updateProduct(int id, double price) {

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Product p = session.get(Product.class, id);

        if(p != null) {

            p.setPrice(price);

            session.update(p);

            tx.commit();

            System.out.println("Product Updated");
        }
        else {
            System.out.println("Product Not Found");
        }

        session.close();
    }

    // Delete Product
    public void deleteProduct(int id) {

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        Product p = session.get(Product.class, id);

        if(p != null) {

            session.delete(p);

            tx.commit();

            System.out.println("Product Deleted");
        }
        else {
            System.out.println("Product Not Found");
        }

        session.close();
    }


}
