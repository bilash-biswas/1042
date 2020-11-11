var
a,b,c : int64;
begin
  read(a);
  read(b);
  read(c);
   if((a > b) and (a > c) and (b > c))then
   begin
      writeln(c);
      writeln(b);
      writeln(a);
      writeln();
      writeln(a);
      writeln(b);
      writeln(c);
   end
   else if((a > b) and (a > c) and (b < c))then
   begin
      writeln(b);
      writeln(c);
      writeln(a);
      writeln();
      writeln(a);
      writeln(b);
      writeln(c);
   end
   else if((b > a) and (b > c) and (a > c))then
   begin
      writeln(c);
      writeln(a);
      writeln(b);
      writeln();
      writeln(a);
      writeln(b);
      writeln(c);
   end
   else if((b > a) and (b > c) and (a < c))then
   begin
      writeln(a);
      writeln(c);
      writeln(b);
      writeln();
      writeln(a);
      writeln(b);
      writeln(c);
   end
   else if((c > b) and (c > a) and (a > b))then
   begin
      writeln(b);
      writeln(a);
      writeln(c);
      writeln();
      writeln(a);
      writeln(b);
      writeln(c);
   end
   else if((c > b) and (c > a) and (a < b))then
   begin
      writeln(a);
      writeln(b);
      writeln(c);
      writeln();
      writeln(a);
      writeln(b);
      writeln(c);
   end
end.
