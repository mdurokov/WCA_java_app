
package wca_app.controller;

import java.util.List;
import wca_app.model.Competition;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class CompetitionController extends Controller 
        implements ControllerInterface<Competition>{

    @Override
    public List<Competition> getEntities() {
        return session.createQuery("From Competition").list();
    }
    
    public List<Competition> getEntities(String condition) {
        return session.createQuery("From Competition where name like"
                + " :condition").setString("condition", '%' + condition + '%')
                .list();
    }

    @Override
    public Competition add(Competition entity) throws CustomException {
        saveEntity(entity);
        return entity;
        
    }

    @Override
    public Competition update(Competition entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
