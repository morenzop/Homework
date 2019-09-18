package homework;

public class Triangle {
    public Float length;
    public Triangle(Float length){
        this.length=length;
    }
    public void calculateArea(Float n){
        System.out.println(n+n+n);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                '}';
    }
}
