package pl.sda;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class TemperatureConverterTest {

    @ParameterizedTest
    @EnumSource(TemperatureConverter.class)
    void convertTemp(TemperatureConverter temperatureConverter) {
        float v = temperatureConverter.convertTemp(100f);
        System.out.println(v);
    }
}