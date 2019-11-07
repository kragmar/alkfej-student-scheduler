# alkfej-student-scheduler
Repository for "Student Scheduler for Private Teachers" project.
**Fejlesztői környezet és haszált technológiák:**

 - IntelliJ IDEA 2019.2.4 (Ultimate Edition)
 - MySQL Workbench
 - Java
 - JSON
 - stackedit.io

**Szerepkörök:**
 - admin
 - tanár
 
**Az adatbázis az alábbi adatokat tárolja:**
 - órák(időpont, dátum, típus, tanuló, tanár)
 - tanárok (név, cím, telefonszám, email, felhasználó név, jelszó)
 - diákok (név, cím, telefonszám, email, születési dátum)
 - bérlet(tanuló, érvényesség kezdete, vége, típus)
 
 **Adatbázis modell:**
database.png

**Végpontok:**

| Entitások | Típus | Elérés | Leírás | hozzáférés | 
| -| -| -|-|-|
|Lesson | GET | Lesson/ | Lekérdezi az összes órát | mindenki| 
| | GET | Lesson/{id} | Lekérdez egyetlen órát id alapján | mindenki| 
|| POST| Lesson/ | új órát hoz létre|mindenki|
| | DELETE| Lesson/{id} | id alapján töröl egy órát | mindenki|
| | PUT| Lesson/{id} | id alapján egy óra adatain módosít | mindenki|
|LessonTicket | GET | LessonTicket/ | Lekérdezi az összes bérletet | mindenki| 
| | GET | LessonTicket/{id} | Lekérdez egyetlen bérletet id alapján | mindenki| 
|| POST| LessonTicket/ | új bérletet hoz létre|mindenki|
| | DELETE| LessonTicket/{id} | id alapján töröl egy bérletet | mindenki|
| | PUT| LessonTicket/{id} | id alapján egy bérlet adatain módosít | mindenki|
|Teacher | GET | Teacher / | Lekérdezi az összes tanárt | mindenki| 
| | GET | Teacher/{id} | Lekérdez egyetlen tanárt id alapján | mindenki| 
|| POST| Teacher/ | új tanárt hoz létre|admin|
| | DELETE| Teacher/{id} | id alapján töröl egy tanárt | mindenki|
| | PUT| Teacher/{id} | id alapján egy tanár adatain módosít | mindenki|
|Student | GET | Student/ | Lekérdezi az összes diákot | mindenki| 
| | GET | Student/{id} | Lekérdez egyetlen diákot id alapján | mindenki| 
|| POST| Student/ | új diákot hoz létre|admin|
| | DELETE| Student/{id} | id alapján töröl egy diákot | mindenki|
| | PUT| Student/{id} | id alapján egy diák adatain módosít | mindenki|
