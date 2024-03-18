package h4;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class l extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final l f31892Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ l[] f31893Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, h4.l] */
    static {
        Enum r32 = new Enum("IGNORE", 0);
        ?? r42 = new Enum("RESPECT_PERFORMANCE", 1);
        f31892Y = r42;
        l[] lVarArr = {r32, r42, new Enum("RESPECT_ALL", 2)};
        f31893Z = lVarArr;
        AbstractC3557B.C0(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f31893Z.clone();
    }
}
