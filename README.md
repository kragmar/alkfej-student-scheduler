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
 
![enter image description here](https://lh3.googleusercontent.com/J4bcXX3JxVZtvW8YNG6ls68m1axPWMoKbXod3xJFyoSgybjSaYoUOCq1s_ZP4rv4e9p3TxJDFaHt-CrUT9QRuV6HybkBVFxWW46Wd0fmVF1aakGRVILJLcDYC2JEDuizOimv_8qiR-DGusoPQS732KBOaLPl9BNjj6Xk6pFqlO6bTi6vzQ-fQ5f8TWCI7Zq_YLcPSgQ-5vBrZRJdlumZVmyJ3lYfjezJT9cA8arQGdtfpu5n2DTENZISkbf7A0xSyXWH3soEh8mv-X8zEATl1KxnGr8tlXq6MP15vIIG08G5khw43CBzZMI4SlNr-3VZkndjLYEa3zVGEAZiCaf34aIBYv8-BLN8OO7mrw02HmtdJnWFSKn5sHwDFCLo_FBtJt5T8VO4I6N8P762Yt4kZjFaHAv3Qtc5OYZevC6Y0sHoA6vbPd4FFsCzhVSTQR0aR2wvNla1q3ZdzMZGhLIfl5pJRxfU6SvY8b34d-veFGSmIw55j4wZQZwwu7c2yc93qOVLpKO5grVje-cqs6yBxjFRGKx2eVMe71vcJjJcXEErePjp1kgXH2ejfh-5wxUTlrPq-RrS3S2GAxiCopMB8Ckja4ByXaW2VNnSaCA_U0J00nkziDbCWwp_mEZnVt9Xh7tYrbY8ccGFyLZQWe1SfKFBaBy9-KUePykxUr1v8fFrk0YaEiK6RTs=w1263-h801-no)

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
