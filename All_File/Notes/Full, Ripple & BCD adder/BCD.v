`include"rca.v"

module bcd(s,cout,a,b,cin);
input [3:0]a,b;
input cin;
output [3:0]s;
output cout;
wire [3:0]z;
wire [8:0]w;
wire [1:0]k;
and a1(w[0],z[3],z[2]);
and a2(w[1],z[3],z[1]);
or a3(w[2],w[0],w[1]);
or a4(w[3],k[0],w[2]);
or a5(cout,w[3],k[1]);
assign w[4]=0;
assign w[5]=w[3];
assign w[6]=w[3];
assign w[7]=0;
assign w[8]=0;
rca a6(z[3:0],k[0],a[3:0],b[3:0],cin);
rca a7(s[3:0],k[1],z[3:0],w[7:4],w[8]);
endmodule