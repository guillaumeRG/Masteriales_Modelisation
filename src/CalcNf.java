
public class CalcNf {
	int NB_USERS =2;
	final static int Dmax =5;
	
	int[][] Li;
	
	public CalcNf(int nbUsers) {
		this.NB_USERS=nbUsers;
		Li= new int[NB_USERS][2];
	}
	
	public void exempleMatrix(){
		for(int i=0;i<NB_USERS;i++){
			Li[i][0]=i+2;
			Li[i][1]=i+2;
			System.out.println("exemple Li : x y:"+Li[i][0]+" "+Li[i][1]);
			
		}
	}
	public StationsProches[] calcNf(int[][] Lf,int nb_stations){
		/* CALCUL DES VOISINS DE Li DANS UNE MATRICE Nf*/
	
		StationsProches Nf[]= new StationsProches[NB_USERS];
		int XU;
		int YU;
		int XS;
		int YS;
		int d;
		for(int j=0;j<NB_USERS;j++){
			Nf[j]= new StationsProches();
			for(int i = 0;i<nb_stations;i++){
			
				
				XS=Lf[i][0];
				YS=Lf[i][1];
				
				XU=Li[j][0];
				YU=Li[j][1];
				d=Math.abs((XU-XS)+(YU-YS));
				if(d<=Dmax){
					//System.out.println(XS+" "+YS);
					
					
					Nf[j].ajouterStation(i, d);	
				}
		
			}
			
		}
		System.out.println("---user 1---");
		Nf[0].enumrer();
		System.out.println("---user 2---");
		Nf[1].enumrer();
		return Nf;
	}
}
