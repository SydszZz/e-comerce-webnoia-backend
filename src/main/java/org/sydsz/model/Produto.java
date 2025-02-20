package org.sydsz.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Document(collection = "produto")  // Nome da coleção no MongoDB
public class Produto {

    @Id
    private String id;  // _id no MongoDB


    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;
    private Integer estoque;
    private String marca;
    private List<String> imagens;  // Lista de URLs das imagens
    private Avaliacoes avaliacoes;  // Média de avaliações
    private List<Comentarios> comentarios;
    private List<Variacoes> variacoes;  // Variações do produto (ex: tamanho, cor)
    private String criadoEm;
    private String atualizadoEm;

    // Getters and Setters

    @Getter
    @Setter
    public static class Comentarios{
        private String idUsuario;
        private Integer nota;
        private String comentario;
        private String data;
    }

    @Getter
    @Setter
    public static class Avaliacoes {
        private Double media;
        private List<Comentarios> comentariosList; // Lista de comentários dos usuários

        // Getters and Setters
    }

    @Getter
    @Setter
    public static class Variacoes {
        private String cor;
        private String tamanho;
        private Integer estoque;

        // Getters and Setters
    }



}
