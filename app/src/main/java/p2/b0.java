package p2;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class b0 implements Comparable, Parcelable, AbstractC5057j {
    public static final Parcelable.Creator<b0> CREATOR = new C3871a(11);

    /* renamed from: i0  reason: collision with root package name */
    public static final String f41994i0 = Integer.toString(0, 36);

    /* renamed from: j0  reason: collision with root package name */
    public static final String f41995j0 = Integer.toString(1, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f41996k0 = Integer.toString(2, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f41997Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f41998Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f41999h0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public b0(int i10, int i11, int i12) {
        this.f41997Y = i10;
        this.f41998Z = i11;
        this.f41999h0 = i12;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        int i10 = this.f41997Y;
        if (i10 != 0) {
            bundle.putInt(f41994i0, i10);
        }
        int i11 = this.f41998Z;
        if (i11 != 0) {
            bundle.putInt(f41995j0, i11);
        }
        int i12 = this.f41999h0;
        if (i12 != 0) {
            bundle.putInt(f41996k0, i12);
        }
        return bundle;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b0 b0Var = (b0) obj;
        int i10 = this.f41997Y - b0Var.f41997Y;
        if (i10 == 0) {
            int i11 = this.f41998Z - b0Var.f41998Z;
            if (i11 == 0) {
                return this.f41999h0 - b0Var.f41999h0;
            }
            return i11;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f41997Y == b0Var.f41997Y && this.f41998Z == b0Var.f41998Z && this.f41999h0 == b0Var.f41999h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f41997Y * 31) + this.f41998Z) * 31) + this.f41999h0;
    }

    public final String toString() {
        return this.f41997Y + Separators.DOT + this.f41998Z + Separators.DOT + this.f41999h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41997Y);
        parcel.writeInt(this.f41998Z);
        parcel.writeInt(this.f41999h0);
    }

    public b0(Parcel parcel) {
        this.f41997Y = parcel.readInt();
        this.f41998Z = parcel.readInt();
        this.f41999h0 = parcel.readInt();
    }
}
