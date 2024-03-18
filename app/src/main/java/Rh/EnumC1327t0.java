package Rh;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sh.AbstractC5641m;
import wh.AbstractC6242g;
import yh.AbstractC6603e;
import yh.G1;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Rh.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1327t0 extends Enum implements AbstractC1325s0, AbstractC1314m0, AbstractC1318o0, AbstractC1322q0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1327t0 f15945Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1327t0[] f15946Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Rh.t0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f15945Y = r12;
        f15946Z = new EnumC1327t0[]{r12};
    }

    public static EnumC1327t0 valueOf(String str) {
        return (EnumC1327t0) Enum.valueOf(EnumC1327t0.class, str);
    }

    public static EnumC1327t0[] values() {
        return (EnumC1327t0[]) f15946Z.clone();
    }

    @Override // Rh.AbstractC1325s0
    public final l1.a a(String str, Map map, yh.l1 l1Var, p1 p1Var) {
        return new V0(p1Var, str);
    }

    @Override // Rh.AbstractC1318o0
    public final l1.a b(String str, p1 p1Var, Map map, AbstractC6242g abstractC6242g) {
        return new V0(p1Var, str);
    }

    @Override // Rh.AbstractC1318o0
    public final G1 c(ArrayList arrayList, p1 p1Var, Map map, M0 m02) {
        return new U0(p1Var, arrayList);
    }

    @Override // Rh.AbstractC1322q0
    public final l1.a d(String str, p1 p1Var, Map map, AbstractC6603e abstractC6603e) {
        return new V0(p1Var, str);
    }

    @Override // Rh.AbstractC1325s0
    public final G1 e(List list, p1 p1Var, Map map, yh.l1 l1Var) {
        return new U0(p1Var, list);
    }

    @Override // Rh.AbstractC1335x0
    public final G1 f(p1 p1Var, AbstractC5641m abstractC5641m, Map map, Map map2) {
        throw new GenericSignatureFormatError();
    }

    @Override // Rh.AbstractC1314m0
    public final l1.a g(String str, p1 p1Var, Map map, vh.c cVar) {
        return new V0(p1Var, str);
    }

    @Override // Rh.AbstractC1318o0
    public final G1 h(List list, p1 p1Var, Map map, AbstractC6242g abstractC6242g) {
        return new U0(p1Var, list);
    }
}
