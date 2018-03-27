package cs.trk.taskweb.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "taskweb")
@Data
public class TaskWebProperties {

    public String appName;
    public String userServiceHost;
}
