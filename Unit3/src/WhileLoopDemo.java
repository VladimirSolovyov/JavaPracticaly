
public class WhileLoopDemo {

	public static void main(String[] args) {
		String [] autoModels = new String [20];
		autoModels[0] = "Audi";
		autoModels[1] = "AlfaRome";
		autoModels[2] = "BMV";
		autoModels[3] = "Seat";
		autoModels[4] = "Renault";
		autoModels[18] = "Honda";
		autoModels[19] = "Kia";
		
		int totalElements = autoModels.length;
		int i = 0;
		
		while(i < totalElements) {
			if(autoModels[i] == null) {
				i++;
				continue;
			}
			
			System.out.println("And you know the car brand: " + autoModels[i]);
			if(autoModels[i] == "Renault") break;
			i++;
		}
		
		System.out.println("End loop!");

	}

}
