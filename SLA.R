negociateFunction()

negociateFunction <- function(){
  round<-1
  initFunction()
  payOffMatrix<-payOffMatrixFunction(ScP(P0),ScQ(Q0),SscP(P0),SscQ(Q0),Po)
  current_equilibrium<-findNashEquilibrium(payOffMatrix)
  Pe<-Po
  Qe<-Qo
  Pn<-updateOfferP(Pc)
  Qn<-updateOfferQ(Qc)
  payoffMatrix <- payOffMatrixFunction(ScP(Pe),ScQ(Qe),SscP(Pe),SscQ(Qe),Po,DELTA,delta)
  next_equilibrium<- findNashEquilibrium(payOffMatrix)
  current_satisfactionDiff<-findSatisfactionDiff(current_equilibrium)
  next_satisfactionDiff<-findSatisfactionDiff(next_equilibrium)
  
  while(current_satisfactionDiff>= next_satisfactionDiff)
  {
    Pc<-Pn
    Qc<-Qn
    current_equilibrium<-next_equilibrium
    Pn <- updateOfferP(Pc)
    Qn <- updateOfferQ(Qn)
    payoffMatrix <- payOffMatrixFunction(ScP(Pe),ScQ(Qe),SscP(Pe),SscQ(Qe),DELTA,delta)
    next_equilibrium<- findNashEquilibrium(payOffMatrix)
    current_satisfactionDiff<-findSatisfactionDiff(current_equilibrium)
    next_satisfactionDiff<-findSatisfactionDiff(next_equilibrium)
    round<-round+1
  }
  return( current_equilibrium)
}
ScP <- function(P){
  return(0) 
}
ScQ <- function(Q){
  return(0) 
}
SscP <- function(P){
  return(0)
}
SscQ <- function(Q){
  return(0) 
}

updateOfferP <- function(Pc){
  return(0)
}
updateOfferQ <- function(Qc){
  return(0)
}
findNashEquilibrium<- function(payOffMatrix){
  return(0)
}
payOffMatrixFunction<- function(Sc_P,Sc_Q,Ssp_P,Ssp_Q,Po,DELTA,delta){
  
  payOffMatrix <- as.matrix(nrow=3,ncol=3)
  #c ,
  payOffMatrix[0,0]<-{}
  payOffMatrix[0,0]<-
  payOffMatrix[0,0]<-  
  payOffMatrix[0,0]<-
  return(0)
}
findSatisfactionDiff <- function(equilibrium){

  return(0)
}
initFunction<- function(){
  Po<<-0
  Qo<<-0
  Qmax<<-0
  Pmax<<-0
  Qmin<<-0
  Pmin<<-0
  Ssp_P<<-0
  Ssp_Q<<-0
  Sc_P<<-0
  Sc_Q<<-0
  DELTA<<-0
  delta<<-0
}


