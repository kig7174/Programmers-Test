-- 코드를 입력하세요
SELECT user_id, product_id
FROM online_sale
GROUP BY 1, 2
HAVING count(product_id) > 1
ORDER BY user_id ASC, product_id DESC;