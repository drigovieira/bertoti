public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay(station);

        station.setTemperature(25); // Notifica o PhoneDisplay
        station.setTemperature(30); // Notifica novamente
    }
}