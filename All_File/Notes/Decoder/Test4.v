module test;
reg [3:0]a;
reg en;
wire [15:0]y;
decoder4 a1(y,a,en);

initial begin
$dumpfile("decoder4.vcd");
$dumpvars(0,test);
en=1'b0;a=4'bxxxx;
#5 en=1'b1;a=4'b0000;
#5 en=1'b1;a=4'b0001;
#5 en=1'b1;a=4'b0010;
#5 en=1'b1;a=4'b0011;
#5 en=1'b1;a=4'b0100;
#5 en=1'b1;a=4'b0101;
#5 en=1'b1;a=4'b0110;
#5 en=1'b1;a=4'b0111;
#5 en=1'b1;a=4'b1000;
#5 en=1'b1;a=4'b1001;
#5 en=1'b1;a=4'b1010;
#5 en=1'b1;a=4'b1011;
#5 en=1'b1;a=4'b1100;
#5 en=1'b1;a=4'b1101;
#5 en=1'b1;a=4'b1110;
#5 en=1'b1;a=4'b1111;
#5 $finish;
end

initial begin
$monitor("Time=%d,en=%b a=%b y=%b ",$time,en,a,y);
end

endmodule