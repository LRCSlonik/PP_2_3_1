package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private final CarService CarService;

    public CarsController(CarService CarService) {
        this.CarService = CarService;
    }

    @GetMapping("/cars")
    public String getCars(
            @RequestParam(value = "count", required = false, defaultValue = "0") int count,
            Model model) {
        if (count <= 0 || count >= CarService.getAllCars().size()) {
            model.addAttribute("cars", CarService.getAllCars());
        } else {
            model.addAttribute("cars", CarService.byCount(count));
        }
        return "cars";
    }
}
