import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {

	//map needs 2 type params (1 for key and 1 for the value)
	Map<String, BankAccount> accounts = new HashMap<String, BankAccount>();

	public Collection<BankAccount> accounts() {
		return accounts.values();
	}
	
	public int getSize() {
		return accounts.size();
	}

	public void add(BankAccount account) {
		accounts.put(account.accountNum, account);
	}

	public BankAccount getAccountNum(String accountNum) {
		return accounts.get(accountNum);
	}
	
	public BankAccount closeAccount(String accountNum)
	{
		return accounts.remove(accountNum);
	}

}