import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;



//    @Parameterized.Parameters
//    public static Object[][] getData() {
//        return new Object[][]{
//                {"Самец", true},
//                {"Самка", false}
//        };
//    }
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(10);
        int kittens = lion.getKittens();
        int expectedKittens = 10;
        Assert.assertEquals(expectedKittens, kittens);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> food = lion.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, food);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean hasMane = lion.doesHaveMane();
        boolean expectedHasMane = true;
        Assert.assertEquals(expectedHasMane, hasMane);
    }
}
