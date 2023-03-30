public class Item {
    

    double full_prices;
    double sale_prices;
    String names;

    public Item(String name,double full,double sale){
        this.names = name;
        full_prices = full;
        sale_prices = sale;
    }

    public Item(String names,double fullPrices){
        this.name = names;
        full_price = fullPrices;
        sale_price = full_prices / 2;
        
    }

    public static String Format(double price){
        if(price >0){
            return String.format("%.2f",price) + " $";
        }
        
        return (price) + "$";
    }

    public String toString(){
        return "Item : " + name + " Full price : " + Format(full_price) + " Sales price: "+ Format(sale_price);
    }

    public void full_price(double d) {
    }
    
    

   
    
}
