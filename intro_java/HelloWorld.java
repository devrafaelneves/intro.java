//catorze
import java.util.Scanner;

public class HelloWorld{
    public static void main (String[]args){

    Scanner scan = new Scanner (System.in);

    System.out.println("Digite seu sexo: 1(M) OU 2(F)");

    int inputSexo = scan.nextInt();
    String sexo;

    switch (inputSexo){
        case 1 : {
            sexo = "Machu";
        break; }
        case 2 : {
            sexo = "Female";
        break; }

        default : sexo = "Others";

    }

    System.out.println("Seu sexo é " + sexo);

    }
}

//treze
// import java.util.Scanner;

// public class HelloWorld{
//     public static void main (String[]args){

//     Scanner scan = new Scanner (System.in);

//     System.out.println("Digite seu sexo: 1(M) OU 2(F)");

//     String sexo = (scan.nextInt() == 1 ? "Masculino" : "Female"); //operador ternario (condição -> caso 1 -> caso 2)
    
//     System.out.println("Sexo escolhido é " + sexo);


//     }
// }

//doze
// import java.util.Scanner;

// public class HelloWorld{
//     public static void main (String[]args){

        
//     Scanner scan = new Scanner (System.in);
//     System.out.println("Digite seu sexo: 1(M) OU 2(F)");


//     int inputSexo = scan.nextInt();
//     String sexo;

//     if (inputSexo == 1){
//         System.out.println("Masculino");
//     }
//     else{
//         System.out.println("Feminino");
//     }

//     }
// }

//onze
// import java.util.Scanner;

// public class HelloWorld{
//     public static void main (String[]args){
        
//     Scanner scan = new Scanner (System.in);

//     System.out.println("Digite seu nome:");
//     String nome = scan.nextLine();

//     System.out.println("Olá " + nome + ", digite a sua nota da N1: ");
//     double n1 = scan.nextDouble();
//     System.out.println("da N2: ");
//     double n2 = scan.nextDouble();
//     System.out.println("da N3: ");
//     double n3 = scan.nextDouble();

//     double media = (n1+n2+n3)/3;

//     System.out.println(nome + ", sua média é: " + media);



//     if (media == 7) {} //igual  
//     if (media >= 7) {} //maiorigual
//     if (media <= 7) {} //menorigual
//     if (media < 7) {} //menor
//     if (media > 7) {} //maior 
//     if (media != 7) {} //diferente

//     if (media >= 7 ){
//         System.out.println("Aprovado")
//     }
//     else{
//         if (media < 5){ 
//         System.out.println("Reprovado")
//         }
//         else {
//             double exame = 10-media
//             System.out.println("Exame, você precisa tirar" + exame)
//         }
//     }
// }


//dez
//bibilioteca de scanner 
// import java.util.Scanner;

// public class HelloWorld{
//     public static void main (String[]args){
        
//     Scanner scan = new Scanner (System.in);

//     System.out.println("Digite seu nome:");
//     String nome = scan.nextLine();

//     System.out.println("Olá " + nome + ", digite a sua nota da N1: ");
//     double n1 = scan.nextDouble();
//     System.out.println("da N2: ");
//     double n2 = scan.nextDouble();
//     System.out.println("da N3: ");
//     double n3 = scan.nextDouble();

//     double res = (n1+n2+n3)/3;

//     System.out.println(nome + ", sua média é: " + res);

// }
// }

//nove
// public class HelloWorld{
//     public static void main (String[]args){

//         double valor = 10;
//         valor += 10;

//         System.out.println(valor); //20

//         valor -= 15;
//         System.out.println(valor); //5

//         valor *= 2;
//         System.out.println(valor); //10

//         valor /= 10;
//         System.out.println(valor); //1


// }
// }


//oito 
// public class HelloWorld{
//     public static void main (String[]args){
        
//         float n1 = 8;
//         float n2 = 9;
       

//         boolean maior = (n1 > n2);
//         boolean menor = (n1 < n2);
//         boolean igual = (n1 == n2);
//         boolean diferente = (n1 != n2);


//         System.out.println(maior);
//         System.out.println(menor);
//         System.out.println(igual);
//         System.out.println(diferente);

// }
// }



//sétimo
// public class HelloWorld{
//     public static void main (String[]args){
        
//         float n1 = 8;
//         float n2 = 9;
//         float n3 = 10;
//         float res = (n1 + n2 + n3)/3 ;
//         float exame = 10-res;

//         if (res >= 7 ){
//             System.out.println("Você está aprovado");
//         }
//         else {
//             System.out.println("Você está reprovado. Você precisa tirar " + (exame) + " no exame para recuperar a média.");
//         }

//     }

// }

//sexto
// public class HelloWorld{
//     public static void main (String[]args){
        
//         float n1 = 2;
//         float n2 = 3;
//         float n3 = 4;
//         float res = (n1 + n2 + n3)/3 ;
//         float exame = 10-res;

//         if (res >= 7 ){
//             System.out.println("Você está aprovado");
//         }
//         else {
//             System.out.println("Você está reprovado. Você precisa tirar " + (exame) + " no exame para recuperar a média.");
//         }

//     }

// }

//quinto 
// public class HelloWorld{
//     public static void main (String[]args){
        
//         float n1 = 6;
//         float n2 = 7;
//         float n3 = 8;
//         float res = (n1 + n2 + n3)/3 ;

//         System.out.println(res);
//     }

// }


//quarto
// public class HelloWorld{
//     public static void main (String[]args){
        
//         String nome = " Rafael";
//         int idade =  20;
//         int a =  1;
//         int b =  2;

//         System.out.println(a + b + nome );
//         System.out.println(a - b);
//         System.out.println(a*b);
//         System.out.println(a/b);
//     }

// }



//Terceiro
// public class HelloWorld{
//     public static void main (String[]args){
        
//         String nome = "Rafael";
//         int idade = 20;
        
    
//         System.out.println(idade);
//     }

// }


//segundo
// public class HelloWorld{
//     public static void main (String[]args){
        
//         String nome = "Rafael";
        
    
//         System.out.println(nome);
//     }

// }

//Primeiro
//Foi criado uma class e depois só chamou no terminal
// PS C:\Users\aluno\Desktop\intro_java> javac HelloWorld.java
// PS C:\Users\aluno\Desktop\intro_java> java HelloWorld
// Hello World
// PS C:\Users\aluno\Desktop\intro_java>

//A ORDEM É SEMPRE USAR O TERMINAL COM OS CODE :
//javac (nome do arquivo.java)
//depois ->
//java (nome do arquivo só)


// pra saber em qual parte da pasta está programando é comando "ls" no terminal 
// pra entrar na pasta, colocar "cd" e usar TAB pra ir pro próximo diretório
//exemplo PS C:\Users\ALUNO.LAB-15\Desktop\intro.java-main> cd .\intro_java\