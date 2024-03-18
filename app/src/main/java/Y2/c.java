package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new C3871a(23);

    /* renamed from: Z  reason: collision with root package name */
    public final String f22059Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f22060h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f22061i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f22062j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f22063k0;

    /* renamed from: l0  reason: collision with root package name */
    public final j[] f22064l0;

    public c(String str, int i10, int i11, long j6, long j10, j[] jVarArr) {
        super("CHAP");
        this.f22059Z = str;
        this.f22060h0 = i10;
        this.f22061i0 = i11;
        this.f22062j0 = j6;
        this.f22063k0 = j10;
        this.f22064l0 = jVarArr;
    }

    @Override // Y2.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f22060h0 == cVar.f22060h0 && this.f22061i0 == cVar.f22061i0 && this.f22062j0 == cVar.f22062j0 && this.f22063k0 == cVar.f22063k0 && AbstractC5530A.a(this.f22059Z, cVar.f22059Z) && Arrays.equals(this.f22064l0, cVar.f22064l0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f22060h0) * 31) + this.f22061i0) * 31) + ((int) this.f22062j0)) * 31) + ((int) this.f22063k0)) * 31;
        String str = this.f22059Z;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f22059Z);
        parcel.writeInt(this.f22060h0);
        parcel.writeInt(this.f22061i0);
        parcel.writeLong(this.f22062j0);
        parcel.writeLong(this.f22063k0);
        j[] jVarArr = this.f22064l0;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = AbstractC5530A.f45131a;
        this.f22059Z = readString;
        this.f22060h0 = parcel.readInt();
        this.f22061i0 = parcel.readInt();
        this.f22062j0 = parcel.readLong();
        this.f22063k0 = parcel.readLong();
        int readInt = parcel.readInt();
        this.f22064l0 = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f22064l0[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
