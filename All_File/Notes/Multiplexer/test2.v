module test;
reg [1:0]d;
reg s;
wire y;
mux2 a1(y,d,s);
initial begin
s=1'b0;d=2'bx0;
#5 s=1'b0;d=2'bx1;
#5 s=1'b1;d=2'b0x;
#5 s=1'b1;d=2'b1x;
#5 $finish;
end
initial begin
$monitor("Time=%d,s=%b d=%b y=%b",$time,s,d,y);
end
endmodule