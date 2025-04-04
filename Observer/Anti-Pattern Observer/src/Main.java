// Anti-Pattern: WeatherStation sabe demais sobre PhoneDisplay!
class WeatherStation {
    private PhoneDisplay phone;
    private int temperature;

    public void setPhoneDisplay(PhoneDisplay phone) {
        this.phone = phone;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        if (phone != null) {
            phone.update(temperature); // Chama diretamente o PhoneDisplay!
        }
    }
}

class PhoneDisplay {
    public void update(int temp) {
        System.out.println("A temperatura é " + temp + "°C");
    }
}

// Uso (frágil e acoplado)
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay();
        station.setPhoneDisplay(phone); // Acoplamento explícito!

        station.setTemperature(25);
        station.setTemperature(40);
    }
}