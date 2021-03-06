package seafilejavasdk.accountobjects;

import java.util.List;

/**
 * @author liudongyu1119@outlook.com
 * @version 1.5
 * @date 2019/04/17
 */
public class ServerInfo {

    private String version;
    private List<String> features;

    public ServerInfo(String version, List<String> features) {
        this.version = version;
        this.features = features;
    }

    public String getVersion() {
        return version;
    }

    public List<String> getFeatures() {
        return features;
    }
}
