import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
  host: {
    class: 'grid-layout__dashboard'
  }
})
export class DashboardComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
