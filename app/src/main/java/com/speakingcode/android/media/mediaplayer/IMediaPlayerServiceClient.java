package com.speakingcode.android.media.mediaplayer;

/**
 * Created by unknown on 9/15/14.
 */
public interface IMediaPlayerServiceClient {
    /**
     * A callback made by a MediaPlayerService onto its clients to indicate that a player is initializing.
     */
    public void onInitializePlayerStart();

    /**
     * A callback made by a MediaPlayerService onto its clients to indicate that a player was successfully initialized.
     */
    public void onInitializePlayerSuccess();

    /**
     * A callback made by a MediaPlayerService onto its clients to indicate that a player encountered an error.
     */
    public void onError();
}
