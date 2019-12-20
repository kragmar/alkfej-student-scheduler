import { Component, OnInit, Input } from '@angular/core';
import { DbService } from '../../services/db.service';
import { Lesson } from "../../services/lesson";
import { Student } from 'src/app/services/student';
import { LessonPost } from 'src/app/services/lesson-post';

@Component({
  selector: 'app-daily-accordion',
  templateUrl: './daily-accordion.component.html',
  styleUrls: ['./daily-accordion.component.css']
})
export class DailyAccordionComponent implements OnInit {

  lessons: Lesson[];
  students: Student[];
  
  @Input() lessonDate: string;
  @Input() lessonStart: string;
  @Input() lessonType: string;
  @Input() studentId: number;

  lessonPost: LessonPost[];

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

  getSelected(event: any): void {
    this.studentId = event.target.value;

    this.addLesson();
  }

  createLesson(lessonDate: string, lessonStart: string, lessonType: string/* , studentId: number */): LessonPost {
    let lesson: LessonPost;
    lesson = {lessonDate, lessonStart, lessonType, "studentId": 2, "teacherId": null};

    return lesson;
  }

  addLesson(): void {
    this.dbService
      .addLesson(this.createLesson(this.lessonDate, this.lessonStart, this.lessonType/* , this.studentId */))
      .subscribe(lesson => this.lessonPost.push(lesson));
  }

}
