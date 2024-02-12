import java.util.List;
import java.util.ArrayList;

public class PersonalFinanceApplication {
    private List<Account> accounts;
    private List<Transaction> transactions;
    private List<Budget> budgets;

    public PersonalFinanceApplication() {
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
       this.budgets = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
       
        accounts.remove(account);
    }

    public void makeTransaction(Transaction transaction) {
        transactions.add(transaction);

    }
    
    public void createBudget(Budget budget) {
        budgets.add(budget);
    }

    public void trackExpense(Expense expense) {
        //implement me
    }
    public void generateReport() {
        //implement me
    }

    //TEST
    public static void main(String[] args) {
        
        PersonalFinanceApplication financeApp = new PersonalFinanceApplication();

        //Create and add accounts, transaction, budgets
        Account account1 = new Account();
        financeApp.addAccount(account1);

        Transaction transaction1 = new Transaction();
        financeApp.makeTransactionTransaction(transaction1);

        financeApp.removeAccount(account1);
        
        financeApp.generateReport();
 
    }


}