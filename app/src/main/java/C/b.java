package C;

import B.AbstractC0130h1;
import D1.A0;
import D1.AbstractC0374u;
import D1.H;
import D1.H0;
import D1.J0;
import D1.L;
import D1.Z;
import D1.x0;
import D1.y0;
import D1.z0;
import K4.J;
import L.AbstractC0849g0;
import L.EnumC0847f0;
import L.v0;
import Ng.AbstractC1070k;
import Wh.r;
import Wh.s;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.auth0.android.result.Credentials;
import com.google.android.gms.internal.play_billing.N;
import com.google.gson.reflect.TypeToken;
import g5.C3200b;
import h5.C3324b;
import h5.C3325c;
import i4.AbstractC3469b;
import i4.C3473f;
import i5.C3478d;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j5.AbstractC3910a;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import jf.y;
import jh.H1;
import ji.C4113B;
import k5.x;
import k5.z;
import kh.C4300a;
import kh.t;
import m.LayoutInflater$Factory2C4511H;
import m.RunnableC4517N;
import m1.C4547d;
import nh.AbstractC4854d;
import of.EnumC5000a;
import r0.C5341e;
import s1.C5523e;
import w3.K;
import w3.h0;
import yf.AbstractC6583a;
import z.AbstractC6661F;
import z.AbstractC6696f;
import z.AbstractC6714o;
import z.AbstractC6726u;
import z.AbstractC6728v;
import z.C6665H;
import z.C6736z;
import z0.C6738a;
import z0.C6739b;

/* loaded from: classes.dex */
public final class b implements AbstractC0849g0, AbstractC3910a, AbstractC0374u, AbstractC4854d, h0, AbstractC6728v {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2434Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f2435Z;

    public /* synthetic */ b(int i10, Object obj) {
        this.f2434Y = i10;
        this.f2435Z = obj;
    }

    @Override // j5.AbstractC3910a
    public void a(Object obj) {
        switch (this.f2434Y) {
            case 0:
                k((Credentials) obj);
                return;
            case 1:
                k((Credentials) obj);
                return;
            case 2:
                Void r22 = (Void) obj;
                ((AbstractC1070k) this.f2435Z).resumeWith(y.f36177a);
                return;
            default:
                k((Credentials) obj);
                return;
        }
    }

