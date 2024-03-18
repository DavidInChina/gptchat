package W2;

import E9.f;
import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import p2.C5065s;
import p2.J;
import p2.L;
import s2.AbstractC5530A;
import s2.u;
import w8.e;

/* loaded from: classes2.dex */
public final class a implements L {
    public static final Parcelable.Creator<a> CREATOR = new C3871a(17);

    /* renamed from: Y  reason: collision with root package name */
    public final int f20684Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f20685Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f20686h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f20687i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f20688j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f20689k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f20690l0;

    /* renamed from: m0  reason: collision with root package name */
    public final byte[] f20691m0;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f20684Y = i10;
        this.f20685Z = str;
        this.f20686h0 = str2;
        this.f20687i0 = i11;
        this.f20688j0 = i12;
        this.f20689k0 = i13;
        this.f20690l0 = i14;
        this.f20691m0 = bArr;
    }

    public static a a(u uVar) {
        int g10 = uVar.g();
        String s10 = uVar.s(uVar.g(), e.f48219a);
        String s11 = uVar.s(uVar.g(), e.f48221c);
        int g11 = uVar.g();
        int g12 = uVar.g();
        int g13 = uVar.g();
        int g14 = uVar.g();
        int g15 = uVar.g();
        byte[] bArr = new byte[g15];
        uVar.e(bArr, 0, g15);
        return new a(g10, s10, s11, g11, g12, g13, g14, bArr);
    }

    @Override // p2.L
    public final /* synthetic */ C5065s b() {
        return null;
    }

    @Override // p2.L
    public final void d(J j6) {
        j6.a(this.f20684Y, this.f20691m0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p2.L
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f20684Y == aVar.f20684Y && this.f20685Z.equals(aVar.f20685Z) && this.f20686h0.equals(aVar.f20686h0) && this.f20687i0 == aVar.f20687i0 && this.f20688j0 == aVar.f20688j0 && this.f20689k0 == aVar.f20689k0 && this.f20690l0 == aVar.f20690l0 && Arrays.equals(this.f20691m0, aVar.f20691m0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v10 = f.v(this.f20685Z, (527 + this.f20684Y) * 31, 31);
        return Arrays.hashCode(this.f20691m0) + ((((((((f.v(this.f20686h0, v10, 31) + this.f20687i0) * 31) + this.f20688j0) * 31) + this.f20689k0) * 31) + this.f20690l0) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f20685Z + ", description=" + this.f20686h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20684Y);
        parcel.writeString(this.f20685Z);
        parcel.writeString(this.f20686h0);
        parcel.writeInt(this.f20687i0);
        parcel.writeInt(this.f20688j0);
        parcel.writeInt(this.f20689k0);
        parcel.writeInt(this.f20690l0);
        parcel.writeByteArray(this.f20691m0);
    }

    public a(Parcel parcel) {
        this.f20684Y = parcel.readInt();
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f20685Z = readString;
        this.f20686h0 = parcel.readString();
        this.f20687i0 = parcel.readInt();
        this.f20688j0 = parcel.readInt();
        this.f20689k0 = parcel.readInt();
        this.f20690l0 = parcel.readInt();
        this.f20691m0 = parcel.createByteArray();
    }
}
