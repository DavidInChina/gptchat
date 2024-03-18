package Rh;

import java.util.Collections;
import java.util.Map;
import sh.AbstractC5641m;
import th.AbstractC5806n;
import yh.AbstractC6601d0;
import yh.l1;

/* loaded from: classes2.dex */
public final class Y0 extends AbstractC6601d0 {

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15770Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1337y0 f15771h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f15772i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15773j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC5641m f15774k0;

    /* renamed from: l0  reason: collision with root package name */
    public transient /* synthetic */ l1.a f15775l0;

    /* renamed from: m0  reason: collision with root package name */
    public transient /* synthetic */ yh.l1 f15776m0;

    public Y0(String str, Map map, AbstractC5641m abstractC5641m, AbstractC1337y0 abstractC1337y0, p1 p1Var) {
        this.f15770Z = p1Var;
        this.f15771h0 = abstractC1337y0;
        this.f15772i0 = str;
        this.f15773j0 = map;
        this.f15774k0 = abstractC5641m;
    }

    public static Y0 j1(String str, Map map, AbstractC5641m abstractC5641m, AbstractC1337y0 abstractC1337y0, p1 p1Var) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        return new Y0(str, map, abstractC5641m, abstractC1337y0, p1Var);
    }

    public static yh.l1 k1(p1 p1Var, String str) {
        String str2;
        Nh.r u10 = Nh.r.u(str);
        if (u10.s() == 9) {
            str2 = u10.j().replace('/', '.');
        } else {
            str2 = u10.f();
        }
        return p1Var.a(str2).a();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return i1().getDeclaredAnnotations();
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        l1.a aVar;
        if (this.f15775l0 != null) {
            aVar = null;
        } else {
            aVar = this.f15771h0.a(this.f15770Z, this.f15774k0, "", this.f15773j0);
        }
        if (aVar == null) {
            return this.f15775l0;
        }
        this.f15775l0 = aVar;
        return aVar;
    }

    @Override // yh.AbstractC6632q
    public final yh.l1 l0() {
        yh.l1 l1Var;
        if (this.f15776m0 != null) {
            l1Var = null;
        } else {
            l1Var = k1(this.f15770Z, this.f15772i0);
        }
        if (l1Var == null) {
            return this.f15776m0;
        }
        this.f15776m0 = l1Var;
        return l1Var;
    }
}
