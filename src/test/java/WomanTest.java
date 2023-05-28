import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomanTest {
    private Woman woman;

    @BeforeTest
    public void createWoman() {
        woman = new Woman ("Maria", "Lysenko", 63);
    }

    @Test
    public void testGetFirstName() {
        String firstName = woman.getFirstName();
        Assert.assertEquals(firstName, "Maria");
    }

    @Test
    public void testSetFirstName() {
        woman.setFirstName("Klaudia");
        String firstName = woman.getFirstName();
        Assert.assertEquals(firstName, "Klaudia");
    }

    @Test
    public void testGetLastName() {
        String lastName = woman.getLastName();
        Assert.assertEquals(lastName, "Lysenko");
    }

    @Test
    public void testSetLastName() {
        woman.setLastName("Kuzmenko");
        String lastName = woman.getLastName();
        Assert.assertEquals(lastName, "Kuzmenko");
    }
    @Test
    public void testGetAge() {
        int age = woman.getAge();
        Assert.assertEquals(age, 63);
    }

    @Test
    public void testSetAge() {
        woman.setAge(30);
        int age = woman.getAge();
        Assert.assertEquals(age, 30);
    }

    @Test
    public void testIsRetired_Retired() {
        boolean isRetired = woman.isRetired();
        Assert.assertTrue(isRetired);
    }
}
