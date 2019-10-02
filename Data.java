package com.example.squarephotovideoeditor.adapter;

public class Data
{
    private String MobileNo;

    private String DeviceType;

    private String UpdateDate;

    private String Email;

    private String UserId;

    private String FirstName;

    private String FacebookId;

    private String EntryDate;

    private String ProfilePic;

    private String LastName;

    private String Gender;

    private String Location;

    public String getMobileNo ()
    {
        return MobileNo;
    }

    public void setMobileNo (String MobileNo)
    {
        this.MobileNo = MobileNo;
    }

    public String getDeviceType ()
    {
        return DeviceType;
    }

    public void setDeviceType (String DeviceType)
    {
        this.DeviceType = DeviceType;
    }

    public String getUpdateDate ()
    {
        return UpdateDate;
    }

    public void setUpdateDate (String UpdateDate)
    {
        this.UpdateDate = UpdateDate;
    }

    public String getEmail ()
    {
        return Email;
    }

    public void setEmail (String Email)
    {
        this.Email = Email;
    }

    public String getUserId ()
    {
        return UserId;
    }

    public void setUserId (String UserId)
    {
        this.UserId = UserId;
    }

    public String getFirstName ()
    {
        return FirstName;
    }

    public void setFirstName (String FirstName)
    {
        this.FirstName = FirstName;
    }

    public String getFacebookId ()
    {
        return FacebookId;
    }

    public void setFacebookId (String FacebookId)
    {
        this.FacebookId = FacebookId;
    }

    public String getEntryDate ()
    {
        return EntryDate;
    }

    public void setEntryDate (String EntryDate)
    {
        this.EntryDate = EntryDate;
    }

    public String getProfilePic ()
    {
        return ProfilePic;
    }

    public void setProfilePic (String ProfilePic)
    {
        this.ProfilePic = ProfilePic;
    }

    public String getLastName ()
    {
        return LastName;
    }

    public void setLastName (String LastName)
    {
        this.LastName = LastName;
    }

    public String getGender ()
    {
        return Gender;
    }

    public void setGender (String Gender)
    {
        this.Gender = Gender;
    }

    public String getLocation ()
    {
        return Location;
    }

    public void setLocation (String Location)
    {
        this.Location = Location;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MobileNo = "+MobileNo+", DeviceType = "+DeviceType+", UpdateDate = "+UpdateDate+", Email = "+Email+", UserId = "+UserId+", FirstName = "+FirstName+", FacebookId = "+FacebookId+", EntryDate = "+EntryDate+", ProfilePic = "+ProfilePic+", LastName = "+LastName+", Gender = "+Gender+", Location = "+Location+"]";
    }
}