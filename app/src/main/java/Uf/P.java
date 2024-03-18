package Uf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public class P extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final P f17782Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final P f17783h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final P f17784i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final O f17785j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ P[] f17786k0;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f17787Y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [Uf.O, Uf.P] */
    static {
        P p10 = new P(0, null, "NULL");
        f17782Z = p10;
        P p11 = new P(1, -1, "INDEX");
        f17783h0 = p11;
        P p12 = new P(2, Boolean.FALSE, "FALSE");
        f17784i0 = p12;
        ?? p13 = new P(3, null, "MAP_GET_OR_DEFAULT");
        f17785j0 = p13;
        P[] pArr = {p10, p11, p12, p13};
        f17786k0 = pArr;
        AbstractC3557B.C0(pArr);
    }

    public P(int i10, Object obj, String str) {
        this.f17787Y = obj;
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f17786k0.clone();
    }
}
