package androidx.versionedparcelable;

import I3.b;
import I3.c;
import Y2.n;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new n(16);

    /* renamed from: Y  reason: collision with root package name */
    public final c f25513Y;

    public ParcelImpl(Parcel parcel) {
        this.f25513Y = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).i(this.f25513Y);
    }
}
