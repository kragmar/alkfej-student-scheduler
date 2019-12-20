import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatDatepickerModule } from '@angular/material';
import { MatNativeDateModule } from '@angular/material';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { HttpClientModule } from '@angular/common/http';
import { TableComponent } from './weekly-schedule/table/table.component';
import { WeeklyScheduleComponent } from './weekly-schedule/weekly-schedule.component';
import { DbService } from './services/db.service';
import { DailyScheduleComponent } from './daily-schedule/daily-schedule.component';
import { DailyAccordionComponent } from './daily-schedule/daily-accordion/daily-accordion.component';

@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
    WeeklyScheduleComponent,
    DailyScheduleComponent,
    DailyAccordionComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatDatepickerModule,
    MatNativeDateModule
  ],
  providers: [DbService, MatDatepickerModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
