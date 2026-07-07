SET SERVEROUTPUT ON;

BEGIN
    FOR loan IN (
        SELECT c.CustomerName,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate <= SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: '
            || loan.CustomerName
            || '''s loan is due on '
            || TO_CHAR(loan.DueDate,'DD-MON-YYYY')
        );

    END LOOP;
END;
/