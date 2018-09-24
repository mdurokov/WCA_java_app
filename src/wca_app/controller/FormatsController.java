
package wca_app.controller;

import java.util.List;
import wca_app.model.Format;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class FormatsController extends Controller
        implements ControllerInterface<Format>{

    @Override
    public List<Format> getEntities() {
        return session.createQuery("From Format").list();
    }
    
    public List<Format> getEntities(String condition) {
        return session.createQuery("From Format where name like :condition")
                .setString("condition", '%'
                + condition + '%').list();
    }

    @Override
    public Format add(Format entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

    @Override
    public Format update(Format entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
