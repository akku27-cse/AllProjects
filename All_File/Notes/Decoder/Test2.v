module test;
reg [1:0]a;
reg en;
wire [3:0]y;
decoder2 a1(y,a,en);

initial begin
$dumpfile("decoder2.vcd");
$dumpvars(0,test);
en=1'b0;a=2'bxx;
#5 en=1'b1;a=2'b00;
#5 en=1'b1;a=2'b01;
#5 en=1'b1;a=2'b10;
#5 en=1'b1;a=2'b11;
#5 $finish;
end

initial begin
$monitor("Time=%d,en=%b a=%b y=%b ",$time,en,a,y);
end

endmodule