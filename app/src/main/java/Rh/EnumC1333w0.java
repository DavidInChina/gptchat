package Rh;

import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import wh.AbstractC6242g;
import yh.AbstractC6603e;
import yh.G1;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Rh.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1333w0 extends Enum implements AbstractC1325s0, AbstractC1314m0, AbstractC1318o0, AbstractC1322q0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1333w0 f15959Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1333w0[] f15960Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Rh.w0, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f15959Y = r12;
        f15960Z = new EnumC1333w0[]{r12};
    }

    public static EnumC1333w0 valueOf(String str) {
        return (EnumC1333w0) Enum.valueOf(EnumC1333w0.class, str);
    }

    public static EnumC1333w0[] values() {
        return (EnumC1333w0[]) f15960Z.clone();
    }

    @Override // Rh.AbstractC1325s0
    public final l1.a a(String str, Map map, yh.l1 l1Var, p1 p1Var) {
        return C1331v0.i1(str, map, p1Var);
    }

    @Override // Rh.AbstractC1318o0
    public final l1.a b(String str, p1 p1Var, Map map, AbstractC6242g abstractC6242g) {
        return C1331v0.i1(str, map, p1Var);
    }

    @Override // Rh.AbstractC1318o0
    public final G1 c(ArrayList arrayList, p1 p1Var, Map map, M0 m02) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        return new C1329u0(p1Var, map, arrayList);
    }

    @Override // Rh.AbstractC1322q0
    public final l1.a d(String str, p1 p1Var, Map map, AbstractC6603e abstractC6603e) {
        return C1331v0.i1(str, map, p1Var);
    }

    @Override // Rh.AbstractC1325s0
    public final G1 e(List list, p1 p1Var, Map map, yh.l1 l1Var) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        return new C1329u0(p1Var, map, list);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [yh.G1, Qh.q] */
    @Override // Rh.AbstractC1335x0
    public final G1 f(p1 p1Var, AbstractC5641m abstractC5641m, Map map, Map map2) {
        return new AbstractC1239q(1);
    }

    @Override // Rh.AbstractC1314m0
    public final l1.a g(String str, p1 p1Var, Map map, vh.c cVar) {
        return C1331v0.i1(str, map, p1Var);
    }

    @Override // Rh.AbstractC1318o0
    public final G1 h(List list, p1 p1Var, Map map, AbstractC6242g abstractC6242g) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        return new C1329u0(p1Var, map, list);
    }
}
