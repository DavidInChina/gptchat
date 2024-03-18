package Z;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;

/* renamed from: Z.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1722l0 extends W0 implements Parcelable {
    public static final Parcelable.Creator<C1722l0> CREATOR = new C3871a(6);

    public C1722l0(long j6) {
        this.f22582Z = new V0(j6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(((V0) j0.p.s(this.f22582Z, this)).f22577c);
    }
}
