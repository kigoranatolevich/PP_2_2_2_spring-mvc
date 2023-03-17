package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    public List<Car> listCars() {
        return List.of(new Car("Model1", "color1", 1000),
                new Car("Model2", "color2", 2000),
                new Car("Model3", "color3", 3000),
                new Car("Model4", "color4", 4000),
                new Car("Model5", "color5", 5000));
    }
}
