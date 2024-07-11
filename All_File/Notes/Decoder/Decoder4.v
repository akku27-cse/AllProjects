`include"decoder3.v"

module decoder4(y,a,en);
input [3:0]a;
input en;
output [15:0]y;
wire [2:0]w;
not not1(w[0],a[3]);
and and1(w[1],w[0],en);
and and2(w[2],a[3],en);
decoder3 a1(y[7:0],a[2:0],w[1]);
decoder3 a2(y[15:8],a[2:0],a[3]);
endmodule