package j05_ClassMethod;

public class CM07_Member {
    //1. 필드 정의
    private String id;
    private String password;
    private String name;
    private char gender;
    private String idNo;
    private String email;
    private int point;

    //2. 생성자
    public CM07_Member(String id, String password, String name,
                       char gender, String idNo, String email, int point){
        super();
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.idNo = idNo;
        this.email = email;
        this.point = point;
    }

    //3. setter, getter
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getIdNo() {
        return idNo;
    }
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }

    // 4. toString
    @Override
    public String toString() {
        return "CM07_Member{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", idNo='" + idNo + '\'' +
                ", email='" + email + '\'' +
                ", point=" + point +
                '}';
    }
}
