package de.akuz.android.praisd.sdk;

import java.util.Date;

import android.os.Parcel;
import android.os.Parcelable;

public class FlattrUserData implements Parcelable {

	String city;
	String country;
	String description;
	String email;
	String firstname;
	String lastname;
	String gravatarUrl;
	String resourceLink;
	Date timestampOfRegistration;
	String homepageUrl;
	String userId;

	public final static Creator<FlattrUserData> CREATOR = new Creator<FlattrUserData>() {

		@Override
		public FlattrUserData createFromParcel(Parcel source) {
			return new FlattrUserData(source);
		}

		@Override
		public FlattrUserData[] newArray(int size) {
			return new FlattrUserData[size];
		}
	};

	public FlattrUserData() {

	}

	private FlattrUserData(Parcel source) {
		city = source.readString();
		country = source.readString();
		description = source.readString();
		email = source.readString();
		firstname = source.readString();
		lastname = source.readString();
		gravatarUrl = source.readString();
		resourceLink = source.readString();
		long timestamtp = source.readLong();
		if (timestamtp > 0) {
			timestampOfRegistration = new Date(timestamtp);
		}
		homepageUrl = source.readString();
		userId = source.readString();
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(city);
		dest.writeString(country);
		dest.writeString(description);
		dest.writeString(email);
		dest.writeString(firstname);
		dest.writeString(lastname);
		dest.writeString(gravatarUrl);
		dest.writeString(resourceLink);
		dest.writeLong(timestampOfRegistration != null ? timestampOfRegistration
				.getTime() : -1);
		dest.writeString(homepageUrl);
		dest.writeString(userId);

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGravatarUrl() {
		return gravatarUrl;
	}

	public void setGravatarUrl(String gravatarUrl) {
		this.gravatarUrl = gravatarUrl;
	}

	public String getResourceLink() {
		return resourceLink;
	}

	public void setResourceLink(String resourceLink) {
		this.resourceLink = resourceLink;
	}

	public Date getTimestampOfRegistration() {
		return timestampOfRegistration;
	}

	public void setTimestampOfRegistration(Date timestampOfRegistration) {
		this.timestampOfRegistration = timestampOfRegistration;
	}

	public String getHomepageUrl() {
		return homepageUrl;
	}

	public void setHomepageUrl(String homepageUrl) {
		this.homepageUrl = homepageUrl;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
