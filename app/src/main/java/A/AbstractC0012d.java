package A;

import B0.C0194k;
import B0.EnumC0195l;
import G0.AbstractC0587p;
import android.view.KeyEvent;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import wf.AbstractC6216a;
import z0.AbstractC6740c;
import z0.C6738a;

/* renamed from: A.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0012d extends AbstractC0587p implements G0.t0, AbstractC6740c {

    /* renamed from: u0  reason: collision with root package name */
    public D.m f181u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f182v0;

    /* renamed from: w0  reason: collision with root package name */
    public AbstractC6216a f183w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C0006a f184x0 = new C0006a();

    public AbstractC0012d(D.m mVar, boolean z10, AbstractC6216a abstractC6216a) {
        this.f181u0 = mVar;
        this.f182v0 = z10;
        this.f183w0 = abstractC6216a;
    }

    @Override // G0.t0
    public final void A() {
        C0().A();
    }

    public final void B0() {
        C0006a c0006a = this.f184x0;
        D.p pVar = c0006a.f160b;
        if (pVar != null) {
            this.f181u0.c(new D.o(pVar));
        }
        LinkedHashMap linkedHashMap = c0006a.f159a;
        for (D.p pVar2 : linkedHashMap.values()) {
            this.f181u0.c(new D.o(pVar2));
        }
        c0006a.f160b = null;
        linkedHashMap.clear();
    }

    public abstract AbstractC0016f C0();

    public final void D0(D.m mVar, boolean z10, AbstractC6216a abstractC6216a) {
        if (!AbstractC3557B.K(this.f181u0, mVar)) {
            B0();
            this.f181u0 = mVar;
        }
        if (this.f182v0 != z10) {
            if (!z10) {
                B0();
            }
            this.f182v0 = z10;
        }
        this.f183w0 = abstractC6216a;
    }

    @Override // G0.t0
    public final void N() {
        A();
    }

    @Override // G0.t0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // G0.t0
    public final void h0() {
        A();
    }

    @Override // z0.AbstractC6740c
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // G0.t0
    public final void s(C0194k c0194k, EnumC0195l enumC0195l, long j6) {
        C0().s(c0194k, enumC0195l, j6);
    }

    @Override // l0.AbstractC4325q
    public final void u0() {
        B0();
    }

    @Override // z0.AbstractC6740c
    public final boolean x(KeyEvent keyEvent) {
        int b10;
        boolean z10 = this.f182v0;
        C0006a c0006a = this.f184x0;
        if (z10) {
            int i10 = L.f90b;
            if (r.f.w(androidx.compose.ui.input.key.a.c(keyEvent), 2) && ((b10 = (int) (androidx.compose.ui.input.key.a.b(keyEvent) >> 32)) == 23 || b10 == 66 || b10 == 160)) {
                if (c0006a.f159a.containsKey(new C6738a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())))) {
                    return false;
                }
                D.p pVar = new D.p(c0006a.f161c);
                c0006a.f159a.put(new C6738a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())), pVar);
                Ad.l.O0(p0(), null, null, new C0008b(this, pVar, null), 3);
                return true;
            }
        }
        if (!this.f182v0) {
            return false;
        }
        int i11 = L.f90b;
        if (!r.f.w(androidx.compose.ui.input.key.a.c(keyEvent), 1)) {
            return false;
        }
        int b11 = (int) (androidx.compose.ui.input.key.a.b(keyEvent) >> 32);
        if (b11 != 23 && b11 != 66 && b11 != 160) {
            return false;
        }
        D.p pVar2 = (D.p) c0006a.f159a.remove(new C6738a(androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode())));
        if (pVar2 != null) {
            Ad.l.O0(p0(), null, null, new C0010c(this, pVar2, null), 3);
        }
        this.f183w0.mo122invoke();
        return true;
    }

    @Override // G0.t0
    public final /* synthetic */ void H() {
    }
}
