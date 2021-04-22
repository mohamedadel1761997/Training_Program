public class Department extends Organization {
    private int Deptid;
    private String DeptName;

    public Department(int orrgId, String orgName) {
        super(orrgId, orgName);
    }

    public void setDeptid(int deptid) {
        Deptid = deptid;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public int getDeptid() {
        return Deptid;
    }

    public String getDeptName() {
        return DeptName;
    }



}
