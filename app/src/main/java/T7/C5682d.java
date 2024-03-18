package t7;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l8.AbstractC4344b;
import w7.t;
import x7.AbstractC6355a;

/* renamed from: t7.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5682d extends AbstractC6355a {
    public static final Parcelable.Creator<C5682d> CREATOR = new t(7);

    /* renamed from: Y  reason: collision with root package name */
    public final String f45767Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f45768Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f45769h0;

    public C5682d(long j6, String str) {
        this.f45767Y = str;
        this.f45769h0 = j6;
        this.f45768Z = -1;
    }

    public final long c() {
        long j6 = this.f45769h0;
        if (j6 == -1) {
            return this.f45768Z;
        }
        return j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5682d) {
            C5682d c5682d = (C5682d) obj;
            String str = this.f45767Y;
            if (((str != null && str.equals(c5682d.f45767Y)) || (str == null && c5682d.f45767Y == null)) && c() == c5682d.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45767Y, Long.valueOf(c())});
    }

    public final String toString() {
        U3.l lVar = new U3.l(this);
        lVar.e("name", this.f45767Y);
        lVar.e(ParameterNames.VERSION, Long.valueOf(c()));
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.A1(parcel, 1, this.f45767Y);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f45768Z);
        long c10 = c();
        AbstractC4344b.G1(parcel, 3, 8);
        parcel.writeLong(c10);
        AbstractC4344b.F1(parcel, D12);
    }

    public C5682d(long j6, String str, int i10) {
        this.f45767Y = str;
        this.f45768Z = i10;
        this.f45769h0 = j6;
    }
}
