import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.HMmaven.services.SQRService;

public class SqrServiceTest {


    @ParameterizedTest
//    @CsvSource({
//            "200,300,3"
//    })
    @CsvFileSource(files = "src/test/resources/SqrRange.csv")
    public void upperBorder(int low, int hight, int expected) {
        SQRService service = new SQRService();

        //int expected = 1;
        int actual = service.sqrServiceCalc(low, hight);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void lowerBorder() {
//        SQRService service = new SQRService();
//
//        int expected = 1;
//        int actual = service.sqrServiceCalc(99, 101);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void allRange() {
//        SQRService service = new SQRService();
//
//        int expected = 90;
//        int actual = service.sqrServiceCalc(99, 9802);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void notValidUp() {
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.sqrServiceCalc(9803, 10000);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void notValidLow() {
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.sqrServiceCalc(1, 99);
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void negativeRange() {
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.sqrServiceCalc(-1, -898);
//
//        Assertions.assertEquals(expected, actual);
//    }



}