package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new C3871a(29);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22091Z;

    /* renamed from: h0  reason: collision with root package name */
    public final byte[] f22092h0;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f22091Z = str;
        this.f22092h0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (AbstractC5530A.a(this.f22091Z, mVar.f22091Z) && Arrays.equals(this.f22092h0, mVar.f22092h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f22091Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f22092h0) + ((527 + i10) * 31);
    }

    @Override // Y2.j
    public final String toString() {
        return this.f22082Y + ": owner=" + this.f22091Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22091Z);
        parcel.writeByteArray(this.f22092h0);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22091Z = readString;
        this.f22092h0 = parcel.createByteArray();
    }
}
