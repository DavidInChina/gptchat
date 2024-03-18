package ee;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class q extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final q f29338Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final q f29339Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final q f29340h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ q[] f29341i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, ee.q] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, ee.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, ee.q] */
    static {
        ?? r32 = new Enum("BOTH", 0);
        f29338Y = r32;
        ?? r42 = new Enum("HORIZONTAL", 1);
        f29339Z = r42;
        ?? r52 = new Enum("VERTICAL", 2);
        f29340h0 = r52;
        q[] qVarArr = {r32, r42, r52};
        f29341i0 = qVarArr;
        AbstractC3557B.C0(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f29341i0.clone();
    }
}
