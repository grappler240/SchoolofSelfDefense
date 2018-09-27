package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentId
{
    @Id
    private Integer id;

    public StudentId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
}
