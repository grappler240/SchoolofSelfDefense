package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Technique
{
    @Id
    private int techniqueId;
    private String techniqueName;
    private String beltLevel;



    public int getTechniqueId()
    {
        return techniqueId;
    }

    public void setTechniqueId(int techniqueId)
    {
        this.techniqueId = techniqueId;
    }

    public String getTechniqueName()
    {
        return techniqueName;
    }

    public void setTechniqueName(String techniqueName)
    {
        this.techniqueName = techniqueName;
    }

    public String getBeltLevel()
    {
        return beltLevel;
    }

    public void setBeltLevel(String beltLevel)
    {
        this.beltLevel = beltLevel;
    }
}
