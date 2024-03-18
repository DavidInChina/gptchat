package y;

import h.C3281g;
import l0.AbstractC4313e;
import l0.C4310b;
import z.C6713n0;
import z.C6715o0;
import z.C6729v0;

/* loaded from: classes2.dex */
public final class c0 extends j0 {

    /* renamed from: A0  reason: collision with root package name */
    public AbstractC4313e f50184A0;

    /* renamed from: s0  reason: collision with root package name */
    public C6729v0 f50187s0;

    /* renamed from: t0  reason: collision with root package name */
    public C6715o0 f50188t0;

    /* renamed from: u0  reason: collision with root package name */
    public C6715o0 f50189u0;

    /* renamed from: v0  reason: collision with root package name */
    public C6715o0 f50190v0;

    /* renamed from: w0  reason: collision with root package name */
    public d0 f50191w0;

    /* renamed from: x0  reason: collision with root package name */
    public e0 f50192x0;

    /* renamed from: y0  reason: collision with root package name */
    public W f50193y0;

    /* renamed from: z0  reason: collision with root package name */
    public long f50194z0 = androidx.compose.animation.a.f24635a;

    /* renamed from: B0  reason: collision with root package name */
    public final b0 f50185B0 = new b0(this, 0);

    /* renamed from: C0  reason: collision with root package name */
    public final b0 f50186C0 = new b0(this, 1);

    public c0(C6729v0 c6729v0, C6715o0 c6715o0, C6715o0 c6715o02, C6715o0 c6715o03, d0 d0Var, e0 e0Var, W w10) {
        this.f50187s0 = c6729v0;
        this.f50188t0 = c6715o0;
        this.f50189u0 = c6715o02;
        this.f50190v0 = c6715o03;
        this.f50191w0 = d0Var;
        this.f50192x0 = e0Var;
        this.f50193y0 = w10;
        A7.b.n(0, 0, 0, 0, 15);
    }

