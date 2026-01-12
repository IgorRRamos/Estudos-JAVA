package Tarefas;
import Usuario.User;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity // Esta mapeando para uma tabela.
@Table(name = "tasks") // esta definindo nome da tabela no DB
public class Task {

    @Id // Define chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrementa o ID no DB
    private long id;

    private String titleTask;
    private String description;
    private boolean esátaCompleta;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDateTime createdAt;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitleTask() {
        return titleTask;
    }

    public void setTitleTask(String titleTask) {
        this.titleTask = titleTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEsátaCompleta() {
        return esátaCompleta;
    }

    public void setEsátaCompleta(boolean esátaCompleta) {
        this.esátaCompleta = esátaCompleta;
    }
}
