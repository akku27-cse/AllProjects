`include "halfadderstruct.v"
module fa(s,co,a,b,cin);
input a,b,cin;
output s,co;
wire w1,w2,w3;
halfadder a1(w1,w2,a,b);
halfadder a2(s,w3,cin,w1);
or a3(co,w2,w3);
endmodule