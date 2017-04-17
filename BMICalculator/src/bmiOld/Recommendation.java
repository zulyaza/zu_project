package bmiOld;

public class Recommendation {
	
	public  String  GetResult(double bmi, String sex) {
		String res = "";
		
		if((bmi<19 & sex.equals("woman") )|| (bmi<20 & sex.equals("man")))
			res= "Недовес";
		
		if((19 <= bmi & bmi <= 24 & sex.equals("woman")) || (20 <= bmi & bmi <= 25 & sex.equals("man")))
			res= "Нормальный вес";
		
		if((25 <= bmi & bmi <= 30 & sex.equals("woman")) || (26 <= bmi & bmi <= 30 & sex.equals("man")))
			res= "Избыточный вес";
		
		if(31 <= bmi & bmi <= 40 )
			res= "Ожирение";
		
		if(40 <= bmi )
			res= "Тяжелое ожирение";

		
		return res;
	}
	
	public void Reccomendation(String res){
		switch(res){
		case "Недовес":
			System.out.println("Вам надо больше питаться и делать силовые упражнения на массу");
			break;
			
		case "Нормальный вес":
			System.out.println("Вам можно оставить питание тем же, а так же не помешают занятия спортом для поддержания фигуры");
			break;
			
		case "Избыточный вес":
			System.out.println("Вам следует ограничить себя в питании и больше двигаться,заниматься спротом");
			break;
			
		case "Ожирение":
			System.out.println("Вам необходимо подобрать диету и делать кардио-упражнения");
			break;
			
		case "Тяжелое ожирение":
			System.out.println("Необходимо проконсультироваться с врачом и подобрать соответствующую диету и режим тренировок");
			break;		
		}
	} 
	

}
