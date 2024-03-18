package V1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new C1461b(3);

    /* renamed from: Y  reason: collision with root package name */
    public ArrayList f18070Y;

    /* renamed from: Z  reason: collision with root package name */
    public ArrayList f18071Z;

    /* renamed from: h0  reason: collision with root package name */
    public C1462c[] f18072h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f18073i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f18074j0;

    /* renamed from: k0  reason: collision with root package name */
    public ArrayList f18075k0;

    /* renamed from: l0  reason: collision with root package name */
    public ArrayList f18076l0;

    /* renamed from: m0  reason: collision with root package name */
    public ArrayList f18077m0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f18070Y);
        parcel.writeStringList(this.f18071Z);
        parcel.writeTypedArray(this.f18072h0, i10);
        parcel.writeInt(this.f18073i0);
        parcel.writeString(this.f18074j0);
        parcel.writeStringList(this.f18075k0);
        parcel.writeTypedList(this.f18076l0);
        parcel.writeTypedList(this.f18077m0);
    }
}
