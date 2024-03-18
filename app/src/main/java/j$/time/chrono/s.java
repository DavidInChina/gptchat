package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class s extends Enum implements l {
    public static final s BCE;
    public static final s CE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ s[] f34947a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j$.time.chrono.s] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.chrono.s] */
    static {
        ?? r22 = new Enum("BCE", 0);
        BCE = r22;
        ?? r32 = new Enum("CE", 1);
        CE = r32;
        f34947a = new s[]{r22, r32};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f34947a.clone();
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
