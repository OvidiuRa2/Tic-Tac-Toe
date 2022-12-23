
/* @author radoi ovidiu*/
public class User {

    private String nume, echipa;

    public User(String n, String ec) {

        nume = n;
        echipa = ec;

    }

    public User(User u) {
        nume = u.getNume();
        echipa = u.getEchipa();
    }

    public String getNume() {
        return nume;
    }

    public String getEchipa() {
        return echipa;
    }

}
