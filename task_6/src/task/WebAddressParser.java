package task;
import java.util.HashMap;


public class WebAddressParser {
    private HashMap<String, String> parameters = new HashMap<>();
    private String login;
    private String password;
    private String scheme;
    private String host;
    private String port;
    private String url;
    private String fragment;



    public WebAddressParser(String address) {
        if (address.contains("://") && address.contains(".")) {
            String[] str = address.split("://");
            scheme = str[0];
            address = str[1];
            if (address.contains("@")) {
                String[] str1 = address.split("@");
                password = str1[0];
                address = str1[1];
            }
            if (password != null){
                String[] str2 = password.split(":");
                login = str2[0];
                password = str2[1];
            }
            if (address.contains("/")) {
                String[] str3 = address.split("/", 2);
                host = str3[0];
                address = str3[1];
            }
            if(host.contains(":")) {
                String[] str4 = host.split(":");
                port = str4[1];
                host = str4[0];
            }
            if (address.contains("#")){
                String[] str5 = address.split("#");
                fragment = str5[1];
                address = str5[0];

            }
            url = address;
            if (address.contains("?")){
                String[] str6 = address.split("\\?");
                url = str6[0];
                address = str6[1];
            }
            if (address.contains("=")){
                String[] str7 = address.split("&");
                for (String s : str7) {
                    String[] str8 = s.split("=");
                    parameters.put(str8[0], str8[1]);
                }
            }
        }
    }

    public boolean isValid() {
        return !(scheme == null && host == null && url == null);
    }
    public String getLogin() {
        if (isValid() && login != null) {
            return login;
        }
        else return "";
    }
    public String getPassword(){
        if (isValid() && password != null) {
            return password;
        }
        else return "";
    }
    public String getScheme(){
        if (isValid()) {
            return scheme;
        }
        else return "";
    }
    public String getHost(){
        if (isValid()) {
            return host;
        }
        else return "";
    }
    public String getPort(){
        if (isValid() && port != null) {
            return port;
        }
        else return "";
    }
    public String getUrl(){
        if (isValid()) {
            return url;
        }
        else return "";
    }
    public String getFragment(){
        if (isValid() && fragment != null) {
            return fragment;
        }
        else return "";
    }
    public HashMap<String, String> getParameters(){
        return parameters;
    }
}
