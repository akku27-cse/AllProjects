`include "MUX2.v"
module mux4(y,d,s);
input [3:0]d;
input [1:0]s;
output y;
wire [1:0]w;
mux2 a1(w[0],d[1:0],s[0]);
mux2 a2(w[1],d[3:2],s[0]);
mux2 a3(y,w[1:0],s[1]);
endmodule