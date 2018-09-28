package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State
{
    @Id private String stateId;
    private String stateName;




    public String getStateId()
    {
        return stateId;
    }

    public void setStateId(String stateId)
    {
        this.stateId = stateId;
    }

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }
}
