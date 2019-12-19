# Student Scheduler for Private Teachers
## Alkalmazások fejlesztése gyakorlati beadandó
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
 
![adatb](https://drive.google.com/file/d/1HTBptkb7yU_FTGWN029rsg7xIf4k1I4X/view?usp=sharing)

**Végpontok:**

| Entitások | Típus | Elérés | Leírás | hozzáférés | 
| -| -| -|-|-|
|Lesson | GET | lesson/ | Lekérdezi az összes órát | Mindenki| 
| | GET | lesson/{id} | Lekérdez egyetlen órát id alapján | Mindenki| 
|| POST| lesson/ | új órát hoz létre| Mindenki|
| | DELETE| lesson/{id} | id alapján töröl egy órát | Mindenki|
| | PUT| lesson/{id} | id alapján egy óra adatain módosít | Mindenki|
|LessonTicket | GET | lesson_ticket/ | Lekérdezi az összes bérletet | Mindenki| 
| | GET | lesson_ticket/{id} | Lekérdez egyetlen bérletet id alapján | Mindenki| 
|| POST| lesson_ticket/ | új bérletet hoz létre|Mindenki|
| | DELETE| lesson_ticket/{id} | id alapján töröl egy bérletet | Mindenki|
| | PUT| lesson_ticket/{id} | id alapján egy bérlet adatain módosít | Mindenki|
|Teacher | GET | teacher / | Lekérdezi az összes tanárt | Mindenki| 
| | GET | teacher/{id} | Lekérdez egyetlen tanárt id alapján | Mindenki| 
|| POST| teacher/ | új tanárt hoz létre| Admin|
| | DELETE| teacher/{id} | id alapján töröl egy tanárt | Mindenki|
| | PUT| teacher/{id} | id alapján egy tanár adatain módosít | Mindenki|
|Student | GET | student/ | Lekérdezi az összes diákot | Mindenki| 
| | GET | student/{id} | Lekérdez egyetlen diákot id alapján | Mindenki| 
|| POST| student/ | új diákot hoz létre| Admin|
| | DELETE| student/{id} | id alapján töröl egy diákot | Mindenki|
| | PUT| student/{id} | id alapján egy diák adatain módosít | Mindenki|
