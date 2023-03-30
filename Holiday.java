public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void setday(int day){
        this.day = day;
    }
    public int getday(){
        return day;
    }

    public void setmonth(String month){
        this.month = month;
    }
    public String getmonth(){
        return month;
    }


    public boolean inSameMonth(Holiday hol){
        return this.month.equals(hol.month);
    }
    public static double avgDate(Holiday[] hol) {
        int sum = 0;
        for(int i = 0; i < hol.length; i++) {
        sum = sum + hol[i].day;
        }
        return ((double) sum)/hol.length;
    }

    
    public static void main(String[] args) {
        Holiday hol = new Holiday("Independence Day", 4, "July");

        System.out.println(hol.getname());
        System.out.println(hol.getday());
        System.out.println(hol.getmonth());
    }
    
}
