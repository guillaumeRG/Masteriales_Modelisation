package masteriales;

import java.lang.Math;

	
public class ADJMatrix {
	final static int NB_STATIONS =8;
	static int[][] distMat= new int[NB_STATIONS][2];
	static int[][] adjMat= new int[NB_STATIONS][2];
	static int[][] voisins;
	public static void main(String[] args) {
		ADJMatrix obj = new ADJMatrix();
		obj.exempleMatrix();
		obj.buildADJMat();
		for(int i=0;i<NB_STATIONS;i++){
			for(int j = 0;j<=NB_STATIONS;j++){
				System.out.print("Resultat "+i+" "+j+"  "+adjMat[i][j]);
				System.out.println();
			}
		}
		voisins=obj.getPointVoisin(adjMat);
		for(int i=0;i<NB_STATIONS;i++){
			for(int j = 0;j<4;j++){
				System.out.print("Voisins "+i+" "+j+"  "+voisins[i][j]);
				System.out.println();
			}
		}
	}
	public void exempleMatrix(){
		for(int i=0;i<NB_STATIONS;i++){
			distMat[i][0]=i;
			distMat[i][1]=i;
			System.out.println("exemple : 0 1:"+distMat[i][0]+" "+distMat[i][1]);
			
		}
	}
	public void getMatrice(int mat[][]){
		this.distMat=mat;	
		
	}
	public void buildADJMat(){
		int currentX=0;
		int currentY=0;
		int x;
		int y;
		int[][] adjMatlocal= new int[9][9];
		for(int i=0;i<NB_STATIONS;i++){
			
			currentX=this.distMat[i][0] ;
			currentY = this.distMat[i][1] ;
			System.out.println(currentX);
			for(int j=0;j<NB_STATIONS;j++){

				x=Math.abs(currentX-distMat[j][0]);
			
				y=Math.abs(currentY-distMat[j][1]);
				
				adjMatlocal[i][j]=x+y;
				
			}
		}
		adjMat=adjMatlocal;

	}

	
	public int[][] getPointVoisin(int MatriceAdj[][]){
		
		int voisin[][]= new int[8][4];
		
		int distlocal = 0;
		int station = 0;
		int min =0;
		
		for( int i = 0; i < NB_STATIONS;i++){
			for( int k = 0; k <= 3;k++){
				
			
				min=999999999;
				station=-1;
				
				for(int j=0;j < NB_STATIONS;j++){
					if(i!=j){
						distlocal=MatriceAdj[i][j];
						
						if(min>distlocal)
						{
							min = distlocal;
							station=j;
							//System.out.println("Voisins "+i+" "+k+"  "+station+" "+distlocal);
						}
					}	
						

				}
				
				MatriceAdj[i][station]=999999999;
				//System.out.println(station);
				voisin[i][k]=station;
				
				
			}
		}
		return voisin;
		
	}
}