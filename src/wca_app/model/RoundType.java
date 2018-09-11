
package wca_app.model;

import java.io.Serializable;

/**
 * @author Mata
 */
@javax.persistence.Entity
public class RoundType extends Entity implements Serializable{
    //  INIT VARS
    private int rank;
    private String name;
    private String cellName;
    private int finale;
    
    //  CONSTRUCTORS
    public RoundType(int rank, String name, String cellName, int finale) {
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

    public int getFinale() {
        return finale;
    }

    public void setFinale(int finale) {
        this.finale = finale;
    }
    //  END GETTERS SETTERS
    
    @Override
    public String toString() {
        return String.format
            ("Round type [id=%s, rank=%s, name=%s, cellName=%s, final=%s]",  getId(), rank, name, cellName, finale);
    
    } 
    
    public String toString(int i){
        return String.format("%s", i);
    }
    
    
}
