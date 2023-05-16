#include<stdio.h>
#include<fcntl.h>
#include"string.h"
int main()
{ 
 //create a new file by named as file.txt 
    int n=open("qt.txt","w+"); 
    char ch[16]="hmfmhxmjhgjhgjjhjmhxjmhjh";
    
//change permission of file.txt with max access

    system("chmod 777 qt.txt");

   //write "helloworld string in file.txt      

   write(n,ch,16);

 // to move cursor from begging to 48th position  

    lseek(n,38,SEEK_SET);
  //write "helloworld string in file.txt      

  write(n,ch,16);
    // to prompt command in command prompt
    //system(str);
    return(0);
}
