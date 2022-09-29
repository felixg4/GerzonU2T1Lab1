// Rectangle class definition
public class Rectangle {

    // instance variables
    private int length;
    private int width;

    // constructor method for creating Rectangle objects;
    // instance variables are set here using the values passed as arguments
    public Rectangle(int len, int wid) {
        length = len;
        width = wid;
    }

    // method that calculates and prints area
    public void printArea() {
        int area = length * width;
        System.out.println("My area is " + area);
    }

    public void printPerimeter() {
        System.out.println(2*(length + width));
    }

    public void diagonal() {
        System.out.print(Math.round(Math.sqrt(Math.pow((double) length, 2) + Math.pow((double) width, 2)) * 100)/100.0);
    }
}