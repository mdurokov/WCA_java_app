
package wca_app.controller;

import java.util.List;
import wca_app.model.Result;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class ResultController extends Controller implements ControllerInterface<Result> {

    @Override
    public List<Result> getEntities() {
        return session.createQuery("From Result").list();
    }
    
    public List<Result> getEntities(String condition) {
        return session.createQuery("From Result where id like"
                + " :condition").setString("condition", '%' + condition + '%')
                .list();
    }

    @Override
    public Result add(Result entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

    @Override
    public Result update(Result entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
