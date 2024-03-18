package mg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class w extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final w f39373Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final w f39374Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final w f39375h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ w[] f39376i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [mg.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [mg.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [mg.w, java.lang.Enum] */
    static {
        ?? r32 = new Enum("ALL", 0);
        f39373Y = r32;
        ?? r42 = new Enum("ONLY_NON_SYNTHESIZED", 1);
        f39374Z = r42;
        ?? r52 = new Enum("NONE", 2);
        f39375h0 = r52;
        w[] wVarArr = {r32, r42, r52};
        f39376i0 = wVarArr;
        AbstractC3557B.C0(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f39376i0.clone();
    }
}
