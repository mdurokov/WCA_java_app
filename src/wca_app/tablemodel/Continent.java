
package wca_app.tablemodel;

/**
 * @author Mata
 */
public class Continent {
    //  INIT VARS
    private int id;
    private String name;
    private String recordName;
    private String latitude;
    private String longitude;
    private int zoom;
    //  END INIT VARS
    
    //  CONSTRUCTORS
    public Continent(int id, String name, String recordName, String latitude, String longitude, int zoom) {
        this.id = id;
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

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
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
            ("Continent [id=%s, name=%s, recordName=%s, longitue=%s, latitude=%s, zoom=%s]",  id, name, recordName, longitude, latitude, zoom);
    }
    
    public String toString(int i){
        return String.format("%s", i);
    }
}
