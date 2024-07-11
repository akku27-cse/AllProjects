module mux2(y,d,s);
input [1:0]d;
input s;
output y;
wire [2:0]w;
not a1(w[0],s);
and a2(w[1],d[0],w[0]);
and a3(w[2],d[1],s);
or or1(y,w[1],w[2]);
endmodule