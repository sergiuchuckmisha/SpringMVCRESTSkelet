package hw.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import hw.service.MessageService;

import javax.annotation.Resource;

/**
 * Handles and retrieves person request
 * Управляет и возвращает запрос
 */
@Controller
@RequestMapping("/main")
public class MainController {
    protected static Logger logger = Logger.getLogger("hw/controller");

    @Resource(name="messageService")
    private MessageService messageService;


    /**
    * @return just some string
    */
    @RequestMapping(value = "/smth", method = RequestMethod.GET)
    @ResponseBody
    public String getSmth() {
        return messageService.getSmth();
    }


}
