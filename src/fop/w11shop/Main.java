package fop.w11shop;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        BookShop shop = new BookShop();
        shop.addBooksInStore(150000);

        Customer peter = new Customer("Peter", shop);
        Customer paul = new Customer("Pauls", shop);

        peter.start();
        paul.start();
        peter.join();
        paul.join();


        shop.printSummary();
        peter.printSummary();
        paul.printSummary();
    }
}
