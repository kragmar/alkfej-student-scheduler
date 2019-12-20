import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentsComponent } from './students/students.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LessonsComponent } from './lessons/lessons.component';


const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'dashboard' },
  { path: 'students', component: StudentsComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'lessons', component: LessonsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
