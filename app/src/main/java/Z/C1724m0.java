package Z;

import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;

/* renamed from: Z.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1724m0 extends Y0 implements Parcelable {
    public static final Parcelable.Creator<C1724m0> CREATOR = new q.k1(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        C1712g0 c1712g0 = C1712g0.f22623a;
        Z0 z02 = this.f22591Z;
        if (AbstractC3557B.K(z02, c1712g0)) {
            i11 = 0;
        } else if (AbstractC3557B.K(z02, o1.f22665a)) {
            i11 = 1;
        } else if (AbstractC3557B.K(z02, F0.f22489a)) {
            i11 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i11);
    }
}
