public class Main {
    public static void main(String[] args) {

        int idade = 21;
        double salario = 1900.0;
        boolean ehColorado = true;

        String nome = "Rolando caio da Rocha";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.endsWith("Rocha"));

        if(nome.endsWith("Rocha")){
            System.out.println("Termina com Rocha");
        }else{
            System.out.println("Não termina com Rocha");
        }

        if(nome.length() < 3){
            System.out.println("Nome inválido");
        }

        System.out.println(nome.replace("a","@"));
        String[] partesDoNome = nome.split(" ");
        for(String parte : partesDoNome){
            System.out.println(parte);
        }

        System.out.println(nome.indexOf("h"));

        System.out.println(nome.substring(5));

        System.out.println(nome.substring(nome.lastIndexOf(" ")+1));

        String email = "acab@ab";

        System.out.println(email.matches("[a-z]+@[a-z]+"));

    }
}