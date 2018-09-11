
package wca_app.util;

import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import org.hibernate.Session;
import wca_app.model.Operator;

/**
 * @author Mata
 */
public class Autorization {
    public static String getHash(String lozinka){
         try {
            byte[] salt = new byte[16];
            salt="1214525214525252".getBytes();
            KeySpec spec = new PBEKeySpec(lozinka.toCharArray(), salt, 65536, 128);
            SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

            byte[] hash = f.generateSecret(spec).getEncoded();
            Base64.Encoder enc = Base64.getEncoder();
            return enc.encodeToString(hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
         return String.valueOf(Math.random());
    }
    
    public static Operator AuthenticateOperator(String email, char[] password){
        Session session = HibernateUtil.getSession();
        System.out.println(getHash(String.valueOf(password)));
        return (Operator)session.createQuery("from Operator where "
                + " email=:email and password=:password")
                .setString("email", email)
                .setString("password", getHash(String.valueOf(password)))
                .uniqueResult();
    }
    
}
