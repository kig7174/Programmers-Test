-- 코드를 입력하세요
SELECT outs.animal_id, outs.name
FROM animal_outs AS outs
INNER JOIN animal_ins AS ins
ON outs.animal_id = ins.animal_id
GROUP BY outs.animal_id
ORDER BY outs.datetime - ins.datetime DESC
LIMIT 0, 2