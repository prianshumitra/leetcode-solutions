-- Write your PostgreSQL query statement below
select r.contest_id, 
round((count(*)*100.0) / (select count(*) from users),2) as percentage
from Users u 
join Register r
on u.user_id = r.user_id 
group by contest_id
order by percentage desc, r.contest_id;