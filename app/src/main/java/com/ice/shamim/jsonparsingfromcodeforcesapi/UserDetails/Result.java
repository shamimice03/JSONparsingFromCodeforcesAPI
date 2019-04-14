package com.ice.shamim.jsonparsingfromcodeforcesapi.UserDetails;

public class Result
{
    private String lastName;

    private String country;

    private String lastOnlineTimeSeconds;

    private String city;

    private String rating;

    private String friendOfCount;

    private String titlePhoto;

    private String handle;

    private String avatar;

    private String firstName;

    private String contribution;

    private String organization;

    private String rank;

    private String maxRating;

    private String registrationTimeSeconds;

    private String maxRank;

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getLastOnlineTimeSeconds ()
    {
        return lastOnlineTimeSeconds;
    }

    public void setLastOnlineTimeSeconds (String lastOnlineTimeSeconds)
    {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getFriendOfCount ()
    {
        return friendOfCount;
    }

    public void setFriendOfCount (String friendOfCount)
    {
        this.friendOfCount = friendOfCount;
    }

    public String getTitlePhoto ()
    {
        return titlePhoto;
    }

    public void setTitlePhoto (String titlePhoto)
    {
        this.titlePhoto = titlePhoto;
    }

    public String getHandle ()
    {
        return handle;
    }

    public void setHandle (String handle)
    {
        this.handle = handle;
    }

    public String getAvatar ()
    {
        return avatar;
    }

    public void setAvatar (String avatar)
    {
        this.avatar = avatar;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getContribution ()
    {
        return contribution;
    }

    public void setContribution (String contribution)
    {
        this.contribution = contribution;
    }

    public String getOrganization ()
    {
        return organization;
    }

    public void setOrganization (String organization)
    {
        this.organization = organization;
    }

    public String getRank ()
    {
        return rank;
    }

    public void setRank (String rank)
    {
        this.rank = rank;
    }

    public String getMaxRating ()
    {
        return maxRating;
    }

    public void setMaxRating (String maxRating)
    {
        this.maxRating = maxRating;
    }

    public String getRegistrationTimeSeconds ()
    {
        return registrationTimeSeconds;
    }

    public void setRegistrationTimeSeconds (String registrationTimeSeconds)
    {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    public String getMaxRank ()
    {
        return maxRank;
    }

    public void setMaxRank (String maxRank)
    {
        this.maxRank = maxRank;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lastName = "+lastName+", country = "+country+", lastOnlineTimeSeconds = "+lastOnlineTimeSeconds+", city = "+city+", rating = "+rating+", friendOfCount = "+friendOfCount+", titlePhoto = "+titlePhoto+", handle = "+handle+", avatar = "+avatar+", firstName = "+firstName+", contribution = "+contribution+", organization = "+organization+", rank = "+rank+", maxRating = "+maxRating+", registrationTimeSeconds = "+registrationTimeSeconds+", maxRank = "+maxRank+"]";
    }
}

