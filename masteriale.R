data <- fromJSON(getURL("https://api.jcdecaux.com/vls/v1/stations?contract=Paris&apiKey=bce47180ba4a6209d11bc04d12200c9dabd93f96"))

fix<-cbind(data[,1:3],pos=data[,4],"nb supports"=data[,9],data[,5:6])

path<-"C:/Users/POSTE/Desktop/"
filename<-"statique.csv"
filevelo<-paste(paste("nb_velo_",day(as.POSIXct(Sys.time(),format="%S")),"_",months(as.POSIXct(Sys.time(),format="%S")),sep=""),".csv",sep="")

write.csv(as.data.frame(data.frame(number = I(fix$number),name=I(fix$name),address=I(fix$address),lat=I(fix$pos.lat),long=I(fix$pos.lng),banking=I(fix$banking),bonus=I(fix$bonus),nb_support=I(fix$`nb supports`))),file=paste(path,filename,sep=""))
out<-read.csv(paste(path,filename,sep=""))

nb_velo<-data.frame(data[,11])

sysd<-day(as.POSIXct(Sys.time(),format="%S"))
datad<-day(as.POSIXct((data[1,12]+ 0.1)/1000,tz="CET",origin="1970-01-01"))

while(TRUE){
  while(sysd==datad){
    sysd<-day(as.POSIXct(Sys.time(),format="%S"))
    datad<-day(as.POSIXct((data[1,12]+ 0.1)/1000,tz="CET",origin="1970-01-01"))
  
    nb_velo<-cbind(nb_velo,data[,11])
    
    
    Sys.sleep(2)
    data <- fromJSON(getURL("https://api.jcdecaux.com/vls/v1/stations?contract=Paris&apiKey=bce47180ba4a6209d11bc04d12200c9dabd93f96"))
    
  }
  write.csv(data.frame(name=data[,2],nbvelo=nb_velo),file=paste(path,filevelo,sep=""))
  out<-read.csv(paste(path,filevelo,sep=""))
}
