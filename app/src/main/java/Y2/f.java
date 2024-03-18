package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new C3871a(26);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22073Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f22074h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f22075i0;

    /* renamed from: j0  reason: collision with root package name */
    public final byte[] f22076j0;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f22073Z = str;
        this.f22074h0 = str2;
        this.f22075i0 = str3;
        this.f22076j0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC5530A.a(this.f22073Z, fVar.f22073Z) && AbstractC5530A.a(this.f22074h0, fVar.f22074h0) && AbstractC5530A.a(this.f22075i0, fVar.f22075i0) && Arrays.equals(this.f22076j0, fVar.f22076j0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f22073Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f22074h0;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f22075i0;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f22076j0) + ((i14 + i12) * 31);
    }

    @Override // Y2.j
    public final String toString() {
        return this.f22082Y + ": mimeType=" + this.f22073Z + ", filename=" + this.f22074h0 + ", description=" + this.f22075i0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22073Z);
        parcel.writeString(this.f22074h0);
        parcel.writeString(this.f22075i0);
        parcel.writeByteArray(this.f22076j0);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22073Z = readString;
        this.f22074h0 = parcel.readString();
        this.f22075i0 = parcel.readString();
        this.f22076j0 = parcel.createByteArray();
    }
}
