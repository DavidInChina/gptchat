package Z;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;

/* renamed from: Z.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1720k0 extends U0 implements Parcelable {
    public static final Parcelable.Creator<C1720k0> CREATOR = new C3871a(5);

    public C1720k0(int i10) {
        this.f22574Z = new T0(i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(h());
    }
}
