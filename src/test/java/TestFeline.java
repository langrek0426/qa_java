import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
@RunWith(Parameterized.class)
public class TestFeline {

    int kittensCount;
    int expectedKittensCount;

    public TestFeline(int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;

    }
        @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {10, 10},
                {1, 1}
        };
    }

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
        Feline feline = new Feline();
        int kittens = feline.getKittens(kittensCount);
        Assert.assertEquals(expectedKittensCount, kittens);
    }
}
