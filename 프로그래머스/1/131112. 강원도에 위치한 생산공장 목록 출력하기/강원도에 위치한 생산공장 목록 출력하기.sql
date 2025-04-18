-- 코드를 입력하세요
SELECT factory_id, factory_name, address FROM food_factory
GROUP BY factory_id
HAVING address LIKE '강원%'
ORDER BY factory_id;