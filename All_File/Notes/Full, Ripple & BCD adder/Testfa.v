module test;
reg a,b,cin;
wire s,co;
fa a1(s,co,a,b,cin);
initial begin
a=1'b0;b=1'b0;cin=1'b0;
#5 cin=1'b1;
#5 b=1'b1;cin=1'b0;
#5 cin=1'b0;
#5 a=1'b1;b=1'b0;cin=1'b0;
#5 cin=1'b1;
#5 b=1'b1;cin=1'b0;
#5 cin=1'b1;
#5 $finish;
end
initial begin
$monitor("Time=%d,a=%b b=%b cin=%b s=%b co=%b",$time,a,b,cin,s,co);
end
endmodule