    @Override // nh.AbstractC4854d
    public Object b(C5341e c5341e) {
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 0:
                String str = (String) obj;
                AbstractC3557B.c0("name", str);
                return new C4300a(str, c5341e);
            case 1:
                C4113B c4113b = (C4113B) obj;
                AbstractC3557B.c0("path", c4113b);
                return new kh.b(c4113b, c5341e, null);
            case 2:
                Uri uri = (Uri) obj;
                AbstractC3557B.c0("uri", uri);
                String h10 = J.h(uri);
                if (h10 != null) {
                    return new C4300a(h10, c5341e);
                }
                return new t(uri, c5341e);
            default:
                AbstractC3469b abstractC3469b = (AbstractC3469b) obj;
                C3473f c3473f = ((i4.m) abstractC3469b).f32702Y;
                if (!c3473f.f32677Z) {
                    C4113B c4113b2 = (C4113B) c3473f.f32676Y.f32669c.get(1);
                    Re.a aVar = new Re.a(4, abstractC3469b);
                    AbstractC3557B.c0("path", c4113b2);
                    return new kh.b(c4113b2, c5341e, aVar);
                }
                throw new IllegalStateException("snapshot is closed".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x021c, code lost:
        if (z0.C6738a.a(r0, L.v0.f10330q) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
        if (z0.C6738a.a(androidx.compose.ui.input.key.a.a(r12.getKeyCode()), L.v0.f10320g) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    @Override // L.AbstractC0849g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EnumC0847f0 c(KeyEvent keyEvent) {
        EnumC0847f0 enumC0847f0 = EnumC0847f0.DELETE_PREV_CHAR;
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 0:
                wf.k kVar = (wf.k) obj;
                boolean booleanValue = ((Boolean) kVar.invoke(new C6739b(keyEvent))).booleanValue();
                EnumC0847f0 enumC0847f02 = EnumC0847f0.REDO;
                if (booleanValue && keyEvent.isShiftPressed()) {
                    break;
                } else {
                    boolean booleanValue2 = ((Boolean) kVar.invoke(new C6739b(keyEvent))).booleanValue();
                    EnumC0847f0 enumC0847f03 = EnumC0847f0.CUT;
                    EnumC0847f0 enumC0847f04 = EnumC0847f0.COPY;
                    EnumC0847f0 enumC0847f05 = EnumC0847f0.PASTE;
                    if (booleanValue2) {
                        long b10 = androidx.compose.ui.input.key.a.b(keyEvent);
                        if (!C6738a.a(b10, v0.f10315b) && !C6738a.a(b10, v0.f10330q)) {
                            if (!C6738a.a(b10, v0.f10317d)) {
                                if (!C6738a.a(b10, v0.f10319f)) {
                                    if (C6738a.a(b10, v0.f10314a)) {
                                        return EnumC0847f0.SELECT_ALL;
                                    }
                                    if (!C6738a.a(b10, v0.f10318e)) {
                                        if (C6738a.a(b10, v0.f10320g)) {
                                            return EnumC0847f0.UNDO;
                                        }
                                        return null;
                                    }
                                    return enumC0847f02;
                                }
                                return enumC0847f03;
                            }
                            return enumC0847f05;
                        }
                        return enumC0847f04;
                    }
                    if (!keyEvent.isCtrlPressed()) {
                        if (keyEvent.isShiftPressed()) {
                            long a5 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                            if (C6738a.a(a5, v0.f10322i)) {
                                return EnumC0847f0.SELECT_LEFT_CHAR;
                            }
                            if (C6738a.a(a5, v0.f10323j)) {
                                return EnumC0847f0.SELECT_RIGHT_CHAR;
                            }
                            if (C6738a.a(a5, v0.f10324k)) {
                                return EnumC0847f0.SELECT_UP;
                            }
                            if (C6738a.a(a5, v0.f10325l)) {
                                return EnumC0847f0.SELECT_DOWN;
                            }
                            if (C6738a.a(a5, v0.f10326m)) {
                                return EnumC0847f0.SELECT_PAGE_UP;
                            }
                            if (C6738a.a(a5, v0.f10327n)) {
                                return EnumC0847f0.SELECT_PAGE_DOWN;
                            }
                            if (C6738a.a(a5, v0.f10328o)) {
                                return EnumC0847f0.SELECT_LINE_START;
                            }
                            if (!C6738a.a(a5, v0.f10329p)) {
                                break;
                            } else {
                                return EnumC0847f0.SELECT_LINE_END;
                            }
                        } else {
                            long a10 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                            if (C6738a.a(a10, v0.f10322i)) {
                                return EnumC0847f0.LEFT_CHAR;
                            }
                            if (C6738a.a(a10, v0.f10323j)) {
                                return EnumC0847f0.RIGHT_CHAR;
                            }
                            if (C6738a.a(a10, v0.f10324k)) {
                                return EnumC0847f0.UP;
                            }
                            if (C6738a.a(a10, v0.f10325l)) {
                                return EnumC0847f0.DOWN;
                            }
                            if (C6738a.a(a10, v0.f10326m)) {
                                return EnumC0847f0.PAGE_UP;
                            }
                            if (C6738a.a(a10, v0.f10327n)) {
                                return EnumC0847f0.PAGE_DOWN;
                            }
                            if (C6738a.a(a10, v0.f10328o)) {
                                return EnumC0847f0.LINE_START;
                            }
                            if (C6738a.a(a10, v0.f10329p)) {
                                return EnumC0847f0.LINE_END;
                            }
                            if (C6738a.a(a10, v0.f10331r)) {
                                return EnumC0847f0.NEW_LINE;
                            }
                            if (!C6738a.a(a10, v0.f10332s)) {
                                if (C6738a.a(a10, v0.f10333t)) {
                                    return EnumC0847f0.DELETE_NEXT_CHAR;
                                }
                                if (!C6738a.a(a10, v0.f10334u)) {
                                    if (!C6738a.a(a10, v0.f10335v)) {
                                        if (!C6738a.a(a10, v0.f10336w)) {
                                            if (C6738a.a(a10, v0.f10337x)) {
                                                return EnumC0847f0.TAB;
                                            }
                                        }
                                        return enumC0847f04;
                                    }
                                    return enumC0847f03;
                                }
                                return enumC0847f05;
                            }
                            return enumC0847f0;
                        }
                    }
                    return null;
                }
                break;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long a11 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                    if (C6738a.a(a11, v0.f10322i)) {
                        enumC0847f0 = EnumC0847f0.SELECT_LEFT_WORD;
                    } else if (C6738a.a(a11, v0.f10323j)) {
                        enumC0847f0 = EnumC0847f0.SELECT_RIGHT_WORD;
                    } else if (C6738a.a(a11, v0.f10324k)) {
                        enumC0847f0 = EnumC0847f0.SELECT_PREV_PARAGRAPH;
                    } else {
                        if (C6738a.a(a11, v0.f10325l)) {
                            enumC0847f0 = EnumC0847f0.SELECT_NEXT_PARAGRAPH;
                        }
                        enumC0847f0 = null;
                    }
                    if (enumC0847f0 == null) {
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long a12 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                    if (C6738a.a(a12, v0.f10322i)) {
                        enumC0847f0 = EnumC0847f0.LEFT_WORD;
                    } else if (C6738a.a(a12, v0.f10323j)) {
                        enumC0847f0 = EnumC0847f0.RIGHT_WORD;
                    } else if (C6738a.a(a12, v0.f10324k)) {
                        enumC0847f0 = EnumC0847f0.PREV_PARAGRAPH;
                    } else if (C6738a.a(a12, v0.f10325l)) {
                        enumC0847f0 = EnumC0847f0.NEXT_PARAGRAPH;
                    } else if (!C6738a.a(a12, v0.f10316c)) {
                        if (C6738a.a(a12, v0.f10333t)) {
                            enumC0847f0 = EnumC0847f0.DELETE_NEXT_WORD;
                        } else if (C6738a.a(a12, v0.f10332s)) {
                            enumC0847f0 = EnumC0847f0.DELETE_PREV_WORD;
                        } else {
                            if (C6738a.a(a12, v0.f10321h)) {
                                enumC0847f0 = EnumC0847f0.DESELECT;
                            }
                            enumC0847f0 = null;
                        }
                    }
                    if (enumC0847f0 == null) {
                        return ((AbstractC0849g0) obj).c(keyEvent);
                    }
                    return enumC0847f0;
                } else if (keyEvent.isShiftPressed()) {
                    long a13 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                    if (C6738a.a(a13, v0.f10328o)) {
                        enumC0847f0 = EnumC0847f0.SELECT_LINE_LEFT;
                    } else {
                        if (C6738a.a(a13, v0.f10329p)) {
                            enumC0847f0 = EnumC0847f0.SELECT_LINE_RIGHT;
                        }
                        enumC0847f0 = null;
                    }
                    if (enumC0847f0 == null) {
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long a14 = androidx.compose.ui.input.key.a.a(keyEvent.getKeyCode());
                        if (C6738a.a(a14, v0.f10332s)) {
                            enumC0847f0 = EnumC0847f0.DELETE_FROM_LINE_START;
                        } else if (C6738a.a(a14, v0.f10333t)) {
                            enumC0847f0 = EnumC0847f0.DELETE_TO_LINE_END;
                        }
                        if (enumC0847f0 == null) {
                        }
                    }
                    enumC0847f0 = null;
                    if (enumC0847f0 == null) {
                    }
                }
                break;
        }
    }

    @Override // j5.AbstractC3910a
    public void d(C3200b c3200b) {
        switch (this.f2434Y) {
            case 0:
                ((AbstractC1070k) this.f2435Z).resumeWith(N.w((C3478d) c3200b));
                return;
            case 1:
                j((C3325c) c3200b);
                return;
            case 2:
                j((C3325c) c3200b);
                return;
            default:
                j((C3325c) c3200b);
                return;
        }
    }

    @Override // D1.AbstractC0374u
    public J0 e(View view, J0 j02) {
        A0 a02;
        boolean z10;
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 0:
                int d10 = j02.d();
                int K10 = ((LayoutInflater$Factory2C4511H) obj).K(j02, null);
                if (d10 != K10) {
                    int b10 = j02.b();
                    int c10 = j02.c();
                    int a5 = j02.a();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        a02 = new z0(j02);
                    } else if (i11 >= 29) {
                        a02 = new y0(j02);
                    } else {
                        a02 = new x0(j02);
                    }
                    a02.g(C5523e.b(b10, K10, c10, a5));
                    j02 = a02.b();
                }
                WeakHashMap weakHashMap = Z.f3247a;
                WindowInsets f6 = j02.f();
                if (f6 != null) {
                    WindowInsets b11 = L.b(view, f6);
                    if (!b11.equals(f6)) {
                        return J0.g(view, b11);
                    }
                    return j02;
                }
                return j02;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!C1.b.a(coordinatorLayout.f24903u0, j02)) {
                    coordinatorLayout.f24903u0 = j02;
                    boolean z11 = true;
                    if (j02.d() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    coordinatorLayout.f24904v0 = z10;
                    if (z10 || coordinatorLayout.getBackground() != null) {
                        z11 = false;
                    }
                    coordinatorLayout.setWillNotDraw(z11);
                    H0 h02 = j02.f3232a;
                    if (!h02.n()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = coordinatorLayout.getChildAt(i12);
                            WeakHashMap weakHashMap2 = Z.f3247a;
                            if (!H.b(childAt) || ((C4547d) childAt.getLayoutParams()).f38851a == null || !h02.n()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return j02;
        }
    }

    public Object f(AbstractC0130h1 abstractC0130h1, float f6, float f10, e eVar, i iVar) {
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 0:
                Object a5 = n.a(abstractC0130h1, f6, AbstractC6696f.b(0.0f, f10, 28), (C6736z) obj, eVar, iVar);
                if (a5 != EnumC5000a.f41328Y) {
                    return (a) a5;
                }
                return a5;
            default:
                Object b10 = n.b(abstractC0130h1, Math.signum(f10) * Math.abs(f6), f6, AbstractC6696f.b(0.0f, f10, 28), (AbstractC6714o) obj, eVar, iVar);
                if (b10 != EnumC5000a.f41328Y) {
                    return (a) b10;
                }
                return b10;
        }
    }

    public AbstractC6661F g(int i10) {
        Object obj = this.f2435Z;
        int i11 = this.f2434Y;
        switch (i11) {
            case 0:
                switch (i11) {
                    case 0:
                        return (C6665H) ((List) obj).get(i10);
                    default:
                        return (C6665H) obj;
                }
            case 1:
                switch (i11) {
                    case 0:
                        return (C6665H) ((List) obj).get(i10);
                    default:
                        return (C6665H) obj;
                }
            default:
                return (AbstractC6661F) obj;
        }
    }

    public int h(View view) {
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 0:
                ((K) obj).getClass();
                return view.getRight() + ((w3.L) view.getLayoutParams()).f47768b.right + ((ViewGroup.MarginLayoutParams) ((w3.L) view.getLayoutParams())).rightMargin;
            default:
                ((K) obj).getClass();
                return view.getBottom() + ((w3.L) view.getLayoutParams()).f47768b.bottom + ((ViewGroup.MarginLayoutParams) ((w3.L) view.getLayoutParams())).bottomMargin;
        }
    }

    public int i(View view) {
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 0:
                ((K) obj).getClass();
                return (view.getLeft() - ((w3.L) view.getLayoutParams()).f47768b.left) - ((ViewGroup.MarginLayoutParams) ((w3.L) view.getLayoutParams())).leftMargin;
            default:
                ((K) obj).getClass();
                return (view.getTop() - ((w3.L) view.getLayoutParams()).f47768b.top) - ((ViewGroup.MarginLayoutParams) ((w3.L) view.getLayoutParams())).topMargin;
        }
    }

