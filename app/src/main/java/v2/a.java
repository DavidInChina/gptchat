package V2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import p2.C5065s;
import p2.J;
import p2.L;
import p2.r;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class a implements L {
    public static final Parcelable.Creator<a> CREATOR = new C3871a(16);

    /* renamed from: l0  reason: collision with root package name */
    public static final C5065s f18324l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C5065s f18325m0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f18326Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f18327Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f18328h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f18329i0;

    /* renamed from: j0  reason: collision with root package name */
    public final byte[] f18330j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f18331k0;

    static {
        r rVar = new r();
        rVar.f42237k = "application/id3";
        f18324l0 = rVar.a();
        r rVar2 = new r();
        rVar2.f42237k = "application/x-scte35";
        f18325m0 = rVar2.a();
    }

    public a(String str, String str2, long j6, long j10, byte[] bArr) {
        this.f18326Y = str;
        this.f18327Z = str2;
        this.f18328h0 = j6;
        this.f18329i0 = j10;
        this.f18330j0 = bArr;
    }

    @Override // p2.L
    public final C5065s b() {
        String str = this.f18326Y;
        str.getClass();
        char c10 = '\uffff';
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f18325m0;
            case 1:
            case 2:
                return f18324l0;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p2.L
    public final byte[] e() {
        if (b() != null) {
            return this.f18330j0;
        }
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
        if (this.f18328h0 == aVar.f18328h0 && this.f18329i0 == aVar.f18329i0 && AbstractC5530A.a(this.f18326Y, aVar.f18326Y) && AbstractC5530A.a(this.f18327Z, aVar.f18327Z) && Arrays.equals(this.f18330j0, aVar.f18330j0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f18331k0 == 0) {
            int i11 = 0;
            String str = this.f18326Y;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f18327Z;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j6 = this.f18328h0;
            long j10 = this.f18329i0;
            this.f18331k0 = Arrays.hashCode(this.f18330j0) + ((((((i12 + i11) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f18331k0;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f18326Y + ", id=" + this.f18329i0 + ", durationMs=" + this.f18328h0 + ", value=" + this.f18327Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18326Y);
        parcel.writeString(this.f18327Z);
        parcel.writeLong(this.f18328h0);
        parcel.writeLong(this.f18329i0);
        parcel.writeByteArray(this.f18330j0);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f18326Y = readString;
        this.f18327Z = parcel.readString();
        this.f18328h0 = parcel.readLong();
        this.f18329i0 = parcel.readLong();
        this.f18330j0 = parcel.createByteArray();
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}
