package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class SearchStudents
{
    @Id
    private String lastName;
    private String firstName;
    private String studentAddress;
    private String cityName;
    private String stateName;
    private String zipCode;
    private String phoneNumber;
    private String beltRank;
    private String instructorName;
    private int paymentFrequencyId;
    private int techniqueId;
    private boolean contractStatus;
    private BigDecimal rate;
    private Date startDate;


    public SearchStudents(String lastName, String firstName, String studentAddress, String cityName, String stateName, String zipCode, String phoneNumber, String beltRank, String instructorName, int paymentFrequencyId, int techniqueId, boolean contractStatus, BigDecimal rate, Date startDate)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentAddress = studentAddress;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.beltRank = beltRank;
        this.instructorName = instructorName;
        this.paymentFrequencyId = paymentFrequencyId;
        this.techniqueId = techniqueId;
        this.contractStatus = contractStatus;
        this.rate = rate;
        this.startDate = startDate;
    }

    public int getPaymentFrequencyId()
    {
        return paymentFrequencyId;
    }

    public void setPaymentFrequencyId(int paymentFrequencyId)
    {
        this.paymentFrequencyId = paymentFrequencyId;
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

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getBeltRank()
    {
        return beltRank;
    }

    public void setBeltRank(String beltRank)
    {
        this.beltRank = beltRank;
    }

    public String getInstructorName()
    {
        return instructorName;
    }

    public void setInstructorName(String instructorName)
    {
        this.instructorName = instructorName;
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

    public BigDecimal getRate()
    {
        return rate;
    }

    public void setRate(BigDecimal rate)
    {
        this.rate = rate;
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
