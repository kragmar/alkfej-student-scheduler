import { Component, OnInit } from '@angular/core';
import { DbService } from '../services/db.service';
import { Lesson } from '../services/lesson';
import { Student } from '../services/student';
import { LessonPost } from '../services/lesson-post';

@Component({
  selector: 'app-lessons',
  templateUrl: './lessons.component.html',
  styleUrls: ['./lessons.component.css']
})
export class LessonsComponent implements OnInit {

  lessons: Lesson[];
  students: Student[];
  selected: Student;
  lessonType: string;
  lessonStart: string;
  lessonDate: string;

  constructor(private dbService: DbService) { }

  ngOnInit() {
    this.getLessons();
    this.getStudents();
  }

  getLessons(): void {
    this.dbService.getLessons()
      .subscribe(lessons => this.lessons = lessons);
  }

  getStudents(): void {
    this.dbService.getStudents()
      .subscribe(students => this.students = students);
  }

  createLesson(lessonDate: string, lessonStart: string, lessonType: string, student: Student): Lesson {
    let lesson: Lesson;
    lesson = {lessonDate, lessonStart, lessonType, student, "teacher": null};

    console.log(lesson);

    return lesson;
  }

  addLesson(): void {
    this.dbService.addLesson(this.createLesson(this.lessonDate, this.lessonStart, this.lessonType, this.selected))
      .subscribe(lesson => { this.lessons.push(lesson) });
  }

}
