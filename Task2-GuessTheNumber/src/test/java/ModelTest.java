import com.gmail.nikita00.wade.GlobalConstants;
import com.gmail.nikita00.wade.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ModelTest {
    private static Model model;


    @BeforeAll
    public static void init (){
        model = new Model ();
        model.setPrimaryBarrier (GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
    }
    @Test
    @DisplayName (value = "Random number is less then 100 and greater then 0")
    void randomNumberInDiapason () {
        for (int i = 0; i < 1000000000; i++) {
            model.setRandomNumber ();
            Assertions.assertTrue (model.getRandomNumber () < GlobalConstants.PRIMARY_MAX_BARRIER &&
                    model.getRandomNumber () > GlobalConstants.PRIMARY_MIN_BARRIER);
        }
    }
}
