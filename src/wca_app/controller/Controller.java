
package wca_app.controller;

import org.hibernate.Session;
import wca_app.model.Entity;
import wca_app.util.HibernateUtil;

/**
 * @author Mata
 */
public class Controller {
    protected Session session;
    
    public Controller(){
        session = HibernateUtil.getSession();
    }
    
    protected void saveEntity(Entity entity){
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }
    
    public void deleteEntity(Entity entity){
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
