`include"decoder2.v"

module decoder3(y,a,en);
input [2:0]a;
input en;
output [7:0]y;
wire [2:0]w;
not not1(w[0],a[2]);
and and1(w[1],w[0],en);
and and2(w[2],a[2],en);
decoder2 a1(y[3:0],a[1:0],w[1]);
decoder2 a2(y[7:4],a[1:0],w[2]);
endmodule