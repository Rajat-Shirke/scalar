package AdapterPattern;

public class LocationService implements LocationAPI{
    LocationData data ;

    //Dependency Injection - passing object into the constructor
    public LocationService(LocationData _data)
    {
        this.data = _data;
    }
    @Override
    public LocationData GetCurrentLocation() {
        data.AddressLine1="#433 3rd cross";
        data.AddressLine2="Vishwabandhu Nagar";
        data.Landmark="Behind KV School";
        data.pin="581115";
        data.Latitude = 14.1232321;
        data.Longitude = 78.1232324;
        data.Place="Ranebennuru";

        return data;
    }

    @Override
    public LocationData GetLastKnownLocation() {

        data.AddressLine1="#3 1st cross";
        data.AddressLine2="Vidhya Nagar";
        data.Landmark="Behind Devika School";
        data.pin="581115";
        data.Latitude = 14.12872321;
        data.Longitude = 78.98632324;
        data.Place="Ranebennuru";

        return data;
    }
}
