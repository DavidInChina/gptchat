package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new C3871a(22);

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f22058Z;

    public b(String str, byte[] bArr) {
        super(str);
        this.f22058Z = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f22082Y.equals(bVar.f22082Y) && Arrays.equals(this.f22058Z, bVar.f22058Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22058Z) + E9.f.v(this.f22082Y, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22082Y);
        parcel.writeByteArray(this.f22058Z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22058Z = parcel.createByteArray();
    }
}
