public class BankAccount {

    private int ano;
    private String cname;
    private int balance;
    private static int totalCash;
    
    public void showTotalCash(){
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
