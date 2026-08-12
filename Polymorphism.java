abstract class Polymorphism {

  
    abstract void calculateArea();

    
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Polymorphism {
    double radius = 5;

    // Overriding abstract method
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Polymorphism {
    double length = 10;
    double width = 5;


    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}


public class Main {
    public static void main(String[] args) {

   
        Polymorphism shape;

        shape = new Circle();
        shape.display();
        shape.calculateArea();

        System.out.println();

        shape = new Rectangle();
        shape.display();
        shape.calculateArea();
    }
}



