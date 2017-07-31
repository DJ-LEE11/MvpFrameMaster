package com.example.mvpframe.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李栋杰
 * @time 2017/7/30  11:56
 * @desc ${TODD}
 */
public class NewsInfo implements Serializable {

    private List<T1348647909107Bean> T1348647909107;

    public List<T1348647909107Bean> getT1348647909107() {
        return T1348647909107;
    }

    public void setT1348647909107(List<T1348647909107Bean> T1348647909107) {
        this.T1348647909107 = T1348647909107;
    }

    @Override
    public String toString() {
        return "NewsInfo{" +
                "T1348647909107=" + T1348647909107 +
                '}';
    }

    public static class T1348647909107Bean {
        /**
         * imgextra : [{"imgsrc":"http://cms-bucket.nosdn.127.net/3276f7e7ff5244d0807a4337a554f76820170730101738.jpeg"},{"imgsrc":"http://cms-bucket.nosdn.127.net/81304f3265764dad9ff2b9c08bf29a5e20170730101738.jpeg"}]
         * template : normal1
         * skipID : 00AN0001|2268793
         * lmodify : 2017-07-30 10:49:44
         * postid : PHOT257JP000100A
         * source : 央广军事
         * title : 歼-20亮相阅兵式 舱内画面首次曝光
         * hasImg : 1
         * topic_background : http://img2.cache.netease.com/m/newsapp/reading/cover1/C1348646712614.jpg
         * digest :
         * photosetID : 00AN0001|2268793
         * boardid : photoview_bbs
         * alias : Top News
         * hasAD : 1
         * imgsrc : http://cms-bucket.nosdn.127.net/7385335535bb4dbc9d55de67476a945b20170730104229.jpeg
         * ptime : 2017-07-30 10:17:41
         * hasHead : 1
         * order : 1
         * votecount : 5952
         * hasCover : false
         * docid : 9IG74V5H00963VRO_CQJ8U7AAbjhuangjiadiupdateDoc
         * tname : 头条
         * priority : 354
         * ads : [{"subtitle":"","skipType":"photoset","skipID":"00AN0001|2268796","tag":"photoset","title":"解放军建军90周年阅兵 海军女兵亮相","imgsrc":"http://cms-bucket.nosdn.127.net/15b189490c3e40d28cecb4178f8b1e8b20170730110200.jpeg","url":"00AN0001|2268796"},{"subtitle":"","skipType":"photoset","skipID":"00AN0001|2268779","tag":"photoset","title":"解放军建军90周年阅兵 空中突击队亮相","imgsrc":"http://cms-bucket.nosdn.127.net/fc0e664e3bd742abb6d702dd11509f6c20170730094021.png","url":"00AN0001|2268779"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2268809","tag":"photoset","title":"大连暑夏热 海滨浴场只见人头不见沙滩","imgsrc":"http://cms-bucket.nosdn.127.net/eacf8e1ddd9f49cb810a5b077c9199e320170730111457.jpeg","url":"00AP0001|2268809"},{"subtitle":"","skipType":"photoset","skipID":"00AN0001|2268782","tag":"photoset","title":"解放军建军90周年阅兵 各方队悉数亮相","imgsrc":"http://cms-bucket.nosdn.127.net/d022ae4f082e4e49a07d6e9b0d72cc9d20170730095151.png","url":"00AN0001|2268782"},{"subtitle":"","skipType":"photoset","skipID":"00AP0001|2268707","tag":"photoset","title":"少林寺无遮大会开幕 系千年来首次举办","imgsrc":"http://cms-bucket.nosdn.127.net/45cce6ad9793499b8e9fbe856a7d52f420170729200324.jpeg","url":"00AP0001|2268707"}]
         * ename : androidnews
         * replyCount : 6568
         * imgsum : 9
         * hasIcon : false
         * skipType : photoset
         * cid : C1348646712614
         * url_3w : http://news.163.com/17/0730/10/CQJ8PQLD0001875N.html
         * url : http://3g.163.com/news/17/0730/10/CQJ8PQLD0001875N.html
         * specialID : S1500454965982
         * ltitle : 习近平：我们的英雄军队有能力打败一切来犯之敌
         * subtitle :
         * length : 75
         * videosource : 新媒体
         * videoID : VCPLDTDEH
         * videoinfo : {"length":75,"mp4Hd_url":"http://flv1.bn.netease.com/videolib3/1707/30/BpobX9607/HD/BpobX9607-mobile.mp4","description":"","videosource":"新媒体","title":"歼击机梯队 阅兵现场发射干扰弹","m3u8Hd_url":"http://flv.bn.netease.com/videolib3/1707/30/BpobX9607/HD/movie_index.m3u8","mp4_url":"http://flv1.bn.netease.com/videolib3/1707/30/BpobX9607/SD/BpobX9607-mobile.mp4","vid":"VCPLDTDEH","playCount":0,"replyCount":320,"replyBoard":"video_bbs","playersize":1,"replyid":"CPLDTDEH008535RB","sectiontitle":"","ptime":"2017-07-30 09:54:04","m3u8_url":"http://flv.bn.netease.com/videolib3/1707/30/BpobX9607/SD/movie_index.m3u8"}
         * TAGS : 视频
         * imgType : 1
         */

