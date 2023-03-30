public class Date{
    private int month;
    private int day;
    private int year;

    Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate(){
        if(month >= 1 && month<=12){
            System.out.println(month+"/"+day+"/"+year);
        }else{
            month = 1;
            System.out.println(month+"/"+day+"/"+year);
        }
    }

    public static void main(String[]args){
        Date obj = new Date(6,15,2000);

        //Where the value of month is 17
        Date obj1 = new Date(17,28,2000);

        obj.displayDate();

        obj1.displayDate();

    }
}