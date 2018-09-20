
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
    
    public List<Competitor> getEntities(String condition) {
        return session.createQuery("From Competitor where concat(firstName,"
                + " lastName) like :condition").setString("condition", '%'
                + condition + '%').list();
    }

    @Override
    public Competitor add(Competitor entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

    @Override
    public Competitor update(Competitor entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
