public class PhoneDisplay implements Observer {
    private WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
        this.station.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Phone Display: Temperatura atualizada para " + station.getTemperature() + "°C");
    }
}
