
package wca_app.tablemodel;

/**
 * @author Mata
 */
public class Event {
    //  INIT VARS
    private int id;
    private String name;
    private int rank;
    private String format;
    private String cellName;
    
    //  CONSTRUCTORS
    public Event(int id, String name, int rank, String format, String cellName) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.format = format;
        this.cellName = cellName;
    }

    public Event() {
    }
    //  END CONTSTRUCTORS
    
    //  GETTERS SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }
    //  END GETTERS SETTERS
    
    @Override
    public String toString() {
        return String.format
            ("Event [id=%s, name=%s, rank=%s, format=%s, cellName=%s]",  id, name, rank, format, cellName);
    
    } 
    
    public String toString(int i){
        return String.format("%s", i);
    }
    
}
