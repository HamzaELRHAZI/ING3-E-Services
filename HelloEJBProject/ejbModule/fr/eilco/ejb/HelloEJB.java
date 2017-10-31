package fr.eilco.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.eilco.ing.bean.HelloBean;

/**
 * Session Bean implementation class HelloEJB
 */
@Stateless(mappedName = "HelloJNDI")
public class HelloEJB implements HelloEJBRemote, HelloEJBLocal {

	@PersistenceContext(unitName="managerHello")
	EntityManager mh;
    /**
     * Default constructor. 
     */
    public HelloEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void insertEntity(HelloBean bean){
    	mh.persist(bean);   //pour l'insertion
    	mh.flush(); 
    }

}
