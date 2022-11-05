import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Mock
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, food);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, family);
    }

    @Test
    public void getKittensTest() {
        feline.getKittens(10);
        Mockito.verify(feline).getKittens((Mockito.anyInt()));
    }
}
