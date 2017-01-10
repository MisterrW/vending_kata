package Vending;
import java.util.*;

public class VendingMachine {
  private double totalMoney;
  private ArrayList<Coin> totalCoins;
  private ArrayList<Coin> insertedCoins;
  private ArrayList<Item> stockA;
  private ArrayList<Item> stockB;
  private ArrayList<Item> stockC;

  public VendingMachine() {
    this.stockA = new ArrayList<Item>();
    this.stockB = new ArrayList<Item>();
    this.stockC = new ArrayList<Item>();
    this.totalMoney = 0.00;
    this.totalCoins = new ArrayList<Coin>();
    this.insertedCoins = new ArrayList<Coin>();
   }

   public double getTotalMoney(){
    return this.totalMoney;
   }

   public void insert(Coin coin) {
    insertedCoins.add(coin);
   }

   public ArrayList<Coin> checkInsertedCoins() {
    return this.insertedCoins;
   }

  }

