remove(deltat)# remove an object
rm(list = ls())# remove all objects

varglob <<- 4 # est une variable globale
varpasglob <- 4# n'est pas globale

myfunction <- function(arg1, arg2, ... ){
  statements
  return(object)
}