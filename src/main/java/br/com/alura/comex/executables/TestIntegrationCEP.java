package br.com.alura.comex.executables;

import br.com.alura.comex.models.Address;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TestIntegrationCEP {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner busca = new Scanner(System.in);
        System.out.println("Por favor digite o CEP: ");
        var buscaCEP = busca.nextLine();

        try {

            String endereco = "https://viacep.com.br/ws/" + buscaCEP + "/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            String s = response.body();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
            TranslateAPI api = gson.fromJson(s, TranslateAPI.class);
            Address address_1 = new Address(api);
            System.out.println(address_1);

        }catch (Exception e){
            System.out.println("Erro de API");
        }

    }
}
