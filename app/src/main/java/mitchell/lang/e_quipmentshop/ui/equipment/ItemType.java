package mitchell.lang.e_quipmentshop.ui.equipment;

public class ItemType {
    private String name;
    private int images;


    public ItemType(String name, int images) {
        this.name = name;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefinition() { return images; }

    public void setDefinition(int images) {
        this.images = images;
    }

    @Override
    public String toString(){
        return this.name;
    }


}
