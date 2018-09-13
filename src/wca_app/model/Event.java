
package wca_app.model;

import java.io.Serializable;
import javax.persistence.Table;

/**
 * @author Mata
 */
@javax.persistence.Entity
@Table(name = "Events")
public class Event extends Entity implements Serializable {
    //  INIT VARS
    private String name;
    private int rank;
    private String format;
    
    //  CONSTRUCTORS
    public Event(String name, int rank, String format) {
        this.name = name;
        this.rank = rank;
        this.format = format;
    }

    public Event() {
    }
    //  END CONTSTRUCTORS
    
    //  GETTERS SETTERS
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    //  END GETTERS SETTERS
    
    @Override
    public String toString() {
        return String.format
            ("Event [id=%s, name=%s, rank=%s, format=%s",
                    getId(), name, rank, format);
    
    } 
    
    public String toString(int i){
        return String.format("%s", i);
    }
    
}
