
package wca_app.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Mata
 */
@javax.persistence.Entity
@Table(name = "Competitions")
public class Competition extends Entity implements Serializable{
    @ManyToOne
    @JoinColumn(name="country_id", nullable=false )
    private Country country_id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String city;
    private String information;
    @Column(nullable=false)
    private Date startDate;
    @Column(nullable=false)
    private Date endDate;
    private String specification;
    private String wcaDelegate;
    private String organiser;
    private String venue;
    private String venueAddress;
    private String venueDetails;
    private String website;
    @Column(nullable=false)
    private String cellName;
    private BigInteger latitude;
    private BigInteger longitude;

    public Competition() {
    }

    public Competition(Country country_id, String name, String city,
            Date startDate, Date endDate, String cellName) {
        this.country_id = country_id;
        this.name = name;
        this.city = city;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cellName = cellName;
    }
    
    public Country getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Country country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getWcaDelegate() {
        return wcaDelegate;
    }

    public void setWcaDelegate(String wcaDelegate) {
        this.wcaDelegate = wcaDelegate;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getVenueDetails() {
        return venueDetails;
    }

    public void setVenueDetails(String venueDetails) {
        this.venueDetails = venueDetails;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
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

   

    
}
