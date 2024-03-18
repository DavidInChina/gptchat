package Ug;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class j extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final j f17883Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final j f17884Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final j f17885h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final j f17886i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ j[] f17887j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Ug.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ug.j] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Ug.j] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Ug.j] */
    static {
        ?? r42 = new Enum("SUCCESSFUL", 0);
        f17883Y = r42;
        ?? r52 = new Enum("REREGISTER", 1);
        f17884Z = r52;
        ?? r62 = new Enum("CANCELLED", 2);
        f17885h0 = r62;
        ?? r72 = new Enum("ALREADY_SELECTED", 3);
        f17886i0 = r72;
        j[] jVarArr = {r42, r52, r62, r72};
        f17887j0 = jVarArr;
        AbstractC3557B.C0(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f17887j0.clone();
    }
}
