package cadastro;

public class User {

    private String nome;
    private int idade;
    private String genero;
    private String email;

    public User() {
    }

    public User(String name, int age, String gender, String email) {
        this.nome = name;
        this.idade = age;
        this.genero = gender;
        this.email = email;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public int getAge() {
        return idade;
    }

    public void setAge(int age) {
        this.idade = age;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome+", "+ idade+", "+ genero +", "+email;
    }
}
