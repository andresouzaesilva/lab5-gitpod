package br.gov.sp.fatec.lab5.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "for_fornecedor")

@AttributeOverride(name = "id", column = @Column(name = "for_id"))
public class Fornecedor extends Identificador {

    private String nome;
    private String cnpj;

    @OneToMany(mappedBy = "fornecedor", fetch = FetchType.LAZY)
    private List<Item> items = new ArrayList<>();

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", items=" + items +
                ", id=" + id +
                '}';
    }
}
