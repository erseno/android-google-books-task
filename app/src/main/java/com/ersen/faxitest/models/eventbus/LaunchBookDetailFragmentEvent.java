package com.ersen.faxitest.models.eventbus;

public class LaunchBookDetailFragmentEvent {
    private String mLinkToBookDetails;

    public LaunchBookDetailFragmentEvent(String mLinkToBookDetails) {
        this.mLinkToBookDetails = mLinkToBookDetails;
    }

    public String getLinkToBookDetails() {
        return mLinkToBookDetails;
    }
}
