public class Invoice{
    private String partnumber;
    private String partdescription;
    private int quantity;
    private int price;

    Invoice(String p_number,String p_description,int quantity, int price){
        partnumber = p_number;
        partdescription = p_description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getInvoiveAmount(){

        if(quantity<0){
            quantity = 0;
        }
        
        if(price<0)
            price = 0;
        
        return quantity * price;
    }

    public static void main(String[]args){
        Invoice obj = new Invoice("1","Book",2,14);

        System.out.println(obj.getInvoiveAmount());
    }
}