/* Users */
INSERT INTO users (id_user, email, password) VALUES (default, 'admin@councils.com', '$2a$12$gF90ZSIghs8zt5RcttygseASBlZ/dknQ./wL.33EOiEUOy9GYx6nm');
INSERT INTO users (id_user, email, password) VALUES (default, 'ali@councils.com', '$2a$12$gF90ZSIghs8zt5RcttygseASBlZ/dknQ./wL.33EOiEUOy9GYx6nm');


/* Roles */
INSERT INTO roles (id_rol, name) VALUES (default, 'ROLE_ADMIN');
INSERT INTO roles (id_rol, name) VALUES (default, 'ROLE_USER');

/* Roles_Users */
INSERT INTO roles_users (user_id, role_id) VALUES (1, 1);
INSERT INTO roles_users (user_id, role_id) VALUES (2, 2);

/* Councils */

INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Gijon');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Oviedo');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Aviles');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Llanes');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Mieres');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Nava');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Cangas de Onis');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Cangas del Narcea');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Castrillon');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Colunga');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Ribadesella');
INSERT INTO councils (id_council, name_of_council ) VALUES (default, 'Cudillero');

/* Trails */

INSERT INTO trails (id_trail, trail_title, description, points, web, trail_image, council_id) VALUES (default, 'Paseo por San Lorenzo', 'Agradable y bonito paseo por la costa de Gijón, desde el mirador del Parque del Cabo de San Lorenzo hasta el Cerro de Santa Catalina', 50, 'https://es.wikiloc.com/rutas-a-pie/san-lorenzo-gijon-47664663', 'SanLorenzo.jpg', 1)