package r8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.t;

/* renamed from: r8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5372a implements Parcelable {
    public static final Parcelable.Creator<AbstractC5372a> CREATOR = new t(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5373b c5373b = (C5373b) this;
        parcel.writeParcelable(c5373b.f44461Y, 0);
        parcel.writeInt(c5373b.f44462Z ? 1 : 0);
    }
}
