
public class StationsProches {
	int d[];
	int idStation[] = new int[1];
	int nbStations=0;
	//structure
	public void StationProches(){
		
	}
	public int getId(int k){
		
			
			if(k<nbStations){return idStation[k];}
		
		System.out.println("Erreur aucune "+k+"eme station !");
		return -1;
	}
	public int getDistance(int id){
		for(int i = 0;i<nbStations;i++){
			
			if(idStation[i] == id){return d[i];}
		}
		System.out.println("Erreur aucune station "+ id+" !");
		return -1;
	}
	public void enumrer(){
		
		for(int i=0;i<nbStations;i++){
			System.out.println("distance :"+d[i]+" id Station :"+idStation[i]);
		}
	}
	public void ajouterStation(int idStation,int d){
		nbStations++;
		//System.out.println("NB STATION :"+nbStations);
		int idStationLocal[]=this.idStation;
		this.idStation= new int[nbStations];
		int dLocal[]= this.d;
		this.d = new int[nbStations];
		
		for(int i=0;i<=(nbStations-1);i++){
			if(i!=(nbStations-1)){
				this.idStation[i]=idStationLocal[i];
				this.d[i]=dLocal[i];
			}
			else{
				this.idStation[i]=idStation;
				this.d[i]=d;
			}
		}
	}
}
