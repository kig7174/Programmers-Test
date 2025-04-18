-- 코드를 작성해주세요
SELECT i.item_id, item_name, rarity
FROM item_info AS i
INNER JOIN item_tree AS t
ON i.item_id = t.item_id
WHERE i.item_id NOT IN (SELECT parent_item_id
                       FROM item_tree
                       WHERE parent_item_id IS NOT NULL
                       GROUP BY parent_item_id)
ORDER BY i.item_id DESC