module test;
reg [3:0]d;
reg [1:0]s;
wire y;
mux4 a1(y,d,s);
initial begin
s=2'b00;d=4'bxxx0;
#5 d=4'bxxx1;
#5 s=2'b01;d=4'bxx0x;
#5 d=4'bxx1x;
#5 s=2'b10;d=4'bx0xx;
#5 d=4'bx1xx;
#5 s=2'b11;d=4'b0xxx;
#5 d=4'b1xxx;
#5 $finish;
end
initial begin
$monitor("Time=%d,s=%b d=%b y=%b",$time,s,d,y);
end
endmodule