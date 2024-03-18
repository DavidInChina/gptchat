package jf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3958h extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC3958h f36152Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3958h f36153Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3958h[] f36154h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jf.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jf.h] */
    static {
        Enum r32 = new Enum("SYNCHRONIZED", 0);
        ?? r42 = new Enum("PUBLICATION", 1);
        f36152Y = r42;
        ?? r52 = new Enum("NONE", 2);
        f36153Z = r52;
        EnumC3958h[] enumC3958hArr = {r32, r42, r52};
        f36154h0 = enumC3958hArr;
        AbstractC3557B.C0(enumC3958hArr);
    }

    public static EnumC3958h valueOf(String str) {
        return (EnumC3958h) Enum.valueOf(EnumC3958h.class, str);
    }

    public static EnumC3958h[] values() {
        return (EnumC3958h[]) f36154h0.clone();
    }
}
