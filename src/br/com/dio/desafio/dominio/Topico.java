package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.function.Consumer;

public class Topico {
    private HashSet<String> topico;

    public Topico() {
       topico = new HashSet<>();
    }

    public void adicionarTopico(String topico){
        this.topico.add(topico);
    }

    public void removerTopico(String removerTopico){
        this.topico.remove(removerTopico);
    }

    public void monstrarTopico(){
        Consumer<String> listarTopicoConsumer = e -> System.out.println(e); 
        this.topico.forEach(listarTopicoConsumer);
    }
}
