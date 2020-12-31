package io.javadev.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javadev.ratingsdataservice.model.Rating;
import io.javadev.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsData")
public class RatingResource {
    
    @RequestMapping("/{movieId}")
    public List<Rating> getMovie(@PathVariable String movieId) {
        
        return Collections.singletonList(new Rating("1234", 5));
    }    

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
                );
        UserRating userRating = new  UserRating();
        userRating.setRatings(ratings);
        return userRating;
    }
}
