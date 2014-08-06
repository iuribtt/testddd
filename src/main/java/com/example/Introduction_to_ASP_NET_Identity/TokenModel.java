package com.example.Introduction_to_ASP_NET_Identity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ServusKevin on 8/2/14.
 */
public class TokenModel {

    @SerializedName("access_token")
    public String AccessToken;

    @SerializedName(".expires")
    public String ExpiresAt;

    @SerializedName("expires_in")
    public Integer ExpiresIn;

    @SerializedName(".issued")
    public String IssuedAt;

    @SerializedName("token_type")
    public String TokenType;

    @SerializedName("userName")
    public String Username;

}
