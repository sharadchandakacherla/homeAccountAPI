package hello;

public class ExpenseTenderModeDetails {
    private long  id;
    private String tenderModeType;
    private String tenderModeProvider;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTenderModeType() {
        return tenderModeType;
    }

    public void setTenderModeType(String tenderModeType) {
        this.tenderModeType = tenderModeType;
    }

    public String getTenderModeProvider() {
        return tenderModeProvider;
    }

    public void setTenderModeProvider(String tenderModeProvider) {
        this.tenderModeProvider = tenderModeProvider;
    }
}