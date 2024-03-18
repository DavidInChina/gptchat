package Tf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class d extends Enum implements a {

    /* renamed from: Y  reason: collision with root package name */
    public static final d f17211Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final d f17212Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final d f17213h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final d f17214i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final d f17215j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final d f17216k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final d f17217l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final d f17218m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ d[] f17219n0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Enum, Tf.d] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, Tf.d] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, Tf.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, Tf.d] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, Tf.d] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Enum, Tf.d] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, Tf.d] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Enum, Tf.d] */
    static {
        Enum r62 = new Enum("FROM_IDE", 0);
        Enum r72 = new Enum("FROM_BACKEND", 1);
        Enum r52 = new Enum("FROM_TEST", 2);
        ?? r42 = new Enum("FROM_BUILTINS", 3);
        f17211Y = r42;
        Enum r32 = new Enum("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        Enum r22 = new Enum("WHEN_CHECK_OVERRIDES", 5);
        Enum r12 = new Enum("FOR_SCRIPT", 6);
        ?? r02 = new Enum("FROM_REFLECTION", 7);
        f17212Z = r02;
        Enum r15 = new Enum("WHEN_RESOLVE_DECLARATION", 8);
        Enum r14 = new Enum("WHEN_GET_DECLARATION_SCOPE", 9);
        Enum r13 = new Enum("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        ?? r122 = new Enum("FOR_ALREADY_TRACKED", 11);
        f17213h0 = r122;
        ?? r11 = new Enum("WHEN_GET_ALL_DESCRIPTORS", 12);
        f17214i0 = r11;
        Enum r10 = new Enum("WHEN_TYPING", 13);
        ?? r92 = new Enum("WHEN_GET_SUPER_MEMBERS", 14);
        f17215j0 = r92;
        ?? r82 = new Enum("FOR_NON_TRACKED_SCOPE", 15);
        f17216k0 = r82;
        Enum r93 = new Enum("FROM_SYNTHETIC_SCOPE", 16);
        ?? r83 = new Enum("FROM_DESERIALIZATION", 17);
        f17217l0 = r83;
        ?? r94 = new Enum("FROM_JAVA_LOADER", 18);
        f17218m0 = r94;
        d[] dVarArr = {r62, r72, r52, r42, r32, r22, r12, r02, r15, r14, r13, r122, r11, r10, r92, r82, r93, r83, r94, new Enum("WHEN_GET_LOCAL_VARIABLE", 19), new Enum("WHEN_FIND_BY_FQNAME", 20), new Enum("WHEN_GET_COMPANION_OBJECT", 21), new Enum("FOR_DEFAULT_IMPORTS", 22)};
        f17219n0 = dVarArr;
        AbstractC3557B.C0(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f17219n0.clone();
    }
}
