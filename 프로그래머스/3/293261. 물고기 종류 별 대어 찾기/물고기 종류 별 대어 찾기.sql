-- 코드를 작성해주세요
select id, fish_name, length from fish_info as info
inner join fish_name_info as name
on info.fish_type = name.fish_type
WHERE info.fish_type IN
(
    SELECT fish_type
    FROM fish_info
    GROUP BY fish_type
    HAVING length = MAX(length)
)
ORDER BY id