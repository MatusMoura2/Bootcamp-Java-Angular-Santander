import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BlogComponent } from './blog/blog.component';
import { AutomaticTransmissionComponent } from './inventions/automatic-transmission/automatic-transmission.component';

@NgModule({
  declarations: [
    AppComponent,
    BlogComponent,
    AutomaticTransmissionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
