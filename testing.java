class shape{
    public void display(){
        System.out.println("\nInside display");
    }
}
class Rectangle extends shape{
    public void area(){
        System.out.println("Inside area");
    }
}
public class testing{
    public static void main (String[] args){
        Rectangle rect= new Rectangle();
        rect.display();
        rect.area();
    }
}