package _08_California_Weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather {

	void start() {
		HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
		String userWant = JOptionPane.showInputDialog(
				"Would you like to see weather data for a given city, all cities with a speific weather, or find a city within a range of temperatures?");
		if (userWant.toLowerCase().contains("given city")) {
			String cityName = Utilities.capitalizeWords(JOptionPane.showInputDialog("City name?"));
			WeatherData datum = weatherData.get(cityName);

			if (datum == null) {
				System.out.println("Unable to find weather data for: " + cityName);
			} else {
				System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of "
						+ datum.temperatureF + " F");
			}
		} else if (userWant.toLowerCase().contains("weather")) {
			String desiredWeather = JOptionPane.showInputDialog("Which weather would you like?");
			List<String> citiesThatWork = new ArrayList<>();
			// WeatherData datum;
			for (String city : weatherData.keySet()) {
				if (weatherData.get(city).weatherSummary.equalsIgnoreCase(desiredWeather.trim())) {
					citiesThatWork.add(city);
				}

			}
			System.out.println("Cities with a weather of "+desiredWeather+" include:");
			for(String c : citiesThatWork) {
				System.out.print(" "+c);
			}

		} else if (userWant.toLowerCase().contains("temperature")) {
			String desiredTemp = JOptionPane.showInputDialog("Which temperature would you like?");
			int desiredTempp = Integer.getInteger(desiredTemp);
			List<String> citiesThatWork = new ArrayList<>();
			for (String city : weatherData.keySet()) {
				if (weatherData.get(city).temperatureF==desiredTempp) {
					citiesThatWork.add(city);
				}

			}
			System.out.println("Cities with a temperature of "+desiredTempp+" include:");
			for(String c : citiesThatWork) {
				System.out.print(" "+c);
			}
		}
		// All city keys have the first letter capitalized of each word

	}
}
