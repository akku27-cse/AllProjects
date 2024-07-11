module decoder2(y,a,en);
input [1:0]a;
input en;
output [3:0]y;
wire [1:0]w;
not not1(w[0],a[0]);
not not2(w[1],a[1]);
and and1(y[0],w[0],w[1],en);
and and2(y[1],a[0],w[1],en);
and and3(y[2],w[0],a[1],en);
and and4(y[3],a[0],a[1],en);
endmodule