module test;
reg [2:0]a;
reg en;
wire [7:0]y;
decoder3 a1(y,a,en);

initial begin
$dumpfile("decoder3.vcd");
$dumpvars(0,test);
en=1'b0;a=3'bxxx;
#5 en=1'b1;a=3'b000;
#5 en=1'b1;a=3'b001;
#5 en=1'b1;a=3'b010;
#5 en=1'b1;a=3'b011;
#5 en=1'b1;a=3'b100;
#5 en=1'b1;a=3'b101;
#5 en=1'b1;a=3'b110;
#5 en=1'b1;a=3'b111;
#5 $finish;
end

initial begin
$monitor("Time=%d,en=%b a=%b y=%b ",$time,en,a,y);
end

endmodule