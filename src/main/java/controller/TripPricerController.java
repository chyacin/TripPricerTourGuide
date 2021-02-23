package controller;


import Service.TripPricerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

@RestController
public class TripPricerController {

    @Autowired
    TripPricerService tripPricerService;

    @GetMapping("/price")
    public List<Provider> getPrice(@RequestParam String apiKey, UUID attractionId, int adults,
                                   int children, int nightsStay, int rewardsPoints) {

        List<Provider> price = tripPricerService.getPrice(apiKey, attractionId, adults, children,
                nightsStay, rewardsPoints);

        return price;

    }
}
