package BurgerShop.controller;

import BurgerShop.model.BurgerList;
import static BurgerShop.model.BurgerList.addBurgerOrder;
import static BurgerShop.model.BurgerList.sortOrdersByTotalDecending;
import BurgerShop.model.BurgerOrder;
import BurgerShop.model.Node;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BurgerController {
    
    private static File file = new File("Burger.txt");
    
    public static void addBurger(BurgerOrder burger) throws IOException{
        String orderId = burger.getOrderId();
        String customerId = burger.getCustomerId();
        String customerName = burger.getCustomerName();
        int burgerQuantity = burger.getBurgerQuantity();
        double totalAmount = burger.getTotalAmount();
        int orderStatus = burger.getOrderStatus();
        
        FileWriter burgerList = new FileWriter("Burger.txt",true);
        burgerList.write(orderId+","+customerId+","+customerName+","+burgerQuantity+","+totalAmount+","+orderStatus+"\n");
        burgerList.close();
    }
    
    public static String generateOrderId() throws FileNotFoundException{
        
        Scanner input = new Scanner(file);
        String line = "";
        
        if (!file.exists()||file.length()==0) {
            return "B0001";
        }
        
        while (input.hasNextLine()) {
            line = input.nextLine();
        }
        
        int lastOrderIdNum = Integer.parseInt(line.substring(1,5));
        return String.format("B%04d",lastOrderIdNum+1);
    }
    
    public static String getCustomerName(String customerId) throws FileNotFoundException{
       
        Scanner input = new Scanner(file);
        String line = "";
        
        while (input.hasNextLine()) {
            line = input.nextLine();
            String[] order = line.split(",");
            
            if (order[1].equalsIgnoreCase(customerId)) {
                return order[2];
            }
        }
        return null;
    }
    
    public static boolean hasFile(){
        if(!file.exists()||file.length()==0){
            return true;
        }
        return false;
    }
    
    public static void removeDuplicateCustomerId() throws FileNotFoundException{
        
        File file = new File("Burger.txt");
        Scanner input = new Scanner(file);
        String line = "";

        String [] customerIdAr = new String [0];
        String [] customerNameAr = new String [0];
        double [] totalAmountAr = new double [0];

        while (input.hasNextLine()){
            
            line = input.nextLine();
            String[] order = line.split(",");
            
            if("1".equals(order[5])){

                boolean dup = true;
                int index = 0;

                for (int j = 0; j < customerIdAr.length; j++){
                    if(order[1].equals(customerIdAr[j])){
                            index = j;
                            dup = false;
                    }
                }

                if (dup){

                    String [] tempCustomerIdAr = new String [customerIdAr.length+1];
                    String [] tempCustomerNameAr = new String [customerNameAr.length+1];
                    double [] tempTotalAmountAr = new double [totalAmountAr.length+1];

                    for (int j = 0; j < customerIdAr.length ; j++){
                            tempCustomerIdAr[j]=customerIdAr[j];
                            tempCustomerNameAr[j]=customerNameAr[j];
                            tempTotalAmountAr[j]=totalAmountAr[j];
                    }

                    customerIdAr=tempCustomerIdAr;
                    customerNameAr=tempCustomerNameAr;
                    totalAmountAr=tempTotalAmountAr;

                    customerIdAr[customerIdAr.length-1]=order[1];
                    customerNameAr[customerNameAr.length-1]=order[2];
                    totalAmountAr[totalAmountAr.length-1]=Double.parseDouble(order[4]);

                }else{
                        totalAmountAr[index]+=Double.parseDouble(order[4]);
                }
            }
        }
        BurgerList.setCustomerIdAr(customerIdAr);
        BurgerList.setCustomerNameAr(customerNameAr);
        BurgerList.setTotalAmountAr(totalAmountAr);
        BurgerList.sortOrdersByTotalDecending();
    }
    
    public static void dataStoreNode () throws FileNotFoundException{
        BurgerList.setFirst(null);
        
        File file = new File ("Burger.txt");
        Scanner input = new Scanner (file);
        String line;
        
        while(input.hasNextLine()){
            line = input.nextLine();
            String[] orderLine = line.split(",");
            
            BurgerOrder order = new BurgerOrder(orderLine[0],orderLine[1],orderLine[2],Integer.parseInt(orderLine[3]),Integer.parseInt(orderLine[5]));
            BurgerList.addBurgerOrder(order);
        }
    }
    
    public static String[] searchOrder(String orderId) throws FileNotFoundException{
        File file = new File("Burger.txt");
        Scanner input = new Scanner(file);
        String line = "";
        String[] order;

        while (input.hasNextLine()){
            line=input.nextLine();
            order = line.split(",");

            if (order[0].equalsIgnoreCase(orderId)) {
                return order;
            }
        }
        order = null;
        return  order;
    }
    
    public static void dataStoreFile() throws IOException{
        FileWriter fileClear = new FileWriter("Burger.txt",false);
        fileClear.write("");
        fileClear.close();
        
        FileWriter fileWrite = new FileWriter("Burger.txt");
        Node temp = BurgerList.getFirst();
        
        while (temp!=null) {
            String orderId = temp.getOrder().getOrderId();
            String customerId = temp.getOrder().getCustomerId();
            String customerName = temp.getOrder().getCustomerName();
            int burgerQuantity = temp.getOrder().getBurgerQuantity();
            double totalAmount = temp.getOrder().getTotalAmount();
            int orderStatus = temp.getOrder().getOrderStatus();
            
            fileWrite.write(orderId+","+customerId+","+customerName+","+burgerQuantity+","+totalAmount+","+orderStatus+"\n");
            temp = temp.getNext();
        }
        fileWrite.close();
    }
   
    public static int searchCustomerId(String customerId) throws FileNotFoundException{
        
        File file = new File("Burger.txt");
        Scanner input = new Scanner (file);
        String line = "";
        
        String [] orderIdAr = new String [0];
        int [] burgerQuantityAr = new int [0];
        double [] totalAmountAr = new double [0];
        int hasCustomerId = -1;
       
        while (input.hasNextLine()){
            
            line = input.nextLine();
            String[] order = line.split(",");

            if("1".equals(order[5])){
                
                if (order[1].equalsIgnoreCase(customerId)) {

                    String [] tempOrderIdAr = new String [orderIdAr.length+1];
                    int [] tempBurgerQuantityAr = new int [burgerQuantityAr.length+1];
                    double [] tempTotalAmountAr = new double [totalAmountAr.length+1];

                    for (int j = 0; j < orderIdAr.length; j++) {
                
                        tempBurgerQuantityAr[j]=burgerQuantityAr[j];
                        tempOrderIdAr[j]=orderIdAr[j];
                        tempTotalAmountAr[j]=totalAmountAr[j];
                    }
                    hasCustomerId = 1;

                    burgerQuantityAr=tempBurgerQuantityAr;
                    orderIdAr=tempOrderIdAr;
                    totalAmountAr=tempTotalAmountAr;
                    
                    orderIdAr[orderIdAr.length-1]=order[0];
                    burgerQuantityAr[burgerQuantityAr.length-1]=Integer.parseInt(order[3]);
                    totalAmountAr[totalAmountAr.length-1]=Double.parseDouble(order[4]);
                }
            }
        }
        BurgerList.setBurgerQuantityAr(burgerQuantityAr);
        BurgerList.setOrderIdAr(orderIdAr);
        BurgerList.setTotalAmountAr(totalAmountAr);
       
       return hasCustomerId;
    }
    
    public static void searchOrderStatus(int status) throws FileNotFoundException{
        
        File file = new File ("Burger.txt");
        Scanner input = new Scanner (file);
        String line = "";
        
        String [] orderIdAr = new String [0];
        String [] customerIdAr = new String [0];
        String [] customerNameAr = new String [0];
        int [] burgerQuantityAr = new int [0];
        double [] totalAmountAr = new double [0];
       
        while(input.hasNextLine()){
            
            line = input.nextLine();
            String[] order = line.split(",");
            
            if(status==Integer.parseInt(order[5])){
                
                String [] tempOrderIdAr = new String [orderIdAr.length+1];
                String [] tempCustomerIdAr = new String [customerIdAr.length+1];
                String [] tempCustomerNameAr = new String [customerNameAr.length+1];
                int [] tempBurgerQuantityAr = new int [burgerQuantityAr.length+1];
                double [] tempTotalAmountAr = new double [totalAmountAr.length+1];

                for (int j = 0; j < orderIdAr.length; j++) {
                    tempOrderIdAr[j]=orderIdAr[j];
                    tempCustomerIdAr[j]=customerIdAr[j];
                    tempCustomerNameAr[j]=customerNameAr[j];
                    tempBurgerQuantityAr[j]=burgerQuantityAr[j];
                    tempTotalAmountAr[j]=totalAmountAr[j];
                }
                
                orderIdAr=tempOrderIdAr;
                customerIdAr=tempCustomerIdAr;
                customerNameAr=tempCustomerNameAr;
                burgerQuantityAr=tempBurgerQuantityAr;
                totalAmountAr=tempTotalAmountAr;
                
                orderIdAr[orderIdAr.length-1]=order[0];
                customerIdAr[customerIdAr.length-1]=order[1];
                customerNameAr[customerNameAr.length-1]=order[2];
                burgerQuantityAr[burgerQuantityAr.length-1]=Integer.parseInt(order[3]);
                totalAmountAr[totalAmountAr.length-1]=Double.parseDouble(order[4]);
            }
        }
        BurgerList.setOrderIdAr(orderIdAr);
        BurgerList.setCustomerIdAr(customerIdAr);
        BurgerList.setCustomerNameAr(customerNameAr);
        BurgerList.setBurgerQuantityAr(burgerQuantityAr);
        BurgerList.setTotalAmountAr(totalAmountAr);
    }
}
