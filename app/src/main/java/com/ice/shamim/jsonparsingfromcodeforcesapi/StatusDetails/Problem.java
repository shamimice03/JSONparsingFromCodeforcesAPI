package com.ice.shamim.jsonparsingfromcodeforcesapi.StatusDetails;

public class Problem
{
    private String contestId;

    private String name;

    private String rating;

    private String index;

    private String type;

    private String points;

    private String[] tags;

    public String getContestId ()
    {
        return contestId;
    }

    public void setContestId (String contestId)
    {
        this.contestId = contestId;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getIndex ()
    {
        return index;
    }

    public void setIndex (String index)
    {
        this.index = index;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPoints ()
    {
        return points;
    }

    public void setPoints (String points)
    {
        this.points = points;
    }

    public String[] getTags ()
    {
        return tags;
    }

    public void setTags (String[] tags)
    {
        this.tags = tags;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contestId = "+contestId+", name = "+name+", rating = "+rating+", index = "+index+", type = "+type+", points = "+points+", tags = "+tags+"]";
    }
}

