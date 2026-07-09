-- Last updated: 7/9/2026, 10:06:52 AM
# Write your MySQL query statement below
SELECT
    m.name
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
GROUP BY
    m.id,
    m.name
HAVING COUNT(*) >= 5;