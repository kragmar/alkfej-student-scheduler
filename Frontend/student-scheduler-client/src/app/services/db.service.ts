import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Lesson } from './lesson';
import { Student } from './student';
import { LessonPost } from './lesson-post';
/* import { LESSONS } from './mock-data'; */

@Injectable({
  providedIn: 'root'
})
export class DbService {

  private lessonUrl = 'http://localhost:8080/lesson'
  private studentUrl = 'http://localhost:8080/student'
  private teacherUrl = 'http://localhost:8080/teacher'

  constructor( private http: HttpClient ) { }

  getLessons(): Observable<Lesson[]> {
    return this.http.get<Lesson[]>(this.lessonUrl);
  }

  getStudents(): Observable<Student[]> {
    return this.http.get<Student[]>(this.studentUrl);
  }

  getColumns(): Observable<string[]> {
    return of(["12:50", "13:40", "14:30", "15:20", "16:10", "17:00", "17:50", "18:40", "19:30"]);
  }

  addLesson(lesson: LessonPost): Observable<LessonPost> {
    return this.http.post<LessonPost>(this.lessonUrl, lesson);
  }

}