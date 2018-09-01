package org.debugroom.sample.aws.codebuild.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User implements Serializable {

    private String userId;
    private String userName;

}
