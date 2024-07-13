import obs.Observer;
import obs.PhoneDisplay;
import obs.TVDisplay;
import sub.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        Observer phoneDisplay=new PhoneDisplay();
        Observer tvDisplay=new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("sunny");
    }
}