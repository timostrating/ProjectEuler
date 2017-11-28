set serveroutput on;

DECLARE 
   a number := 1; 
   b number := 1; 
   tmp number := 0; 
   total number := 0;
BEGIN 
    WHILE a < 4000000
    LOOP
        tmp := a + b;
        b := a;
        a := tmp;
        
        IF a < 4000000 THEN
            IF MOD(a, 2) = 0 THEN
                total := total + a;
            END IF;
        END IF;
    END LOOP;
    
    dbms_output.put_line(total);
END; 