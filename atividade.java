public class atividade {
    public static void main(String[] args){

        professor pr = new professor("nome" , 24 ,5000 ,"hfhf545");

        System.out.println("professor " + pr.getNome());
        System.out.println("idade " + pr.getIdade());
        System.out.println("salario " + pr.getSalario());
        System.out.println("matricula " + pr.getMatricula());
    }
}
