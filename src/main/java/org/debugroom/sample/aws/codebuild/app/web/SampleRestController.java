package org.debugroom.sample.aws.codebuild.app.web;

import org.debugroom.sample.aws.codebuild.app.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class SampleRestController {

    @RequestMapping(value="users", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<User> getUsers(){
        return Arrays.asList(User.builder().userId("1").userName("(・∀・)").build());
    }

}
