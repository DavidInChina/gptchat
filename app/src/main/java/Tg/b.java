package Tg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final b f17229Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final b f17230Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final b f17231h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final b f17232i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final b f17233j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ b[] f17234k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [Tg.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [Tg.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Tg.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Tg.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Tg.b, java.lang.Enum] */
    static {
        ?? r52 = new Enum("CPU_ACQUIRED", 0);
        f17229Y = r52;
        ?? r62 = new Enum("BLOCKING", 1);
        f17230Z = r62;
        ?? r72 = new Enum("PARKING", 2);
        f17231h0 = r72;
        ?? r82 = new Enum("DORMANT", 3);
        f17232i0 = r82;
        ?? r92 = new Enum("TERMINATED", 4);
        f17233j0 = r92;
        b[] bVarArr = {r52, r62, r72, r82, r92};
        f17234k0 = bVarArr;
        AbstractC3557B.C0(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f17234k0.clone();
    }
}
