public class BmiService {
    public double calculate (double m, double h) {
        double result = m/(h*h); // m-масса тела в кг, h-рост человека в м
        return result;
    }

}
