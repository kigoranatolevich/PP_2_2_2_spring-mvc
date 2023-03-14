package web.service;

import web.model.Car;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getNumbersOfCars(List<Car> carList, Integer count) {
        return carList.stream().limit(count).toList();
    }
}
