package j06_ClassExtends;

public class CE03_Son extends CE03_Father{
    String name; // 자손클래스에 없을 경우 조상 멤버변수가져온다.
    int money; // private 붙어있어서 조상꺼는 못가져온다.

    CE03_Son(){System.out.println("CE03_Son Default 생성자");}
    CE03_Son(String name, int money, String fname, int fmoney){
        super(fname, fmoney);
        this.name = name;
        this.money = money;
    }

    public void info(){
        //super.info();
        System.out.printf("Son info: %s, %s, money: %d\n",country,name,money);
    }

    public void bank(){
        if(this.money < 0)super.bank(money);
        this.money+=money;
        System.out.println("Son total money = "+this.money);
    }

    public static void main(String[] args) {
        CE03_Son s1 = new CE03_Son();
        s1.money = 30000;
        s1.info();
        s1.bank(40000);
    }
}
