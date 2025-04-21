import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookMyShowComponent } from './book-my-show.component';

describe('BookMyShowComponent', () => {
  let component: BookMyShowComponent;
  let fixture: ComponentFixture<BookMyShowComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BookMyShowComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookMyShowComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
