public class PersonTest {
    public static void main(String args[]) {
        Address address = new Address(12, "MG Road", 600001, "Chennai", "Tamil Nadu");
        Account account = new Account(1001, "SBI", "Main Branch", 5000.0);

        Person1 person = new Person1(21, "Santhiya", address, account);

        person.display();
        person.shop(1000); 
        person.shop(6000); 
        person.getAc().deposit(1001, 2000);
        person.getAc().checkbalance(1001);
    }
}

class Person1 {
    private int age;
    private String name;
    private Address add;
    private Account ac;

    public Person1(int age, String name, Address add, Account ac) {
        this.age = age;
        this.name = name;
        this.add = add;
        this.ac = ac;
    }

    public void setage(int age) {
        this.age=age;
    }
    public int getage() {
        return age;
    }
    public void setname(String name) {
        this.name=name;
    }
    public String getname() {
        return name;
    }
    public void setadd(Address add) {
        this.add = add;
    }
    public Address getadd() {
        return add;
    }
    public void setAc(Account ac) {
        this.ac=ac;
    }
    public Account getAc() {
        return ac;
    }

    public void shop(double amount) {
        System.out.println(name + " is shopping for Rs." + amount);
        ac.withdraw(ac.getAcno(), amount);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        add.display();
        System.out.println("Account Details:");
        System.out.println("Account No: " + ac.getAcno());
        System.out.println("Bank Name: " + ac.getbname());
        System.out.println("Branch: " + ac.getbranch());
        System.out.println("Balance: Rs." + ac.getbalance());
        System.out.println("------------------------------------");
    }
}

class Address {
    private int dno;
    private String street;
    private int pincode;
    private String dist;
    private String state;

    public Address(int dno, String street, int pincode, String dist, String state) {
        this.dno = dno;
        this.street = street;
        this.pincode = pincode;
        this.dist = dist;
        this.state = state;
    }

    public void setdno(int dno) {
        this.dno = dno;
    }

    public int getdno() {
        return dno;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getDist() {
        return dist;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void display() {
        System.out.println("Address: " + this.dno + ", " + this.street + ", " + this.dist + ", " + this.state + " - " + this.pincode);
    }
}

class Account {
    private int acno;
    private String bname;
    private String branch;
    private double balance;

    public Account(int acno, String bname, String branch, double balance) {
        this.acno = acno;
        this.bname = bname;
        this.branch = branch;
        this.balance = balance;
    }

    public void setAcno(int acno) {
        this.acno = acno;
    }

    public int getAcno() {
        return acno;
    }

    public void setbname(String bname) {
        this.bname = bname;
    }

    public String getbname() {
        return bname;
    }

    public void setbranch(String branch) {
        this.branch = branch;
    }

    public String getbranch() {
        return branch;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public double getbalance() {
        return balance;
    }

    public double withdraw(int acno, double amount) {
        if (this.acno == acno && amount <= balance) {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn. Remaining balance: Rs." + balance);
            return amount;
        } else {
            System.out.println("Insufficient balance or invalid account!");
            return 0;
        }
    }

    public void deposit(int acno, double amount) {
        if (this.acno == acno) {
            balance += amount;
            System.out.println("Rs." + amount + " deposited. Current balance: Rs." + balance);
        } else {
            System.out.println("Invalid account number!");
        }
    }

    public double checkbalance(int acno) {
        if (this.acno == acno) {
            System.out.println("Current Balance: Rs." + balance);
            return balance;
        } else {
            System.out.println("Invalid account number!");
            return 0;
        }
    }
}
