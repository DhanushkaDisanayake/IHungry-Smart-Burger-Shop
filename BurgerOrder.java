package BurgerShop.model;
public class BurgerOrder{
	private static final int PREPARING = 0;
	private static final int DELIVERED = 1;
	private static final int CANCEL = 2;
	
        private static final int BURGER_PRICE = 500;
	
        private String orderId;
	private String customerId;
	private String customerName;
	private int burgerQuantity;
	private int orderStatus;
        private double totalAmount;

    public BurgerOrder(String orderId,String customerId,String customerName,int burgerQuntity,int orderStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.burgerQuantity = burgerQuntity;
        this.orderStatus = orderStatus;
        this.totalAmount = burgerQuntity*BURGER_PRICE;
    }
    
    public static int getBURGER_PRICE(){
        return BURGER_PRICE;
    }
    
    public static int getPREPARING(){
        return PREPARING;
    }
    
    public static int getDELIVERED(){
        return DELIVERED;
    }
    
    public static int getCANCEL(){
        return CANCEL;
    }
    
    public double getTotalAmount(){
        return totalAmount;
    }
    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the burgerQuantity
     */
    public int getBurgerQuantity() {
        return burgerQuantity;
    }

    /**
     * @param burgerQuantity the burgerQuantity to set
     */
    public void setBurgerQuantity(int burgerQuantity) {
        this.burgerQuantity = burgerQuantity;
    }

    /**
     * @return the orderStatus
     */
    public int getOrderStatus() {
        return orderStatus;
    }

    /**
     * @param orderStatus the orderStatus to set
     */
    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
}