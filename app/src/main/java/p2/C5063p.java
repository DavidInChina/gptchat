package p2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import s2.AbstractC5530A;

/* renamed from: p2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5063p implements Comparator, Parcelable {
    public static final Parcelable.Creator<C5063p> CREATOR = new C3871a(8);

    /* renamed from: Y  reason: collision with root package name */
    public final C5062o[] f42214Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f42215Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f42216h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f42217i0;

    public C5063p(String str, boolean z10, C5062o... c5062oArr) {
        this.f42216h0 = str;
        c5062oArr = z10 ? (C5062o[]) c5062oArr.clone() : c5062oArr;
        this.f42214Y = c5062oArr;
        this.f42217i0 = c5062oArr.length;
        Arrays.sort(c5062oArr, this);
    }

    public final C5063p a(String str) {
        if (AbstractC5530A.a(this.f42216h0, str)) {
            return this;
        }
        return new C5063p(str, false, this.f42214Y);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C5062o c5062o = (C5062o) obj;
        C5062o c5062o2 = (C5062o) obj2;
        UUID uuid = AbstractC5058k.f42084a;
        if (uuid.equals(c5062o.f42207Z)) {
            if (uuid.equals(c5062o2.f42207Z)) {
                return 0;
            }
            return 1;
        }
        return c5062o.f42207Z.compareTo(c5062o2.f42207Z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5063p.class != obj.getClass()) {
            return false;
        }
        C5063p c5063p = (C5063p) obj;
        if (AbstractC5530A.a(this.f42216h0, c5063p.f42216h0) && Arrays.equals(this.f42214Y, c5063p.f42214Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f42215Z == 0) {
            String str = this.f42216h0;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            this.f42215Z = (i10 * 31) + Arrays.hashCode(this.f42214Y);
        }
        return this.f42215Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f42216h0);
        parcel.writeTypedArray(this.f42214Y, 0);
    }

    public C5063p(Parcel parcel) {
        this.f42216h0 = parcel.readString();
        C5062o[] c5062oArr = (C5062o[]) parcel.createTypedArray(C5062o.CREATOR);
        int i10 = AbstractC5530A.f45131a;
        this.f42214Y = c5062oArr;
        this.f42217i0 = c5062oArr.length;
    }
}
