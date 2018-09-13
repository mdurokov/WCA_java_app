
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
@Table(name = "Competitors")
public class Competitor extends Entity implements Serializable{
    @ManyToOne
    @JoinColumn(name="country_id", nullable = false)
    private Country country_id;
    private String tag;
    private String firstName;
    private String lastName;
    private char gender;

    public Competitor() {
    }

    public Competitor(Country country_id, String tag, String firstName, String lastName, char gender) {
        this.country_id = country_id;
        this.tag = tag;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public Country getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Country country_id) {
        this.country_id = country_id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{id=" + getId() + "country_id=" + country_id + ", tag=" + 
                tag + ", firstName=" + firstName + ", lastName=" + lastName + 
                ", gender=" + gender + '}';
    }
    
    
}
