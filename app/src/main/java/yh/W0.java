package yh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class W0 extends Enum implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public static final U0 f50974Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final V0 f50975Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ W0[] f50976h0;

    static {
        U0 u02 = new U0();
        f50974Y = u02;
        V0 v02 = new V0();
        f50975Z = v02;
        f50976h0 = new W0[]{u02, v02};
    }

    public static W0 valueOf(String str) {
        return (W0) Enum.valueOf(W0.class, str);
    }

    public static W0[] values() {
        return (W0[]) f50976h0.clone();
    }
}
