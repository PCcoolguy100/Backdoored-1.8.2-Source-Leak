package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.util.*;

public class GoogleOAuthConstants
{
    public static final String AUTHORIZATION_SERVER_URL = "https://accounts.google.com/o/oauth2/auth";
    public static final String TOKEN_SERVER_URL = "https://accounts.google.com/o/oauth2/token";
    @Beta
    public static final String DEFAULT_PUBLIC_CERTS_ENCODED_URL = "https://www.googleapis.com/oauth2/v1/certs";
    public static final String OOB_REDIRECT_URI = "urn:ietf:wg:oauth:2.0:oob";
    
    private GoogleOAuthConstants() {
        super();
    }
}
