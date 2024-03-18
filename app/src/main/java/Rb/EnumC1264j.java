package Rb;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Rb.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1264j extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1264j f15352Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1264j f15353Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1264j f15354h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1264j f15355i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1264j[] f15356j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Rb.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Rb.j] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Rb.j] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Rb.j] */
    static {
        ?? r42 = new Enum("URL", 0);
        f15352Y = r42;
        ?? r52 = new Enum("MULTI_LINE_TEXT", 1);
        f15353Z = r52;
        ?? r62 = new Enum("SINGLE_LINE_TEXT", 2);
        f15354h0 = r62;
        ?? r72 = new Enum("EMAIL", 3);
        f15355i0 = r72;
        EnumC1264j[] enumC1264jArr = {r42, r52, r62, r72};
        f15356j0 = enumC1264jArr;
        AbstractC3557B.C0(enumC1264jArr);
    }

    public static EnumC1264j valueOf(String str) {
        return (EnumC1264j) Enum.valueOf(EnumC1264j.class, str);
    }

    public static EnumC1264j[] values() {
        return (EnumC1264j[]) f15356j0.clone();
    }
}
