package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class q extends Enum implements l {
    public static final q AH;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ q[] f34945a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.chrono.q, java.lang.Enum] */
    static {
        ?? r12 = new Enum("AH", 0);
        AH = r12;
        f34945a = new q[]{r12};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f34945a.clone();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(1, j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC3699b.i(this, rVar);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.r rVar) {
        return AbstractC3699b.f(this, (j$.time.temporal.a) rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.ERA ? j$.time.temporal.w.j(1L, 1L) : j$.time.temporal.q.d(this, rVar);
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
