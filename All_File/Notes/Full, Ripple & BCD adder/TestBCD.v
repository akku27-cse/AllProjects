module test;
reg [3:0]a,b;
reg cin;
wire [3:0]s;
wire cout;
bcd a1(s,cout,a,b,cin);

initial begin
//$dumpfile("bcd.vcd");
//$dumpvars(0,test);     
a=5;b=3;cin=0;
#5 a=9;b=6;cin=0;
#5 a=8;b=6;cin=1;
#5 $finish;
end

initial begin
$monitor("Time=%d,a=%d b=%d cin=%d cout=%d s=%d ",$time,a,b,cin,cout,s);
end

endmodule