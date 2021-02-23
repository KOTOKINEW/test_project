INSERT INTO db_schema.user (name, email, phone) VALUES
('Kotik', 'qwe@qwe.qwe', '88005553535'),
('Oleg', 'ol@eg.oleg', '375331234567'),
('Kirill', 'kir@ill.kirill', '375337654321'),
('Toxa', 'to@xa.toxa', '375331111111'),
('Vitalik Pervii', 'vitalik1@nas2.da', '375290000000'),
('Vitalik Vtoroi', 'vitalik2@nas2.da', '375291111111');

INSERT INTO db_schema.account_information VALUES
((SELECT id  FROM db_schema.user WHERE name = 'Kotik'), 'miu', '123456'),
((SELECT id  FROM db_schema.user WHERE name = 'Oleg'), 'Oleg_sex_228', '1337'),
((SELECT id  FROM db_schema.user WHERE name = 'Kirill'), 'Kiruxa-saltuxa', 'xoba228'),
((SELECT id  FROM db_schema.user WHERE name = 'Toxa'), 'Anton_Antoxa', 'X3pass'),
((SELECT id  FROM db_schema.user WHERE name = 'Vitalik Pervii'), 'Polovinka-Vitalika', 'Kat'),
((SELECT id  FROM db_schema.user WHERE name = 'Vitalik Vtoroi'), 'Vitalika-Polovinka', 'uxa');
