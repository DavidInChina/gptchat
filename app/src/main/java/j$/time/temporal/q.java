package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* loaded from: classes3.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    static final t f35134a = new s(0);

    /* renamed from: b  reason: collision with root package name */
    static final t f35135b = new s(1);

    /* renamed from: c  reason: collision with root package name */
    static final t f35136c = new s(2);

    /* renamed from: d  reason: collision with root package name */
    static final t f35137d = new s(3);

    /* renamed from: e  reason: collision with root package name */
    static final t f35138e = new s(4);

    /* renamed from: f  reason: collision with root package name */
    static final t f35139f = new s(5);

    /* renamed from: g  reason: collision with root package name */
    static final t f35140g = new s(6);

    public static int a(TemporalAccessor temporalAccessor, r rVar) {
        w s10 = temporalAccessor.s(rVar);
        if (!s10.h()) {
            throw new DateTimeException("Invalid field " + rVar + " for get() method, use getLong() instead");
        }
        long w10 = temporalAccessor.w(rVar);
        if (s10.i(w10)) {
            return (int) w10;
        }
        throw new DateTimeException("Invalid value for " + rVar + " (valid values " + s10 + "): " + w10);
    }

    public static m b(m mVar, long j6, u uVar) {
        long j10;
        if (j6 == Long.MIN_VALUE) {
            mVar = mVar.mo88e(Long.MAX_VALUE, uVar);
            j10 = 1;
        } else {
            j10 = -j6;
        }
        return mVar.mo88e(j10, uVar);
    }

    public static Object c(TemporalAccessor temporalAccessor, t tVar) {
        if (tVar == f35134a || tVar == f35135b || tVar == f35136c) {
            return null;
        }
        return tVar.a(temporalAccessor);
    }

    public static w d(TemporalAccessor temporalAccessor, r rVar) {
        if (!(rVar instanceof a)) {
            Objects.requireNonNull(rVar, "field");
            return rVar.L(temporalAccessor);
        } else if (!temporalAccessor.f(rVar)) {
            throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
        } else {
            return rVar.p();
        }
    }

    public static t e() {
        return f35135b;
    }

    public static t f() {
        return f35139f;
    }

    public static t g() {
        return f35140g;
    }

    public static /* synthetic */ int h(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return 0;
        }
        return (((i10 ^ 7) >> 31) | 1) > 0 ? i11 : i11 + 7;
    }

    public static t i() {
        return f35137d;
    }

    public static t j() {
        return f35136c;
    }

    public static t k() {
        return f35138e;
    }

    public static t l() {
        return f35134a;
    }
}
