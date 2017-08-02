package com.example.mvpframe.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李栋杰
 * @time 2017/8/2  17:46
 * @desc ${TODD}
 */
public class WeatherInfo implements Serializable {
    /**
     * alarms : []
     * city : 南昌
     * cityid : 101240101
     * indexes : [{"abbreviation":"pp","alias":"","content":"建议用露质面霜打底，水质无油粉底霜，透明粉饼，粉质胭脂。","level":"控油","name":"化妆指数"},{"abbreviation":"gm","alias":"","content":"感冒较易发生，干净整洁的环境和清新流通的空气都有利于降低感冒的几率，体质较弱的童鞋们要特别加强自我保护。","level":"较易发","name":"感冒指数"},{"abbreviation":"xc","alias":"","content":"雨(雪)水和泥水会弄脏您的爱车，不适宜清洗车辆。","level":"不宜","name":"洗车指数"},{"abbreviation":"ct","alias":"","content":"潮湿闷热，衣物排汗透气，手帕擦汗环保时尚，不建议在露天场所逛街。","level":"闷热","name":"穿衣指数"},{"abbreviation":"uv","alias":"","content":"辐射较弱，涂擦SPF12-15、PA+护肤品。","level":"弱","name":"紫外线强度指数"},{"abbreviation":"yd","alias":"","content":"今天有阵雨，较不适宜户外运动，建议室内运动。","level":"不适宜","name":"运动指数"}]
     * pm25 : {"advice":"0","aqi":"46","citycount":606,"cityrank":50,"co":"11","color":"0","level":"0","no2":"11","o3":"14","pm10":"46","pm25":"30","quality":"优","so2":"7","timestamp":"","upDateTime":"2017-08-02 10:00:00"}
     * provinceName : 江西省
     * realtime : {"img":"2","sD":"82","sendibleTemp":"30","temp":"28","time":"2017-08-02 11:00:00","wD":"西南风","wS":"3级","weather":"阴","ziwaixian":"N/A"}
     * weatherDetailsInfo : {"publishTime":"2017-08-02 11:00:00","weather3HoursDetailsInfos":[{"endTime":"2017-08-02 15:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-02 12:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-02 18:00:00","highestTemperature":"29","img":"2","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-02 15:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-02 21:00:00","highestTemperature":"28","img":"4","isRainFall":"","lowerestTemperature":"28","precipitation":"0","startTime":"2017-08-02 18:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 00:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-02 21:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 03:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-03 00:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 06:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-03 03:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 09:00:00","highestTemperature":"28","img":"2","isRainFall":"","lowerestTemperature":"28","precipitation":"0","startTime":"2017-08-03 06:00:00","wd":"","weather":"阴","ws":""}]}
     * weathers : [{"date":"2017-08-02","img":"4","sun_down_time":"19:07","sun_rise_time":"05:38","temp_day_c":"32","temp_day_f":"89.6","temp_night_c":"27","temp_night_f":"80.6","wd":"","weather":"雷阵雨","week":"星期三","ws":""},{"date":"2017-08-03","img":"4","sun_down_time":"19:07","sun_rise_time":"05:38","temp_day_c":"34","temp_day_f":"93.2","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"雷阵雨","week":"星期四","ws":""},{"date":"2017-08-04","img":"0","sun_down_time":"19:07","sun_rise_time":"05:38","temp_day_c":"35","temp_day_f":"95.0","temp_night_c":"29","temp_night_f":"84.2","wd":"","weather":"晴","week":"星期五","ws":""},{"date":"2017-08-05","img":"0","sun_down_time":"19:07","sun_rise_time":"05:38","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"29","temp_night_f":"84.2","wd":"","weather":"晴","week":"星期六","ws":""},{"date":"2017-08-06","img":"1","sun_down_time":"19:07","sun_rise_time":"05:38","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"29","temp_night_f":"84.2","wd":"","weather":"多云","week":"星期日","ws":""},{"date":"2017-08-07","img":"4","sun_down_time":"19:07","sun_rise_time":"05:38","temp_day_c":"36","temp_day_f":"96.8","temp_night_c":"28","temp_night_f":"82.4","wd":"","weather":"雷阵雨","week":"星期一","ws":""},{"date":"2017-08-01","img":"7","sun_down_time":"19:07","sun_rise_time":"05:38","temp_day_c":"31","temp_day_f":"87.8","temp_night_c":"26","temp_night_f":"78.8","wd":"","weather":"小雨","week":"星期二","ws":""}]
     */

