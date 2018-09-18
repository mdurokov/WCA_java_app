
package wca_app.controller;

import java.util.List;
import wca_app.model.Result;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class ResultsController extends Controller implements ControllerInterface<Result> {

    @Override
    public List<Result> getEntities() {
        return session.createQuery("From Result").list();
    }

    @Override
    public Result add(Result entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Result update(Result entity) throws CustomException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