    public final AbstractC4313e A0() {
        AbstractC4313e abstractC4313e;
        if (this.f50187s0.c().b(V.f50156Y, V.f50157Z)) {
            N n10 = this.f50191w0.f50197a.f50302c;
            if (n10 == null || (abstractC4313e = n10.f50130a) == null) {
                N n11 = this.f50192x0.f50201a.f50302c;
                if (n11 == null) {
                    return null;
                }
                return n11.f50130a;
            }
        } else {
            N n12 = this.f50192x0.f50201a.f50302c;
            if (n12 == null || (abstractC4313e = n12.f50130a) == null) {
                N n13 = this.f50191w0.f50197a.f50302c;
                if (n13 == null) {
                    return null;
                }
                return n13.f50130a;
            }
        }
        return abstractC4313e;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    @Override // G0.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        C6713n0 c6713n0;
        C6713n0 c6713n02;
        r0.P p11;
        C6715o0 c6715o0;
        C6713n0 c6713n03;
        long j10;
        C6715o0 c6715o02;
        C6713n0 c6713n04;
        C6715o0 c6715o03;
        long j11;
        C6715o0 c6715o04;
        long j12;
        AbstractC4313e abstractC4313e;
        long j13;
        if (this.f50187s0.b() == this.f50187s0.f51386c.getValue()) {
            this.f50184A0 = null;
        } else if (this.f50184A0 == null) {
            AbstractC4313e A02 = A0();
            if (A02 == null) {
                A02 = C4310b.f37693Y;
            }
            this.f50184A0 = A02;
        }
        boolean P = p10.P();
        kf.w wVar = kf.w.f37484Y;
        if (P) {
            E0.d0 o10 = m10.o(j6);
            long c10 = Ng.H.c(o10.f4053Y, o10.f4054Z);
            this.f50194z0 = c10;
            return p10.j0((int) (c10 >> 32), (int) (4294967295L & c10), wVar, new D(o10, 2));
        }
        W w10 = this.f50193y0;
        C6715o0 c6715o05 = w10.f50160a;
        d0 d0Var = w10.f50163d;
        e0 e0Var = w10.f50164e;
        if (c6715o05 != null) {
            c6713n0 = c6715o05.a(new X(d0Var, e0Var, 0), new X(d0Var, e0Var, 1));
        } else {
            c6713n0 = null;
        }
        C6715o0 c6715o06 = w10.f50161b;
        if (c6715o06 != null) {
            c6713n02 = c6715o06.a(new X(d0Var, e0Var, 2), new X(d0Var, e0Var, 3));
        } else {
            c6713n02 = null;
        }
        if (w10.f50162c.b() == V.f50156Y) {
            k0 k0Var = d0Var.f50197a.f50303d;
            if (k0Var != null) {
                p11 = new r0.P(k0Var.f50229b);
            } else {
                k0 k0Var2 = e0Var.f50201a.f50303d;
                if (k0Var2 != null) {
                    p11 = new r0.P(k0Var2.f50229b);
                }
                p11 = null;
            }
            c6715o0 = w10.f50165f;
            if (c6715o0 == null) {
                c6713n03 = c6715o0.a(C6481t.f50291o0, new C3281g(p11, d0Var, e0Var, 3));
            } else {
                c6713n03 = null;
            }
            C3281g c3281g = new C3281g(c6713n0, c6713n02, c6713n03, 2);
            E0.d0 o11 = m10.o(j6);
            long c11 = Ng.H.c(o11.f4053Y, o11.f4054Z);
            if (!(!Z0.k.a(this.f50194z0, androidx.compose.animation.a.f24635a))) {
                j10 = this.f50194z0;
            } else {
                j10 = c11;
            }
            c6715o02 = this.f50188t0;
            if (c6715o02 == null) {
                c6713n04 = c6715o02.a(this.f50185B0, new a0(this, j10, 0));
            } else {
                c6713n04 = null;
            }
            if (c6713n04 != null) {
                c11 = ((Z0.k) c6713n04.getValue()).f22804a;
            }
            long q02 = A7.b.q0(j6, c11);
            c6715o03 = this.f50189u0;
            if (c6715o03 == null) {
                j11 = ((Z0.i) c6715o03.a(C6481t.f50298v0, new a0(this, j10, 1)).getValue()).f22799a;
            } else {
                j11 = Z0.i.f22797b;
            }
            c6715o04 = this.f50190v0;
            if (c6715o04 == null) {
                j12 = ((Z0.i) c6715o04.a(this.f50186C0, new a0(this, j10, 2)).getValue()).f22799a;
            } else {
                j12 = Z0.i.f22797b;
            }
            abstractC4313e = this.f50184A0;
            if (abstractC4313e == null) {
                j13 = abstractC4313e.a(j10, q02, Z0.l.f22805Y);
            } else {
                j13 = Z0.i.f22797b;
            }
            int i10 = Z0.i.f22798c;
            return p10.j0((int) (q02 >> 32), (int) (q02 & 4294967295L), wVar, new Z(0, kotlin.jvm.internal.m.c(((int) (j13 >> 32)) + ((int) (j12 >> 32)), ((int) (j13 & 4294967295L)) + ((int) (j12 & 4294967295L))), j11, o11, c3281g));
        }
        k0 k0Var3 = e0Var.f50201a.f50303d;
        if (k0Var3 != null) {
            p11 = new r0.P(k0Var3.f50229b);
        } else {
            k0 k0Var4 = d0Var.f50197a.f50303d;
            if (k0Var4 != null) {
                p11 = new r0.P(k0Var4.f50229b);
            }
            p11 = null;
        }
        c6715o0 = w10.f50165f;
        if (c6715o0 == null) {
        }
        C3281g c3281g2 = new C3281g(c6713n0, c6713n02, c6713n03, 2);
        E0.d0 o112 = m10.o(j6);
        long c112 = Ng.H.c(o112.f4053Y, o112.f4054Z);
        if (!(!Z0.k.a(this.f50194z0, androidx.compose.animation.a.f24635a))) {
        }
        c6715o02 = this.f50188t0;
        if (c6715o02 == null) {
        }
        if (c6713n04 != null) {
        }
        long q022 = A7.b.q0(j6, c112);
        c6715o03 = this.f50189u0;
        if (c6715o03 == null) {
        }
        c6715o04 = this.f50190v0;
        if (c6715o04 == null) {
        }
        abstractC4313e = this.f50184A0;
        if (abstractC4313e == null) {
        }
        int i102 = Z0.i.f22798c;
        return p10.j0((int) (q022 >> 32), (int) (q022 & 4294967295L), wVar, new Z(0, kotlin.jvm.internal.m.c(((int) (j13 >> 32)) + ((int) (j12 >> 32)), ((int) (j13 & 4294967295L)) + ((int) (j12 & 4294967295L))), j11, o112, c3281g2));
    }

    @Override // l0.AbstractC4325q
    public final void t0() {
        this.f50194z0 = androidx.compose.animation.a.f24635a;
    }
}
