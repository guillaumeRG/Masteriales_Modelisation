import java.lang.Math;




public class CalcNi {
	static int NB_USERS =2;
	final static int Dmax =300;
	
	static int[][] Li= new int[NB_USERS][2];
	public void CalcNi(int nb){
		this.NB_USERS=nb;
	}
	public float dist(Coord c){
		float dist = 0;
		return dist;
	}
	public void exempleMatrix(){
		for(int i=0;i<NB_USERS;i++){
			Li[i][0]=i+2;
			Li[i][1]=i+2;
			System.out.println("exemple Li : x y:"+Li[i][0]+" "+Li[i][1]);
			
		}
	}
	public StationsProches[] calcNi(int[][] Lf,int nb_stations){
		/* CALCUL DES VOISINS DANS UNE MATRICE NF*/
		StationsProches Ni[]= new StationsProches[nb_stations];
		int XU;
		int YU;
		int XS;
		int YS;
		int d;
		for(int i = 0;i<nb_stations;i++){
			
			XS=Lf[i][0];
			YS=Lf[i][1];
			for(int j=0;j<NB_USERS;j++){
				
				XU=Li[j][0];
				YU=Li[j][1];
				d=Math.abs((XU-XS)+(YU-YS));
				if(d<=Dmax){
				Ni[j].ajouterStation(i, d);}
	
			}
			
		}	
		
		return Ni;
				
	}
}
