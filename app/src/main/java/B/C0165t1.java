package B;

import A.C0019g0;
import G0.AbstractC0579h;
import G0.AbstractC0585n;
import G0.AbstractC0587p;
import H0.AbstractC0701r0;
import android.view.KeyEvent;
import z.C6736z;
import z0.AbstractC6740c;
import z0.C6738a;

/* renamed from: B.t1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0165t1 extends AbstractC0587p implements G0.j0, AbstractC0585n, p0.k, AbstractC6740c {

    /* renamed from: A0  reason: collision with root package name */
    public D.m f1503A0;

    /* renamed from: B0  reason: collision with root package name */
    public final A0.d f1504B0;

    /* renamed from: C0  reason: collision with root package name */
    public final W f1505C0;

    /* renamed from: D0  reason: collision with root package name */
    public final A1 f1506D0;

    /* renamed from: E0  reason: collision with root package name */
    public final C0157q1 f1507E0;

    /* renamed from: F0  reason: collision with root package name */
    public final S f1508F0;

    /* renamed from: G0  reason: collision with root package name */
    public final Q0 f1509G0;

    /* renamed from: H0  reason: collision with root package name */
    public final C0139k1 f1510H0;

    /* renamed from: u0  reason: collision with root package name */
    public AbstractC0168u1 f1511u0;

    /* renamed from: v0  reason: collision with root package name */
    public W0 f1512v0;

    /* renamed from: w0  reason: collision with root package name */
    public A.L0 f1513w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f1514x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f1515y0;

    /* renamed from: z0  reason: collision with root package name */
    public L0 f1516z0;

    public C0165t1(AbstractC0168u1 abstractC0168u1, W0 w02, A.L0 l02, boolean z10, boolean z11, L0 l03, D.m mVar, N n10) {
        this.f1511u0 = abstractC0168u1;
        this.f1512v0 = w02;
        this.f1513w0 = l02;
        this.f1514x0 = z10;
        this.f1515y0 = z11;
        this.f1516z0 = l03;
        this.f1503A0 = mVar;
        A0.d dVar = new A0.d();
        this.f1504B0 = dVar;
        W w10 = new W(new C6736z(new y.r0(androidx.compose.foundation.gestures.a.f24696e)));
        this.f1505C0 = w10;
        AbstractC0168u1 abstractC0168u12 = this.f1511u0;
        W0 w03 = this.f1512v0;
        A.L0 l04 = this.f1513w0;
        boolean z12 = this.f1515y0;
        L0 l05 = this.f1516z0;
        A1 a12 = new A1(abstractC0168u12, w03, l04, z12, l05 == null ? w10 : l05, dVar);
        this.f1506D0 = a12;
        C0157q1 c0157q1 = new C0157q1(a12, this.f1514x0);
        this.f1507E0 = c0157q1;
        S s10 = new S(this.f1512v0, this.f1511u0, this.f1515y0, n10);
        A0(s10);
        this.f1508F0 = s10;
        Q0 q02 = new Q0(this.f1514x0);
        A0(q02);
        this.f1509G0 = q02;
        F0.i iVar = A0.i.f376a;
        A0(new A0.g(c0157q1, dVar));
        A0(new p0.q());
        A0(new I.m(s10));
        A0(new C0019g0(new C0107a(this, 2)));
        C0139k1 c0139k1 = new C0139k1(a12, this.f1512v0, this.f1514x0, dVar, this.f1503A0);
        A0(c0139k1);
        this.f1510H0 = c0139k1;
    }

    @Override // p0.k
    public final void S(p0.i iVar) {
        iVar.b(false);
    }

    @Override // G0.j0
    public final void X() {
        this.f1505C0.f1211a = new C6736z(new y.r0((Z0.b) AbstractC0579h.p(this, AbstractC0701r0.f7002e)));
    }

    @Override // z0.AbstractC6740c
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // l0.AbstractC4325q
    public final void t0() {
        this.f1505C0.f1211a = new C6736z(new y.r0((Z0.b) AbstractC0579h.p(this, AbstractC0701r0.f7002e)));
        AbstractC0579h.y(this, new C0110b(3, this));
    }

    @Override // z0.AbstractC6740c
    public final boolean x(KeyEvent keyEvent) {
        long j6;
        float f6;
        float f10;
        if (this.f1514x0 && ((C6738a.a(androidx.compose.ui.input.key.a.b(keyEvent), C6738a.f51428l) || C6738a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), C6738a.f51427k)) && r.f.w(androidx.compose.ui.input.key.a.c(keyEvent), 2) && !keyEvent.isCtrlPressed())) {
            W0 w02 = this.f1512v0;
            W0 w03 = W0.f1213Y;
            S s10 = this.f1508F0;
            if (w02 == w03) {
                int i10 = (int) (s10.f1163B0 & 4294967295L);
                if (C6738a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), C6738a.f51427k)) {
                    f10 = i10;
                } else {
                    f10 = -i10;
                }
                j6 = R4.b.r(0.0f, f10);
            } else {
                int i11 = (int) (s10.f1163B0 >> 32);
                if (C6738a.a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode()), C6738a.f51427k)) {
                    f6 = i11;
                } else {
                    f6 = -i11;
                }
                j6 = R4.b.r(f6, 0.0f);
            }
            Ad.l.O0(p0(), null, null, new C0162s1(this.f1506D0, j6, null), 3);
            return true;
        }
        return false;
    }
}
