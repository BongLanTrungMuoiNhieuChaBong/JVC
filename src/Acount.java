public class Acount {
    private String username ;
    private String passWord ;

    public Acount() {
    }
    public String getUsername() {
        return username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void input() {
        this.setUsername("Minh Anh");
        this.setPassWord("Minhanh123");
    }
}
