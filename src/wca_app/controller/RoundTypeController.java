
package wca_app.controller;

import java.util.List;
import wca_app.model.Competition;
import wca_app.model.Event;
import wca_app.model.RoundType;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class RoundTypeController extends Controller 
        implements ControllerInterface<RoundType>{

    @Override
    public List<RoundType> getEntities() {
        return session.createQuery("From RoundType").list();
    }
    
    public List<RoundType> getEntities(String condition) {
        return session.createQuery("From RoundType where name like"
                + " :condition").setString("condition", '%' + condition + '%')
                .list();
    }

    @Override
    public RoundType add(RoundType entity) throws CustomException {
        saveEntity(entity);
        return entity;
        
    }

    @Override
    public RoundType update(RoundType entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
