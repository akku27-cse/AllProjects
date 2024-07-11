module test;
reg [3:0]a,b;
reg cin;
wire [3:0]s;
wire co;
rca a1(s,co,a,b,cin);
initial begin
a=4'b1001;b=4'b1111;cin=1'b0;
#5 cin=1'b1;
#5 $finish;
end
initial begin
$monitor("Time=%d,a=%b b=%b cin=%b s=%b co=%b",$time,a,b,cin,s,co);
end
endmodule