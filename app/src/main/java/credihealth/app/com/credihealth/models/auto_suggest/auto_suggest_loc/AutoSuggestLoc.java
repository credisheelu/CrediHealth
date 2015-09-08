
package credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_loc;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health.Hospital;


public class AutoSuggestLoc {

    @SerializedName("location_search")
    @Expose
    private List<LocationSearch> locationSearch = new ArrayList<LocationSearch>();

    /**
     * 
     * @return
     *     The locationSearch
     */
    public List<LocationSearch> getLocationSearch() {
        return locationSearch;
    }

    /**
     * 
     * @param locationSearch
     *     The location_search
     */
    public void setLocationSearch(List<LocationSearch> locationSearch) {
        this.locationSearch = locationSearch;
    }

    public AutoSuggestLoc withLocationSearch(List<LocationSearch> locationSearch) {
        this.locationSearch = locationSearch;
        return this;
    }


}
