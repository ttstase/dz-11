import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    Person man = new Man("Vasyl", "Petrenko", 64);
    Person woman = new Woman("Maria", "Lysenko", 63);

    @Test
    public void testManIsRetired() {
        Assert.assertFalse(man.isRetired());
    }

    @Test
    public void testWomanIsRetired() {
        Assert.assertTrue(woman.isRetired());
    }

    @Test
    public void testWomanRegisterPartnership() {
        woman.registerPartnership(man);
        Person partner = woman.getPartner();

        Assert.assertNotNull(partner);
    }
    @Test
    public void testGetWomanPartnerFirstName() {
        woman.registerPartnership(man);
        Person partner = woman.getPartner();

        Assert.assertEquals(partner.getFirstName(), "Vasyl");
    }
    @Test
    public void testGetWomanPartnerLastName() {
        woman.registerPartnership(man);
        Person partner = woman.getPartner();

        Assert.assertEquals(partner.getLastName(), "Petrenko");
    }
    @Test
    public void testGetWomanPartnerAge() {
        woman.registerPartnership(man);
        Person partner = woman.getPartner();

        Assert.assertEquals(partner.getAge(), 64);
    }
}
