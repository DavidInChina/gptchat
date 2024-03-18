package Y2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new C3871a(28);

    /* renamed from: Z  reason: collision with root package name */
    public final int f22086Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f22087h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f22088i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int[] f22089j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int[] f22090k0;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f22086Z = i10;
        this.f22087h0 = i11;
        this.f22088i0 = i12;
        this.f22089j0 = iArr;
        this.f22090k0 = iArr2;
    }

    @Override // Y2.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f22086Z == lVar.f22086Z && this.f22087h0 == lVar.f22087h0 && this.f22088i0 == lVar.f22088i0 && Arrays.equals(this.f22089j0, lVar.f22089j0) && Arrays.equals(this.f22090k0, lVar.f22090k0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f22089j0);
        return Arrays.hashCode(this.f22090k0) + ((hashCode + ((((((527 + this.f22086Z) * 31) + this.f22087h0) * 31) + this.f22088i0) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f22086Z);
        parcel.writeInt(this.f22087h0);
        parcel.writeInt(this.f22088i0);
        parcel.writeIntArray(this.f22089j0);
        parcel.writeIntArray(this.f22090k0);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f22086Z = parcel.readInt();
        this.f22087h0 = parcel.readInt();
        this.f22088i0 = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = AbstractC5530A.f45131a;
        this.f22089j0 = createIntArray;
        this.f22090k0 = parcel.createIntArray();
    }
}
