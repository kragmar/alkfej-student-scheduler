INSERT INTO STUDENT (email, name, tel_num, birth_date) VALUES ('example@mail.com', 'Teszt Elek', '+36 12 345 6789', '1970-01-01');
INSERT INTO STUDENT (email, name, tel_num, birth_date) VALUES ('example@mail.com', 'Pali Bácsi', '+36 12 345 6789', '1970-01-01');
INSERT INTO STUDENT (email, name, tel_num, birth_date) VALUES ('example@mail.com', 'Abraka Dabraka', '+36 12 345 6789', '1970-01-01');
INSERT INTO STUDENT (email, name, tel_num, birth_date) VALUES ('example@mail.com', 'Cal Kestis', '+36 12 345 6789', '1970-01-01');

INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-20', '12:50', 'LESSON', 1);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-20', '12:50', 'LESSON', 2);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-20', '14:30', 'LESSON', 3);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-20', '14:30', 'LESSON', 4);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-20', '14:30', 'LESSON', 2);

INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-19', '12:50', 'LESSON', 4);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-18', '18:40', 'LESSON', 1);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-16', '17:00', 'LESSON', 3);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-19', '18:40', 'LESSON', 4);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-17', '19:30', 'LESSON', 3);

INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-13', '12:50', 'LESSON', 1);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-12', '12:50', 'LESSON', 2);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-11', '14:30', 'LESSON', 3);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-9', '14:30', 'LESSON', 4);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-10', '14:30', 'LESSON', 2);

INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-10', '12:50', 'LESSON', 4);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-9', '12:50', 'LESSON', 1);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-11', '17:00', 'LESSON', 3);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-13', '16:10', 'LESSON', 4);
INSERT INTO LESSON (lesson_date, lesson_start, lesson_type, student_id) VALUES ('2019-12-12', '13:40', 'LESSON', 3);

INSERT INTO LESSON_TICKET (ticket_name, valid_from, valid_till) VALUES ('Test','2019-11-7', '2019-12-7');
INSERT INTO LESSON_TICKET (ticket_name, valid_from, valid_till) VALUES ('Test2','2019-10-7', '2019-11-7');
INSERT INTO LESSON_TICKET (ticket_name, valid_from, valid_till) VALUES ('Test3','2019-12-7', '2020-1-7');
INSERT INTO LESSON_TICKET (ticket_name, valid_from, valid_till) VALUES ('Test4','2019-1-1', '2019-12-31');

INSERT INTO TEACHER (email, name, tel_num, password, role, username) VALUES ('tesztelek@mail.com', 'Tanár Bácsi', '+36 90 420 6969', '$2y$12$kK1c.6bxycVFM7mS5u30TefiH5RVPqdwk8L3uAUhvlmgSS6Dgf0pu', 'ROLE_USER', 'xXx_OkBoomer69_xXx');
INSERT INTO TEACHER (email, name, tel_num, password, role, username) VALUES ('admin@mail.com', 'Admin Bácsi', '+36 90 420 6969', '$2y$12$f/iLPJblwLUQEOtJEoxo4uaD84rV7iNxXYhL46Ccn9Sz6VZMYh9cq', 'ROLE_ADMIN', 'admin');
INSERT INTO TEACHER (email, name, tel_num, password, role, username) VALUES ('admin@mail.com', 'Admin Bácsi', '+36 90 420 6969', '$2y$12$f/iLPJblwLUQEOtJEoxo4uaD84rV7iNxXYhL46Ccn9Sz6VZMYh9cq', 'ROLE_USER', 'user');