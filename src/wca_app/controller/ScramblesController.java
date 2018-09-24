
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
    
    public List<Scramble> getEntities(String condition) {
        return session.createQuery("From Scramble where scramble like"
                + " :condition").setString("condition", '%' + condition + '%')
                .list();
    }

    @Override
    public Scramble add(Scramble entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

    @Override
    public Scramble update(Scramble entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
