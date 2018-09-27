package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User
{

    @Id private String userName;
    private String passWord;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassWord()
    {
        return passWord;
    }

    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }
}
