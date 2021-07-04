package Principal;

import entidades.Comorbidade;
import entidades.Pessoa;
import java.util.Locale;
import java.util.Scanner;


public class Programa {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //receber o nome digitado
        String nome = "";
        //receber data de nascimento digitada
        double nascimento;
        //entidade da pessoa
        Pessoa p1;
        //receber a comorbidade cadastrada
        int comorbCadastrada;
        
        System.out.println("Sistema de Verificação de Prioridade de Vacina - COVID-19");
        
        
        System.out.println("Digite o seu Nome Completo: ");
        //recebendo nome digitado
        nome = sc.nextLine();
        System.out.println("Digite o ano do seu nascimento");
        //recebendo data de nascimento cadastrada
        nascimento = sc.nextDouble();
        
        //instanciando um objeto da classe pessoa
        p1 = new Pessoa(nome, nascimento);
        
        //verificando se de acordo com a idade, tem prioridade
        if(p1.prioridadeIdade()){
            System.out.println("Você possui prioridade, de acordo com sua idade: "+p1.getIdade());
            return;
        }
        System.out.println("Você possui alguma das comorbidades listadas a baixo?: ");
        System.out.println(Comorbidade.listar());
        //recebendo a opcao escolhida de comorbidade
        comorbCadastrada = sc.nextInt();
        
        //validando comorbidade digitada
        if(Comorbidade.validar(comorbCadastrada)){
            System.out.println("Você tem prioridade para a vacinação.");
            //instanciando uma comorbidade e atribuindo a pessoa
            p1.setComorbidade(new Comorbidade(comorbCadastrada));
            return;
        }
            System.out.println("Você não tem prioridade para a vacinação.");
        
    }
    
}
