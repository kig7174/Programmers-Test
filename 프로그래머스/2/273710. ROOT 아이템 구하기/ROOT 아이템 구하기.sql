-- 코드를 작성해주세요
SELECT i.item_id, item_name
FROM item_info AS i
INNER JOIN item_tree AS t
ON i.item_id = t.item_id
WHERE parent_item_id IS NULL
ORDER BY i.item_id ASC