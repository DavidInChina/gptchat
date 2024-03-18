package K7;

import J7.f;
import J7.g;
import M3.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.Arrays;
import l8.AbstractC4344b;
import w7.t;
import x7.AbstractC6355a;

/* loaded from: classes2.dex */
public final class a extends AbstractC6355a {
    public static final Parcelable.Creator<a> CREATOR = new t(10);

    /* renamed from: Y  reason: collision with root package name */
    public final long f9528Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f9529Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f9530h0;

    /* renamed from: i0  reason: collision with root package name */
    public final f f9531i0;

    public a(long j6, int i10, boolean z10, f fVar) {
        this.f9528Y = j6;
        this.f9529Z = i10;
        this.f9530h0 = z10;
        this.f9531i0 = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9528Y != aVar.f9528Y || this.f9529Z != aVar.f9529Z || this.f9530h0 != aVar.f9530h0 || !H.P(this.f9531i0, aVar.f9531i0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9528Y), Integer.valueOf(this.f9529Z), Boolean.valueOf(this.f9530h0)});
    }

    public final String toString() {
        String str;
        StringBuilder p10 = android.gov.nist.core.a.p("LastLocationRequest[");
        long j6 = this.f9528Y;
        if (j6 != Long.MAX_VALUE) {
            p10.append("maxAge=");
            int i10 = g.f8880a;
            int i11 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            if (i11 == 0) {
                p10.append("0s");
            } else {
                p10.ensureCapacity(p10.length() + 27);
                boolean z10 = false;
                if (i11 < 0) {
                    p10.append("-");
                    if (j6 != Long.MIN_VALUE) {
                        j6 = -j6;
                    } else {
                        j6 = Long.MAX_VALUE;
                        z10 = true;
                    }
                }
                if (j6 >= 86400000) {
                    p10.append(j6 / 86400000);
                    p10.append("d");
                    j6 %= 86400000;
                }
                if (true == z10) {
                    j6 = 25975808;
                }
                if (j6 >= 3600000) {
                    p10.append(j6 / 3600000);
                    p10.append("h");
                    j6 %= 3600000;
                }
                if (j6 >= StatsigLoggerKt.FLUSH_TIMER_MS) {
                    p10.append(j6 / StatsigLoggerKt.FLUSH_TIMER_MS);
                    p10.append("m");
                    j6 %= StatsigLoggerKt.FLUSH_TIMER_MS;
                }
                if (j6 >= 1000) {
                    p10.append(j6 / 1000);
                    p10.append("s");
                    j6 %= 1000;
                }
                if (j6 > 0) {
                    p10.append(j6);
                    p10.append("ms");
                }
            }
        }
        int i12 = this.f9529Z;
        if (i12 != 0) {
            p10.append(", ");
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        str = "GRANULARITY_FINE";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "GRANULARITY_COARSE";
                }
            } else {
                str = "GRANULARITY_PERMISSION_LEVEL";
            }
            p10.append(str);
        }
        if (this.f9530h0) {
            p10.append(", bypass");
        }
        f fVar = this.f9531i0;
        if (fVar != null) {
            p10.append(", impersonation=");
            p10.append(fVar);
        }
        p10.append(']');
        return p10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int D12 = AbstractC4344b.D1(parcel, 20293);
        AbstractC4344b.G1(parcel, 1, 8);
        parcel.writeLong(this.f9528Y);
        AbstractC4344b.G1(parcel, 2, 4);
        parcel.writeInt(this.f9529Z);
        AbstractC4344b.G1(parcel, 3, 4);
        parcel.writeInt(this.f9530h0 ? 1 : 0);
        AbstractC4344b.z1(parcel, 5, this.f9531i0, i10);
        AbstractC4344b.F1(parcel, D12);
    }
}
