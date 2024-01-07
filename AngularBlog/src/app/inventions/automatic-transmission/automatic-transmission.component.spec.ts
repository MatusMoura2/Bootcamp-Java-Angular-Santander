import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutomaticTransmissionComponent } from './automatic-transmission.component';

describe('AutomaticTransmissionComponent', () => {
  let component: AutomaticTransmissionComponent;
  let fixture: ComponentFixture<AutomaticTransmissionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AutomaticTransmissionComponent]
    });
    fixture = TestBed.createComponent(AutomaticTransmissionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
