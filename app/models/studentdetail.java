package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class studentdetail
{
    @Id private int studentId;
    private String lastName;
    private String firstName;
    private String studentAddress;
    private String cityName;
    private String stateId;
    private String zipCode;
    private int techniqueId;
    private boolean contractStatus;
    private int instructorId;
    private String paymentFrequencyId;
    private Date startDate;

    public studentdetail(int studentId, String lastName, String firstName, String studentAddress, String cityName, String stateId, String zipCode, int techniqueId, boolean contractStatus, int instructorId, String paymentFrequencyId, Date startDate)
    {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentAddress = studentAddress;
        this.cityName = cityName;
        this.stateId = stateId;
        this.zipCode = zipCode;
        this.techniqueId = techniqueId;
        this.contractStatus = contractStatus;
        this.instructorId = instructorId;
        this.paymentFrequencyId = paymentFrequencyId;
        this.startDate = startDate;
    }


    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getStudentAddress()
    {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress)
    {
        this.studentAddress = studentAddress;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getStateId()
    {
        return stateId;
    }

    public void setStateId(String stateId)
    {
        this.stateId = stateId;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public int getTechniqueId()
    {
        return techniqueId;
    }

    public void setTechniqueId(int techniqueId)
    {
        this.techniqueId = techniqueId;
    }

    public boolean isContractStatus()
    {
        return contractStatus;
    }

    public void setContractStatus(boolean contractStatus)
    {
        this.contractStatus = contractStatus;
    }

    public int getInstructorId()
    {
        return instructorId;
    }

    public void setInstructorId(int instructorId)
    {
        this.instructorId = instructorId;
    }

    public String getPaymentFrequencyId()
    {
        return paymentFrequencyId;
    }

    public void setPaymentFrequencyId(String paymentFrequencyId)
    {
        this.paymentFrequencyId = paymentFrequencyId;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }
}
