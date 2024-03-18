package Eh;

import wh.AbstractC6236a;
import wh.AbstractC6250o;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class I extends Enum implements J, F {

    /* renamed from: Y  reason: collision with root package name */
    public static final I f4752Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ I[] f4753Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Eh.I] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f4752Y = r12;
        f4753Z = new I[]{r12};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f4753Z.clone();
    }

    @Override // Eh.J
    public final Hh.n b(AbstractC6250o abstractC6250o, AbstractC0522v abstractC0522v) {
        AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o;
        if (abstractC6236a.m1(abstractC0522v.f4810a) && abstractC6236a.o1()) {
            return E9.f.i(abstractC6236a);
        }
        throw new IllegalStateException("Cannot invoke " + abstractC6236a + " virtually");
    }

    @Override // Eh.F
    public final J a(l1 l1Var) {
        return this;
    }
}
