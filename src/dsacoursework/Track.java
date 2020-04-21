/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsacoursework;

/**
 *
 * @author user
 */
public class Track {
    private final int trackId;
    private  String trackTitle;
    private  String artist;
    private  String trackLength;
    private  String composer;
    private  String releaseDate;
    private  String album;
    private  String genre;
    private static int lastIdAllocated = 0;
    static final char EOLN='\n';       
    static final String QUOTE="\""; 
    
    public Track(String trackTitle ,String artist,String trackLength,String composer,String releaseDate,String album,String genre) {
        this.trackId = ++lastIdAllocated;
        this.trackTitle=trackTitle;
           this.artist=artist;
           this.trackLength=trackLength;
           this.composer=composer;
           this.releaseDate=releaseDate;
           this.album=album;
           this.genre=genre;
              
    }
    
    public Track( int trackId, String trackTitle ,String artist,String trackLength,String composer,String releaseDate,String album,String genre){
    
           this.trackId=trackId;
           this.trackTitle=trackTitle;
           this.artist=artist;
           this.trackLength=trackLength;
           this.composer=composer;
           this.releaseDate=releaseDate;
           this.album=album;
           this.genre=genre;
           
             if (trackId > Track.lastIdAllocated)
            Track.lastIdAllocated = trackId;            
    }
           
     
 
    
     public int getTrackId(){
         return this.trackId;
     }
      public String getTrackTitle(){
         return this.trackTitle;
     }
       public String getArtist(){
         return this.artist;
     }
     public String getTrackLength(){
         return this.trackLength;
     }
      public String getComposer(){
         return this.composer;
     }
       public String getReleaseDate(){
         return this.releaseDate;
     }
        public String getAlbum(){
         return this.album;
     }
         public String getGenre(){
         return this.genre;
     }
         
     public void setTrackTitle(String trackTitle){
          this.trackTitle=trackTitle;
     }
     public void setArtist(String artist){
          this.artist=artist;
     }
     public void setTrackLength(String trackLength){
          this.trackLength=trackLength;
     }
     public void setComposer(String composer){
          this.composer=composer;
     }
     public void setReleaseDate(String releaseDate){
          this.releaseDate=releaseDate;
     }
     public void setAlbum(String album){
          this.album=album;
     }
          public void setGenre(String genre){
          this.genre=genre;
     }
          
    public int compareTo(Track compareTrack) {
       int restId = ((Track) compareTrack).getTrackId(); 
		
		//ascending order
		return this.trackId - restId;
		
		
    }
    
        public int compareArtist(Track compareTrack) {
       String trartist = ((Track) compareTrack).getArtist(); 
		
		//ascending order
		return this.artist.compareTo(trartist);
		
		
    }
        
               public int compareArtistDesc(Track compareTrack) {
       String trartist = ((Track) compareTrack).getArtist(); 
		
		//ascending order
		return trartist.compareTo(this.artist);
		
		
    }
    
    
    @Override
          public String toString() {
        return "Track ID: "+this.trackId +EOLN+ " Title:"+this.trackTitle+EOLN+" Artist:"+this.artist+EOLN+" Length:"+this.trackLength+EOLN+" Composer:"+this.composer+EOLN+" Release Date:"+this.getReleaseDate()+EOLN+" Album:"+this.album+EOLN+" Genre:"+this.genre+EOLN;
     }
          
        public String toString(char delimiter) {     
        String str =    Integer.toString(this.trackId) + delimiter + QUOTE + this.trackTitle + QUOTE + delimiter +
                QUOTE + this.artist + QUOTE + delimiter +QUOTE+ this.trackLength +QUOTE+delimiter+QUOTE+ this.composer +QUOTE+delimiter+
                QUOTE+ this.releaseDate +QUOTE+delimiter+QUOTE+ this.album +QUOTE+delimiter+QUOTE+ this.genre +QUOTE+delimiter+ EOLN;
       
        return str;
    } 
     
}
