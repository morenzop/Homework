package homework;

public class Square {
public Float length;
public Square (Float length){
    this.length = length;
}
public void calculateArea(Float n){
    System.out.println(n*n);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
