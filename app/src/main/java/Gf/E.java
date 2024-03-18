package Gf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class E extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final E f6338Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final E f6339Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ E[] f6340h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Gf.E] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Gf.E] */
    static {
        ?? r22 = new Enum("DECLARED", 0);
        f6338Y = r22;
        ?? r32 = new Enum("INHERITED", 1);
        f6339Z = r32;
        E[] eArr = {r22, r32};
        f6340h0 = eArr;
        AbstractC3557B.C0(eArr);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f6340h0.clone();
    }
}
