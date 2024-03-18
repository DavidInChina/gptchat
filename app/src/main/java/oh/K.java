package oh;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new w7.t(21);

    /* renamed from: Y  reason: collision with root package name */
    public final Float f41394Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Float f41395Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Float f41396h0;

    public K(Float f6, Float f10, Float f11) {
        this.f41394Y = f6;
        this.f41395Z = f10;
        this.f41396h0 = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (AbstractC3557B.K(this.f41394Y, k10.f41394Y) && AbstractC3557B.K(this.f41395Z, k10.f41395Z) && AbstractC3557B.K(this.f41396h0, k10.f41396h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Float f6 = this.f41394Y;
        if (f6 == null) {
            i10 = 0;
        } else {
            i10 = f6.hashCode();
        }
        int i13 = i10 * 31;
        Float f10 = this.f41395Z;
        if (f10 == null) {
            i11 = 0;
        } else {
            i11 = f10.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Float f11 = this.f41396h0;
        if (f11 != null) {
            i12 = f11.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "ZoomableSavedState(offsetX=" + this.f41394Y + ", offsetY=" + this.f41395Z + ", userZoom=" + this.f41396h0 + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        Float f6 = this.f41394Y;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f6.floatValue());
        }
        Float f10 = this.f41395Z;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        Float f11 = this.f41396h0;
        if (f11 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(f11.floatValue());
    }
}
