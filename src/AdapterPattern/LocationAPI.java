package AdapterPattern;

public interface LocationAPI {
    LocationData GetCurrentLocation();

    LocationData GetLastKnownLocation();
}
