public abstract class Organization {
    private int OrrgId;
    private String OrgName;

    public int getOrrgId() {
        return OrrgId;
    }

    public String getOrgName() {
        return OrgName;
    }

    public Organization(int orrgId, String orgName) {
        OrrgId = orrgId;
        OrgName = orgName;
    }
}
