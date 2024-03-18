package t2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import p2.C5065s;
import p2.J;
import p2.L;
import s2.AbstractC5530A;

/* renamed from: t2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5664a implements L {
    public static final Parcelable.Creator<C5664a> CREATOR = new C3871a(12);

    /* renamed from: Y  reason: collision with root package name */
    public final String f45627Y;

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f45628Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f45629h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f45630i0;

    public C5664a(String str, byte[] bArr, int i10, int i11) {
        this.f45627Y = str;
        this.f45628Z = bArr;
        this.f45629h0 = i10;
        this.f45630i0 = i11;
    }

    @Override // p2.L
    public final /* synthetic */ C5065s b() {
        return null;
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
        if (obj == null || C5664a.class != obj.getClass()) {
            return false;
        }
        C5664a c5664a = (C5664a) obj;
        if (this.f45627Y.equals(c5664a.f45627Y) && Arrays.equals(this.f45628Z, c5664a.f45628Z) && this.f45629h0 == c5664a.f45629h0 && this.f45630i0 == c5664a.f45630i0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f45628Z) + E9.f.v(this.f45627Y, 527, 31)) * 31) + this.f45629h0) * 31) + this.f45630i0;
    }

    public final String toString() {
        String str;
        boolean z10;
        boolean z11;
        byte[] bArr = this.f45628Z;
        int i10 = this.f45630i0;
        if (i10 != 1) {
            if (i10 != 23) {
                if (i10 != 67) {
                    int i11 = AbstractC5530A.f45131a;
                    StringBuilder sb2 = new StringBuilder(bArr.length * 2);
                    for (int i12 = 0; i12 < bArr.length; i12++) {
                        sb2.append(Character.forDigit((bArr[i12] >> 4) & 15, 16));
                        sb2.append(Character.forDigit(bArr[i12] & 15, 16));
                    }
                    str = sb2.toString();
                } else {
                    int i13 = AbstractC5530A.f45131a;
                    if (bArr.length == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Gi.e.l(z11);
                    str = String.valueOf(bArr[3] | (bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8));
                }
            } else {
                int i14 = AbstractC5530A.f45131a;
                if (bArr.length == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Gi.e.l(z10);
                str = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | ((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8)));
            }
        } else {
            str = AbstractC5530A.m(bArr);
        }
        return "mdta: key=" + this.f45627Y + ", value=" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f45627Y);
        parcel.writeByteArray(this.f45628Z);
        parcel.writeInt(this.f45629h0);
        parcel.writeInt(this.f45630i0);
    }

    public C5664a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f45627Y = readString;
        this.f45628Z = parcel.createByteArray();
        this.f45629h0 = parcel.readInt();
        this.f45630i0 = parcel.readInt();
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}
