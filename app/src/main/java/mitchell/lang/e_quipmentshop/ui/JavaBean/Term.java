package mitchell.lang.e_quipmentshop.ui.JavaBean;

public class Term {
    private String name;
    private String definition;

    public Term(){

    }

    public Term(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
