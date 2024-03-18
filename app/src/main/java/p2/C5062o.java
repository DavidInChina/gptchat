package p2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import java.util.UUID;
import s2.AbstractC5530A;

/* renamed from: p2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5062o implements Parcelable {
    public static final Parcelable.Creator<C5062o> CREATOR = new C3871a(9);

    /* renamed from: Y  reason: collision with root package name */
    public int f42206Y;

    /* renamed from: Z  reason: collision with root package name */
    public final UUID f42207Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f42208h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f42209i0;

    /* renamed from: j0  reason: collision with root package name */
    public final byte[] f42210j0;

    public C5062o(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f42207Z = uuid;
        this.f42208h0 = str;
        str2.getClass();
        this.f42209i0 = str2;
        this.f42210j0 = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = AbstractC5058k.f42084a;
        UUID uuid3 = this.f42207Z;
        if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5062o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5062o c5062o = (C5062o) obj;
        if (!AbstractC5530A.a(this.f42208h0, c5062o.f42208h0) || !AbstractC5530A.a(this.f42209i0, c5062o.f42209i0) || !AbstractC5530A.a(this.f42207Z, c5062o.f42207Z) || !Arrays.equals(this.f42210j0, c5062o.f42210j0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        if (this.f42206Y == 0) {
            int hashCode = this.f42207Z.hashCode() * 31;
            String str = this.f42208h0;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            this.f42206Y = Arrays.hashCode(this.f42210j0) + E9.f.v(this.f42209i0, (hashCode + i10) * 31, 31);
        }
        return this.f42206Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f42207Z;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f42208h0);
        parcel.writeString(this.f42209i0);
        parcel.writeByteArray(this.f42210j0);
    }

    public C5062o(Parcel parcel) {
        this.f42207Z = new UUID(parcel.readLong(), parcel.readLong());
        this.f42208h0 = parcel.readString();
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f42209i0 = readString;
        this.f42210j0 = parcel.createByteArray();
    }
}