        private String template;
        private String skipID;
        private String lmodify;
        private String postid;
        private String source;
        private String title;
        private int hasImg;
        private String topic_background;
        private String digest;
        private String photosetID;
        private String boardid;
        private String alias;
        private int hasAD;
        private String imgsrc;
        private String ptime;
        private int hasHead;
        private int order;
        private int votecount;
        private boolean hasCover;
        private String docid;
        private String tname;
        private int priority;
        private String ename;
        private int replyCount;
        private int imgsum;
        private boolean hasIcon;
        private String skipType;
        private String cid;
        private String url_3w;
        private String url;
        private String specialID;
        private String ltitle;
        private String subtitle;
        private int length;
        private String videosource;
        private String videoID;
        private VideoinfoBean videoinfo;
        private String TAGS;
        private int imgType;
        private List<ImgextraBean> imgextra;
        private List<AdsBean> ads;

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getTopic_background() {
            return topic_background;
        }

        public void setTopic_background(String topic_background) {
            this.topic_background = topic_background;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getImgsum() {
            return imgsum;
        }

        public void setImgsum(int imgsum) {
            this.imgsum = imgsum;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getUrl_3w() {
            return url_3w;
        }

        public void setUrl_3w(String url_3w) {
            this.url_3w = url_3w;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSpecialID() {
            return specialID;
        }

        public void setSpecialID(String specialID) {
            this.specialID = specialID;
        }

        public String getLtitle() {
            return ltitle;
        }

        public void setLtitle(String ltitle) {
            this.ltitle = ltitle;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getVideosource() {
            return videosource;
        }

        public void setVideosource(String videosource) {
            this.videosource = videosource;
        }

        public String getVideoID() {
            return videoID;
        }

        public void setVideoID(String videoID) {
            this.videoID = videoID;
        }

        public VideoinfoBean getVideoinfo() {
            return videoinfo;
        }

        public void setVideoinfo(VideoinfoBean videoinfo) {
            this.videoinfo = videoinfo;
        }

        public String getTAGS() {
            return TAGS;
        }

        public void setTAGS(String TAGS) {
            this.TAGS = TAGS;
        }

        public int getImgType() {
            return imgType;
        }

        public void setImgType(int imgType) {
            this.imgType = imgType;
        }

        public List<ImgextraBean> getImgextra() {
            return imgextra;
        }

        public void setImgextra(List<ImgextraBean> imgextra) {
            this.imgextra = imgextra;
        }

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        @Override
        public String toString() {
            return "T1348647909107Bean{" +
                    "template='" + template + '\'' +
                    ", skipID='" + skipID + '\'' +
                    ", lmodify='" + lmodify + '\'' +
                    ", postid='" + postid + '\'' +
                    ", source='" + source + '\'' +
                    ", title='" + title + '\'' +
                    ", hasImg=" + hasImg +
                    ", topic_background='" + topic_background + '\'' +
                    ", digest='" + digest + '\'' +
                    ", photosetID='" + photosetID + '\'' +
                    ", boardid='" + boardid + '\'' +
                    ", alias='" + alias + '\'' +
                    ", hasAD=" + hasAD +
                    ", imgsrc='" + imgsrc + '\'' +
                    ", ptime='" + ptime + '\'' +
                    ", hasHead=" + hasHead +
                    ", order=" + order +
                    ", votecount=" + votecount +
                    ", hasCover=" + hasCover +
                    ", docid='" + docid + '\'' +
                    ", tname='" + tname + '\'' +
                    ", priority=" + priority +
                    ", ename='" + ename + '\'' +
                    ", replyCount=" + replyCount +
                    ", imgsum=" + imgsum +
                    ", hasIcon=" + hasIcon +
                    ", skipType='" + skipType + '\'' +
                    ", cid='" + cid + '\'' +
                    ", url_3w='" + url_3w + '\'' +
                    ", url='" + url + '\'' +
                    ", specialID='" + specialID + '\'' +
                    ", ltitle='" + ltitle + '\'' +
                    ", subtitle='" + subtitle + '\'' +
                    ", length=" + length +
                    ", videosource='" + videosource + '\'' +
                    ", videoID='" + videoID + '\'' +
                    ", videoinfo=" + videoinfo +
                    ", TAGS='" + TAGS + '\'' +
                    ", imgType=" + imgType +
                    ", imgextra=" + imgextra +
                    ", ads=" + ads +
                    '}';
        }

        public static class VideoinfoBean {
            /**
             * length : 75
             * mp4Hd_url : http://flv1.bn.netease.com/videolib3/1707/30/BpobX9607/HD/BpobX9607-mobile.mp4
             * description :
             * videosource : 新媒体
             * title : 歼击机梯队 阅兵现场发射干扰弹
             * m3u8Hd_url : http://flv.bn.netease.com/videolib3/1707/30/BpobX9607/HD/movie_index.m3u8
             * mp4_url : http://flv1.bn.netease.com/videolib3/1707/30/BpobX9607/SD/BpobX9607-mobile.mp4
             * vid : VCPLDTDEH
             * playCount : 0
             * replyCount : 320
             * replyBoard : video_bbs
             * playersize : 1
             * replyid : CPLDTDEH008535RB
             * sectiontitle :
             * ptime : 2017-07-30 09:54:04
             * m3u8_url : http://flv.bn.netease.com/videolib3/1707/30/BpobX9607/SD/movie_index.m3u8
             */

            private int length;
            private String mp4Hd_url;
            private String description;
            private String videosource;
            private String title;
            private String m3u8Hd_url;
            private String mp4_url;
            private String vid;
            private int playCount;
            private int replyCount;
            private String replyBoard;
            private int playersize;
            private String replyid;
            private String sectiontitle;
            private String ptime;
            private String m3u8_url;

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public String getMp4Hd_url() {
                return mp4Hd_url;
            }

            public void setMp4Hd_url(String mp4Hd_url) {
                this.mp4Hd_url = mp4Hd_url;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getVideosource() {
                return videosource;
            }

            public void setVideosource(String videosource) {
                this.videosource = videosource;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getM3u8Hd_url() {
                return m3u8Hd_url;
            }

            public void setM3u8Hd_url(String m3u8Hd_url) {
                this.m3u8Hd_url = m3u8Hd_url;
            }

            public String getMp4_url() {
                return mp4_url;
            }

            public void setMp4_url(String mp4_url) {
                this.mp4_url = mp4_url;
            }

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public int getPlayCount() {
                return playCount;
            }

            public void setPlayCount(int playCount) {
                this.playCount = playCount;
            }

            public int getReplyCount() {
                return replyCount;
            }

            public void setReplyCount(int replyCount) {
                this.replyCount = replyCount;
            }

            public String getReplyBoard() {
                return replyBoard;
            }

            public void setReplyBoard(String replyBoard) {
                this.replyBoard = replyBoard;
            }

            public int getPlayersize() {
                return playersize;
            }

            public void setPlayersize(int playersize) {
                this.playersize = playersize;
            }

            public String getReplyid() {
                return replyid;
            }

            public void setReplyid(String replyid) {
                this.replyid = replyid;
            }

            public String getSectiontitle() {
                return sectiontitle;
            }

            public void setSectiontitle(String sectiontitle) {
                this.sectiontitle = sectiontitle;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public String getM3u8_url() {
                return m3u8_url;
            }

            public void setM3u8_url(String m3u8_url) {
                this.m3u8_url = m3u8_url;
            }
        }

        public static class ImgextraBean {
            /**
             * imgsrc : http://cms-bucket.nosdn.127.net/3276f7e7ff5244d0807a4337a554f76820170730101738.jpeg
             */

            private String imgsrc;

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }
        }

        public static class AdsBean {
            /**
             * subtitle :
             * skipType : photoset
             * skipID : 00AN0001|2268796
             * tag : photoset
             * title : 解放军建军90周年阅兵 海军女兵亮相
             * imgsrc : http://cms-bucket.nosdn.127.net/15b189490c3e40d28cecb4178f8b1e8b20170730110200.jpeg
             * url : 00AN0001|2268796
             */

            private String subtitle;
            private String skipType;
            private String skipID;
            private String tag;
            private String title;
            private String imgsrc;
            private String url;

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getSkipType() {
                return skipType;
            }

            public void setSkipType(String skipType) {
                this.skipType = skipType;
            }

            public String getSkipID() {
                return skipID;
            }

            public void setSkipID(String skipID) {
                this.skipID = skipID;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
