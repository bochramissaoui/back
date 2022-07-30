package markers.marker.control;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import markers.marker.model.Marker;

import markers.marker.service.MarkerService;

import java.util.List;


@RestController
@RequestMapping("/marker")
public class MarkerCont {
    private final MarkerService MarkerService;
    public MarkerCont(MarkerService markerService ) {
        this.MarkerService = markerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Marker>> getAllMarkers () {
        List<Marker> markers = MarkerService.findAllMarkers();
        return new ResponseEntity<>(markers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Marker> getMarkerById (@PathVariable("id") long id) {
        Marker marker= MarkerService.findMarkerByid(id);
        return new ResponseEntity<>(marker, HttpStatus.OK);
    }
    

    @PostMapping("/add")
    public ResponseEntity<Marker> addMarker (@RequestBody Marker marker) {
        Marker newmarker = MarkerService.addMarker(marker);
        return new ResponseEntity<>(newmarker, HttpStatus.CREATED);
    }
  

 

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMarker(@PathVariable("id") Long id) {
        MarkerService.deleteMarker(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
