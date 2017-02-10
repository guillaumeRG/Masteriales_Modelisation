
public class SLA {
	int Po=0;
	int Qo=0;
	int Qmax=0;
	int Pmax=0;
	int Qmin=0;
	int Pmin=0;
	int Ssp_P=0;
	int Ssp_Q=0;
	int Sc_P=0;
	int Sc_Q=0;
	int DELTA=0;
	int delta=0;
	
	NashEquilibrium current_equilibrium;
	NashEquilibrium next_equilibrium;
	
	
	float[][] payOffMatrix;
	public static void main(String[] args) {
		

	}
	public void negociate(){
		 int round = 1;
		 float Pe;
		 float Qe;
		 float Pn;
		 float Qn;
		 float Pc = 0;
		 float Qc = 0;
		 
		 this.payOffMatrixFunction(ScP(Po),ScQ(Qo),SscP(Po),SscQ(Qo),Po,DELTA,delta);
		  
		 current_equilibrium=this.findNashEquilibrium();
		  
		 Pe=Po;
		 Qe=Qo;
		 Pn=updateOfferP(Pc);
		 Qn=updateOfferQ(Qc);
		 
		 this.payOffMatrixFunction(ScP(Pe),ScQ(Qe),SscP(Pe),SscQ(Qe),Po,DELTA,delta);
		  
		 next_equilibrium= this.findNashEquilibrium();
		  
		 float current_satisfactionDiff = findSatisfactionDiff(current_equilibrium);
		  
		 float next_satisfactionDiff=findSatisfactionDiff(next_equilibrium);
		 
		 while(current_satisfactionDiff>= next_satisfactionDiff)
		 {
		    Pc=Pn;
		    Qc=Qn;
		    current_equilibrium=next_equilibrium;
		    Pn = updateOfferP(Pc);
		    Qn = updateOfferQ(Qn);
		    this.payOffMatrixFunction(ScP(Pe),ScQ(Qe),SscP(Pe),SscQ(Qe),Po,DELTA,delta);
		    next_equilibrium= this.findNashEquilibrium();
		    current_satisfactionDiff=findSatisfactionDiff(current_equilibrium);
		    next_satisfactionDiff=findSatisfactionDiff(next_equilibrium);
		    round++;
		}
		 
	}
	
	private float findSatisfactionDiff(NashEquilibrium current_equilibrium2) {
		
		return 0;
	}
	private void payOffMatrixFunction(float scP, float scQ, float sscP,
			float sscQ,float P0, int DELTA,int delta) {
		
		
	}
	public void initFunction(){
		

	}
	
	public void SatisfactionMethode(){
			
			
			
	}
	public NashEquilibrium findNashEquilibrium(){
		return null;
		
	}
	public float updateOfferP(float P){
		return P;
		
	}
	public float updateOfferQ(float P){
		return P;
		
	}
	public float ScP(float P){
		  return P; 
	}
	public float ScQ(float Q){
		  return Q; 
	}
	public float SscP(float P){
		  return P; 
	}
	public float SscQ(float Q){
		  return Q; 
	}
		

}
