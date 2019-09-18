package homework;

public class Bicycle {
    public Float cadence;
    public int gear;
    public Float speed;

    public Bicycle(Float cadence, int gear, Float speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(Float n) {
        if (n < speed) {
            System.out.println(speed - n);
        }
    }
        public void speedUp(Float n){
            if (n < speed) {
                System.out.println(speed + n);
            }
        }
    }
