
package wca_app.controller;

import java.util.List;
import wca_app.model.Country;
import wca_app.util.CustomException;

/**
 * @author Mata
 */
public class CountryController extends Controller implements ControllerInterface<Country>{

    @Override
    public List<Country> getEntities() {
        return session.createQuery("From Country").list();
    }

    @Override
    public Country add(Country entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

    @Override
    public Country update(Country entity) throws CustomException {
        saveEntity(entity);
        return entity;
    }

}
