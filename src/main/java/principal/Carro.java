package principal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Carro {

    public final String nome;
    public final String modelo;

    public Carro(@JsonProperty("nome") String nome,
               @JsonProperty("modelo") String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }
}
