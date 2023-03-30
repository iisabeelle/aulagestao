package matriculaweb;

public class Coordenacao {

	 private Aluno[] bd = new Aluno[6];
	  private int posicao = 0;
	  
	  public void matricular(Aluno aluno){
	    if(posicao<6){
	      bd[posicao] = aluno;
	      posicao++;
	    } else {
	      System.out.println("Não podemos matricular aluno");
	    }
	    
	  }

	  public String consultar(String matricula){
	    for(int i = 0; i<bd.length; i++){
	      if(bd[i]!=null){
	        if(bd[i].getMatricula().equals(matricula)){
	        return "Aluno: " + bd[i].getNome() + " Matricula: " + bd[i].getMatricula()+ " Email: " + bd[i].getEmail();
	       }
	      }
	    }
	    return "Aluno não encontrado";
	  }

	  public void exibir(){
	    for(Aluno aluno : bd){

	      if( aluno != null){
	      System.out.println("Aluno: " + aluno.getNome() + " Matricula: " + aluno.getMatricula()+ " Email: " + aluno.getEmail());
	      }

	    }
	  }
	}
	
	
	