    private String city;
    private int cityid;
    private Pm25Bean pm25;
    private String provinceName;
    private RealtimeBean realtime;
    private WeatherDetailsInfoBean weatherDetailsInfo;
    private List<?> alarms;
    private List<IndexesBean> indexes;
    private List<WeathersBean> weathers;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public Pm25Bean getPm25() {
        return pm25;
    }

    public void setPm25(Pm25Bean pm25) {
        this.pm25 = pm25;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public RealtimeBean getRealtime() {
        return realtime;
    }

    public void setRealtime(RealtimeBean realtime) {
        this.realtime = realtime;
    }

    public WeatherDetailsInfoBean getWeatherDetailsInfo() {
        return weatherDetailsInfo;
    }

    public void setWeatherDetailsInfo(WeatherDetailsInfoBean weatherDetailsInfo) {
        this.weatherDetailsInfo = weatherDetailsInfo;
    }

    public List<?> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<?> alarms) {
        this.alarms = alarms;
    }

    public List<IndexesBean> getIndexes() {
        return indexes;
    }

    public void setIndexes(List<IndexesBean> indexes) {
        this.indexes = indexes;
    }

    public List<WeathersBean> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<WeathersBean> weathers) {
        this.weathers = weathers;
    }

    @Override
    public String toString() {
        return "ValueBean{" +
                "city='" + city + '\'' +
                ", cityid=" + cityid +
                ", pm25=" + pm25 +
                ", provinceName='" + provinceName + '\'' +
                ", realtime=" + realtime +
                ", weatherDetailsInfo=" + weatherDetailsInfo +
                ", alarms=" + alarms +
                ", indexes=" + indexes +
                ", weathers=" + weathers +
                '}';
    }

    public static class Pm25Bean {
        /**
         * advice : 0
         * aqi : 46
         * citycount : 606
         * cityrank : 50
         * co : 11
         * color : 0
         * level : 0
         * no2 : 11
         * o3 : 14
         * pm10 : 46
         * pm25 : 30
         * quality : 优
         * so2 : 7
         * timestamp :
         * upDateTime : 2017-08-02 10:00:00
         */

        private String advice;
        private String aqi;
        private int citycount;
        private int cityrank;
        private String co;
        private String color;
        private String level;
        private String no2;
        private String o3;
        private String pm10;
        private String pm25;
        private String quality;
        private String so2;
        private String timestamp;
        private String upDateTime;

        public String getAdvice() {
            return advice;
        }

        public void setAdvice(String advice) {
            this.advice = advice;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public int getCitycount() {
            return citycount;
        }

        public void setCitycount(int citycount) {
            this.citycount = citycount;
        }

        public int getCityrank() {
            return cityrank;
        }

        public void setCityrank(int cityrank) {
            this.cityrank = cityrank;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getUpDateTime() {
            return upDateTime;
        }

        public void setUpDateTime(String upDateTime) {
            this.upDateTime = upDateTime;
        }

        @Override
        public String toString() {
            return "Pm25Bean{" +
                    "advice='" + advice + '\'' +
                    ", aqi='" + aqi + '\'' +
                    ", citycount=" + citycount +
                    ", cityrank=" + cityrank +
                    ", co='" + co + '\'' +
                    ", color='" + color + '\'' +
                    ", level='" + level + '\'' +
                    ", no2='" + no2 + '\'' +
                    ", o3='" + o3 + '\'' +
                    ", pm10='" + pm10 + '\'' +
                    ", pm25='" + pm25 + '\'' +
                    ", quality='" + quality + '\'' +
                    ", so2='" + so2 + '\'' +
                    ", timestamp='" + timestamp + '\'' +
                    ", upDateTime='" + upDateTime + '\'' +
                    '}';
        }
    }

    public static class RealtimeBean {
        /**
         * img : 2
         * sD : 82
         * sendibleTemp : 30
         * temp : 28
         * time : 2017-08-02 11:00:00
         * wD : 西南风
         * wS : 3级
         * weather : 阴
         * ziwaixian : N/A
         */

        private String img;
        private String sD;
        private String sendibleTemp;
        private String temp;
        private String time;
        private String wD;
        private String wS;
        private String weather;
        private String ziwaixian;

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getSD() {
            return sD;
        }

        public void setSD(String sD) {
            this.sD = sD;
        }

        public String getSendibleTemp() {
            return sendibleTemp;
        }

        public void setSendibleTemp(String sendibleTemp) {
            this.sendibleTemp = sendibleTemp;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getWD() {
            return wD;
        }

        public void setWD(String wD) {
            this.wD = wD;
        }

        public String getWS() {
            return wS;
        }

        public void setWS(String wS) {
            this.wS = wS;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getZiwaixian() {
            return ziwaixian;
        }

        public void setZiwaixian(String ziwaixian) {
            this.ziwaixian = ziwaixian;
        }

        @Override
        public String toString() {
            return "RealtimeBean{" +
                    "img='" + img + '\'' +
                    ", sD='" + sD + '\'' +
                    ", sendibleTemp='" + sendibleTemp + '\'' +
                    ", temp='" + temp + '\'' +
                    ", time='" + time + '\'' +
                    ", wD='" + wD + '\'' +
                    ", wS='" + wS + '\'' +
                    ", weather='" + weather + '\'' +
                    ", ziwaixian='" + ziwaixian + '\'' +
                    '}';
        }
    }

    public static class WeatherDetailsInfoBean {
        /**
         * publishTime : 2017-08-02 11:00:00
         * weather3HoursDetailsInfos : [{"endTime":"2017-08-02 15:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-02 12:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-02 18:00:00","highestTemperature":"29","img":"2","isRainFall":"","lowerestTemperature":"29","precipitation":"0","startTime":"2017-08-02 15:00:00","wd":"","weather":"阴","ws":""},{"endTime":"2017-08-02 21:00:00","highestTemperature":"28","img":"4","isRainFall":"","lowerestTemperature":"28","precipitation":"0","startTime":"2017-08-02 18:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 00:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-02 21:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 03:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-03 00:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 06:00:00","highestTemperature":"27","img":"4","isRainFall":"","lowerestTemperature":"27","precipitation":"0","startTime":"2017-08-03 03:00:00","wd":"","weather":"雷阵雨","ws":""},{"endTime":"2017-08-03 09:00:00","highestTemperature":"28","img":"2","isRainFall":"","lowerestTemperature":"28","precipitation":"0","startTime":"2017-08-03 06:00:00","wd":"","weather":"阴","ws":""}]
         */

        private String publishTime;
        private List<Weather3HoursDetailsInfosBean> weather3HoursDetailsInfos;

        public String getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(String publishTime) {
            this.publishTime = publishTime;
        }

        public List<Weather3HoursDetailsInfosBean> getWeather3HoursDetailsInfos() {
            return weather3HoursDetailsInfos;
        }

        public void setWeather3HoursDetailsInfos(List<Weather3HoursDetailsInfosBean> weather3HoursDetailsInfos) {
            this.weather3HoursDetailsInfos = weather3HoursDetailsInfos;
        }

        @Override
        public String toString() {
            return "WeatherDetailsInfoBean{" +
                    "publishTime='" + publishTime + '\'' +
                    ", weather3HoursDetailsInfos=" + weather3HoursDetailsInfos +
                    '}';
        }

        public static class Weather3HoursDetailsInfosBean {
            /**
             * endTime : 2017-08-02 15:00:00
             * highestTemperature : 27
             * img : 4
             * isRainFall :
             * lowerestTemperature : 27
             * precipitation : 0
             * startTime : 2017-08-02 12:00:00
             * wd :
             * weather : 雷阵雨
             * ws :
             */

            private String endTime;
            private String highestTemperature;
            private String img;
            private String isRainFall;
            private String lowerestTemperature;
            private String precipitation;
            private String startTime;
            private String wd;
            private String weather;
            private String ws;

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public String getHighestTemperature() {
                return highestTemperature;
            }

            public void setHighestTemperature(String highestTemperature) {
                this.highestTemperature = highestTemperature;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getIsRainFall() {
                return isRainFall;
            }

            public void setIsRainFall(String isRainFall) {
                this.isRainFall = isRainFall;
            }

            public String getLowerestTemperature() {
                return lowerestTemperature;
            }

            public void setLowerestTemperature(String lowerestTemperature) {
                this.lowerestTemperature = lowerestTemperature;
            }

            public String getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(String precipitation) {
                this.precipitation = precipitation;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getWd() {
                return wd;
            }

            public void setWd(String wd) {
                this.wd = wd;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWs() {
                return ws;
            }

            public void setWs(String ws) {
                this.ws = ws;
            }

            @Override
            public String toString() {
                return "Weather3HoursDetailsInfosBean{" +
                        "endTime='" + endTime + '\'' +
                        ", highestTemperature='" + highestTemperature + '\'' +
                        ", img='" + img + '\'' +
                        ", isRainFall='" + isRainFall + '\'' +
                        ", lowerestTemperature='" + lowerestTemperature + '\'' +
                        ", precipitation='" + precipitation + '\'' +
                        ", startTime='" + startTime + '\'' +
                        ", wd='" + wd + '\'' +
                        ", weather='" + weather + '\'' +
                        ", ws='" + ws + '\'' +
                        '}';
            }
        }
    }

    public static class IndexesBean {
        /**
         * abbreviation : pp
         * alias :
         * content : 建议用露质面霜打底，水质无油粉底霜，透明粉饼，粉质胭脂。
         * level : 控油
         * name : 化妆指数
         */

        private String abbreviation;
        private String alias;
        private String content;
        private String level;
        private String name;

        public String getAbbreviation() {
            return abbreviation;
        }

        public void setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "IndexesBean{" +
                    "abbreviation='" + abbreviation + '\'' +
                    ", alias='" + alias + '\'' +
                    ", content='" + content + '\'' +
                    ", level='" + level + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static class WeathersBean {
        /**
         * date : 2017-08-02
         * img : 4
         * sun_down_time : 19:07
         * sun_rise_time : 05:38
         * temp_day_c : 32
         * temp_day_f : 89.6
         * temp_night_c : 27
         * temp_night_f : 80.6
         * wd :
         * weather : 雷阵雨
         * week : 星期三
         * ws :
         */

        private String date;
        private String img;
        private String sun_down_time;
        private String sun_rise_time;
        private String temp_day_c;
        private String temp_day_f;
        private String temp_night_c;
        private String temp_night_f;
        private String wd;
        private String weather;
        private String week;
        private String ws;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getSun_down_time() {
            return sun_down_time;
        }

        public void setSun_down_time(String sun_down_time) {
            this.sun_down_time = sun_down_time;
        }

        public String getSun_rise_time() {
            return sun_rise_time;
        }

        public void setSun_rise_time(String sun_rise_time) {
            this.sun_rise_time = sun_rise_time;
        }

        public String getTemp_day_c() {
            return temp_day_c;
        }

        public void setTemp_day_c(String temp_day_c) {
            this.temp_day_c = temp_day_c;
        }

        public String getTemp_day_f() {
            return temp_day_f;
        }

        public void setTemp_day_f(String temp_day_f) {
            this.temp_day_f = temp_day_f;
        }

        public String getTemp_night_c() {
            return temp_night_c;
        }

        public void setTemp_night_c(String temp_night_c) {
            this.temp_night_c = temp_night_c;
        }

        public String getTemp_night_f() {
            return temp_night_f;
        }

        public void setTemp_night_f(String temp_night_f) {
            this.temp_night_f = temp_night_f;
        }

        public String getWd() {
            return wd;
        }

        public void setWd(String wd) {
            this.wd = wd;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getWs() {
            return ws;
        }

        public void setWs(String ws) {
            this.ws = ws;
        }

        @Override
        public String toString() {
            return "WeathersBean{" +
                    "date='" + date + '\'' +
                    ", img='" + img + '\'' +
                    ", sun_down_time='" + sun_down_time + '\'' +
                    ", sun_rise_time='" + sun_rise_time + '\'' +
                    ", temp_day_c='" + temp_day_c + '\'' +
                    ", temp_day_f='" + temp_day_f + '\'' +
                    ", temp_night_c='" + temp_night_c + '\'' +
                    ", temp_night_f='" + temp_night_f + '\'' +
                    ", wd='" + wd + '\'' +
                    ", weather='" + weather + '\'' +
                    ", week='" + week + '\'' +
                    ", ws='" + ws + '\'' +
                    '}';
        }
    }

}
