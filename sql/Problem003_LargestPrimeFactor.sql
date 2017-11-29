set serveroutput on;

DECLARE 
   input number := 600851475143; 
   counter number := 1;
   cal number := 0;
BEGIN 
    WHILE input > 1
    LOOP
        counter := counter + 1;
        cal := MOD(input, counter); 
        IF cal = 0 THEN
            dbms_output.put_line(counter);
            input := input / counter;
        END IF;
    END LOOP;
END; 