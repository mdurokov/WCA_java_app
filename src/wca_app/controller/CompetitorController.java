
package wca_app.controller;

import java.util.List;
import wca_app.model.Competitor;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class CompetitorController extends Controller implements ControllerInterface<Competitor>{

    @Override
    public List<Competitor> getEntities() {
        return session.createQuery("From Competitor").list();
    }

    @Override
    public Competitor add(Competitor entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Competitor update(Competitor entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
