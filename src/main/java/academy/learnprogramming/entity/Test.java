package academy.learnprogramming.entity;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


/**
 *
 * @author Roger
 */
@ApplicationScoped
public class Test {
    @Inject Logger logger;
    
    @PostConstruct
    private void init(){
        logger.log(Level.INFO, "***************************");
        logger.log(Level.INFO, "***************************");
        logger.log(Level.INFO, "hi there, this is a logger");
        logger.log(Level.INFO, "***************************");
        logger.log(Level.INFO, "***************************");
    }
}