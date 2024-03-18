package Mf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class A extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final Cf.k f12050Y = new Cf.k(9, 0);

    /* renamed from: Z  reason: collision with root package name */
    public static final A f12051Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final A f12052h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final A f12053i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final A f12054j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ A[] f12055k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Mf.A] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Mf.A] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Mf.A] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Mf.A] */
    static {
        ?? r42 = new Enum("FINAL", 0);
        f12051Z = r42;
        ?? r52 = new Enum("SEALED", 1);
        f12052h0 = r52;
        ?? r62 = new Enum("OPEN", 2);
        f12053i0 = r62;
        ?? r72 = new Enum("ABSTRACT", 3);
        f12054j0 = r72;
        A[] aArr = {r42, r52, r62, r72};
        f12055k0 = aArr;
        AbstractC3557B.C0(aArr);
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f12055k0.clone();
    }
}
