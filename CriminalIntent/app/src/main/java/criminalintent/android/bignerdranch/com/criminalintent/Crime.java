package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by lizhuoli on 15/3/26.
 */
public class Crime {
    private UUID mid;//UUID is an immutable representation of a 128-bit universally unique identifier
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mid = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getMid() {
        return mid;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
