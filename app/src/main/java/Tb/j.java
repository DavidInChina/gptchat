package tb;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class j extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final R4.a f46060Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final j f46061Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final j f46062h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final j f46063i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final j f46064j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final j f46065k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ j[] f46066l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [R4.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, tb.j] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, tb.j] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, tb.j] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, tb.j] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, tb.j] */
    static {
        ?? r52 = new Enum("Loading", 0);
        f46061Z = r52;
        ?? r62 = new Enum("Expired", 1);
        f46062h0 = r62;
        ?? r72 = new Enum("Unavailable", 2);
        f46063i0 = r72;
        ?? r82 = new Enum("Error", 3);
        f46064j0 = r82;
        ?? r92 = new Enum("Available", 4);
        f46065k0 = r92;
        j[] jVarArr = {r52, r62, r72, r82, r92};
        f46066l0 = jVarArr;
        AbstractC3557B.C0(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f46066l0.clone();
    }
}
