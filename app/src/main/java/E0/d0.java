package E0;

/* loaded from: classes.dex */
public abstract class d0 implements Q {

    /* renamed from: Y  reason: collision with root package name */
    public int f4053Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4054Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f4055h0 = Ng.H.c(0, 0);

    /* renamed from: i0  reason: collision with root package name */
    public long f4056i0 = f0.f4061a;

    /* renamed from: j0  reason: collision with root package name */
    public long f4057j0 = Z0.i.f22797b;

    public d0() {
        int i10 = Z0.i.f22798c;
    }

    public int T() {
        return (int) (this.f4055h0 & 4294967295L);
    }

    public int U() {
        return (int) (this.f4055h0 >> 32);
    }

    public final void W() {
        this.f4053Y = com.google.android.gms.internal.play_billing.N.p((int) (this.f4055h0 >> 32), Z0.a.j(this.f4056i0), Z0.a.h(this.f4056i0));
        int p10 = com.google.android.gms.internal.play_billing.N.p((int) (this.f4055h0 & 4294967295L), Z0.a.i(this.f4056i0), Z0.a.g(this.f4056i0));
        this.f4054Z = p10;
        int i10 = this.f4053Y;
        long j6 = this.f4055h0;
        this.f4057j0 = kotlin.jvm.internal.m.c((i10 - ((int) (j6 >> 32))) / 2, (p10 - ((int) (j6 & 4294967295L))) / 2);
    }

    public abstract void X(long j6, float f6, wf.k kVar);

    public final void b0(long j6) {
        if (!Z0.k.a(this.f4055h0, j6)) {
            this.f4055h0 = j6;
            W();
        }
    }

    public final void d0(long j6) {
        if (!Z0.a.b(this.f4056i0, j6)) {
            this.f4056i0 = j6;
            W();
        }
    }

    public /* synthetic */ Object u() {
        return null;
    }
}
