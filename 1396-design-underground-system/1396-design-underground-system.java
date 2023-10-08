import java.util.HashMap;

class UndergroundSystem {
    private HashMap<Integer, CheckInInfo> checkIns;
    private HashMap<String, StationInfo> stationInfo;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        stationInfo = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo checkInInfo = checkIns.get(id);
        String startStation = checkInInfo.startStation;
        int startTime = checkInInfo.time;

        String key = startStation + "-" + stationName;
        StationInfo station = stationInfo.getOrDefault(key, new StationInfo());
        station.totalTime += t - startTime;
        station.totalTravels++;
        stationInfo.put(key, station);

        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "-" + endStation;
        StationInfo station = stationInfo.get(key);
        return (double) station.totalTime / station.totalTravels;
    }

    private class CheckInInfo {
        String startStation;
        int time;

        public CheckInInfo(String startStation, int time) {
            this.startStation = startStation;
            this.time = time;
        }
    }

    private class StationInfo {
        int totalTime;
        int totalTravels;
    }
}


/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */