import { Injectable } from '@angular/core';
import IUser from '../interfaces/user';
import { HttpClient, HttpParams } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  //public currentUser: Observable<IUser>;
  user: User;
  public currentUser!: Observable<IUser>;

  constructor(private http: HttpClient) {
    this.user = new User();
  }

  login(username: string, password: string): Observable<User> {
    let params = new HttpParams().set("username",username).set("password", password);
    return this.http.get<User>('http://localhost:8080/login',{params:params});
  }

}
