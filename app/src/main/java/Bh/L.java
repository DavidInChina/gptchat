package Bh;

import java.util.Set;
import wh.AbstractC6250o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class L extends Enum implements M {

    /* renamed from: Y  reason: collision with root package name */
    public static final L f2229Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ L[] f2230Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bh.L] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2229Y = r12;
        f2230Z = new L[]{r12};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f2230Z.clone();
    }

    @Override // Bh.M
    public final int c() {
        return 4;
    }

    @Override // Bh.M
    public final Set d() {
        throw new IllegalStateException("Cannot resolve bridge method of an illegal node");
    }

    @Override // Bh.M
    public final AbstractC6250o e() {
        throw new IllegalStateException("Cannot resolve the method of an illegal node");
    }

    @Override // Bh.M
    public final xh.e getVisibility() {
        throw new IllegalStateException("Cannot resolve visibility of an illegal node");
    }
}
