public class TrainingProgramManual {
    private TrainingProgramIntake TraingProgramIntake[];
    private Course courses[];

    public TrainingProgramIntake[] getTraingProgramIntake() {
        return TraingProgramIntake;
    }

    public Course[] getCourses() {
        return courses;
    }

    public TrainingProgramManual(TrainingProgramIntake[] traingProgramIntake, Course[] courses) {
        TraingProgramIntake = traingProgramIntake;
        this.courses = courses;

    }

    public void setTraingProgramIntake(TrainingProgramIntake[] traingProgramIntake) {
        TraingProgramIntake = traingProgramIntake;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
