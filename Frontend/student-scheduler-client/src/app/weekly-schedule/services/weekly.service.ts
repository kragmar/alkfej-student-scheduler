import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';

import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Lesson } from './lesson';
import { LESSONS } from './mock-data';

@Injectable({
  providedIn: 'root'
})
export class WeeklyService {

  private lessonUrl = 'http://localhost:8080/lesson'

  constructor( private http: HttpClient ) { }

  getLessons(): Observable<Lesson[]> {
    return this.http.get<Lesson[]>(this.lessonUrl);
  }

  getColumns(): Observable<string[]> {
    return of(["12:50", "13:40", "14:30", "15:20", "16:10", "17:00", "17:50", "18:40", "19:30"]);
  }

  addLesson(lesson: Lesson[]): Observable<Lesson[]> {
    return this.http.post<Lesson[]>(this.lessonUrl, lesson);
  }

}