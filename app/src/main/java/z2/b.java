package Z2;

import Gi.e;
import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new n(4);

    /* renamed from: Y  reason: collision with root package name */
    public final long f23143Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f23144Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f23145h0;

    public b(long j6, int i10, long j10) {
        boolean z10;
        if (j6 < j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.l(z10);
        this.f23143Y = j6;
        this.f23144Z = j10;
        this.f23145h0 = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f23143Y == bVar.f23143Y && this.f23144Z == bVar.f23144Z && this.f23145h0 == bVar.f23145h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23143Y), Long.valueOf(this.f23144Z), Integer.valueOf(this.f23145h0)});
    }

    public final String toString() {
        int i10 = AbstractC5530A.f45131a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f23143Y + ", endTimeMs=" + this.f23144Z + ", speedDivisor=" + this.f23145h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f23143Y);
        parcel.writeLong(this.f23144Z);
        parcel.writeInt(this.f23145h0);
    }
}
