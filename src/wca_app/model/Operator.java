
package wca_app.model;

import java.io.Serializable;

/**
 * @author Mata
 */
@javax.persistence.Entity
public class Operator extends Entity implements Serializable{
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
