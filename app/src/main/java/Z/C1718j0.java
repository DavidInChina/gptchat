package Z;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;

/* renamed from: Z.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1718j0 extends S0 implements Parcelable {
    public static final Parcelable.Creator<C1718j0> CREATOR = new C3871a(4);

    public C1718j0(float f6) {
        this.f22567Z = new R0(f6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(h());
    }
}
