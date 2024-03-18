package j$.time;

import j$.time.chrono.AbstractC3698a;
import j$.time.chrono.AbstractC3699b;
import j$.time.format.x;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes3.dex */
public final class m implements TemporalAccessor, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a  reason: collision with root package name */
    private final int f35096a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35097b;

    static {
        x xVar = new x();
        xVar.f("--");
        xVar.p(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        xVar.e('-');
        xVar.p(j$.time.temporal.a.DAY_OF_MONTH, 2);
        xVar.z(Locale.getDefault());
    }

    private m(int i10, int i11) {
        this.f35096a = i10;
        this.f35097b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m L(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        byte readByte2 = dataInput.readByte();
        k Q = k.Q(readByte);
        Objects.requireNonNull(Q, "month");
        j$.time.temporal.a.DAY_OF_MONTH.P(readByte2);
        if (readByte2 <= Q.P()) {
            return new m(Q.getValue(), readByte2);
        }
        String name = Q.name();
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + name);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 13, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        if (((AbstractC3698a) AbstractC3699b.p(mVar)).equals(j$.time.chrono.r.f34946d)) {
            j$.time.temporal.m d10 = mVar.d(this.f35096a, j$.time.temporal.a.MONTH_OF_YEAR);
            j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
            return d10.d(Math.min(d10.s(aVar).d(), this.f35097b), aVar);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(DataOutput dataOutput) {
        dataOutput.writeByte(this.f35096a);
        dataOutput.writeByte(this.f35097b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i10 = this.f35096a - mVar.f35096a;
        return i10 == 0 ? this.f35097b - mVar.f35097b : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f35096a == mVar.f35096a && this.f35097b == mVar.f35097b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH : rVar != null && rVar.z(this);
    }

    public final int hashCode() {
        return (this.f35096a << 6) + this.f35097b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return s(rVar).a(w(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.p();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.q.d(this, rVar);
        }
        int i10 = this.f35096a;
        k Q = k.Q(i10);
        Q.getClass();
        int i11 = j.f35092a[Q.ordinal()];
        return j$.time.temporal.w.k(1L, i11 != 1 ? (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) ? 30 : 31 : 28, k.Q(i10).P());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        int i10 = this.f35096a;
        sb2.append(i10 < 10 ? WebrtcBuildVersion.maint_version : "");
        sb2.append(i10);
        int i11 = this.f35097b;
        sb2.append(i11 < 10 ? "-0" : "-");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        int i10;
        if (rVar instanceof j$.time.temporal.a) {
            int i11 = l.f35095a[((j$.time.temporal.a) rVar).ordinal()];
            if (i11 == 1) {
                i10 = this.f35097b;
            } else if (i11 != 2) {
                throw new DateTimeException(b.a("Unsupported field: ", rVar));
            } else {
                i10 = this.f35096a;
            }
            return i10;
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.e() ? j$.time.chrono.r.f34946d : j$.time.temporal.q.c(this, tVar);
    }
}
