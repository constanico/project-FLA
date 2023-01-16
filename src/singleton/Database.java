package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import model.Order;

public class Database {
	
	private static Database database = null;
	private ArrayList<Order> transactionList;
	private HashMap<Object, Integer> stock;

	public Database() {
		transactionList = new ArrayList<>();
		stock = new HashMap<>();
	}
	
	public static Database getDatabase() {
		if(database == null) {
			synchronized (Database.class) {
				if(database == null) {
					database = new Database();
				}
			}
		}
		return database;
	}
	
	public ArrayList<Order> getTransactionList(){
		return transactionList;
	}

	public HashMap<Object, Integer> getStock(){
		return stock;
	}

}
