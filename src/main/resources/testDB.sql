insert into cars (description, model, rate) values
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, климат-контроль, двигатель 1.6 MPI, камера заднего вида, круиз контроль', 'KIA Rio X', 0.25),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, кондиционер, двигатель 1.5, подогрев сидений и руля, камера заднего вида, круиз контроль', 'Mini Cooper', 0.39),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, климат-контроль, двигатель 1.4 TSI, подогрев сидений, камера заднего вида', 'Volkswagen Tiguan', 0.59),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, климат-контроль, парковочный ассистент, подогрев сидений, камера заднего вида, круиз контроль', 'Ford Mustang', 0.79),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, люк, контроль слепых зон, климат-контроль, камера заднего вида, круиз контроль', 'Dodge Challenger', 0.89),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, люк, контроль слепых зон, кондиционер, камера заднего вида, круиз контроль', 'Chevrolet Camaro', 0.79),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, запас хода 500 км, автопилот, климат-контроль, электрокар, камера заднего вида, круиз контроль', 'Tesla Model 3', 0.79),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, запас хода 500 км, автопилот, климат-контроль, панорамная крыша, электрокар, камера заднего вида, круиз контроль', 'Tesla Model X', 1.99),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, запас хода 500 км, автопилот, климат-контроль, электрокар, камера заднего вида, круиз контроль, камера 360', 'Tesla Model S', 1.89),
('АКПП, бустер, зарядка для телефонов Android и Apple, держатель для телефона, климат-контроль, двигатель 1.8 , камера заднего вида, круиз контроль', 'Mercedes Benz C180 W205', 1.69);
delete from cars;

insert into client (email, login, name, number_phone, password) values
('vasya98@mail.ru', 'vasya98', 'Вася Иванов', '+375291245798', '159753Vasya'),
('lena86@yandex.ru', 'lena86', 'Лена Борисова', '+375445689632', '753951Lena'),
('pushkin57@gmail.com', 'pushkin57', 'Алексей Пушкин', '+375251598745', '147963Leha'),
('zheka90@tut.by', 'zheka90', 'Евгений Пасечкин', '+375331683987', '789321Zhmen'),
('ivanVladimirovich@mail.ru', 'ivanVladimirovich', 'Иван Прусов', '+375445478965', '456852Ivan');
delete from client;

insert into admin (login, password) values
('admin1', 'admin123'),
('admin2', 'admin456');
delete from admin;