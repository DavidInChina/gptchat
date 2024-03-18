package hc;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;

/* renamed from: hc.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3406v extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3406v f32223Z = new C3406v(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3406v f32224h0 = new C3406v(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3406v f32225i0 = new C3406v(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3406v f32226j0 = new C3406v(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C3406v f32227k0 = new C3406v(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C3406v f32228l0 = new C3406v(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C3406v f32229m0 = new C3406v(6);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32230Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3406v(int i10) {
        super(1);
        this.f32230Y = i10;
    }

    public final C3403s a(C3403s c3403s) {
        switch (this.f32230Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", c3403s);
                return C3403s.e(c3403s, null, null, false, true, 15);
            case 1:
                AbstractC3557B.c0("$this$setState", c3403s);
                return C3403s.e(c3403s, null, null, false, false, 15);
            case 2:
                AbstractC3557B.c0("$this$setState", c3403s);
                return C3403s.e(c3403s, null, null, true, false, 23);
            default:
                AbstractC3557B.c0("$this$setState", c3403s);
                return C3403s.e(c3403s, null, null, false, false, 23);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f32230Y) {
            case 0:
                return a((C3403s) obj);
            case 1:
                return a((C3403s) obj);
            case 2:
                return a((C3403s) obj);
            case 3:
                return a((C3403s) obj);
            case 4:
                AbstractC2469q0.p(obj);
                AbstractC3557B.c0("it", null);
                return jf.y.f36177a;
            case 5:
                L l10 = (L) obj;
                AbstractC3557B.c0("$this$setState", l10);
                return L.e(l10, false, false, null, 11);
            default:
                zd.n nVar = (zd.n) obj;
                AbstractC3557B.c0("$this$update", nVar);
                return zd.n.a(nVar, false, null, false, true, false, false, false, false, null, false, 4079);
        }
    }
}
