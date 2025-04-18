-- 코드를 입력하세요
SELECT CONCAT('/home/grep/src/', f.board_id, '/', file_id , file_name, file_ext) AS file_path
FROM used_goods_file AS f
INNER JOIN used_goods_board AS b
ON f.board_id = b.board_id
WHERE views = (SELECT MAX(views) FROM used_goods_board)
ORDER BY f.file_id DESC