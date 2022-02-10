package j07_AbstractInterface;
//**과제
//=> 게시판을 종류별로 10개 이상 만든다.
//=> 기본기능(interface) : insert, update, delete, listPrint, detail, replyInsert
//=> 게시판 종류별로 : 일반게시판(i,u,d,l,detail,r), QnA(i,r,l), 공지사항(i,l,detail)
//=> 모든 게시판은 interface를 구현
//   게시판 종류에 따라 필요없는 메서드도 오버라이딩 해야함.
//   이런경우 interface를 구현하는 추상 클래스를 작성하고
//   게시판은 위 추상클래스를 구현한다면,의무적 구현에서 벗어나 필요한 메서드만 구현 할 수 있다.

interface BoardUtil{
    void insert();
    void update();
    void delete();
    void listPrint();
    void detail();
    void replyInsert();
}
abstract class BoardA implements BoardUtil{
    @Override
    public abstract void insert();
    @Override
    public abstract void listPrint();
    @Override
    public void delete() {
        System.out.println("Delete execute");
    }
    @Override
    public void update() {
        System.out.println("update execute");
    }
    @Override
    public void detail() {}
    @Override
    public void replyInsert() {}
}
class NorBoard extends BoardA{
    @Override
    public void insert() {
        System.out.println("NorBoard insert execute");
    }
    @Override
    public void listPrint() {
        System.out.println("NorBoard listPrint execute");
    }
}
class QnABoard extends BoardA{
    @Override
    public void insert() {
        System.out.println("QnABoard insert execute");
    }
    @Override
    public void listPrint() {
        System.out.println("QnABoard listPrint execute");
    }
    public void reset(){
        System.out.println("QnABoard reset execute");
    }
    @Override
    public void update() {
        System.out.println("QnABoard update execute");
    }
}

public class AI03_AbsInter {
    public static void main(String[] args) {
        NorBoard nb = new NorBoard();
        nb.update();
        nb.insert();

        QnABoard qab = new QnABoard();
        qab.delete();
        qab.listPrint();
        qab.reset();

        BoardA ba = new QnABoard();
        ba.listPrint();
        ba.update();
    }
}
