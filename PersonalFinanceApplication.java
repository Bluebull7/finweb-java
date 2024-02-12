import java.util.List;
import java.util.ArrayList;

public class PersonalFinanceApplication {
    private List<Account> accounts;
    private List<Transaction> transactions;
    private List<Budget> budgets;
    private List<Expense> expenses;

    public PersonalFinanceApplication() {
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
       this.budgets = new ArrayList<>();
       this.expenses = new ArrayList<>();
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
        expenses.add(expense);
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
        financeApp.makeTransaction(transaction1);

        financeApp.removeAccount(account1);
        
        financeApp.generateReport();
 
    }


}