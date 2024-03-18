package mg;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: mg.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC4650A extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final z f39279Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final y f39280Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4650A[] f39281h0;

    static {
        z zVar = new z();
        f39279Y = zVar;
        y yVar = new y();
        f39280Z = yVar;
        EnumC4650A[] enumC4650AArr = {zVar, yVar};
        f39281h0 = enumC4650AArr;
        AbstractC3557B.C0(enumC4650AArr);
    }

    public static EnumC4650A valueOf(String str) {
        return (EnumC4650A) Enum.valueOf(EnumC4650A.class, str);
    }

    public static EnumC4650A[] values() {
        return (EnumC4650A[]) f39281h0.clone();
    }

    public abstract String a(String str);
}
