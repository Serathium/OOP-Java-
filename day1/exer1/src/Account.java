public class Account {

    // Attributes
    int number, pos;
    String owner;
    double balance;
    double limit;

    // Methods
    void deposits( double quantity ) {
        System.out.println( "Depositing R$" + quantity + " in " + owner + "'s account..." );
        balance = balance + quantity;
        System.out.println( "New balance: R$" + balance );
        System.out.println();
    }

    boolean withdraws( double value ) {
        if ( balance + limit < value ) {
            System.out.println();
            return false;
        } else {
            System.out.println( "withdrawing R$" + value + " from " + owner + "'s account..." );
            balance = balance - value;
            System.out.println( "Withdraw successful!" );
            System.out.println( "Current balance: R$" + balance );
            System.out.println();
            return true;
        }
    }

    void printsOwner() {
        System.out.println( "Owner: " + owner );
        System.out.println();
    }

    void retrievesbalance() {
        System.out.println( "Current balance from account number " + number + ": " + balance );
        System.out.println();
    }

    boolean transfersTo( Account destination, double value ) {
        if ( ( balance + limit ) < value ){
            if ( ( balance + limit ) > 0 ) {
                System.out.println( "Insufficient funds! Your remaining limit will be transfered." );
                System.out.println( "Transfering R$" + (balance + limit) + " to " + destination.owner + "..." );
                destination.deposits( balance + limit  );    
                balance -= (balance + limit);           
                System.out.println( "Transfer complete!" );
                System.out.println();
                return true;
            } else {
                System.out.println( "Insufficient funds!" );
                System.out.println();
                return false;
            }
        } else {
            System.out.println( "Transfering R$" + value + " to " + destination.owner + "..." );
            balance -= value;
            destination.deposits( value );
            System.out.println( "Transfer complete!" );
            System.out.println();
            return true;
        }
        
    }

    void printsInfo() {
        System.out.println( "Details of account " + pos + ": " );
        System.out.println( "Account's number: " + number );
        System.out.println( "Account's owner name: " + owner );
        System.out.println( "Account's balance: R$" + balance );
        System.out.println( "Account's limit: R$" + limit );
        System.out.println();
    }

    public static void main( String[] args ) {
        // Array declaration of size 2 and class Account objects instantiation.
        Account accounts[] = new Account[2]; 
        accounts[0] = new Account();
        accounts[1] = new Account();
        
        // Assignment of the required attribute values for account 1.
        accounts[0].owner = "Alice Silva";
        accounts[0].balance = 1000;
        accounts[0].number = 123;
        accounts[0].pos = 1;
        accounts[0].limit = 500;

        // Assignment of the required attribute values for account 2.
        accounts[1].owner = "Bob";
        accounts[1].balance = 500;
        accounts[1].pos = 2;

        // Running tests requested in the exercise.
        System.out.println( "=== ACCOUNT CLASS TEST ===" );
        accounts[0].printsInfo();
        accounts[0].deposits( 200 );
        accounts[0].withdraws(1500);
        accounts[0].transfersTo(accounts[1], 1500);

        // Prints accounts final balances.
        System.out.println( "Accounts final balances:");
        System.out.println( "Account " + accounts[0].pos + " - balance: R$" + accounts[0].balance );
        System.out.println( "Account " + accounts[1].pos + " - balance: R$" + accounts[1].balance );
    }
}