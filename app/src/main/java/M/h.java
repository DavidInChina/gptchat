package M;

import B0.C0194k;
import B0.I;
import N.C1030n;
import N.K;
import N.j0;
import N.m0;
import Z.G0;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import java.util.LinkedHashMap;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class h implements G0 {

    /* renamed from: Y  reason: collision with root package name */
    public final long f11310Y;

    /* renamed from: Z  reason: collision with root package name */
    public final j0 f11311Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f11312h0;

    /* renamed from: i0  reason: collision with root package name */
    public k f11313i0;

    /* renamed from: j0  reason: collision with root package name */
    public C1030n f11314j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC4326r f11315k0;

    public h(long j6, j0 j0Var, long j10) {
        k kVar = k.f11325c;
        this.f11310Y = j6;
        this.f11311Z = j0Var;
        this.f11312h0 = j10;
        this.f11313i0 = kVar;
        g gVar = new g(this, 0);
        i iVar = new i(j6, j0Var, gVar);
        j jVar = new j(j6, j0Var, gVar);
        K k10 = new K(jVar, iVar, null);
        C0194k c0194k = I.f1599a;
        this.f11315k0 = new SuspendPointerInputElement(jVar, iVar, k10, 4).g(new PointerHoverIconModifierElement(false));
    }

    @Override // Z.G0
    public final void a() {
        C1030n c1030n = this.f11314j0;
        if (c1030n != null) {
            ((m0) this.f11311Z).d(c1030n);
            this.f11314j0 = null;
        }
    }

    @Override // Z.G0
    public final void c() {
        C1030n c1030n = this.f11314j0;
        if (c1030n != null) {
            ((m0) this.f11311Z).d(c1030n);
            this.f11314j0 = null;
        }
    }

    @Override // Z.G0
    public final void d() {
        g gVar = new g(this, 1);
        g gVar2 = new g(this, 2);
        long j6 = this.f11310Y;
        C1030n c1030n = new C1030n(j6, gVar, gVar2);
        m0 m0Var = (m0) this.f11311Z;
        m0Var.getClass();
        if (j6 != 0) {
            LinkedHashMap linkedHashMap = m0Var.f12375c;
            if (true ^ linkedHashMap.containsKey(Long.valueOf(j6))) {
                linkedHashMap.put(Long.valueOf(j6), c1030n);
                m0Var.f12374b.add(c1030n);
                m0Var.f12373a = false;
                this.f11314j0 = c1030n;
                return;
            }
            throw new IllegalArgumentException(("Another selectable with the id: " + c1030n + ".selectableId has already subscribed.").toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("The selectable contains an invalid id: ", j6).toString());
    }
}
