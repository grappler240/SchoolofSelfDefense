package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instructor
{
    @Id private int instructorId;
    private String instructorName;



    public int getInstructorId()
    {
        return instructorId;
    }

    public void setInstructorId(int instructorId)
    {
        this.instructorId = instructorId;
    }

    public String getInstructorName()
    {
        return instructorName;
    }

    public void setInstructorName(String instructorName)
    {
        this.instructorName = instructorName;
    }
}
