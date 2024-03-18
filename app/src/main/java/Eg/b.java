package Eg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final b f4732Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ b[] f4733Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Eg.b] */
    static {
        ?? r32 = new Enum("FOR_SUBTYPING", 0);
        f4732Y = r32;
        b[] bVarArr = {r32, new Enum("FOR_INCORPORATION", 1), new Enum("FROM_EXPRESSION", 2)};
        f4733Z = bVarArr;
        AbstractC3557B.C0(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4733Z.clone();
    }
}
