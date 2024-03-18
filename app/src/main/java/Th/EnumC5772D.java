package th;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC5772D extends Enum implements AbstractC5783O {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5813u f46163Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C5814v f46164Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final C5815w f46165h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final C5816x f46166i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final C5817y f46167j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final C5818z f46168k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final C5769A f46169l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C5770B f46170m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final C5771C f46171n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5772D[] f46172o0;

    static {
        C5813u c5813u = new C5813u();
        f46163Y = c5813u;
        C5814v c5814v = new C5814v();
        f46164Z = c5814v;
        C5815w c5815w = new C5815w();
        f46165h0 = c5815w;
        C5816x c5816x = new C5816x();
        f46166i0 = c5816x;
        C5817y c5817y = new C5817y();
        f46167j0 = c5817y;
        C5818z c5818z = new C5818z();
        f46168k0 = c5818z;
        C5769A c5769a = new C5769A();
        f46169l0 = c5769a;
        C5770B c5770b = new C5770B();
        f46170m0 = c5770b;
        C5771C c5771c = new C5771C();
        f46171n0 = c5771c;
        f46172o0 = new EnumC5772D[]{c5813u, c5814v, c5815w, c5816x, c5817y, c5818z, c5769a, c5770b, c5771c};
    }

    public static EnumC5772D valueOf(String str) {
        return (EnumC5772D) Enum.valueOf(EnumC5772D.class, str);
    }

    public static EnumC5772D[] values() {
        return (EnumC5772D[]) f46172o0.clone();
    }

    @Override // th.AbstractC5783O
    public final String c(Object obj) {
        ArrayList arrayList = new ArrayList(Array.getLength(obj));
        for (int i10 = 0; i10 < Array.getLength(obj); i10++) {
            arrayList.add(f(i10, obj));
        }
        return g0.JAVA_19_CAPABLE_VM.h(arrayList);
    }

    @Override // th.AbstractC5783O
    public final Object d(Object obj) {
        return e(obj);
    }

    public abstract Object e(Object obj);

    public abstract String f(int i10, Object obj);
}
