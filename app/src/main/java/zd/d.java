package zd;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class d extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final d f51960Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ d[] f51961Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, zd.d] */
    static {
        ?? r32 = new Enum("System", 0);
        f51960Y = r32;
        d[] dVarArr = {r32, new Enum("Light", 1), new Enum("Dark", 2)};
        f51961Z = dVarArr;
        AbstractC3557B.C0(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f51961Z.clone();
    }
}
