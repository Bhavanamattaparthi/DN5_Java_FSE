package com.cognizant.forecasting;

public class Forecast {

    public static double futureValue(double currentValue,
                                     double growthRate,
                                     int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }
        return futureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }
}