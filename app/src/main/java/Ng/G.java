package Ng;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class G extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final G f12867Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final G f12868Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final G f12869h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final G f12870i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ G[] f12871j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Ng.G] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ng.G] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Ng.G] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Ng.G] */
    static {
        ?? r42 = new Enum("DEFAULT", 0);
        f12867Y = r42;
        ?? r52 = new Enum("LAZY", 1);
        f12868Z = r52;
        ?? r62 = new Enum("ATOMIC", 2);
        f12869h0 = r62;
        ?? r72 = new Enum("UNDISPATCHED", 3);
        f12870i0 = r72;
        G[] gArr = {r42, r52, r62, r72};
        f12871j0 = gArr;
        AbstractC3557B.C0(gArr);
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f12871j0.clone();
    }
}
