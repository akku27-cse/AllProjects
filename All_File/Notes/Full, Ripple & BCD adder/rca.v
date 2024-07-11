`include "fulladderstruct.v"
module rca(s,co,x,y,cin);
input [3:0]x,y;
input cin;
output [3:0]s;
output co;
wire w1,w2,w3;
fa a1(s[0],w1,x[0],y[0],cin);
fa a2(s[1],w2,x[1],y[1],w1);
fa a3(s[2],w3,x[2],y[2],w2);
fa a4(s[3],co,x[3],y[3],w3);
endmodule