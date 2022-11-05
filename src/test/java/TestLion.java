import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestLion {

    private String sex;
    private boolean expectedHasMane;

    public TestLion(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;

    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int kittens = lion.getKittens();
        int expectedKittens = 1;
        Assert.assertEquals(expectedKittens, kittens);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> food = lion.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, food);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMane, hasMane);
    }
}
