import { Component } from '@angular/core';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

user: User =  new User();

username: string = '';
password: string = '';

constructor(private userService: UserService ) {

}

ngOnInit() {
  console.log("username: " + this.username);
  console.log("password: " + this.password);
}

login(): void {
  this.userService.login(this.username, this.password).subscribe((response: User) => {                          
    console.log('response received')
    this.user = response; 
  });
  console.log("username: " + this.username);
  console.log("password: " + this.password);

}


}

