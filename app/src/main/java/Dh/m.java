package Dh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class m extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final k f3724Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final l f3725Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ m[] f3726h0;

    static {
        k kVar = new k();
        f3724Y = kVar;
        l lVar = new l();
        f3725Z = lVar;
        f3726h0 = new m[]{kVar, lVar};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f3726h0.clone();
    }
}
