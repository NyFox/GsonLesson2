
public class Counters
{
    private String photos;

    private String audios;

    private String followers;

    private String user_videos;

    private String videos;

    private String albums;

    private String notes;

    public String getPhotos ()
    {
        return photos;
    }

    public void setPhotos (String photos)
    {
        this.photos = photos;
    }

    public String getAudios ()
    {
        return audios;
    }

    public void setAudios (String audios)
    {
        this.audios = audios;
    }

    public String getFollowers ()
    {
        return followers;
    }

    public void setFollowers (String followers)
    {
        this.followers = followers;
    }

    public String getUser_videos ()
    {
        return user_videos;
    }

    public void setUser_videos (String user_videos)
    {
        this.user_videos = user_videos;
    }

    public String getVideos ()
    {
        return videos;
    }

    public void setVideos (String videos)
    {
        this.videos = videos;
    }

    public String getAlbums ()
    {
        return albums;
    }

    public void setAlbums (String albums)
    {
        this.albums = albums;
    }

    public String getNotes ()
    {
        return notes;
    }

    public void setNotes (String notes)
    {
        this.notes = notes;
    }

    @Override
    public String toString()
    {
        return "[photos = "+photos+", audios = "+audios+", followers = "+followers+", user_videos = "+user_videos+", videos = "+videos+", albums = "+albums+", notes = "+notes+"]";
    }
}