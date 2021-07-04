package entidades;

public class Pessoa {
    
    //nome da pessoa
    public String nome;
    //data de nascimento
    public double nascimento;
    //se possui comorbidade
    public Comorbidade comorbidade;
    
    //construtor
    public Pessoa(String nome, double nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    //calcula a idade a partir do nascimento
    public int getIdade(){
        return (int) (2021 - nascimento);
    }

    //atribui uma comorbidade
    public void setComorbidade(Comorbidade comorbidade) {
        this.comorbidade = comorbidade;
    }
    
    //retorna se tem prioridade
    public boolean prioridadeIdade(){
        return (2021 - this.nascimento >= 60);
    }
}
