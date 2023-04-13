import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Double peso, altura, imc;
       Scanner teclado;
       String abaixodoPeso, pesoNormal, sobrePeso, mostrarImc;

       teclado = new Scanner(System.in);

       System.out.println("Digite seu peso ");
       peso = teclado.nextDouble();

       System.out.println("Digite sua altura");
       altura = teclado.nextDouble();

       abaixodoPeso = ("Abaixo do peso. ");
       pesoNormal = ("Peso normal. ");
       sobrePeso = ("Acima do peso. ");
       mostrarImc = ("Seu IMC é de: ");
       
       imc = peso / (altura * altura);

       teclado.close();

       if (imc < 18.5){
            System. out.println(abaixodoPeso + mostrarImc + imc);
       }
       else {
            if(imc>- 18.5 && imc < 24.9) {
                System.out.println(pesoNormal + mostrarImc + imc);
            }
        else {
            if (imc > 24.9 && imc <= 29.9) {
                System.out.println(sobrePeso + mostrarImc + imc);
          }
        }
      }
    }
}
