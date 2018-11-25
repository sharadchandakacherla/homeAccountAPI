package hello;

public class ExpenseModelView {
    private long id;
    private int expenseType;
    private int expenseTenderMode;
    private double amount;
    private ExpenseTenderModeDetails expenseTenderModeDetails;
    private VendorModelView vendorModelView;
    private String expenseCategory;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(int expenseType) {
        this.expenseType = expenseType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExpenseTenderModeDetails getExpenseTenderModeDetails() {
        return expenseTenderModeDetails;
    }

    public void setExpenseTenderModeDetails(ExpenseTenderModeDetails expenseTenderModeDetails) {
        this.expenseTenderModeDetails = expenseTenderModeDetails;
    }

    public VendorModelView getVendorModelView() {
        return vendorModelView;
    }

    public void setVendorModelView(VendorModelView vendorModelView) {
        this.vendorModelView = vendorModelView;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }
}