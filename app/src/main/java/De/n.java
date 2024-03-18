package de;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class n extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f28246Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ n[] f28247Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, de.n] */
    static {
        ?? r32 = new Enum("BOTH", 0);
        f28246Y = r32;
        n[] nVarArr = {r32, new Enum("HORIZONTAL", 1), new Enum("VERTICAL", 2)};
        f28247Z = nVarArr;
        AbstractC3557B.C0(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f28247Z.clone();
    }
}
