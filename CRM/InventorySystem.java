public class InventorySystem {
    public static void main(String[] args) {

        String  product_Name = "Chocolates";
        int product_quantity = 50;
        float unit_price = 10.5f;
        int reorder = 20;
        boolean isstatus = true;
        int total_value = (int) (reorder * unit_price); //  total stock price 20 * 10.5
        boolean isproduct_available = product_quantity > reorder; //product available 50<20 ==> true
        boolean issale = isproduct_available && product_quantity > 1; //product is ready for sale or not ==> true AND true = true
        product_quantity--;

        System.out.println("Stock Available:"+ isstatus);
        System.out.println("Stock Value:"+ total_value);
        System.out.println("status of product:"+ isproduct_available);
    }
    
}