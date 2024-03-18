package H0;

import android.os.Looper;
import android.view.Choreographer;
import pf.AbstractC5163j;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class P extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6865Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final P f6845Z = new P(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final P f6846h0 = new P(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final P f6847i0 = new P(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final P f6848j0 = new P(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final P f6849k0 = new P(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final P f6850l0 = new P(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final P f6851m0 = new P(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final P f6852n0 = new P(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final P f6853o0 = new P(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final P f6854p0 = new P(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final P f6855q0 = new P(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final P f6856r0 = new P(11);

    /* renamed from: s0  reason: collision with root package name */
    public static final P f6857s0 = new P(12);

    /* renamed from: t0  reason: collision with root package name */
    public static final P f6858t0 = new P(13);

    /* renamed from: u0  reason: collision with root package name */
    public static final P f6859u0 = new P(14);

    /* renamed from: v0  reason: collision with root package name */
    public static final P f6860v0 = new P(15);

    /* renamed from: w0  reason: collision with root package name */
    public static final P f6861w0 = new P(16);

    /* renamed from: x0  reason: collision with root package name */
    public static final P f6862x0 = new P(17);

    /* renamed from: y0  reason: collision with root package name */
    public static final P f6863y0 = new P(18);

    /* renamed from: z0  reason: collision with root package name */
    public static final P f6864z0 = new P(19);

    /* renamed from: A0  reason: collision with root package name */
    public static final P f6837A0 = new P(20);

    /* renamed from: B0  reason: collision with root package name */
    public static final P f6838B0 = new P(21);

    /* renamed from: C0  reason: collision with root package name */
    public static final P f6839C0 = new P(22);

    /* renamed from: D0  reason: collision with root package name */
    public static final P f6840D0 = new P(23);

    /* renamed from: E0  reason: collision with root package name */
    public static final P f6841E0 = new P(24);

    /* renamed from: F0  reason: collision with root package name */
    public static final P f6842F0 = new P(25);

    /* renamed from: G0  reason: collision with root package name */
    public static final P f6843G0 = new P(26);

    /* renamed from: H0  reason: collision with root package name */
    public static final P f6844H0 = new P(27);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(int i10) {
        super(0);
        this.f6865Y = i10;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [pf.j, wf.n] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Choreographer choreographer;
        Boolean bool = Boolean.FALSE;
        switch (this.f6865Y) {
            case 0:
                return bool;
            case 1:
                return Float.valueOf(0.0f);
            case 2:
                Z.b("LocalConfiguration");
                throw null;
            case 3:
                Z.b("LocalContext");
                throw null;
            case 4:
                Z.b("LocalImageVectorCache");
                throw null;
            case 5:
                Z.b("LocalLifecycleOwner");
                throw null;
            case 6:
                Z.b("LocalSavedStateRegistryOwner");
                throw null;
            case 7:
                Z.b("LocalView");
                throw null;
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    Tg.e eVar = Ng.Q.f12904a;
                    choreographer = (Choreographer) Ad.l.a1(Sg.u.f16684a, new AbstractC5163j(2, null));
                }
                C0676e0 c0676e0 = new C0676e0(choreographer, AbstractC5260f.m(Looper.getMainLooper()));
                return c0676e0.plus(c0676e0.f6948p0);
            case 9:
            case 10:
                return null;
            case 11:
                AbstractC0701r0.b("LocalAutofillTree");
                throw null;
            case 12:
                AbstractC0701r0.b("LocalClipboardManager");
                throw null;
            case 13:
                AbstractC0701r0.b("LocalDensity");
                throw null;
            case 14:
                AbstractC0701r0.b("LocalFocusManager");
                throw null;
            case 15:
                AbstractC0701r0.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                AbstractC0701r0.b("LocalFontLoader");
                throw null;
            case 17:
                AbstractC0701r0.b("LocalHapticFeedback");
                throw null;
            case 18:
                AbstractC0701r0.b("LocalInputManager");
                throw null;
            case 19:
                AbstractC0701r0.b("LocalLayoutDirection");
                throw null;
            case 20:
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC0701r0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC0701r0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC0701r0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC0701r0.b("LocalWindowInfo");
                throw null;
            default:
                return bool;
        }
    }
}
