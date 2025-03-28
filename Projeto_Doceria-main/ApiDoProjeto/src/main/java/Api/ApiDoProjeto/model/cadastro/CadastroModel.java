package Api.ApiDoProjeto.model.cadastro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter @Setter
@AllArgsConstructor 
@NoArgsConstructor
@EqualsAndHashCode(of = "id") // Recomendado manter
@Entity
@Table(name = "cadastro")
public class CadastroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome; 
    private String email;
    private String senha;
    private String confirmarSenha; // Pode remover se não for persistir no banco

    public CadastroModel(String nome, String sobrenome, String email, String senha, String confirmarSenha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    }

}
