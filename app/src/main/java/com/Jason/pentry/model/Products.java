package com.Jason.pentry.model;
import java.util.LinkedList;


public class Products {

    protected LinkedList<Product> products = new LinkedList<Product>();
    protected int numberOfItems = 0;
    protected double totalPrice = 0;

    public void add(Product product)
    {
        products.add(product);
        updateNumberOfItems();
        updateTotalPrice();
    }
    public void remove(Product product)
    {
        products.remove(product);
    }
    protected Product find(int id)
    {
        for (Product p: products)
            if (p.getId() == id)
                return p;
            return null;
    }
    protected void updateNumberOfItems()
    {
        numberOfItems++ ;
    }
    protected void updateTotalPrice()
    {
        totalPrice += products.getLast().getPrice();
    }
    public double getTotalPrice()
    {
        return totalPrice;
    }
    public int getNumberOfItems()
    {
        return numberOfItems;
    }
}
