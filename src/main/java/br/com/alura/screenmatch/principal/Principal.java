package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private List<DadosTemporada> temporadas = new ArrayList<>();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String QUERY = "&season=";
    private final String API_KEY = "&apikey=787b445d";

    public void exibMenu(){

        System.out.println("Digite o nome da série para a busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ","+") + API_KEY);

        DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
        System.out.println("Dados da série:");
        System.out.println(dadosSerie+"\n");

//        System.out.println("Dados por temporada:");
        for (int i = 1; i<=dadosSerie.totalTemporadas(); i++){
            json = consumo.obterDados (ENDERECO + nomeSerie.replace(" ","+") + QUERY + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
//        temporadas.forEach(System.out::println);
//        Percorrendo cada episodio para printar o titulo
//        for(int i = 0; i < dados.totalTemporadas(); i++){
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for(int j = 0; j< episodiosTemporada.size(); j++){
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

    }
}
