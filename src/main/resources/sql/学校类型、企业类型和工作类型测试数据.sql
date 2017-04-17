TRUNCATE TABLE ezd_schoolType;
TRUNCATE TABLE ezd_enterpriseType;
TRUNCATE TABLE ezd_recruitmentDetailsType;

-- 插入学校类型
INSERT INTO ezd_schoolType(schoolTypeName) VALUES('本科'),('专科');

SELECT * FROM ezd_schoolType;

-- 插入企业类型
INSERT INTO ezd_enterpriseType(enterpriseTypeName) VALUES('it/互联网'),
('政府/非营业机构'),
('电子/通信/硬件'),
('农/林、牧 、渔'),
('广告/传媒/影视/文化'),
('房地产/商业中心'),
('房建'),
('教育/培训/科研/院校'),
('专业服务'),
('生活服务'),
('金融业'),
('贸易/物流/交通/运输'),
('快速/耐用消费品'),
('医学/生物'),
('能源/水利/化工/环保'),
('仪器/仪表/工业自动化/电器'),
('汽车/摩托车/电动车'),
('机械制造物/机电/重工'),
('航空/航天研究与制造');

SELECT * FROM ezd_enterpriseType;

-- 插入工作类型测试数据
INSERT INTO ezd_recruitmentDetailsType(recruitmentDetailsTypeName) VALUES('实习'),('全职');

SELECT * FROM ezd_recruitmentDetailsType;

