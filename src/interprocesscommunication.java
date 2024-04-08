class Customer {
    int amount = 100000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw ..");
        if (this.amount<amount) {
            System.out.println("Less balance;waiting for deposit..");
            try {
                wait();
            }
            catch (Exception e)
            {

            }
        }
        this.amount = this.amount - amount;
        System.out.println("Withdraw completed...");
    }


    synchronized void deposit(int amount) {
        System.out.println("Going to desposit ..");
        this.amount = this.amount + amount;
        System.out.println("Deposit complected");
        notify();
    }
}
    public class interprocesscommunication {
    public static void main(String args[])
    {
        final Customer c=new Customer();
        new Thread()
        {
            public void run()
            {
                c.withdraw(150000);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                c.deposit(100000);
            }
        }.start();
    }
    }

