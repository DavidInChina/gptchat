package Z2;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import p2.C5065s;
import p2.J;
import p2.L;

/* loaded from: classes.dex */
public final class a implements L {
    public static final Parcelable.Creator<a> CREATOR = new n(2);

    /* renamed from: Y  reason: collision with root package name */
    public final long f23138Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f23139Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f23140h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f23141i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f23142j0;

    public a(long j6, long j10, long j11, long j12, long j13) {
        this.f23138Y = j6;
        this.f23139Z = j10;
        this.f23140h0 = j11;
        this.f23141i0 = j12;
        this.f23142j0 = j13;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f23138Y == aVar.f23138Y && this.f23139Z == aVar.f23139Z && this.f23140h0 == aVar.f23140h0 && this.f23141i0 == aVar.f23141i0 && this.f23142j0 == aVar.f23142j0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c02 = P4.a.c0(this.f23139Z);
        int c03 = P4.a.c0(this.f23140h0);
        int c04 = P4.a.c0(this.f23141i0);
        return P4.a.c0(this.f23142j0) + ((c04 + ((c03 + ((c02 + ((P4.a.c0(this.f23138Y) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f23138Y + ", photoSize=" + this.f23139Z + ", photoPresentationTimestampUs=" + this.f23140h0 + ", videoStartPosition=" + this.f23141i0 + ", videoSize=" + this.f23142j0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f23138Y);
        parcel.writeLong(this.f23139Z);
        parcel.writeLong(this.f23140h0);
        parcel.writeLong(this.f23141i0);
        parcel.writeLong(this.f23142j0);
    }

    public a(Parcel parcel) {
        this.f23138Y = parcel.readLong();
        this.f23139Z = parcel.readLong();
        this.f23140h0 = parcel.readLong();
        this.f23141i0 = parcel.readLong();
        this.f23142j0 = parcel.readLong();
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}
