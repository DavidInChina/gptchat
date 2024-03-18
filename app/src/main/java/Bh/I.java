package Bh;

import java.util.Collections;
import wh.C6246k;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class I extends Enum implements K, H {

    /* renamed from: Y  reason: collision with root package name */
    public static final I f2215Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ I[] f2216Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bh.I] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2215Y = r12;
        f2216Z = new I[]{r12};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f2216Z.clone();
    }

    @Override // Bh.O
    public final N b() {
        return new N(Collections.emptyList());
    }

    @Override // Bh.O
    public final M d(C6246k c6246k) {
        return L.f2229Y;
    }

    @Override // Bh.K
    public final O e() {
        return this;
    }

    @Override // Bh.K
    public final O a(l1 l1Var) {
        return this;
    }

    @Override // Bh.H
    public final K c(AbstractC0265q abstractC0265q) {
        return this;
    }
}
