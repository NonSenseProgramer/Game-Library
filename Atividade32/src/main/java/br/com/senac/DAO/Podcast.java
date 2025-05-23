
package DAO;
import jakarta.persistence.*;
@Entity
@Table(name = "podcast")
public class Podcast {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNome_episodio() {
        return nome_episodio;
    }

    public void setNome_episodio(String nome_episodio) {
        this.nome_episodio = nome_episodio;
    }

    public int getNumero_episodio() {
        return numero_episodio;
    }

    public void setNumero_episodio(int numero_episodio) {
        this.numero_episodio = numero_episodio;
    }

    public String getURL_repo() {
        return URL_repo;
    }

    public void setURL_repo(String URL_repo) {
        this.URL_repo = URL_repo;
    }

    @Column(nullable = false, length = 100)
    private String produtor;


    @Column(nullable = false, length = 255)
    private String nome_episodio;
    
    @Column (nullable = false)
    private int numero_episodio;
    
      @Column (nullable = false)
    private String duracao;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
    @Column (nullable = false, length = 350)
    private String URL_repo;
    
}
