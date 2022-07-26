import ru.netology.sqr.HMmaven.services.SQRService;

public class Main {
    public static void main(String args[]) {
        SQRService service = new SQRService();
        System.out.println(service.sqrServiceCalc(-56, -45));
    }
}
