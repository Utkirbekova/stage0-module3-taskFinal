package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(float temperatureCelsius) {

        //(0°C × 9/5) + 32
        float temperatureF = temperatureCelsius * 9 / 5 + 32;
        System.out.println(temperatureF);
    }
}
