package mitchell.lang.e_quipmentshop.ui.equipment;

/**
 * @author Mitch Todd
 * @date Week 8-14
 * @description Fragment for the equipment learning page. Linked to the fragment_item.xml layout
 *              getters and setters for the selections available.
 */

public class ItemType {
    private String name;
    private int images;
    private String description;

    public ItemType(String name, int images, String description) {
        this.name = name;
        this.images = images;
        this.description = description;
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

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    @Override
    public String toString(){
        return this.name;
    }


}
