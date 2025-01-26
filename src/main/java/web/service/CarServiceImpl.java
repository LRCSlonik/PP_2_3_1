package web.service;


import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    public CarServiceImpl() {
        this.carList = new ArrayList<>();

        carList.add(new Car("bmw", "X6", 9_000_000));
        carList.add(new Car("honda", "civic", 1_500_000));
        carList.add(new Car("lada", "vesta", 1_000_000));
        carList.add(new Car("mercedes-benz", "s600", 15_000_000));
        carList.add(new Car("hammer", "h1", 4_000_000));
    }

    public CarServiceImpl(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> byCount(int count) {
        return carList.subList(0, count);
    }
}
