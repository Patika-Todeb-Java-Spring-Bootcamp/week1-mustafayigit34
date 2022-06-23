package immutable;

import immutable.Car.Model;
import java.awt.Color;
import java.awt.color.ICC_Profile;
import java.time.LocalDate;
import java.util.Date;

public class Immutable {

    public static void main(String[] args) {
        Car car = new Car(Model.FORD, 2000, 5, new Date(), 10, Color.BLACK);
        Car car = new Car(Model.TOYOTA, 1999, 4, new Date(), 9, Color.GREEN);
       
    }
}
