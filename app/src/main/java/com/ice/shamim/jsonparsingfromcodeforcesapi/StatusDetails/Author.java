package com.ice.shamim.jsonparsingfromcodeforcesapi.StatusDetails;

public class Author
{
    private String contestId;

    private String ghost;

    private Members[] members;

    private String participantType;

    private String startTimeSeconds;

    public String getContestId ()
    {
        return contestId;
    }

    public void setContestId (String contestId)
    {
        this.contestId = contestId;
    }

    public String getGhost ()
    {
        return ghost;
    }

    public void setGhost (String ghost)
    {
        this.ghost = ghost;
    }

    public Members[] getMembers ()
    {
        return members;
    }

    public void setMembers (Members[] members)
    {
        this.members = members;
    }

    public String getParticipantType ()
    {
        return participantType;
    }

    public void setParticipantType (String participantType)
    {
        this.participantType = participantType;
    }

    public String getStartTimeSeconds ()
    {
        return startTimeSeconds;
    }

    public void setStartTimeSeconds (String startTimeSeconds)
    {
        this.startTimeSeconds = startTimeSeconds;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contestId = "+contestId+", ghost = "+ghost+", members = "+members+", participantType = "+participantType+", startTimeSeconds = "+startTimeSeconds+"]";
    }
}

