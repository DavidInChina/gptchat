package j$.time;

import j$.time.chrono.AbstractC3698a;
import j$.time.chrono.AbstractC3699b;
import j$.time.format.G;
import j$.time.format.x;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class s implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f35109b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a  reason: collision with root package name */
    private final int f35110a;

    static {
        x xVar = new x();
        xVar.q(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD);
        xVar.z(Locale.getDefault());
    }

    private s(int i10) {
        this.f35110a = i10;
    }

    public static s L(int i10) {
        j$.time.temporal.a.YEAR.P(i10);
        return new s(i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        if (((AbstractC3698a) AbstractC3699b.p(mVar)).equals(j$.time.chrono.r.f34946d)) {
            return mVar.d(this.f35110a, j$.time.temporal.a.YEAR);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* renamed from: O */
    public final s mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            int i10 = r.f35108b[((j$.time.temporal.b) uVar).ordinal()];
            if (i10 == 1) {
                return P(j6);
            }
            if (i10 == 2) {
                return P(j$.com.android.tools.r8.a.q(j6, 10));
            }
            if (i10 == 3) {
                return P(j$.com.android.tools.r8.a.q(j6, 100));
            }
            if (i10 == 4) {
                return P(j$.com.android.tools.r8.a.q(j6, 1000));
            }
            if (i10 == 5) {
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.k(w(aVar), j6), aVar);
            }
            throw new DateTimeException("Unsupported unit: " + uVar);
        }
        return (s) uVar.p(this, j6);
    }

    public final s P(long j6) {
        return j6 == 0 ? this : L(j$.time.temporal.a.YEAR.O(this.f35110a + j6));
    }

    /* renamed from: Q */
    public final s d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            aVar.P(j6);
            int i10 = r.f35107a[aVar.ordinal()];
            int i11 = this.f35110a;
            if (i10 == 1) {
                if (i11 < 1) {
                    j6 = 1 - j6;
                }
                return L((int) j6);
            } else if (i10 == 2) {
                return L((int) j6);
            } else {
                if (i10 != 3) {
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
                }
                return w(j$.time.temporal.a.ERA) == j6 ? this : L(1 - i11);
            }
        }
        return (s) rVar.A(this, j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(DataOutput dataOutput) {
        dataOutput.writeInt(this.f35110a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f35110a - ((s) obj).f35110a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f35110a == ((s) obj).f35110a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.z(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    public final int hashCode() {
        return this.f35110a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return s(rVar).a(w(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        localDate.getClass();
        return (s) AbstractC3699b.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f35110a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.q.d(this, rVar);
    }

    public final String toString() {
        return Integer.toString(this.f35110a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = r.f35107a[((j$.time.temporal.a) rVar).ordinal()];
            int i11 = this.f35110a;
            int i12 = 1;
            if (i10 == 1) {
                if (i11 < 1) {
                    i11 = 1 - i11;
                }
                return i11;
            } else if (i10 == 2) {
                return i11;
            } else {
                if (i10 != 3) {
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
                }
                if (i11 < 1) {
                    i12 = 0;
                }
                return i12;
            }
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.e() ? j$.time.chrono.r.f34946d : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.YEARS : j$.time.temporal.q.c(this, tVar);
    }
}
