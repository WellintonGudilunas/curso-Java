package entities;

public class Student {
	public String nome;
	public double nota1, nota2, nota3;

	public double finalGrade() {
		return (nota1 + nota2 + nota3);
	}

	public String situation(){
        if(finalGrade() >= 60){
          	return "PASS";
        } else {
          	return "FAILED";
        }
    }

	public double missingPoints(){
		if(finalGrade() < 60.0 && finalGrade() > 0){
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
}