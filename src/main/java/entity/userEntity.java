package entity;

public class userEntity {
public Integer user;
public String password;
public String  acount;

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getUser() {
        return user;
    }

    public String getAcount() {
        return acount;
    }

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "userEntity{" +
                "user=" + user +
                ", password='" + password + '\'' +
                ", acount='" + acount + '\'' +
                '}';
    }
}
