
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarefas")

 public class Tarefa {
    private long id;
    private String descricao;

    public void setId(long id){
        this.id = id;
    }

    public void getId(long id){
        this.id = id;
    }
 }

