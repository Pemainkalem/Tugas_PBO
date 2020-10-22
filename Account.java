package Tugas3;

public class Account {
    String AccountID;
    String VirtualAccount;
    String PaymentAmount;
    String PaymountGateAway;

    Account(String AccountID,String VirtualAccount,String PaymentAmount,String PaymentGateAway) {
        this.AccountID = AccountID;
        this.VirtualAccount = VirtualAccount;
        this.PaymentAmount = PaymentAmount;
        this.PaymountGateAway = PaymentGateAway;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountID='" + AccountID + '\'' +
                ", VirtualAccount='" + VirtualAccount + '\'' +
                ", PaymentAmount='" + PaymentAmount + '\'' +
                ", PaymountGateAway='" + PaymountGateAway + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Account account1 = new Account("ID Account","123456789","Rp 1.370.500,00","Pilih Pembayaran");
        Account account2 = new Account("ID Account","123456789","Rp 1.307.500,00","Pilih Pembayaran");
        System.out.println(account1);
        System.out.println(account2);
    }
}
