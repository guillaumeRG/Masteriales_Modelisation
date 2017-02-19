
public class AdjMatrix {
	static int NB_STATIONS;
	
	static int[][] coordMat ;
	static int[][] adjMat; 
	
	//permet de creer un exemple de matrice Lf de coordonné des stations
	public int[][] exempleMatrix(){
		for(int i=0;i<NB_STATIONS;i++){
			coordMat[i][0]=i;
			coordMat[i][1]=i;
			System.out.println("exemple Lf : 0 1:"+coordMat[i][0]+" "+coordMat[i][1]);
			
		}
		return coordMat;
	}
	
	public AdjMatrix(int nb){
	
		this.NB_STATIONS=nb;
		coordMat = new int[NB_STATIONS][2];
		adjMat = new int[NB_STATIONS][2];
	}
	public int[][] buildADJMat(){
		/* CALCUL DES DISTANCES DES STATIONS ENTRE ELLES DANS UNE MATRICE D'ADJA*/
		int currentX=0;
		int currentY=0;
		int x;
		int y;
		int[][] adjMatlocal= new int[9][9];
		for(int i=0;i<NB_STATIONS;i++){
			
			currentX=this.coordMat[i][0] ;
			currentY = this.coordMat[i][1] ;
			System.out.println(currentX);
			for(int j=0;j<NB_STATIONS;j++){

				x=Math.abs(currentX-coordMat[j][0]);
			
				y=Math.abs(currentY-coordMat[j][1]);
				
				adjMatlocal[i][j]=x+y;
				
			}
		}
		adjMat=adjMatlocal;
		return adjMatlocal;
	}
}
