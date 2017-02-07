negociateFunction()

negociateFunction <- function(){
  round<-1
  initFunction()
  payOffMatrix<-payOffMatrixFunction(ScP(P0),ScQ(Q0),SscP(P0),SscQ(Q0))
  current_equilibrium<-findNashEquilibrium(payOffMatrix)
  Pe<-Po
  Qe<- Qo
  
  payoffMatrix <- payOffMatrixFunction(ScP(Pe),ScQ(Qe),SscP(Pe),SscQ(Qe))
  
  return(0)
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

updateOffer <- function(Pc,Qc){
  return(0)
}
findNashEquilibrium<- function(payOffMatrix){
  return(0)
}
payOffMatrixFunction<- function(Sc_P,Sc_Q,Ssp_P,Ssp_Q){
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


