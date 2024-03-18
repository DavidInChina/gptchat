package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new C3871a(25);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22070Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f22071h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f22072i0;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f22070Z = str;
        this.f22071h0 = str2;
        this.f22072i0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC5530A.a(this.f22071h0, eVar.f22071h0) && AbstractC5530A.a(this.f22070Z, eVar.f22070Z) && AbstractC5530A.a(this.f22072i0, eVar.f22072i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f22070Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f22071h0;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f22072i0;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }

    @Override // Y2.j
    public final String toString() {
        return this.f22082Y + ": language=" + this.f22070Z + ", description=" + this.f22071h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22082Y);
        parcel.writeString(this.f22070Z);
        parcel.writeString(this.f22072i0);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22070Z = readString;
        this.f22071h0 = parcel.readString();
        this.f22072i0 = parcel.readString();
    }
}
