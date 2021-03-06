
package wca_app.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author Mata
 */
@javax.persistence.Entity
@Table(name = "Continents")
public class Continent extends Entity implements Serializable{
    //  INIT VARS
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String recordName;
    @Column(nullable=false)
    private BigInteger latitude;
    @Column(nullable=false)
    private BigInteger longitude;
    @Column(nullable=false)
    private int zoom;
    //  END INIT VARS
    
    //  CONSTRUCTORS
    public Continent(String name, String recordName, BigInteger latitude,
            BigInteger longitude, int zoom) {
        this.name = name;
        this.recordName = recordName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
    }

    public Continent() {
    }
    //  END CONSTRUCTORS

    //  GETTERS SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public BigInteger getLatitude() {
        return latitude;
    }

    public void setLatitude(BigInteger latitude) {
        this.latitude = latitude;
    }

    public BigInteger getLongitude() {
        return longitude;
    }

    public void setLongitude(BigInteger longitude) {
        this.longitude = longitude;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }
    //  END GETTERS SETTERS

    
    @Override
    public String toString() {
        return String.format
            ("Continent [id=%s, name=%s, recordName=%s, longitue=%s," +
                    " latitude=%s, zoom=%s]",  getId(), name, recordName,
                    longitude, latitude, zoom);
    }
    
    public String toString(int i){
        return String.format("%s", i);
    }
}
