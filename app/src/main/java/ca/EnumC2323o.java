package ca;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ca.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2323o extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2323o f26406Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC2323o f26407Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC2323o f26408h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC2323o f26409i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC2323o[] f26410j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [ca.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ca.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ca.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ca.o, java.lang.Enum] */
    static {
        ?? r42 = new Enum("InProgress", 0);
        f26406Y = r42;
        ?? r52 = new Enum("Success", 1);
        f26407Z = r52;
        ?? r62 = new Enum("Interrupted", 2);
        f26408h0 = r62;
        ?? r72 = new Enum("Error", 3);
        f26409i0 = r72;
        EnumC2323o[] enumC2323oArr = {r42, r52, r62, r72};
        f26410j0 = enumC2323oArr;
        AbstractC3557B.C0(enumC2323oArr);
    }

    public static EnumC2323o valueOf(String str) {
        return (EnumC2323o) Enum.valueOf(EnumC2323o.class, str);
    }

    public static EnumC2323o[] values() {
        return (EnumC2323o[]) f26410j0.clone();
    }

    public final boolean a() {
        if (this != f26406Y) {
            return true;
        }
        return false;
    }

    public final EnumC2323o b(EnumC2323o enumC2323o) {
        AbstractC3557B.c0("replaceWithState", enumC2323o);
        if (AbstractC2322n.f26405a[ordinal()] != 1) {
            return this;
        }
        return enumC2323o;
    }
}
