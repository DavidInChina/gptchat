package Lf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class k extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final k f11098Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final k f11099Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final k f11100h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final k f11101i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final k f11102j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ k[] f11103k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Lf.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Lf.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Lf.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Lf.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Lf.k, java.lang.Enum] */
    static {
        ?? r52 = new Enum("HIDDEN", 0);
        f11098Y = r52;
        ?? r62 = new Enum("VISIBLE", 1);
        f11099Z = r62;
        ?? r72 = new Enum("DEPRECATED_LIST_METHODS", 2);
        f11100h0 = r72;
        ?? r82 = new Enum("NOT_CONSIDERED", 3);
        f11101i0 = r82;
        ?? r92 = new Enum("DROP", 4);
        f11102j0 = r92;
        k[] kVarArr = {r52, r62, r72, r82, r92};
        f11103k0 = kVarArr;
        AbstractC3557B.C0(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f11103k0.clone();
    }
}
