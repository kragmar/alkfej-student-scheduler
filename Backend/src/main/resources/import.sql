INSERT INTO STUDENT (email, name, tel_num, birth_date) VALUES ('example@mail.com', 'Teszt Elek', '+36 12 345 6789', '1970-01-01');

INSERT INTO LESSON (lesson_date, lesson_start, lesson_type) VALUES ('2019-11-07', '14:20', 'LESSON');

INSERT INTO LESSON_TICKET (ticket_name, valid_from, valid_till) VALUES ('Test','2019-11-07', '2019-12-07');

INSERT INTO TEACHER (email, name, tel_num, password, role, username, enabled) VALUES ('tesztelek@mail.com', 'Tanár Bácsi', '+36 90 420 6969', '$2y$12$kK1c.6bxycVFM7mS5u30TefiH5RVPqdwk8L3uAUhvlmgSS6Dgf0pu', 'ROLE_USER', 'xXx_OkBoomer69_xXx', 'true');
INSERT INTO TEACHER (email, name, tel_num, password, role, username, enabled) VALUES ('admin@mail.com', 'Admin Bácsi', '+36 90 420 6969', '$2y$12$f/iLPJblwLUQEOtJEoxo4uaD84rV7iNxXYhL46Ccn9Sz6VZMYh9cq', 'ROLE_ADMIN', 'admin', 'true');
INSERT INTO TEACHER (email, name, tel_num, password, role, username, enabled) VALUES ('admin@mail.com', 'Admin Bácsi', '+36 90 420 6969', '$2y$12$f/iLPJblwLUQEOtJEoxo4uaD84rV7iNxXYhL46Ccn9Sz6VZMYh9cq', 'ROLE_USER', 'user', 'true');