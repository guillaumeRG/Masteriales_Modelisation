
public class StationsProches {
	int d[];
	int idStation[];
	int nbStations=0;
	
	public void StationProches(){
		
	}
	
	public void ajouterStation(int idStation,int d){
		nbStations++;
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
