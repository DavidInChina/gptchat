package p2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import java.util.Arrays;
import java.util.List;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new C3871a(10);

    /* renamed from: Y  reason: collision with root package name */
    public final L[] f41915Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f41916Z;

    public M(List list) {
        this((L[]) list.toArray(new L[0]));
    }

    public final M a(L... lArr) {
        if (lArr.length == 0) {
            return this;
        }
        int i10 = AbstractC5530A.f45131a;
        L[] lArr2 = this.f41915Y;
        Object[] copyOf = Arrays.copyOf(lArr2, lArr2.length + lArr.length);
        System.arraycopy(lArr, 0, copyOf, lArr2.length, lArr.length);
        return new M(this.f41916Z, (L[]) copyOf);
    }

    public final M c(M m10) {
        if (m10 == null) {
            return this;
        }
        return a(m10.f41915Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m10 = (M) obj;
        if (Arrays.equals(this.f41915Y, m10.f41915Y) && this.f41916Z == m10.f41916Z) {
            return true;
        }
        return false;
    }

    public final L f(int i10) {
        return this.f41915Y[i10];
    }

    public final int g() {
        return this.f41915Y.length;
    }

    public final int hashCode() {
        return P4.a.c0(this.f41916Z) + (Arrays.hashCode(this.f41915Y) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f41915Y));
        long j6 = this.f41916Z;
        if (j6 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j6;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        L[] lArr = this.f41915Y;
        parcel.writeInt(lArr.length);
        for (L l10 : lArr) {
            parcel.writeParcelable(l10, 0);
        }
        parcel.writeLong(this.f41916Z);
    }

    public M(L... lArr) {
        this(-9223372036854775807L, lArr);
    }

    public M(long j6, L... lArr) {
        this.f41916Z = j6;
        this.f41915Y = lArr;
    }

    public M(Parcel parcel) {
        this.f41915Y = new L[parcel.readInt()];
        int i10 = 0;
        while (true) {
            L[] lArr = this.f41915Y;
            if (i10 < lArr.length) {
                lArr[i10] = (L) parcel.readParcelable(L.class.getClassLoader());
                i10++;
            } else {
                this.f41916Z = parcel.readLong();
                return;
            }
        }
    }
}
