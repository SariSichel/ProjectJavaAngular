import { Component } from '@angular/core';
import Post from '../model/post.model';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-post',
  imports: [FormsModule],
  templateUrl: './add-post.component.html',
  styleUrl: './add-post.component.css'
})
export class AddPostComponent {

  public newPost: Post={
    id:-1,
    name:"",
    description:"",
    lyrics:"",
    audio:"",
    uploadDate:new Date(),
    photo:"",
    //צריך לתפוס יוזר מהלוקאל סטוראג
    // user:{},
    //בחירה מתוך קומבובוקס של קטגוריות
    // category:{},
    usersTookPart:"",
    comments:[]
  }
}
