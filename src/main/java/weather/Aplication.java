package weather;

public class Aplication {
    public static void main(String[] args) {
        Weather weather = new WeatherCityInVietNam();
        String cityName = "Hà Nội";
        String weatherInfo = weather.getWeather(cityName);
        System.out.println(weatherInfo);

        Weather weather1 = new WeatherCityInVietNam();
        String cityName1 = "Hồ Chí Minh";
        String weatherInfo1 = weather.getWeather(cityName1);
        System.out.println(weatherInfo1);

    }
}
