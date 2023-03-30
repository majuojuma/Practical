public class Rectangle{
    private int lenght;
    private int width;

    Rectangle(int width, int lenght){
        this.lenght = lenght;
        this.width = width;
    }

    double calculateArea(){
        return lenght * width;
    }

    double calculatePerimeter(){
        return 2 * (lenght + width);
    }

    public static void main(String[]args){
        Rectangle obj =  new Rectangle(2,5);

        System.out.println("The value of Area is "+obj.calculateArea());

        System.out.println("The value of Perimeter is "+obj.calculatePerimeter());
    }
}