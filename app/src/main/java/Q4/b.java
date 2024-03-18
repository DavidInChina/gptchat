package q4;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class b extends Enum {

    /* renamed from: h0  reason: collision with root package name */
    public static final b f43747h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final b f43748i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final b f43749j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ b[] f43750k0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f43751Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f43752Z;

    static {
        b bVar = new b("ENABLED", 0, true, true);
        f43747h0 = bVar;
        b bVar2 = new b("READ_ONLY", 1, true, false);
        b bVar3 = new b("WRITE_ONLY", 2, false, true);
        f43748i0 = bVar3;
        b bVar4 = new b("DISABLED", 3, false, false);
        f43749j0 = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f43750k0 = bVarArr;
        AbstractC3557B.C0(bVarArr);
    }

    public b(String str, int i10, boolean z10, boolean z11) {
        this.f43751Y = z10;
        this.f43752Z = z11;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f43750k0.clone();
    }
}
