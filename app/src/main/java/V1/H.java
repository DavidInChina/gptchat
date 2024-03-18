package V1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new C1461b(2);

    /* renamed from: Y  reason: collision with root package name */
    public String f18025Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f18026Z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18025Y);
        parcel.writeInt(this.f18026Z);
    }
}
