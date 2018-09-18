
package wca_app.controller;

import java.util.List;
import wca_app.model.Scramble;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class ScramblesController extends Controller implements ControllerInterface<Scramble>{

    @Override
    public List<Scramble> getEntities() {
        return session.createQuery("From Scramble").list();
    }

    @Override
    public Scramble add(Scramble entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Scramble update(Scramble entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
