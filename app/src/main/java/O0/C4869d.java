package o0;

/* renamed from: o0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4869d implements Z0.b {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC4866a f40415Y = C4874i.f40420Y;

    /* renamed from: Z  reason: collision with root package name */
    public C4872g f40416Z;

    @Override // Z0.b
    public final long C(int i10) {
        return R.a.h(J(i10), this);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return c(K(f6));
    }

    @Override // Z0.b
    public final float J(int i10) {
        return i10 / b();
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / b();
    }

    @Override // Z0.b
    public final float O() {
        return this.f40415Y.b().O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o0.g, java.lang.Object] */
    public final C4872g a(wf.k kVar) {
        ?? obj = new Object();
        obj.f40418a = kVar;
        this.f40416Z = obj;
        return obj;
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final float b() {
        return this.f40415Y.b().b();
    }

    public final /* synthetic */ long c(float f6) {
        return R.a.h(f6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ float i0(long j6) {
        return R.a.f(j6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ long p(long j6) {
        return R.a.e(j6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ float t(long j6) {
        return R.a.d(j6, this);
    }
}
