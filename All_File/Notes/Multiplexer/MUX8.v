`include "MUX4.v"
module mux8(y,d,s);
input [7:0]d;
input [2:0]s;
output y;
wire [1:0]w;
mux4 a1(w[0],d[3:0],s[1:0]);
mux4 a2(w[1],d[7:4],s[1:0]);
mux2 a3(y,w[1:0],s[2]);
endmodule
