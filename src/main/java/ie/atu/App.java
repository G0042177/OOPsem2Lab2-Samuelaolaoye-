package ie.atu;

public class App {
    public static void main(String [] args){
        Menuitem[] menuitems = new Menuitem[] {
                //add menu items
        };
        for (Menuitem menuitem : menuitems) {
        }
        double totalCost = 0;
        for (Menuitem menuitem :menuitems){
    }
        System.out.println("Total Cost: €" + totalCost);
}

    static class Burger implements Menuitem {
        private String name;
        private double price;
        private String ingredients;

        public Burger(String name, double price, String ingredients) {
            this.name = name;
            this.price = price;
            this.ingredients = ingredients;
        }
        @Override
        public String getName(){
        return name;
        }
        @Override
        public double getPrice(){
            return price;
        }
        @Override
        public String getIngredients(){
            return ingredients;
        }

    }
}
