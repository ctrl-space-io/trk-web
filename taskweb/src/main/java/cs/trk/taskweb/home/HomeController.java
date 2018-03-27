package cs.trk.taskweb.home;

import cs.trk.taskweb.util.TaskWebProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class HomeController {
    private static Logger logger = Logger.getLogger(String.valueOf(HomeController.class));

    @Autowired
    private TaskWebProperties taskWebProperties;

    @RequestMapping("/home")
    public String goHome() {
        logger.info("Go home..");
        logger.trace("Go home..");
        logger.debug("Go home..");
        logger.error("Go home..");
        logger.warn("Go home..");

        System.out.println("s SYSOUT: go home ... ");

        return "src/app";
    }

    @RequestMapping("/testlivereload")
    public String  testlivereload() {
        return "Devi Gopalan";

    }

    @RequestMapping("/displayProperties")
    public String displayProperties() {
        String message = "-- Properties --" + "<BR>";
        message += "APPLICATION Name: " + taskWebProperties.appName + "<BR>";
        message += "SERVICE URL : " + taskWebProperties.userServiceHost + "<BR>";
        return message;
    }
}