    public void j(C3325c c3325c) {
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 1:
                ((AbstractC1070k) obj).resumeWith(N.w(c3325c));
                return;
            case 2:
                ((AbstractC1070k) obj).resumeWith(N.w(c3325c));
                return;
            default:
                if (AbstractC3557B.K("Unauthorized", c3325c.b())) {
                    AbstractC3612c.c(TokenNames.f24311E, "Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to 'Native' and Token Endpoint Authentication Method to 'None' for this app at 'https://manage.auth0.com/#/applications/" + ((z) obj).f37101m.f31907a.f31279a + "/settings'.");
                }
                ((z) obj).f37096h.d(c3325c);
                return;
        }
    }

    public void k(Credentials credentials) {
        int i10 = this.f2434Y;
        Object obj = this.f2435Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("result", credentials);
                ((AbstractC1070k) obj).resumeWith(credentials);
                return;
            case 1:
                AbstractC3557B.c0("result", credentials);
                ((AbstractC1070k) obj).resumeWith(credentials);
                return;
            default:
                AbstractC3557B.c0("credentials", credentials);
                z zVar = (z) obj;
                String c10 = credentials.c();
                k5.y yVar = new k5.y(zVar, 0, credentials);
                String str = z.f37094q;
                zVar.getClass();
                if (TextUtils.isEmpty(c10)) {
                    yVar.d(new k5.J("ID token is required but missing", null));
                    return;
                }
                try {
                    AbstractC3557B.Z(c10);
                    com.auth0.android.request.internal.k kVar = new com.auth0.android.request.internal.k(c10);
                    x xVar = new x(yVar, zVar, kVar);
                    C3324b c3324b = zVar.f37101m;
                    c3324b.getClass();
                    char[] cArr = s.f21249j;
                    r f6 = H1.n(String.valueOf(c3324b.f31907a.f31280b)).f();
                    f6.a(".well-known");
                    f6.a("jwks.json");
                    s b10 = f6.b();
                    I8.n nVar = c3324b.f31909c;
                    AbstractC3557B.c0("gson", nVar);
                    TypeToken<?> parameterized = TypeToken.getParameterized(Map.class, String.class, PublicKey.class);
                    AbstractC3557B.a0("null cannot be cast to non-null type com.google.gson.reflect.TypeToken<kotlin.collections.Map<kotlin.String, T of com.auth0.android.request.internal.GsonAdapter.Companion.forMapOf>>", parameterized);
                    com.auth0.android.request.internal.e eVar = new com.auth0.android.request.internal.e(nVar, parameterized);
                    com.auth0.android.request.internal.l lVar = c3324b.f31908b;
                    lVar.getClass();
                    String str2 = b10.f21257h;
                    AbstractC3557B.c0("url", str2);
                    com.auth0.android.request.internal.b a5 = lVar.a(l5.c.f37837a, str2, eVar, lVar.f26752b);
                    a5.f26723e.a(new RunnableC4517N(a5, 29, new k5.y(kVar.f26740e, 1, xVar)));
                    return;
                } catch (Exception e10) {
                    yVar.d(new k5.J("ID token could not be decoded", e10));
                    return;
                }
        }
    }

    public b(float f6, float f10, AbstractC6726u abstractC6726u) {
        this.f2434Y = 0;
        Cf.g D02 = N.D0(0, abstractC6726u.b());
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(D02, 10));
        Cf.f it = D02.iterator();
        while (it.f3111h0) {
            arrayList.add(new C6665H(f6, f10, abstractC6726u.a(it.a())));
        }
        this.f2435Z = arrayList;
    }

    public b(float f6, float f10) {
        this.f2434Y = 1;
        this.f2435Z = new C6665H(f6, f10, 0.01f);
    }

    public b(AbstractC6661F abstractC6661F) {
        this.f2434Y = 2;
        this.f2435Z = abstractC6661F;
    }
}
