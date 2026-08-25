package ScenarioBased;

class Car {
    int speed;
    int numberOfTyres;

    void accelerate() {
        System.out.println("Car is accelerating");
    }

    void speed() {
        System.out.println("Car speed is " + speed);
    }
}

class BMW extends Car {


    void accelerate() {
        System.out.println("BMW is accelerating quickly");
    }

   
    void speed() {
        System.out.println("BMW speed is " + speed + " km/h");
    }
}

public class CarExample {
    public static void main(String[] args) {

        BMW bmw = new BMW();

        bmw.speed = 200;
        bmw.numberOfTyres = 4;

        bmw.accelerate();
        bmw.speed();
    }
}
