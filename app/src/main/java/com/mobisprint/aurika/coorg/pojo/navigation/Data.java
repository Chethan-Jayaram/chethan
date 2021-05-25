
package com.mobisprint.aurika.coorg.pojo.navigation;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("routes_subcategory")
    @Expose
    private List<Object> routesSubcategory = null;
    @SerializedName("mobile_route")
    @Expose
    private Object mobileRoute;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("is_dashboard_visible")
    @Expose
    private Boolean isDashboardVisible;
    @SerializedName("display_only_on_booking")
    @Expose
    private Boolean displayOnlyOnBooking;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("location_id")
    @Expose
    private Integer locationId;
    @SerializedName("last_activity_on")
    @Expose
    private String lastActivityOn;
    @SerializedName("last_activity_by")
    @Expose
    private Integer lastActivityBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Object> getRoutesSubcategory() {
        return routesSubcategory;
    }

    public void setRoutesSubcategory(List<Object> routesSubcategory) {
        this.routesSubcategory = routesSubcategory;
    }

    public Object getMobileRoute() {
        return mobileRoute;
    }

    public void setMobileRoute(Object mobileRoute) {
        this.mobileRoute = mobileRoute;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getIsDashboardVisible() {
        return isDashboardVisible;
    }

    public void setIsDashboardVisible(Boolean isDashboardVisible) {
        this.isDashboardVisible = isDashboardVisible;
    }

    public Boolean getDisplayOnlyOnBooking() {
        return displayOnlyOnBooking;
    }

    public void setDisplayOnlyOnBooking(Boolean displayOnlyOnBooking) {
        this.displayOnlyOnBooking = displayOnlyOnBooking;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLastActivityOn() {
        return lastActivityOn;
    }

    public void setLastActivityOn(String lastActivityOn) {
        this.lastActivityOn = lastActivityOn;
    }

    public Integer getLastActivityBy() {
        return lastActivityBy;
    }

    public void setLastActivityBy(Integer lastActivityBy) {
        this.lastActivityBy = lastActivityBy;
    }

}
