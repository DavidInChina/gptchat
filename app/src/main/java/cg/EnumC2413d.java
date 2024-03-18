package cg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: cg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2413d extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2413d f26624Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2413d f26625Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2413d[] f26626h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, cg.d] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, cg.d] */
    static {
        ?? r22 = new Enum("READ_ONLY", 0);
        f26624Y = r22;
        ?? r32 = new Enum("MUTABLE", 1);
        f26625Z = r32;
        EnumC2413d[] enumC2413dArr = {r22, r32};
        f26626h0 = enumC2413dArr;
        AbstractC3557B.C0(enumC2413dArr);
    }

    public static EnumC2413d valueOf(String str) {
        return (EnumC2413d) Enum.valueOf(EnumC2413d.class, str);
    }

    public static EnumC2413d[] values() {
        return (EnumC2413d[]) f26626h0.clone();
    }
}
