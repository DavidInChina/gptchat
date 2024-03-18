package j$.time;

import com.statsig.androidsdk.ErrorBoundaryKt;
import j$.time.chrono.AbstractC3698a;
import j$.time.chrono.AbstractC3699b;
import j$.time.format.G;
import j$.time.format.x;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class u implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a  reason: collision with root package name */
    private final int f35163a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35164b;

    static {
        x xVar = new x();
        xVar.q(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD);
        xVar.e('-');
        xVar.p(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        xVar.z(Locale.getDefault());
    }

    private u(int i10, int i11) {
        this.f35163a = i10;
        this.f35164b = i11;
    }

    private long L() {
        return ((this.f35163a * 12) + this.f35164b) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u R(DataInput dataInput) {
        int readInt = dataInput.readInt();
        byte readByte = dataInput.readByte();
        j$.time.temporal.a.YEAR.P(readInt);
        j$.time.temporal.a.MONTH_OF_YEAR.P(readByte);
        return new u(readInt, readByte);
    }

    private u S(int i10, int i11) {
        return (this.f35163a == i10 && this.f35164b == i11) ? this : new u(i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        if (((AbstractC3698a) AbstractC3699b.p(mVar)).equals(j$.time.chrono.r.f34946d)) {
            return mVar.d(L(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* renamed from: O */
    public final u mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (t.f35112b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return P(j6);
                case 2:
                    return Q(j6);
                case 3:
                    return Q(j$.com.android.tools.r8.a.q(j6, 10));
                case 4:
                    return Q(j$.com.android.tools.r8.a.q(j6, 100));
                case 5:
                    return Q(j$.com.android.tools.r8.a.q(j6, 1000));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.k(w(aVar), j6), aVar);
                default:
                    throw new DateTimeException("Unsupported unit: " + uVar);
            }
        }
        return (u) uVar.p(this, j6);
    }

    public final u P(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (this.f35163a * 12) + (this.f35164b - 1) + j6;
        long j11 = 12;
        return S(j$.time.temporal.a.YEAR.O(j$.com.android.tools.r8.a.p(j10, j11)), ((int) j$.com.android.tools.r8.a.o(j10, j11)) + 1);
    }

    public final u Q(long j6) {
        return j6 == 0 ? this : S(j$.time.temporal.a.YEAR.O(this.f35163a + j6), this.f35164b);
    }

    /* renamed from: T */
    public final u d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            aVar.P(j6);
            int i10 = t.f35111a[aVar.ordinal()];
            int i11 = this.f35163a;
            if (i10 == 1) {
                int i12 = (int) j6;
                j$.time.temporal.a.MONTH_OF_YEAR.P(i12);
                return S(i11, i12);
            } else if (i10 == 2) {
                return P(j6 - L());
            } else {
                int i13 = this.f35164b;
                if (i10 == 3) {
                    if (i11 < 1) {
                        j6 = 1 - j6;
                    }
                    int i14 = (int) j6;
                    j$.time.temporal.a.YEAR.P(i14);
                    return S(i14, i13);
                } else if (i10 == 4) {
                    int i15 = (int) j6;
                    j$.time.temporal.a.YEAR.P(i15);
                    return S(i15, i13);
                } else if (i10 != 5) {
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
                } else {
                    if (w(j$.time.temporal.a.ERA) == j6) {
                        return this;
                    }
                    int i16 = 1 - i11;
                    j$.time.temporal.a.YEAR.P(i16);
                    return S(i16, i13);
                }
            }
        }
        return (u) rVar.A(this, j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(DataOutput dataOutput) {
        dataOutput.writeInt(this.f35163a);
        dataOutput.writeByte(this.f35164b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i10 = this.f35163a - uVar.f35163a;
        return i10 == 0 ? this.f35164b - uVar.f35164b : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f35163a == uVar.f35163a && this.f35164b == uVar.f35164b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.z(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    public final int hashCode() {
        return (this.f35164b << 27) ^ this.f35163a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return s(rVar).a(w(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        localDate.getClass();
        return (u) AbstractC3699b.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f35163a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.q.d(this, rVar);
    }

    public final String toString() {
        int i10;
        int i11 = this.f35163a;
        int abs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + ErrorBoundaryKt.SAMPLING_RATE);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            sb2.append(i11);
        }
        int i12 = this.f35164b;
        sb2.append(i12 < 10 ? "-0" : "-");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = t.f35111a[((j$.time.temporal.a) rVar).ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                return this.f35164b;
            }
            if (i10 == 2) {
                return L();
            }
            int i12 = this.f35163a;
            if (i10 == 3) {
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            } else if (i10 == 4) {
                return i12;
            } else {
                if (i10 != 5) {
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
                }
                if (i12 < 1) {
                    i11 = 0;
                }
                return i11;
            }
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.e() ? j$.time.chrono.r.f34946d : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.MONTHS : j$.time.temporal.q.c(this, tVar);
    }
}
