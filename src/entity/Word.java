package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Word {
private Integer id;
private String location;
private Integer frequence;
private String spell;
private String meaning;
private String exampleSentence;
private String linksrc="http://dict.youdao.com/search?le="+spell+"&q=time&keyfrom=dict.index";
private Date HistoryDate;
private Integer favorite;




public Word(){
	
};

public Word( String location, Integer frequence, String spell, Date hIstoryDate, Integer favorite) {
	super();

	this.location = location;
	this.frequence = frequence;
	this.spell = spell;
	HistoryDate = hIstoryDate;
	this.favorite = favorite;
}
public Word(Integer id, String location, Integer frequence, String spell,
		String linksrc, Date hIstoryDate, Integer favorite) {
	super();
	this.id = id;
	this.location = location;
	this.frequence = frequence;
	this.spell = spell;
	this.linksrc = linksrc;
	HistoryDate = hIstoryDate;
	this.favorite = favorite;
}

public String getExampleSentence() {
	return exampleSentence;
}

public void setExampleSentence(String exampleSentence) {
	this.exampleSentence = exampleSentence;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getMeaning() {
	return meaning;
}

public void setMeaning(String meaning) {
	this.meaning = meaning;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
			+ ((HistoryDate == null) ? 0 : HistoryDate.hashCode());
	result = prime * result + ((favorite == null) ? 0 : favorite.hashCode());
	result = prime * result + ((frequence == null) ? 0 : frequence.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((linksrc == null) ? 0 : linksrc.hashCode());
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((spell == null) ? 0 : spell.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Word other = (Word) obj;
	if (HistoryDate == null) {
		if (other.HistoryDate != null)
			return false;
	} else if (!HistoryDate.equals(other.HistoryDate))
		return false;
	if (favorite == null) {
		if (other.favorite != null)
			return false;
	} else if (!favorite.equals(other.favorite))
		return false;
	if (frequence == null) {
		if (other.frequence != null)
			return false;
	} else if (!frequence.equals(other.frequence))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (linksrc == null) {
		if (other.linksrc != null)
			return false;
	} else if (!linksrc.equals(other.linksrc))
		return false;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	if (spell == null) {
		if (other.spell != null)
			return false;
	} else if (!spell.equals(other.spell))
		return false;
	return true;
}

@Override
public String toString() {
	return "Word [id=" + id + ", spell=" + spell + ", linksrc=" + linksrc
			+ ", frequence=" + frequence + ", location=" + location
			+ ", favorite=" + favorite + ", HistoryDate=" + HistoryDate + "]";
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}



public Integer getFrequence() {
	return frequence;
}

public void setFrequence(Integer frequence) {
	this.frequence = frequence;
}

public String getSpell() {
	return spell;
}

public void setSpell(String spell) {
	this.spell = spell;
}

public String getLinksrc() {
	return linksrc;
}

public void setLinksrc(String linksrc) {
	this.linksrc = linksrc;
}

public Date getHistoryDate() {
	return HistoryDate;
}

public void setHistoryDate(Date hIstoryDate) {
	HistoryDate = hIstoryDate;
}

public Integer getFavorite() {
	return favorite;
}

public void setFavorite(Integer favorite) {
	this.favorite = favorite;
}


}
