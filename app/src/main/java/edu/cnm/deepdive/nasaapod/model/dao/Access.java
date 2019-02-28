package edu.cnm.deepdive.nasaapod.model.dao;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import edu.cnm.deepdive.nasaapod.model.entity.Apod;
import java.util.Date;

@Entity(foreignKeys = @ForeignKey(entity = Apod.class,
    parentColumns = "apod_id", childColumns = "apod_id",
    onDelete = ForeignKey.CASCADE)
)

public class Access {

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getApodID() {
    return apodID;
  }

  public void setApodID(long apodID) {
    this.apodID = apodID;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  @ColumnInfo(name = "access_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo (name = "apod_id", index = true)
  private long apodID;


  private Date timestamp = new Date();

}
