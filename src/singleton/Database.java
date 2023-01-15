package singleton;

import java.util.ArrayList;

import model.Order;

public class Database {
	
	private static Database database = null;
	private ArrayList<Order> transactionList;

	private Database() {
		transactionList = new ArrayList<>();
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

}
