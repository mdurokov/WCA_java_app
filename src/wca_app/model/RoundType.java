
package wca_app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author Mata
 */
@javax.persistence.Entity
@Table(name = "RoundTypes")
public class RoundType extends Entity implements Serializable{
    //  INIT VARS
    @Column(nullable=false)
    private int rank;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String cellName;
    @Column(nullable=false)
    private boolean finale;
    
    //  CONSTRUCTORS
    public RoundType(int rank, String name, String cellName, boolean finale) {
        this.rank = rank;
        this.name = name;
        this.cellName = cellName;
        this.finale = finale;
    }

    public RoundType() {
    }
    //  END CONSTRUCTORS
    
    //  GETTERS SETTERS

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public boolean getFinale() {
        return finale;
    }

    public void setFinale(boolean finale) {
        this.finale = finale;
    }
    //  END GETTERS SETTERS
    
    @Override
    public String toString() {
        return getName();
    
    } 
    
    public String toString(int i){
        return String.format("%s", i);
    }
    
    
}
