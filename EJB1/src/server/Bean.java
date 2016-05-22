package server;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Bean
 */
@Stateless
@LocalBean
public class Bean {

    /**
     * Default constructor. 
     */
    public Bean() {
        // TODO Auto-generated constructor stub
    }
    
    public String sayHello(String name){
    	return "Hello " + name;
    }

}
