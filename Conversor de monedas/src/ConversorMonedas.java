import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorMonedas {
    void convertir(String base_code, String tipoCambio) throws IOException, InterruptedException {
        //Se pide la cantidad de dinero a convertir
        Scanner teclado=new Scanner(System.in);
        System.out.println("Cuánto deseas convertir?");
        try {
            var dinero=teclado.nextDouble();
            //link con los datos de tipo de moneda
            String direccion="https://v6.exchangerate-api.com/v6/883a57ddd94f85a44dc9df73/pair/"+base_code+"/"+tipoCambio;
            //Construyendo el cliente para solicitudes (HttpCliente)
            HttpClient client = HttpClient.newHttpClient();
            //Contruyendo la solicitud
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            //Construyendo la respuesta (HttpResponse)
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //Convertir mi json en un objeto de la clase moneda
            String json=response.body();
            Gson gson=new Gson();
            Moneda moneda=gson.fromJson(json, Moneda.class);
            //Operacion para obtener el valor del cambio
            System.out.println("El valor "+dinero+"["+base_code+"] corresponde al valor final de => "+dinero*moneda.conversion_rate()+"["+tipoCambio+"]");

        }catch (InputMismatchException e){
            System.out.println("No es un numero favor de volver a intentar toda la transacción. :D");
        }


    }
}