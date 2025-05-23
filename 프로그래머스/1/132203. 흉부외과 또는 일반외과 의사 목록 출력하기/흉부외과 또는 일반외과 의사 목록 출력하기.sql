-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, date_format(hire_ymd, '%Y-%m-%d')
FROM doctor
WHERE mcdp_cd IN ('CS', 'GS')
ORDER BY hire_ymd DESC, dr_name ASC;