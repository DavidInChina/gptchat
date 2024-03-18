package th;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.N  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC5782N extends Enum implements AbstractC5783O {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5773E f46173Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C5774F f46174Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final C5775G f46175h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final C5776H f46176i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final C5777I f46177j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final C5778J f46178k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final C5779K f46179l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C5780L f46180m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final C5781M f46181n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5782N[] f46182o0;

    static {
        C5773E c5773e = new C5773E();
        f46173Y = c5773e;
        C5774F c5774f = new C5774F();
        f46174Z = c5774f;
        C5775G c5775g = new C5775G();
        f46175h0 = c5775g;
        C5776H c5776h = new C5776H();
        f46176i0 = c5776h;
        C5777I c5777i = new C5777I();
        f46177j0 = c5777i;
        C5778J c5778j = new C5778J();
        f46178k0 = c5778j;
        C5779K c5779k = new C5779K();
        f46179l0 = c5779k;
        C5780L c5780l = new C5780L();
        f46180m0 = c5780l;
        C5781M c5781m = new C5781M();
        f46181n0 = c5781m;
        f46182o0 = new EnumC5782N[]{c5773e, c5774f, c5775g, c5776h, c5777i, c5778j, c5779k, c5780l, c5781m};
    }

    public static EnumC5782N valueOf(String str) {
        return (EnumC5782N) Enum.valueOf(EnumC5782N.class, str);
    }

    public static EnumC5782N[] values() {
        return (EnumC5782N[]) f46182o0.clone();
    }

    @Override // th.AbstractC5783O
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // th.AbstractC5783O
    public final int b(Object obj) {
        return obj.hashCode();
    }

    @Override // th.AbstractC5783O
    public final Object d(Object obj) {
        return obj;
    }
}
