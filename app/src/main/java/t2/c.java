package t2;

import android.os.Parcel;
import android.os.Parcelable;
import j.C3871a;
import p2.C5065s;
import p2.J;
import p2.L;

/* loaded from: classes2.dex */
public final class c implements L {
    public static final Parcelable.Creator<c> CREATOR = new C3871a(14);

    /* renamed from: Y  reason: collision with root package name */
    public final long f45633Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f45634Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f45635h0;

    public c(long j6, long j10, long j11) {
        this.f45633Y = j6;
        this.f45634Z = j10;
        this.f45635h0 = j11;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f45633Y == cVar.f45633Y && this.f45634Z == cVar.f45634Z && this.f45635h0 == cVar.f45635h0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c02 = P4.a.c0(this.f45634Z);
        return P4.a.c0(this.f45635h0) + ((c02 + ((P4.a.c0(this.f45633Y) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f45633Y + ", modification time=" + this.f45634Z + ", timescale=" + this.f45635h0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f45633Y);
        parcel.writeLong(this.f45634Z);
        parcel.writeLong(this.f45635h0);
    }

    public c(Parcel parcel) {
        this.f45633Y = parcel.readLong();
        this.f45634Z = parcel.readLong();
        this.f45635h0 = parcel.readLong();
    }

    @Override // p2.L
    public final /* synthetic */ void d(J j6) {
    }
}
