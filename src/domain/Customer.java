package domain;

public class Customer {
    public int ID = 1;
    public boolean isNew = true;
    public double total = 1000;
    
    public void displayCustomerinfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is customer new: " + isNew);
        System.out.println("Total: " + total);
  } 
    
}
