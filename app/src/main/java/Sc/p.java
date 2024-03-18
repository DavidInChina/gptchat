package Sc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class p extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final p f16543Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final p f16544Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final p f16545h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final p f16546i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ p[] f16547j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Sc.p] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Sc.p] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Sc.p] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Sc.p] */
    static {
        ?? r42 = new Enum("Retrieval", 0);
        f16543Y = r42;
        ?? r52 = new Enum("CodeInterpreter", 1);
        f16544Z = r52;
        ?? r62 = new Enum("Multimodal", 2);
        f16545h0 = r62;
        ?? r72 = new Enum("Unknown", 3);
        f16546i0 = r72;
        p[] pVarArr = {r42, r52, r62, r72};
        f16547j0 = pVarArr;
        AbstractC3557B.C0(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f16547j0.clone();
    }
}
