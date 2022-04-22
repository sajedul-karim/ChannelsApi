package org.optimizely.social.utils;

import org.optimizely.social.channels.facebook.FacebookPost;
import org.optimizely.social.channels.youtube.YoutubeFeed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public interface ChannelsActionService {

    default List<FacebookPost> facebookPostList() {
        List<FacebookPost> facebookPosts = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            facebookPosts.add(new FacebookPost(i + 1, "some post", new Date(), new Date()));
        }
        return facebookPosts;
//        throw new FeatureNotImplementedException();
    }

    default FacebookPost createFacebookPost(FacebookPost facebookPost) {
        facebookPost.setId(new Random().nextInt());
        facebookPost.setDateCreated(new Date());
        facebookPost.setDateLastUpdated(new Date());
        return facebookPost;
//        throw new FeatureNotImplementedException();
    }

    default List<YoutubeFeed> youtubeFeedList() {
        List<YoutubeFeed> youtubeFeeds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            youtubeFeeds.add(new YoutubeFeed(i + 1, "https://youtu.be/LGCvRk7judU","Youtube feed title", new Date(), new Date()));
        }
        return youtubeFeeds;
//        throw new FeatureNotImplementedException();
    }
}
