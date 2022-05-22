public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 120; // m-масса тела человека в кг
        double h = 1.9; // h- рост человека в м
        double bmi = service.calculate(m, h);
        System.out.println("Ваш индекс массы тела =" + bmi);
    }
}
