package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new C3871a(24);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22065Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f22066h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f22067i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String[] f22068j0;

    /* renamed from: k0  reason: collision with root package name */
    public final j[] f22069k0;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f22065Z = str;
        this.f22066h0 = z10;
        this.f22067i0 = z11;
        this.f22068j0 = strArr;
        this.f22069k0 = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f22066h0 == dVar.f22066h0 && this.f22067i0 == dVar.f22067i0 && AbstractC5530A.a(this.f22065Z, dVar.f22065Z) && Arrays.equals(this.f22068j0, dVar.f22068j0) && Arrays.equals(this.f22069k0, dVar.f22069k0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f22066h0 ? 1 : 0)) * 31) + (this.f22067i0 ? 1 : 0)) * 31;
        String str = this.f22065Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22065Z);
        parcel.writeByte(this.f22066h0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f22067i0 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f22068j0);
        j[] jVarArr = this.f22069k0;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22065Z = readString;
        boolean z10 = true;
        this.f22066h0 = parcel.readByte() != 0;
        this.f22067i0 = parcel.readByte() == 0 ? false : z10;
        this.f22068j0 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f22069k0 = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f22069k0[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
