public class BmiService {
    public double calculate(double mass, double height) {
        double result = mass / (height * height); // mass-масса тела в кг, height-рост человека в м
        return result;
    }

}
