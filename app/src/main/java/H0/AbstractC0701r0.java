package H0;

import S0.AbstractC1355p;
import Z.AbstractC1725n;
import Z.AbstractC1748z;
import Z.C1737t0;
import Z.C1741v0;
import androidx.compose.ui.node.Owner;

/* renamed from: H0.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0701r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z.m1 f6998a = new AbstractC1748z(P.f6854p0);

    /* renamed from: b  reason: collision with root package name */
    public static final Z.m1 f6999b = new AbstractC1748z(P.f6855q0);

    /* renamed from: c  reason: collision with root package name */
    public static final Z.m1 f7000c = new AbstractC1748z(P.f6856r0);

    /* renamed from: d  reason: collision with root package name */
    public static final Z.m1 f7001d = new AbstractC1748z(P.f6857s0);

    /* renamed from: e  reason: collision with root package name */
    public static final Z.m1 f7002e = new AbstractC1748z(P.f6858t0);

    /* renamed from: f  reason: collision with root package name */
    public static final Z.m1 f7003f = new AbstractC1748z(P.f6859u0);

    /* renamed from: g  reason: collision with root package name */
    public static final Z.m1 f7004g = new AbstractC1748z(P.f6861w0);

    /* renamed from: h  reason: collision with root package name */
    public static final Z.m1 f7005h = new AbstractC1748z(P.f6860v0);

    /* renamed from: i  reason: collision with root package name */
    public static final Z.m1 f7006i = new AbstractC1748z(P.f6862x0);

    /* renamed from: j  reason: collision with root package name */
    public static final Z.m1 f7007j = new AbstractC1748z(P.f6863y0);

    /* renamed from: k  reason: collision with root package name */
    public static final Z.m1 f7008k = new AbstractC1748z(P.f6864z0);

    /* renamed from: l  reason: collision with root package name */
    public static final Z.m1 f7009l = new AbstractC1748z(P.f6839C0);

    /* renamed from: m  reason: collision with root package name */
    public static final Z.m1 f7010m = new AbstractC1748z(P.f6838B0);

    /* renamed from: n  reason: collision with root package name */
    public static final Z.m1 f7011n = new AbstractC1748z(P.f6840D0);

    /* renamed from: o  reason: collision with root package name */
    public static final Z.m1 f7012o = new AbstractC1748z(P.f6841E0);

    /* renamed from: p  reason: collision with root package name */
    public static final Z.m1 f7013p = new AbstractC1748z(P.f6842F0);

    /* renamed from: q  reason: collision with root package name */
    public static final Z.m1 f7014q = new AbstractC1748z(P.f6843G0);

    /* renamed from: r  reason: collision with root package name */
    public static final Z.m1 f7015r = new AbstractC1748z(P.f6837A0);

    public static final void a(Owner owner, W0 w02, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar;
        int i12;
        int i13;
        int i14;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(874662829);
        if ((i10 & 14) == 0) {
            if (rVar2.g(owner)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar2.g(w02)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar2.i(nVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar2.B()) {
            rVar2.P();
            rVar = rVar2;
        } else {
            C0714y c0714y = (C0714y) owner;
            C1737t0 b10 = f6998a.b(c0714y.getAccessibilityManager());
            C1737t0 b11 = f6999b.b(c0714y.getAutofill());
            C1737t0 b12 = f7000c.b(c0714y.getAutofillTree());
            C1737t0 b13 = f7001d.b(c0714y.getClipboardManager());
            C1737t0 b14 = f7002e.b(c0714y.getDensity());
            C1737t0 b15 = f7003f.b(c0714y.getFocusOwner());
            AbstractC1355p fontLoader = c0714y.getFontLoader();
            Z.m1 m1Var = f7004g;
            m1Var.getClass();
            C1737t0 c1737t0 = new C1737t0(m1Var, fontLoader, false);
            S0.r fontFamilyResolver = c0714y.getFontFamilyResolver();
            Z.m1 m1Var2 = f7005h;
            m1Var2.getClass();
            C1737t0[] c1737t0Arr = {b10, b11, b12, b13, b14, b15, c1737t0, new C1737t0(m1Var2, fontFamilyResolver, false), f7006i.b(c0714y.getHapticFeedBack()), f7007j.b(c0714y.getInputModeManager()), f7008k.b(c0714y.getLayoutDirection()), f7009l.b(c0714y.getTextInputService()), f7010m.b(c0714y.getSoftwareKeyboardController()), f7011n.b(c0714y.getTextToolbar()), f7012o.b(w02), f7013p.b(c0714y.getViewConfiguration()), f7014q.b(c0714y.getWindowInfo()), f7015r.b(c0714y.getPointerIconService())};
            rVar = rVar2;
            A7.b.l(c1737t0Arr, nVar, rVar, ((i11 >> 3) & 112) | 8);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new G.U(owner, w02, nVar, i10, 6);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
