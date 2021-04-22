import java.util.Date;

public class Applicants extends User {

    private int ApllicantId;
    private Date graduationTear;
    private String FaucltyName;
    private TrainingProgram Trainingprogram[];

    public Applicants(int userId, String userName, String email) {
        super(userId, userName, email);
    }
}
