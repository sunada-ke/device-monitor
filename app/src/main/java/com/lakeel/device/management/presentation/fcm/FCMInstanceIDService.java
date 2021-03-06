package com.lakeel.device.management.presentation.fcm;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FCMInstanceIDService extends FirebaseInstanceIdService {

    private static final Logger LOG = LoggerFactory.getLogger(FCMInstanceIDService.class);

    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        LOG.debug("Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
    }
}
