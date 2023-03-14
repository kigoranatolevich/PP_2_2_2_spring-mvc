package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(name = "count") Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model1", "color1", 1000));
        cars.add(new Car("Model2", "color2", 2000));
        cars.add(new Car("Model3", "color3", 3000));
        cars.add(new Car("Model4", "color4", 4000));
        cars.add(new Car("Model5", "color5", 5000));
        model.addAttribute("cars", new CarServiceImpl().getNumbersOfCars(cars, count));
        return "cars";
    }
}
