
public class Run {
	final static  int NB_STATIONS =8;
	final static int Md =4;
	final static int NB_USERS =2;
	
	static int[][] Lf= new int[NB_STATIONS][2];
	static int[][] adjMat= new int[NB_STATIONS][2];
	
	static StationsProches[] Nf ;
	static StationsProches[][] Ni ;
	
	public static void main(String[] args) {
		
		CalcNf cNf = new CalcNf(NB_USERS);
		AdjMatrix matriceADJ= new AdjMatrix(NB_STATIONS);
		//Lf.exempleMatrix();
		
		adjMat=matriceADJ.buildADJMat();
		Lf = matriceADJ.exempleMatrix();
		

		cNf.exempleMatrix();
		//Calcul des Nf
		Nf = cNf.calcNf(Lf, NB_STATIONS);
		
		CalcNi cNi = new CalcNi(Md,NB_USERS, NB_STATIONS,  Nf, adjMat);
		
		//Calcul des Ni
		Ni = cNi.calcNi();
		
		
		
		
		
	}
}
