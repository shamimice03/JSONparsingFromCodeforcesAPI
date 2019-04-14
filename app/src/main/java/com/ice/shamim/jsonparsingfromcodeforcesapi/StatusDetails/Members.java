package com.ice.shamim.jsonparsingfromcodeforcesapi.StatusDetails;

public class Members
{
    private String handle;

    public String getHandle ()
    {
        return handle;
    }

    public void setHandle (String handle)
    {
        this.handle = handle;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [handle = "+handle+"]";
    }
}
