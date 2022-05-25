public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 120; // m-масса тела человека в кг
        double height = 1.9; // h-рост человека в м
        double bmi = service.calculate(mass, height);
        System.out.println("Ваш индекс массы тела =" + bmi);
    }
}
