public abstract  class Staff extends User {

    public Department Dept;
    public StaffCategories StaffCategories;
    public Staff(int userId, String userName, String email) {
        super(userId, userName, email);

    }
}
