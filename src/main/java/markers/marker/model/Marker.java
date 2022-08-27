package markers.marker.model ;
import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Marker implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String ville;
    private float lat;
    private float lng;
    private String information;
    private String imageUrl;
    private String domaine ;
    public Marker(String name, String ville, float lat, float lng, String information, String imageUrl,
            String domaine) {
        this.name = name;
        this.ville = ville;
        this.lat = lat;
        this.lng = lng;
        this.information = information;
        this.imageUrl = imageUrl;
        this.domaine = domaine;
    }
    public String getDomaine() {
        return domaine;
    }
    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
    @Column(nullable = false, updatable = false)
    private String markerCode;

    
    public String getmarkerCode() {
        return markerCode;
    }
    public void setmarkerCode(String employeeCode) {
        this.markerCode = employeeCode;
    }
    public Marker () {}
 
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public float getLat() {
        return lat;
    }
    public void setLat(Float lat) {
        this.lat = lat;
    }
    public float getLng() {
        return lng;
    }
    public void setLng(Float lng) {
        this.lng = lng;
    }
    public String getInformation() {
        return information;
    }
    public void setInformation(String information) {
        this.information = information;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String toString() {
        return "marker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ville='" + ville + '\'' +
                ", lat='" + lat+ '\'' +
                ", lng='" + lng + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", information='" + information + '\'' +
                
                '}';
    }
}