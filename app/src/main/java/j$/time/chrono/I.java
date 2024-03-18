package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class I extends Enum implements l {
    public static final I BE;
    public static final I BEFORE_BE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ I[] f34909a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j$.time.chrono.I] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.chrono.I] */
    static {
        ?? r22 = new Enum("BEFORE_BE", 0);
        BEFORE_BE = r22;
        ?? r32 = new Enum("BE", 1);
        BE = r32;
        f34909a = new I[]{r22, r32};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f34909a.clone();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC3699b.i(this, rVar);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.r rVar) {
        return AbstractC3699b.f(this, (j$.time.temporal.a) rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.d(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long w(j$.time.temporal.r rVar) {
        return AbstractC3699b.g(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC3699b.m(this, tVar);
    }
}
