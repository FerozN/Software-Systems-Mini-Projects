/**
 @Feroz Naeem
 */

package coe318.lab4;
public class Bank {
    private String name;
    
    /**
     * An array of Accounts managed by
     * this bank.
     */
    private Account [] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
            accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }


    /**
     * @return the name
     */
    public String getName() {
        return this.name;  
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return numAccounts; 
    }


    public Account[] getAccounts() {
        return accounts; 
    }

    /**
     * Return true if the Bank already has an account
     * with this number; otherwise false.
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        
        for(int i=0;i<getNumAccounts(); i++){
            if(accountNumber==accounts[i].getNumber()){
                return true;
            }
        }
        return false;
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
       if(this.hasAccountNumber(account.getNumber())){
           return false;
        }
       else {
           if(numAccounts<accounts.length){
                accounts[numAccounts] = account;
                    numAccounts++;
            return true;
           }
            return false;
        }
    }

    @Override
    public String toString() {
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
                s += "\n  " + account;
        }
        return s;
    }
}
