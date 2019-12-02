package mitchell.lang.e_quipmentshop.ui.JavaBean;

/**
 * @author Mitch Todd
 * @date Week 8-12
 * @description Fragment for recycler views. Contains get and sets for the definition and name of items.
 */

public class Rule {

        private String name;
        private String definition;

        public Rule(){

        }

        public Rule(String name, String definition) {
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

