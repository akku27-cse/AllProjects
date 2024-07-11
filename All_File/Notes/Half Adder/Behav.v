module halfadder(s,a,b);
input a,b;
output [1:0]s;
reg s;
always @(a or b)
s=a+b;
endmodule