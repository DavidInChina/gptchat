package a3;

import Y2.n;
import android.os.Parcel;
import android.os.Parcelable;
import s2.u;

/* loaded from: classes.dex */
public final class j extends AbstractC1924b {
    public static final Parcelable.Creator<j> CREATOR = new n(10);

    /* renamed from: Y  reason: collision with root package name */
    public final long f23895Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f23896Z;

    public j(long j6, long j10) {
        this.f23895Y = j6;
        this.f23896Z = j10;
    }

    public static long a(long j6, u uVar) {
        long u10 = uVar.u();
        if ((128 & u10) != 0) {
            return 8589934591L & ((((u10 & 1) << 32) | uVar.v()) + j6);
        }
        return -9223372036854775807L;
    }

    @Override // a3.AbstractC1924b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f23895Y);
        sb2.append(", playbackPositionUs= ");
        return android.gov.nist.core.a.m(sb2, this.f23896Z, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f23895Y);
        parcel.writeLong(this.f23896Z);
    }
}
