package r4;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class g extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final g f44437Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final g f44438Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ g[] f44439h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, r4.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, r4.g] */
    static {
        ?? r22 = new Enum("FILL", 0);
        f44437Y = r22;
        ?? r32 = new Enum("FIT", 1);
        f44438Z = r32;
        g[] gVarArr = {r22, r32};
        f44439h0 = gVarArr;
        AbstractC3557B.C0(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f44439h0.clone();
    }
}
