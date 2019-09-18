package homework;

public class Circle {
    public Float radius;
    public Circle(Float radius){
        this.radius=radius;
    }
    public void calculateArea(Float n){
        System.out.println(Math.pow(n, 2)*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
