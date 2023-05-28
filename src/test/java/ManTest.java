import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManTest {
    private Man man;

    @BeforeMethod
    public void createMan() {
        man = new Man ("Vasyl", "Petrenko", 64);
    }


    @Test
    public void testGetFirstName() {
            String firstName = man.getFirstName();
            Assert.assertEquals(firstName, "Vasyl");
        }

    @Test
    public void testSetFirstName() {
        man.setFirstName("Vasyl");
        String firstName = man.getFirstName();
        Assert.assertEquals(firstName, "Vasyl");
    }

    @Test
    public void testGetLastName() {
        String lastName = man.getLastName();
        Assert.assertEquals(lastName, "Petrenko");
    }

    @Test
    public void testSetLastName() {
        man.setLastName("Kuzmenko");
        String lastName = man.getLastName();
        Assert.assertEquals(lastName, "Kuzmenko");
    }

    @Test
    public void testGetAge() {
        int age = man.getAge();
        Assert.assertEquals(age, 64);
    }

    @Test
    public void testSetAge() {
        man.setAge(35);
        int age = man.getAge();
        Assert.assertEquals(age, 35);
    }

    @Test
    public void testIsRetired_NotRetired() {
        boolean isRetired = man.isRetired();
        Assert.assertFalse(isRetired);
    }
}
