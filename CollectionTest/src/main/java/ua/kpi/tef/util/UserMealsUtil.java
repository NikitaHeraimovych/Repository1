package ua.kpi.tef.util;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {

        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );

//        .toLocalDate();
//        .toLocalTime();
        System.out.println ( getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000));
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // TODO return filtered list with correctly exceeded field

        Map<LocalDate, Integer> map = mealList.stream ().collect (Collectors.groupingBy (o->o.getDateTime ().toLocalDate (), Collectors.summingInt (UserMeal::getCalories)));
        return mealList.stream ()
                .filter (o->TimeUtil.isBetween (o.getDateTime ().toLocalTime (), startTime, endTime))
                .map (o-> new UserMealWithExceed (o.getDateTime (),o.getDescription (), o.getCalories (), (map.get (o.getDateTime ().toLocalDate ())>caloriesPerDay)))
                .collect(Collectors.toList());
    }
}
