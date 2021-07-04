package entidades;

public class Comorbidade {
//    Doenças cardiovasculares
//    Diabetes mellitus 
//    Obesidade morbida
           
//        System.out.println("Doenças causadoras de imunossupressão: lúpus eritematoso sistêmico, síndrome de Cushing, espondilite anquilosante e outras;");
//        System.out.println("Doenças cardiovasculares: arritmia cardíaca, cardiopatia hipertensiva, insuficiência cardíaca, cardiopatia congênita;");
//        System.out.println("Doenças pulmonares: fibrose cística, hipertensão pulmonar, doença pulmonar obstrutiva crônica (DPOC), enfisema, asma;");
//        System.out.println("Síndromes coronarianas: angina instável, infarto agudo do miocárdio;");
//        System.out.println("Valvulopatias: aórtica, mitral, pulmonar e tricúspide;");
//        System.out.println("Miocardiopatias e pericardiopatias: doenças que atingem o miocárdio e o pericárdio;");
//        System.out.println("Doença da aorta, dos grandes vasos e fístulas arteriovenosas;");
//        System.out.println("Próteses valvares e dispositivos cardíacos implantados;");
//        System.out.println("Diabetes mellitus\nHipertensão arterial\nDoenças cerebrovasculares: acidente vascular cerebral;");
//        System.out.println("Doença renal crônica\nTransplantados\nHIV\nDoenças reumáticas\nCâncer\nAnemia falciforme e talassemia maior;");
//        System.out.println("Cirrose hepática\nObesidade mórbida.");
    
    
    //numero da comorbidade
    int c;
    
    //lista de comorbidades
    private static final String[] opcoes = {"Nenhuma","Doenças cardiovasculares","Diabetes mellitus","Obesidade morbida"};

    //construtor
    public Comorbidade(int opc){
        this.c = opc;
    }
        
    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < opcoes.length; i++){
            resultado += (i + 1) + " " + opcoes[i] + "\n";
        }
        return resultado;
    }
    
    //montar a lista
    public static String listar(){
        String resultado = "";
        for (int i = 0; i < opcoes.length; i++){
            resultado += (i + 1) + " " + opcoes[i] + "\n";
        }
        return resultado;
    }
    
    //valida a comorbidade escolhida
    public static boolean validar(int escolha){
        if(escolha > 1){
        return true;
    }
        return false;
    }
}
