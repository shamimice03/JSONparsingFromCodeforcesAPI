package com.ice.shamim.jsonparsingfromcodeforcesapi.StatusDetails;


public class Result
{
    private String contestId;

    private String timeConsumedMillis;

    private String relativeTimeSeconds;

    private Problem problem;

    private String creationTimeSeconds;

    private Author author;

    private String programmingLanguage;

    private String verdict;

    private String testset;

    private String passedTestCount;

    private String memoryConsumedBytes;

    private String id;

    public String getContestId ()
    {
        return contestId;
    }

    public void setContestId (String contestId)
    {
        this.contestId = contestId;
    }

    public String getTimeConsumedMillis ()
    {
        return timeConsumedMillis;
    }

    public void setTimeConsumedMillis (String timeConsumedMillis)
    {
        this.timeConsumedMillis = timeConsumedMillis;
    }

    public String getRelativeTimeSeconds ()
    {
        return relativeTimeSeconds;
    }

    public void setRelativeTimeSeconds (String relativeTimeSeconds)
    {
        this.relativeTimeSeconds = relativeTimeSeconds;
    }

    public Problem getProblem ()
    {
        return problem;
    }

    public void setProblem (Problem problem)
    {
        this.problem = problem;
    }

    public String getCreationTimeSeconds ()
    {
        return creationTimeSeconds;
    }

    public void setCreationTimeSeconds (String creationTimeSeconds)
    {
        this.creationTimeSeconds = creationTimeSeconds;
    }

    public Author getAuthor ()
    {
        return author;
    }

    public void setAuthor (Author author)
    {
        this.author = author;
    }

    public String getProgrammingLanguage ()
    {
        return programmingLanguage;
    }

    public void setProgrammingLanguage (String programmingLanguage)
    {
        this.programmingLanguage = programmingLanguage;
    }

    public String getVerdict ()
    {
        return verdict;
    }

    public void setVerdict (String verdict)
    {
        this.verdict = verdict;
    }

    public String getTestset ()
    {
        return testset;
    }

    public void setTestset (String testset)
    {
        this.testset = testset;
    }

    public String getPassedTestCount ()
    {
        return passedTestCount;
    }

    public void setPassedTestCount (String passedTestCount)
    {
        this.passedTestCount = passedTestCount;
    }

    public String getMemoryConsumedBytes ()
    {
        return memoryConsumedBytes;
    }

    public void setMemoryConsumedBytes (String memoryConsumedBytes)
    {
        this.memoryConsumedBytes = memoryConsumedBytes;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contestId = "+contestId+", timeConsumedMillis = "+timeConsumedMillis+", relativeTimeSeconds = "+relativeTimeSeconds+", problem = "+problem+", creationTimeSeconds = "+creationTimeSeconds+", author = "+author+", programmingLanguage = "+programmingLanguage+", verdict = "+verdict+", testset = "+testset+", passedTestCount = "+passedTestCount+", memoryConsumedBytes = "+memoryConsumedBytes+", id = "+id+"]";
    }
}

