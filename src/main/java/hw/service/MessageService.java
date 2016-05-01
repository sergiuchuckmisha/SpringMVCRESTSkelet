package hw.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for processing Message
 * Сервис для класса Message
 */
@Service("messageService")
@Transactional
public class MessageService {

    protected static Logger logger = Logger.getLogger("hw/service");


    //test method just to return smth
    public String getSmth() {
        return "smth";
    }
}
