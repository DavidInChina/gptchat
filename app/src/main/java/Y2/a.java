package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import p2.J;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new C3871a(21);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22054Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f22055h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f22056i0;

    /* renamed from: j0  reason: collision with root package name */
    public final byte[] f22057j0;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f22054Z = str;
        this.f22055h0 = str2;
        this.f22056i0 = i10;
        this.f22057j0 = bArr;
    }

    @Override // Y2.j, p2.L
    public final void d(J j6) {
        j6.a(this.f22056i0, this.f22057j0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f22056i0 == aVar.f22056i0 && AbstractC5530A.a(this.f22054Z, aVar.f22054Z) && AbstractC5530A.a(this.f22055h0, aVar.f22055h0) && Arrays.equals(this.f22057j0, aVar.f22057j0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.f22056i0) * 31;
        int i12 = 0;
        String str = this.f22054Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f22055h0;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f22057j0) + ((i13 + i12) * 31);
    }

    @Override // Y2.j
    public final String toString() {
        return this.f22082Y + ": mimeType=" + this.f22054Z + ", description=" + this.f22055h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22054Z);
        parcel.writeString(this.f22055h0);
        parcel.writeInt(this.f22056i0);
        parcel.writeByteArray(this.f22057j0);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22054Z = readString;
        this.f22055h0 = parcel.readString();
        this.f22056i0 = parcel.readInt();
        this.f22057j0 = parcel.createByteArray();
    }
}
