
package wca_app.model;

import java.io.Serializable;
import javax.persistence.Table;

/**
 * @author Mata
 */
@javax.persistence.Entity
@Table(name = "Formats")
public class Format extends Entity implements Serializable{
    // INIT VARS
    private String name;
    
    // CONSTRUCTORS
    public Format(String name) {
        this.name = name;
    }

    public Format() {
    }
    //  END CONSTRUCTORS
    
    //  GETTERS SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //  END GETTERS SETTERS
    
    @Override
    public String toString() {
        return String.format
            ("Format [id=%s, name=%s]",  getId(), name);
    
    } 
    
    public String toString(int i){
        return String.format("%s", i);
    }
}
