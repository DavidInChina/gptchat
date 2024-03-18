package Fh;

import wh.AbstractC6250o;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class A extends Enum implements B, w {

    /* renamed from: Y  reason: collision with root package name */
    public static final A f5373Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ A[] f5374Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Fh.A] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f5373Y = r12;
        f5374Z = new A[]{r12};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f5374Z.clone();
    }

    @Override // Fh.w
    public final B a(l1 l1Var) {
        return this;
    }

    @Override // Fh.B
    public final void b(Nh.l lVar, AbstractC6250o abstractC6250o, o oVar) {
    }
}
