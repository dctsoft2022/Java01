package j06_ClassExtends;

public class CE03_Father {
    static String country = "Korea";
    String name = "Yeongmin";
    private int money;

    public CE03_Father(){System.out.println("CE03_Father Default 생성자");}
    CE03_Father(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void info(){
        System.out.printf("Father info: %s, %s, money: %d\n",country,name,money);
    }

    public final void bank(int money){
        this.money += money;
        System.out.println("Father total money: "+this.money);
    }

    public static void main(String[] args) {
        CE03_Father f1 = new CE03_Father();
        f1.money = 90000;
        f1.info();
        f1.bank(89000);
        CE03_Father.country = "Canada";
        f1.info();
    }
}
