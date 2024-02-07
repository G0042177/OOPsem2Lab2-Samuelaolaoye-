package ie.atu;

public class App {
    public static void main(String[] args) {


        Menuitem[] menuitems = new Menuitem[]{
                new Burger("Classic Burger", 8.99, "Beef patty, letuce, tomato, cheese"),
                new Pizza("Margherita Pizza",12.99, "Tomato sauce, mozzarella, basil" ),
                new Salad("Ceaser Salad", 6.99, "Romaine letuce, croutons, Ceaser dressing"),
                new Dessert("Icecream", 4.99, "Eggs, cream, vanilla, milk")
        };

        for (Menuitem menuitem : menuitems) {
            //print out the name ,price and description
            System.out.println("Name:"+ menuitem.getName());
            System.out.println("Description:"+ menuitem.getDescription());
            System.out.println("Price:"+ menuitem.getPrice() + "\n");
        }
        double totalCost = 0;
        for (Menuitem menuitem : menuitems) {
            totalCost+=menuitem.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}
