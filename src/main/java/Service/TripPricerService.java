package Service;


import org.springframework.stereotype.Service;
import tripPricer.Provider;
import tripPricer.TripPricer;

import java.util.List;
import java.util.UUID;

@Service
public class TripPricerService {

    private final TripPricer tripPricer;

    public TripPricerService(TripPricer tripPricer) {
        this.tripPricer = tripPricer;
    }

    public List<Provider> getPrice(String apiKey, UUID attractionId, int adults,
                                   int children, int nightsStay, int rewardsPoints) {

        List<Provider> price = tripPricer.getPrice(apiKey, attractionId, adults, children,
                nightsStay, rewardsPoints);

        return price;

    }
}