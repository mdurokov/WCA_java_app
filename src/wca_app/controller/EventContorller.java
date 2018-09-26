
package wca_app.controller;

import java.util.List;
import wca_app.model.Competition;
import wca_app.model.Event;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class EventContorller extends Controller 
        implements ControllerInterface<Event>{

    @Override
    public List<Event> getEntities() {
        return session.createQuery("From Event").list();
    }
    
    public List<Event> getEntities(String condition) {
        return session.createQuery("From Event where name like"
                + " :condition").setString("condition", '%' + condition + '%')
                .list();
    }

    @Override
    public Event add(Event entity) throws CustomException {
        saveEntity(entity);
        return entity;
        
    }

    @Override
    public Event update(Event entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
