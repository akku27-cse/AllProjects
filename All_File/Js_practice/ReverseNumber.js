var sum=0
var rem;
var no=987;
while(no>0){
    rem=no%10;
    sum=(sum*10)+rem;
    no=no/10;
}
console.log(sum)