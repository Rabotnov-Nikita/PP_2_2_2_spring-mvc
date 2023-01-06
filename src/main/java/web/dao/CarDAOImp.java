package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAOImp implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", 1, "Orange"));
        cars.add(new Car("Toyota", 2, "Black"));
        cars.add(new Car("Honda", 3, "White"));
        cars.add(new Car("Subaru", 4, "Blue"));
        cars.add(new Car("Mitsubishi", 5, "Red"));
    }
    @Override
    public List<Car> getSomeCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
