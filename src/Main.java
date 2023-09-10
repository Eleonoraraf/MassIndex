public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BodyWeight = 98;
        int height = 187;
        int miles = service.calculate( 98, 187);
        System.out.println(miles);
    }
}