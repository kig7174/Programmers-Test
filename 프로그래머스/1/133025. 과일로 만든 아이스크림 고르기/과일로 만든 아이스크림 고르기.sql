-- 코드를 입력하세요
SELECT f.flavor
FROM first_half AS f
INNER JOIN icecream_info AS i ON f.flavor=i.flavor
WHERE total_order > 3000
AND i.ingredient_type = 'fruit_based';