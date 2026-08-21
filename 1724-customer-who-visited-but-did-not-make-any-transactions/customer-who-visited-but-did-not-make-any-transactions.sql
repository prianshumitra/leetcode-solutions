# Write your MySQL query statement below
select v.customer_id,
sum(case when t.visit_id is null then 1 else 0 end) as count_no_trans
from Visits v left join 
Transactions t on
v.visit_id = t.visit_id
group by v.customer_id
having count_no_trans > 0;