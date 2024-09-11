package misa.it2a;

import java.util.Scanner;

public class MISAIT2A {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of Orders: ");
            int numberOfOrders = Integer.parseInt(scanner.nextLine());
            Order[] orders = new Order[numberOfOrders];
            
            for (int i = 0; i < numberOfOrders; i++) {
                System.out.println("\nEnter details of order " + (i + 1) + ":");
                
                System.out.print("Order ID: ");
                int orderId = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Customer Name: ");
                String customerName = scanner.nextLine();
                
                System.out.print("Order Date: ");
                String orderDate = scanner.nextLine();
                
                System.out.print("Order Amount: ");
                double orderAmount = Double.parseDouble(scanner.nextLine());
                
                System.out.print("Order Status: ");
                String orderStatus = scanner.nextLine();
                
                orders[i] = new Order(orderId, customerName, orderDate, orderAmount, orderStatus);
            }
            
            System.out.println("\nOrder ID   Customer Name Order Date  Order Amount Order Status");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }
}

 
