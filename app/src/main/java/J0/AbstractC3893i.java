package j0;

import Z.h1;

/* renamed from: j0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3893i {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f35891e = 0;

    /* renamed from: a  reason: collision with root package name */
    public n f35892a;

    /* renamed from: b  reason: collision with root package name */
    public int f35893b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f35894c;

    /* renamed from: d  reason: collision with root package name */
    public int f35895d;

    public AbstractC3893i(int i10, n nVar) {
        int i11;
        int i12;
        this.f35892a = nVar;
        this.f35893b = i10;
        if (i10 != 0) {
            n e10 = e();
            h1 h1Var = p.f35917a;
            int[] iArr = e10.f35913i0;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                long j6 = e10.f35911Z;
                int i13 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                int i14 = e10.f35912h0;
                if (i13 != 0) {
                    i12 = Ng.H.i(j6);
                } else {
                    long j10 = e10.f35910Y;
                    if (j10 != 0) {
                        i14 += 64;
                        i12 = Ng.H.i(j10);
                    }
                }
                i10 = i12 + i14;
            }
            synchronized (p.f35918b) {
                i11 = p.f35921e.a(i10);
            }
        } else {
            i11 = -1;
        }
        this.f35895d = i11;
    }

    public static void p(AbstractC3893i abstractC3893i) {
        p.f35917a.b(abstractC3893i);
    }

    public final void a() {
        synchronized (p.f35918b) {
            b();
            o();
        }
    }

    public void b() {
        p.f35919c = p.f35919c.s(d());
    }

    public abstract void c();

    public int d() {
        return this.f35893b;
    }

    public n e() {
        return this.f35892a;
    }

    public abstract wf.k f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract wf.k i();

    public final AbstractC3893i j() {
        h1 h1Var = p.f35917a;
        AbstractC3893i abstractC3893i = (AbstractC3893i) h1Var.a();
        h1Var.b(this);
        return abstractC3893i;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(AbstractC3882G abstractC3882G);

    public void o() {
        int i10 = this.f35895d;
        if (i10 >= 0) {
            p.t(i10);
            this.f35895d = -1;
        }
    }

    public void q(int i10) {
        this.f35893b = i10;
    }

    public void r(n nVar) {
        this.f35892a = nVar;
    }

    public void s(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract AbstractC3893i t(wf.k kVar);
}
