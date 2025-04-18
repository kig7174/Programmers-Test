-- 코드를 입력하세요
SELECT book_id, date_format(published_date, '%Y-%m-%d') as published_date FROM book
WHERE category = '인문' AND date_format(published_date, "%Y") = 2021
ORDER BY published_date DESC;