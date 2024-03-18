package Rh;

import java.util.Collections;
import java.util.Map;
import sh.AbstractC5641m;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Rh.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1300f0 extends Enum implements AbstractC1337y0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1300f0 f15840Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1300f0[] f15841Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Rh.f0, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f15840Y = r12;
        f15841Z = new EnumC1300f0[]{r12};
    }

    public static EnumC1300f0 valueOf(String str) {
        return (EnumC1300f0) Enum.valueOf(EnumC1300f0.class, str);
    }

    public static EnumC1300f0[] values() {
        return (EnumC1300f0[]) f15841Z.clone();
    }

    @Override // Rh.AbstractC1337y0
    public final l1.a a(p1 p1Var, AbstractC5641m abstractC5641m, String str, Map map) {
        if (map == null) {
            map = Collections.emptyMap();
        }
        return new C1298e0(str, map, p1Var);
    }

    @Override // Rh.AbstractC1337y0
    public final boolean b(p1 p1Var) {
        throw new IllegalStateException("A wildcard type cannot be a type variable bound: " + this);
    }

    @Override // Rh.AbstractC1337y0
    public final String c() {
        throw new IllegalStateException("An unbound wildcard cannot be the owner of a nested type: " + this);
    }
}
