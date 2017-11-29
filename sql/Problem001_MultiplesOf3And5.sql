set serveroutput on;

DECLARE 
   total number := 0; 
BEGIN 
    FOR i IN 1..1000
    LOOP
        IF MOD(i, 5) = 0 OR MOD(i, 3) = 0 THEN
           total := total + i;
        END IF;
    END LOOP;
    
    dbms_output.put_line(total);
END; `