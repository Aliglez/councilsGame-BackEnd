/* Users */
INSERT INTO users (id_user, email, password) VALUES (default, 'admin@councils.com', '$2a$12$gF90ZSIghs8zt5RcttygseASBlZ/dknQ./wL.33EOiEUOy9GYx6nm');


/* Roles */
INSERT INTO roles (id_rol, name) VALUES (default, 'ROLE_ADMIN');
INSERT INTO roles (id_rol, name) VALUES (default, 'ROLE_USER');

/* Roles_Users */
INSERT INTO roles_users (user_id, role_id) VALUES (1, 1);
