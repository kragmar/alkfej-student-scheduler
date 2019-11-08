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
 
![enter image description here](https://lh3.googleusercontent.com/J4bcXX3JxVZtvW8YNG6ls68m1axPWMoKbXod3xJFyoSgybjSaYoUOCq1s_ZP4rv4e9p3TxJDFaHt-CrUT9QRuV6HybkBVFxWW46Wd0fmVF1aakGRVILJLcDYC2JEDuizOimv_8qiR-DGusoPQS732KBOaLPl9BNjj6Xk6pFqlO6bTi6vzQ-fQ5f8TWCI7Zq_YLcPSgQ-5vBrZRJdlumZVmyJ3lYfjezJT9cA8arQGdtfpu5n2DTENZISkbf7A0xSyXWH3soEh8mv-X8zEATl1KxnGr8tlXq6MP15vIIG08G5khw43CBzZMI4SlNr-3VZkndjLYEa3zVGEAZiCaf34aIBYv8-BLN8OO7mrw02HmtdJnWFSKn5sHwDFCLo_FBtJt5T8VO4I6N8P762Yt4kZjFaHAv3Qtc5OYZevC6Y0sHoA6vbPd4FFsCzhVSTQR0aR2wvNla1q3ZdzMZGhLIfl5pJRxfU6SvY8b34d-veFGSmIw55j4wZQZwwu7c2yc93qOVLpKO5grVje-cqs6yBxjFRGKx2eVMe71vcJjJcXEErePjp1kgXH2ejfh-5wxUTlrPq-RrS3S2GAxiCopMB8Ckja4ByXaW2VNnSaCA_U0J00nkziDbCWwp_mEZnVt9Xh7tYrbY8ccGFyLZQWe1SfKFBaBy9-KUePykxUr1v8fFrk0YaEiK6RTs=w1263-h801-no)

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
