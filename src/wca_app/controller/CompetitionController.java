
package wca_app.controller;

import java.util.List;
import wca_app.model.Competition;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class CompetitionController extends Controller implements ControllerInterface<Competition>{

    @Override
    public List<Competition> getEntities() {
        return session.createQuery("From Competition").list();
    }

    @Override
    public Competition add(Competition entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Competition update(Competition entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
