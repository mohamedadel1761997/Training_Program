public class StaffCategories {
    private int CategoryID;
    private String CategoryName;

    public int getCategoryID() {
        return CategoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public StaffCategories(int categoryID, String categoryName) {
        CategoryID = categoryID;
        CategoryName = categoryName;
    }
}
