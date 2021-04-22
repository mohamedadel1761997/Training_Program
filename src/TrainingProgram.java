public abstract class TrainingProgram {
    private String ProgramId;
    private String ProgramName;
    private String ProgramDesc;

    public void setProgramId(String programId) {
        ProgramId = programId;
    }

    public void setProgramName(String programName) {
        ProgramName = programName;
    }

    public void setProgramDesc(String programDesc) {
        ProgramDesc = programDesc;
    }

    public String getProgramId() {
        return ProgramId;
    }

    public String getProgramName() {
        return ProgramName;
    }

    public String getProgramDesc() {
        return ProgramDesc;
    }

    public TrainingProgram(String programId, String programName, String programDesc) {
        ProgramId = programId;
        ProgramName = programName;
        ProgramDesc = programDesc;
    }
}
