package Usuario;
import jakarta.persistence.*;

/*
O "@Entity" -> diz que classe User é (uma entidade persistente) Ou seja o Hibernate vai mapear essa classe
para uma tabela no banco de dados. e vai começar a usar CRUD.
 */
@Entity

/*
O @Table cria explicitamente o nome da tabela, para o Hibernate não criar um nome default e ocasionar em
algum conflito futuro.
 */
@Table(name = "Users")
public class User {
    @Id // Esta marcando o campo Id como chave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Estáa gerando valor automaticamente para Id
    private long id;

    private String name;
    private String email;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
