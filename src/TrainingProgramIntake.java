import java.util.Date;

public class TrainingProgramIntake {
    private String IntakeID;
    private Date StartDate;
    private Date EndDate;

    public String getIntakeID() {
        return IntakeID;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setIntakeID(String intakeID) {
        IntakeID = intakeID;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public TrainingProgramIntake(String intakeID, Date startDate, Date endDate) {
        IntakeID = intakeID;
        StartDate = startDate;
        EndDate = endDate;
    }
}
