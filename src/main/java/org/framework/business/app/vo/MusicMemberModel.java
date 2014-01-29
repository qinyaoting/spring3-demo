package org.framework.business.app.vo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 * 
 * @author songjian @Mar 4, 2013
 */
public class MusicMemberModel {
	
	//大歌星网站的sid
	private String sessionId;

	private String uid;
	
	private String oauthId;
	
	//昵称
	private String uname;
	
	//性别
	private int sex;

	private int level;
	
	private int flowers;
	
	private int shares;
	
	private int polites;
	
	public byte outhType;//0x01 新浪 0x02 腾讯微博
	
	//我的歌曲
	private List<MusicInfo> myMusics;
	
	//我的收藏
	private List<MusicInfo> myCollects;
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}



	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
	}



	public String getOauthId() {
		return oauthId;
	}



	public void setOauthId(String oauthId) {
		this.oauthId = oauthId;
	}



	public int getSex() {
		return sex;
	}



	public void setSex(int sex) {
		this.sex = sex;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}



	public int getFlowers() {
		return flowers;
	}



	public void setFlowers(int flowers) {
		this.flowers = flowers;
	}



	public int getShares() {
		return shares;
	}



	public void setShares(int shares) {
		this.shares = shares;
	}



	public int getPolites() {
		return polites;
	}



	public void setPolites(int polites) {
		this.polites = polites;
	}



	public byte getOuthType() {
		return outhType;
	}



	public void setOuthType(byte outhType) {
		this.outhType = outhType;
	}



	public List<MusicInfo> getMyMusics() {
		return myMusics;
	}



	public void setMyMusics(List<MusicInfo> myMusics) {
		this.myMusics = myMusics;
	}



	public List<MusicInfo> getMyCollects() {
		return myCollects;
	}



	public void setMyCollects(List<MusicInfo> myCollects) {
		this.myCollects = myCollects;
	}
	
	/**
	 * 
	 * 音乐列表row详情
	 * @author songjian @Mar 4, 2013
	 */
	public class MusicInfo{

		//音乐标识
		private String mid;
		
		//音乐标题/名称
		private String title;
		
		//string时间(显示的)
		private String dateStr;
		
		//music属性
		private Date date;

		public String getMid() {
			return mid;
		}

		public void setMid(String mid) {
			this.mid = mid;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDateStr() {
			return dateStr;
		}

		public void setDateStr(String dateStr) {
			this.dateStr = dateStr;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
		
	}
	
	/**
	 * key:yyyy-mouth
	 * 
	 * @author songjian @Mar 4, 2013
	 */
	public class News implements Map<String,List<String>>{

		@Override
		public void clear() {
			
		}

		@Override
		public boolean containsKey(Object key) {
			return false;
		}

		@Override
		public boolean containsValue(Object value) {
			return false;
		}

		@Override
		public Set<java.util.Map.Entry<String, List<String>>> entrySet() {
			return null;
		}

		@Override
		public List<String> get(Object key) {
			return null;
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public Set<String> keySet() {
			return null;
		}

		@Override
		public List<String> put(String key, List<String> value) {
			return null;
		}

		@Override
		public void putAll(Map<? extends String, ? extends List<String>> m) {
			
		}

		@Override
		public List<String> remove(Object key) {
			return null;
		}

		@Override
		public int size() {
			return 0;
		}

		@Override
		public Collection<List<String>> values() {
			return null;
		}
	 
		
	}
}
