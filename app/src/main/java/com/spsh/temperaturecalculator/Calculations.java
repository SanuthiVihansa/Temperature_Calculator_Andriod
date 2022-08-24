package com.spsh.temperaturecalculator;

public class Calculations {

    public Double convertCelciusToFahrenheit(Double value) {
        Double ans = (value * 9/5) + 32;
        return ans;
    }
    public Double convertFahrenheitToCelcius(Double value) {
        Double ans = (value - 32) * 5/9;
        return ans;
    }
}
