package vf;

/* renamed from: vf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6045b {

    /* renamed from: c  reason: collision with root package name */
    public static final C6044a f47520c = new C6045b(false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f47521d = {13, 10};

    /* renamed from: e  reason: collision with root package name */
    public static final C6045b f47522e = new C6045b(true, false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f47523a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f47524b;

    /* JADX WARN: Type inference failed for: r0v0, types: [vf.b, vf.a] */
    static {
        new C6045b(false, true);
    }

    public C6045b(boolean z10, boolean z11) {
        this.f47523a = z10;
        this.f47524b = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final int a(int i10) {
        int i11;
        int i12 = (i10 + 2) / 3;
        if (this.f47524b) {
            i11 = (i12 - 1) / 19;
        } else {
            i11 = 0;
        }
        int i13 = (i11 * 2) + (i12 * 4);
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }
}
