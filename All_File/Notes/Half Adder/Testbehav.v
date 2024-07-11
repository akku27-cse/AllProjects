module test;
reg a,b;
wire [1:0]s;
halfadder a1(s,a,b);
initial begin
$dumpfile("ha.vcd");
$dumpvars(0,test);
a=1'b0;b=1'b0;
#5 b=1'b1;
#5 a=1'b1;b=1'b0;
#5 b=1'b1;
#5 $finish;
end
initial begin
$monitor("Time=%d,a=%b b=%b s=%b",$time,a,b,s[1:0]);
end
endmodule