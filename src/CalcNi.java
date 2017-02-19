
	
public class CalcNi {
	static int NB_STATIONS ;
	static int NB_USERS;
	static int Md =4;

	static StationsProches[] Nf;
	
	
	static int[][] adjMat; 
	
	public CalcNi(int m,int nbUsers, int nbStations, StationsProches[] Nf,int[][] adjMat){
		this.Md = m;
		this.NB_USERS = nbUsers;
		this.NB_STATIONS = nbStations;
		this.Nf = Nf;
		this.adjMat = adjMat;
		
		
		
	}
	public StationsProches[][] calcNi(){
		/* CALCUL DES VOISINS DES STATIONS DE Nf DANS UNE MATRICE Ni*/
		//int Ni[][]= new int[8][Md];
		StationsProches[][] Ni = new StationsProches[NB_USERS][NB_STATIONS];
		for(int j=0;j<NB_USERS;j++){
			for(int i = 0;i<NB_STATIONS;i++){
				Ni[j][i]= new StationsProches();
				int idLocal = Nf[j].getId(i);
				int distanceLocal = Nf[j].getDistance(idLocal);
				
				for(int k = 0;k<NB_STATIONS;k++){
					
					
					
					Ni[j][i].ajouterStation(this.adjMat[idLocal][k], k);
					
				}
			
		
			
			}
		}
		System.out.println("---user 1---");
		for(int i=0;i<NB_STATIONS;i++)
		{
			System.out.println("   station "+i);
			Ni[0][i].enumrer();
			
		}
		
		System.out.println("---user 2---");
		for(int i=0;i<NB_STATIONS;i++)
		{
			System.out.println("   station "+i);		
			Ni[1][i].enumrer();
			
		}
		
		
		return Ni;
		
	}
}