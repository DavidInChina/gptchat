package w3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w3.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6114v implements Parcelable {
    public static final Parcelable.Creator<C6114v> CREATOR = new Y2.n(13);

    /* renamed from: Y  reason: collision with root package name */
    public int f47989Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f47990Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f47991h0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47989Y);
        parcel.writeInt(this.f47990Z);
        parcel.writeInt(this.f47991h0 ? 1 : 0);
    }
}
