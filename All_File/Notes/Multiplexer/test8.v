module test;
reg [7:0]d;
reg [2:0]s;
wire y;
mux8 a1(y,d,s);
initial begin
s=3'b000;d=8'bxxxxxxx0;
#5 s=3'b000;d=8'bxxxxxxx1;
#5 s=3'b001;d=8'bxxxxxx0x;
#5 s=3'b001;d=8'bxxxxxx1x;
#5 s=3'b010;d=8'bxxxxx0xx;
#5 s=3'b010;d=8'bxxxxx1xx;
#5 s=3'b011;d=8'bxxxx0xxx;
#5 s=3'b011;d=8'bxxxx1xxx;
#5 s=3'b100;d=8'bxxx0xxxx;
#5 s=3'b100;d=8'bxxx1xxxx;
#5 s=3'b101;d=8'bxx0xxxxx;
#5 s=3'b101;d=8'bxx1xxxxx;
#5 s=3'b110;d=8'bx0xxxxxx;
#5 s=3'b110;d=8'bx1xxxxxx;
#5 s=3'b111;d=8'b0xxxxxxx;
#5 s=3'b111;d=8'b1xxxxxxx;
#5 $finish;
end
initial begin
$monitor("Time=%d,s=%b d=%b y=%b",$time,s,d,y);
end
endmodule
