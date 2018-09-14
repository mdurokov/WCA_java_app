
package wca_app.util;

/**
 * @author Mata
 */
public class CustomException extends Exception{
    private String poruka;
    
    public CustomException(String poruka){
        super();
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }
    
    
}
