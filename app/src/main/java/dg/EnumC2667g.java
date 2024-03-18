package dg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: dg.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2667g extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2667g f28314Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2667g f28315Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2667g f28316h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2667g[] f28317i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [dg.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dg.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dg.g, java.lang.Enum] */
    static {
        ?? r32 = new Enum("PROPERTY", 0);
        f28314Y = r32;
        ?? r42 = new Enum("BACKING_FIELD", 1);
        f28315Z = r42;
        ?? r52 = new Enum("DELEGATE_FIELD", 2);
        f28316h0 = r52;
        EnumC2667g[] enumC2667gArr = {r32, r42, r52};
        f28317i0 = enumC2667gArr;
        AbstractC3557B.C0(enumC2667gArr);
    }

    public static EnumC2667g valueOf(String str) {
        return (EnumC2667g) Enum.valueOf(EnumC2667g.class, str);
    }

    public static EnumC2667g[] values() {
        return (EnumC2667g[]) f28317i0.clone();
    }
}
