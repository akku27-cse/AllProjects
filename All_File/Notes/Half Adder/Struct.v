module halfadder(s,c,a,b);
input a,b;
output s,c;
xor a1(s,a,b);
and a2(c,a,b);
endmodule