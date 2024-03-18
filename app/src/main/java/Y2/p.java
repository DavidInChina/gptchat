package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class p extends j {
    public static final Parcelable.Creator<p> CREATOR = new n(1);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22096Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f22097h0;

    public p(String str, String str2, String str3) {
        super(str);
        this.f22096Z = str2;
        this.f22097h0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f22082Y.equals(pVar.f22082Y) && AbstractC5530A.a(this.f22096Z, pVar.f22096Z) && AbstractC5530A.a(this.f22097h0, pVar.f22097h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f22082Y, 527, 31);
        int i11 = 0;
        String str = this.f22096Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (v10 + i10) * 31;
        String str2 = this.f22097h0;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // Y2.j
    public final String toString() {
        return this.f22082Y + ": url=" + this.f22097h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22082Y);
        parcel.writeString(this.f22096Z);
        parcel.writeString(this.f22097h0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22096Z = parcel.readString();
        this.f22097h0 = parcel.readString();
    }
}
