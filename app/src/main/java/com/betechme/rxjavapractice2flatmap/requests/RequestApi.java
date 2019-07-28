package com.betechme.rxjavapractice2flatmap.requests;

import com.betechme.rxjavapractice2flatmap.models.Comment;
import com.betechme.rxjavapractice2flatmap.models.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RequestApi {

    @GET("posts")
    Observable<List<Post>> getPosts();

    @GET("posts/{id}/comments")
    Observable<List<Comment>> getComments(
            @Path("id") int id
    );
}
