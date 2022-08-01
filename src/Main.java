public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle1 = new Circle();
        circle1.setRadius(5);
        circle1.setColor("blue");
        System.out.println("dien tich hinh tron 1: " + circle1);
        Cylinder cylinder1 = new Cylinder(circle1.getRadius(), circle1.getColor(), 20);
        System.out.println("the tich khoi1: "+ cylinder1);

    }
}