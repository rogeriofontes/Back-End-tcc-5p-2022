package br.com.stagiun.tccstagiun.model.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "empresa", schema = "sis_vaga")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString(callSuper = true, of = { "description" })
@Builder
@Data
public class Empresa  extends IdModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tipo_empresa_id" ,referencedColumnName = "id" )
    private TipoEmpresa tipoEmpresa;

    @ManyToOne
    @JoinColumn(name = "usuario_id" ,referencedColumnName = "id" )
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "cep_id", referencedColumnName = "id")
    private Cep cep;

    @Column(nullable = false)
    private String nome_fantasia;

    @Column
    private String razao_social;

    @Column(nullable = false)
    private Integer cnpj;

    @Column(nullable = false)
    private Integer telefone;

    @Column(nullable = false)
    private String email;


}
