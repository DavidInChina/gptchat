package Eh;

import wh.AbstractC6250o;
import wh.C6249n;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Eh.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0517p extends Enum implements r {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0517p f4801Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0517p[] f4802Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Eh.p] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f4801Y = r12;
        f4802Z = new EnumC0517p[]{r12};
    }

    public static EnumC0517p valueOf(String str) {
        return (EnumC0517p) Enum.valueOf(EnumC0517p.class, str);
    }

    public static EnumC0517p[] values() {
        return (EnumC0517p[]) f4802Z.clone();
    }

    @Override // Eh.r
    public final l1 a() {
        throw new IllegalStateException("An illegal special method invocation must not be applied");
    }

    @Override // Hh.n
    public final boolean b() {
        return false;
    }

    @Override // Eh.r
    public final AbstractC6250o c() {
        throw new IllegalStateException("An illegal special method invocation must not be applied");
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        throw new IllegalStateException("Cannot implement an undefined method");
    }

    @Override // Eh.r
    public final r g(C6249n c6249n) {
        return this;
    }
}
