import ca.fangyux.adminapp.utils.Utils;
import org.junit.Test;

public class LoginTest {

    @Test
    public void testEncryption() throws Exception {
        String password="Fang1211047349@";

        String encrypted= Utils.MD5(password);

        System.out.println(encrypted);
    }
}