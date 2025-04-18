-- 코드를 입력하세요
SELECT i.rest_id, rest_name, food_type, favorites, address, round(avg(r.review_score),2) AS score
FROM rest_info AS i
INNER JOIN rest_review AS r ON i.rest_id=r.rest_id
GROUP BY i.rest_id
HAVING i.address LIKE '서울%'
ORDER BY score DESC, favorites DESC;