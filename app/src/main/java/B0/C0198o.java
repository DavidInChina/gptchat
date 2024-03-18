package B0;

import G0.AbstractC0579h;
import G0.AbstractC0585n;
import G0.t0;
import G0.y0;
import H0.AbstractC0701r0;
import H0.C0708v;
import H0.W;
import N.T;
import android.os.Build;
import l0.AbstractC4325q;

/* renamed from: B0.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0198o extends AbstractC4325q implements y0, t0, AbstractC0585n {

    /* renamed from: s0  reason: collision with root package name */
    public q f1662s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1663t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1664u0;

    public C0198o(q qVar, boolean z10) {
        this.f1662s0 = qVar;
        this.f1663t0 = z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final void A0() {
        q qVar;
        ?? obj = new Object();
        AbstractC0579h.D(this, new C0197n(2, obj));
        C0198o c0198o = (C0198o) obj.f37622Y;
        if (c0198o == null || (qVar = c0198o.f1662s0) == null) {
            qVar = this.f1662s0;
        }
        r rVar = (r) AbstractC0579h.p(this, AbstractC0701r0.f7015r);
        if (rVar != null) {
            C0708v c0708v = (C0708v) rVar;
            if (qVar == null) {
                q.f1666a.getClass();
                qVar = s.f1667a;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                W.f6883a.a(c0708v.f7053a, qVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final void B0() {
        jf.y yVar;
        r rVar;
        ?? obj = new Object();
        AbstractC0579h.D(this, new C0197n(0, obj));
        C0198o c0198o = (C0198o) obj.f37622Y;
        if (c0198o != null) {
            c0198o.A0();
            yVar = jf.y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null && (rVar = (r) AbstractC0579h.p(this, AbstractC0701r0.f7015r)) != null) {
            C0708v c0708v = (C0708v) rVar;
            q.f1666a.getClass();
            C0184a c0184a = s.f1667a;
            if (Build.VERSION.SDK_INT >= 24) {
                W.f6883a.a(c0708v.f7053a, c0184a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final void C0() {
        ?? obj = new Object();
        obj.f37645Y = true;
        if (!this.f1663t0) {
            AbstractC0579h.F(this, new T(obj, 1));
        }
        if (obj.f37645Y) {
            A0();
        }
    }

    @Override // G0.t0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // G0.y0
    public final /* bridge */ /* synthetic */ Object m() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // G0.t0
    public final void s(C0194k c0194k, EnumC0195l enumC0195l, long j6) {
        if (enumC0195l == EnumC0195l.f1657Z) {
            if (s.a(c0194k.f1655d, 4)) {
                this.f1664u0 = true;
                C0();
            } else if (s.a(c0194k.f1655d, 5)) {
                this.f1664u0 = false;
                B0();
            }
        }
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        this.f1664u0 = false;
        B0();
    }

    @Override // G0.t0
    public final void A() {
    }

    @Override // G0.t0
    public final /* synthetic */ void H() {
    }

    @Override // G0.t0
    public final void N() {
    }

    @Override // G0.t0
    public final void h0() {
    }
}
