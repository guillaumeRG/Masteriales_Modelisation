

import java.lang.Math;

	
public class CalcNf {
	final static int NB_STATIONS =8;
	final static int Md =4;
	final static int NB_USERS =2;
	
	static int[][] coordMat= new int[NB_STATIONS][2];
	static int[][] adjMat= new int[NB_STATIONS][2];
	static int[][] Nf;
	StationsProches[] Ni = new StationsProches[];
	
	public static void main(String[] args) {
		CalcNf Lf = new CalcNf();
		CalcNi Li = new CalcNi(NB_USERS);
		Lf.exempleMatrix();
		
		Lf.buildADJMat();
		for(int i=0;i<NB_STATIONS;i++){
			for(int j = 0;j<=NB_STATIONS;j++){
				System.out.print("Resultat "+i+" "+j+"  "+adjMat[i][j]);
				System.out.println();
			}
		}
		Nf=Lf.getPointVoisin(adjMat);
		for(int i=0;i<NB_STATIONS;i++){
			for(int j = 0;j<4;j++){
				System.out.print("Voisins "+i+" "+j+"  "+Nf[i][j]);
				System.out.println();
			}
		}
		

		Li.exempleMatrix();
		Li.calcNi(coordMat, NB_STATIONS);
	}
	public void exempleMatrix(){
		for(int i=0;i<NB_STATIONS;i++){
			coordMat[i][0]=i;
			coordMat[i][1]=i;
			System.out.println("exemple Lf : 0 1:"+coordMat[i][0]+" "+coordMat[i][1]);
			
		}
	}
	public void getMatrice(int mat[][]){
		this.coordMat=mat;	
		
	}
	public void buildADJMat(){
		/* CALCUL DES DISTANCES DANS UNE MATRICE D'ADJA*/
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

	}

	
	public int[][] getPointVoisin(int MatriceAdj[][]){
		/* CALCUL DES VOISINS DANS UNE MATRICE NF*/
		int voisin[][]= new int[8][Md];
		
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