
package wca_app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Mata
 */
@javax.persistence.Entity
@Table(name = "Countries")
public class Country extends Entity implements Serializable{
    @ManyToOne
    @JoinColumn(name="continent_id", nullable=false)
    private Continent continent_id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String iso2;

    public Country() {
        
    }

    public Country(Continent continent_id, String name, String iso2) {
        this.continent_id = continent_id;
        this.name = name;
        this.iso2 = iso2;
    }
    
    public Continent getContinent_id() {
        return continent_id;
    }

    public void setContinent_id(Continent continent_id) {
        this.continent_id = continent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    @Override
    public String toString() {
        return "Country{ id=" + getId() + "continent_id=" + continent_id + 
                ", name=" + name + ", iso2=" + iso2 + '}';
    }
    
    
    
}
