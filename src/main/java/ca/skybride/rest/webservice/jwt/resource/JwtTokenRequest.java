package ca.skybride.rest.webservice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJza3kiLCJleHAiOjE1NTYwNDUwODAsImlhdCI6MTU1NTQ0MDI4MH0.ROkZsdrG96zGrreToMJE7tyKD4a7hdtfBxPhztbwDkEJ96vQUZl059MNNDPexhd4KRZHp2YvPaIskfF-L6wecA"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

