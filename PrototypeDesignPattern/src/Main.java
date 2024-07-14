import client.ShapeClient;
import prototype.Circle;
import prototype.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circlePrototype =new Circle("red");
        ShapeClient client=new ShapeClient(circlePrototype);
        Shape redCircle= client.createShape();
        redCircle.draw();
    }
}