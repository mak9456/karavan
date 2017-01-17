package com.example.mak9456.karavan;

/**
 * Created by mak9456 on 16/1/17.
 */


public class QuoteResponse{

    int estimated_distance;
    String from;
    String to ;
    String package_type;
    double km_cap_per_day;
    double penalty_per_km;
    int penalty_per_day;
    int price_per_day;
    double price_per_km;
    Vehicle vehicle;
    Vendor vendor;

    public int getEstimated_distance() {
        return estimated_distance;
    }

    public void setEstimated_distance(int estimated_distance) {
        this.estimated_distance = estimated_distance;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPackage_type() {
        return package_type;
    }

    public void setPackage_type(String package_type) {
        this.package_type = package_type;
    }

    public double getKm_cap_per_day() {
        return km_cap_per_day;
    }

    public void setKm_cap_per_day(double km_cap_per_day) {
        this.km_cap_per_day = km_cap_per_day;
    }

    public double getPenalty_per_km() {
        return penalty_per_km;
    }

    public void setPenalty_per_km(double penalty_per_km) {
        this.penalty_per_km = penalty_per_km;
    }

    public int getPenalty_per_day() {
        return penalty_per_day;
    }

    public void setPenalty_per_day(int penalty_per_day) {
        this.penalty_per_day = penalty_per_day;
    }

    public int getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(int price_per_day) {
        this.price_per_day = price_per_day;
    }

    public double getPrice_per_km() {
        return price_per_km;
    }

    public void setPrice_per_km(double price_per_km) {
        this.price_per_km = price_per_km;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}