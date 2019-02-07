public class BankAccount {

    private int ano;
    private String cname;
    private int balance;
    private static int totalCash;

    public static void showAvg(BankAccount tmp1, BankAccount tmp2){
        //avg of any 2 accounts
        System.out.println("Avg of 2 : "+(tmp1.balance+tmp2.balance)/2);
    }
    public static void showTotalCash(){
        System.out.println("TOTAL CASH  : "+totalCash);
        System.out.println("==================================");
    }
    public void showData(){
        System.out.println("Account Number : "+ano);
        System.out.println("Customer Name  : "+cname);
        System.out.println("Balance    Rs. : "+balance);
        System.out.println("_______________________________________________");
    }
    public void setData(int a, String b, int c){
        ano=a;
        cname=b;
        balance=c;
        totalCash=totalCash+c;
    }
}
