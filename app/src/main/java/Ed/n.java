package Ed;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class n extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final n f4690Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final n f4691h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ n[] f4692i0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f4693Y;

    static {
        n nVar = new n("Assistant", 0, "assistant");
        f4690Z = nVar;
        n nVar2 = new n("Voice", 1, "voice");
        f4691h0 = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f4692i0 = nVarArr;
        AbstractC3557B.C0(nVarArr);
    }

    public n(String str, int i10, String str2) {
        this.f4693Y = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f4692i0.clone();
    }
}
