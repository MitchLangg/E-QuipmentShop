package mitchell.lang.e_quipmentshop.ui;

public class Rule  {
    private String ruleName;
    private String description;

    public Rule() {

    }

    public Rule(String ruleName, String description) {
        this.ruleName = ruleName;
        this.description = description;
    }
    public String getRuleName() {
        return ruleName;
    }
    public void setRuleName() {
        this.ruleName = ruleName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return this.ruleName;
    }
}
