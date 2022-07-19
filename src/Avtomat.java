import Products.Product;
import Products.Water;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Avtomat {
    public List<Product> productList = new ArrayList<>();
    public int coin;

    private String login;
    private String choose;
    private int a;

    public Avtomat() {
        this.productList = productList;
        this.coin = coin;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int Coin) {
        coin = Coin;
    }

    @Override
    public String toString() {
        return "Avtomat{" +
                "productList=" + productList +
                ", coin=" + coin +
                '}';
    }

    public void productInAvtomat() {
        System.out.println("In the machine are available:\n ");
        System.out.println(" BananChips - 100 com\n " +
                "Fanta - 60 com\n " + "Candy - 40 com\n " + "Peanuts - 35 com\n" + " Water - 25 com\n" +
                "\n Coins to the amount: " + getCoin());
        System.out.println(" \n What do you want to do?\n" +
                " 9- throw in more coins,\n" + " 0- exit \n" + " >? ");

    }

    public void printCoins() {
        List<Product> productList = new ArrayList<>();
        do {
            System.out.println("Press <1> to deposit-5 coins,\n" + "Press <2> to deposit-10 coins");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case (1):
                    setCoin(getCoin() + 5);
                    if (getCoin() < 25) {
                        System.out.println("You threw " + getCoin() + " coins");
                        System.out.println("You can't buy anything, throw more.");
                    }
                    if (getCoin() >= 25) {
                        productList.add(new Product(" Water", 25));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin() >= 35) {
                        productList.add(new Product("Peanuts", 35));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin() >= 40) {
                        productList.add(new Product("Snickers", 40));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 5- buy Snickers,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin() >= 60) {
                        productList.add(new Product("Fanta", 60));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 5- buy Snickers,\n  Put 6- buy Fanta,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin() >= 100) {
                        productList.add(new Product("BananaChips", 100));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 5- buy Snickers,\n  Put 6- buy Fanta,\n Put 7- buy BananaChips ,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    break;
                case (2):
                    setCoin(getCoin() + 10);
                    System.out.println("You threw " + getCoin() + " coins");
                    if (getCoin() < 25) {
                        System.out.println("You can't buy anything, throw more.");
                    }
                    if (getCoin() >= 25) {
                        productList.add(new Product("Water", 25));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin()>= 35) {
                        productList.add(new Product("Peanuts", 35));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin() >= 40) {
                        productList.add(new Product("Snickers", 40));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 5- buy Snickers,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin() >= 60) {
                        productList.add(new Product("Fanta", 60));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 5- buy Snickers,\n  Put 6- buy Fanta,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    if (getCoin() >= 100) {
                        productList.add(new Product("BananaChips", 100));
                        Iterator ir = productList.iterator();
                        while (ir.hasNext()){
                            System.out.println(ir.next());
                        }
                        System.out.println(" Put 3- buy water,\n Put 4- buy Peanuts,\n Put 5- buy Snickers,\n  Put 6- buy Fanta,\n Put 7- buy BananaChips ,\n Put 9- throw more coins,\n 0- exit");
                        print();
                    }
                    break;
            }
        }
        while (getCoin() < 25 | getCoin() < 35 | getCoin() < 40 | getCoin() < 60 | getCoin() < 100);
    }


    public void print() {
        Scanner scan = new Scanner(System.in);
        int var = Integer.parseInt(scan.nextLine());
        if (var == 3) {
            System.out.println("You bought water!");
        }
        if (var == 4) {
            System.out.println("You bought Peanuts!");
        }
        if (var == 5) {
            System.out.println("You bought Snickers!");
        }
        if (var == 6) {
            System.out.println("You bought Fanta!");
        }
        if (var == 7) {
            System.out.println("You bought BananaChips!");
        }
        if (var == 9) {
            printCoins();
        }
        if (var == 0) {
            productInAvtomat();
            print();
        }
    }
}


