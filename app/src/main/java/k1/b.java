package K1;

import android.os.Parcel;
import android.os.Parcelable;
import q.k1;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: Y  reason: collision with root package name */
    public final Parcelable f9325Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final a f9324Z = new b();
    public static final Parcelable.Creator<b> CREATOR = new k1(4);

    public b() {
        this.f9325Y = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9325Y, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f9325Y = parcelable == f9324Z ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f9325Y = readParcelable == null ? f9324Z : readParcelable;
    }
}
