import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTest {
    public String name;
    public float price;
    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters
    public static Object[][] getBunTestData() {
        return new Object[][] {
                { "Достойная",9.99F},
                { "По вкусу вкусная",7.5F },
                { "По сути вкусная",5.0F },
        };
    }

    @Test
    public void getBunName() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(bun.name, bun.getName());
    }
    @Test
    public void getBunPrice() {
        Bun bun = new Bun(name, price);
        Assert.assertEquals(bun.price, bun.getPrice(), 0);
    }
}
