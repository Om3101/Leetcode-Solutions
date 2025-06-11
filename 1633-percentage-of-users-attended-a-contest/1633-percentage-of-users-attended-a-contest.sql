# Write your MySQL query statement below

# percentage = (users registered / total users) x 100

select 
r.contest_id, 
round(count(distinct r.user_id) * 100 / (select count(*) from users), 2) as percentage

from register as r
group by r.contest_id
order by percentage desc, r.contest_id asc;