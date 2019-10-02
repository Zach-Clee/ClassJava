class Maths{
	private int Phy, Che, Mat;
	private int invalid = 0;
	private int failedCourses = 0;
	int results;
	private void doSomething(){
		results = Phy + Che + Mat;

	}

	public void Physics(int input){
		if (input >= 0 && input <= 150){
			Phy = input;
		} else {
			Manchester.z("Error, incorrect Physics value");
			invalid = 1;
		}
	}


	public void Chemistery(int input){
		if (input >= 0 && input <= 150){
			Che = input;
		} else {
			Manchester.z("Error, incorrect Chemistery value");
			invalid = 1;
		}
	}


	public void Mathematics(int input){
		if (input >= 0 && input <= 150){
			Mat = input;
		} else {
			Manchester.z("Error, incorrect Mathematics value");
			invalid = 1;
		}
	}

	public void Results(){
		int total = 0;
		if (invalid == 0){
			
			coursesFailed(Phy);
			coursesFailed(Che);
			coursesFailed(Mat);

			switch (failedCourses) {
            case 0:  failedCourses = 0;
            		 Manchester.z("You have passed the exam");
                     break;
            case 1:  failedCourses = 1;
            		 Manchester.z("Retake the exam");
                     break;
            case 2:  failedCourses = 2;
            	     Manchester.z("Retake the module");
                     break;
            case 3:  failedCourses = 3;
            		 Manchester.z("Go home");
                     break;}

			total = Phy + Che + Mat;
			Manchester.z("Total is: " + total);
		}
	}

	public void coursesFailed(int input){
		if (input < 60){
			failedCourses += 1;
		}
	}
}