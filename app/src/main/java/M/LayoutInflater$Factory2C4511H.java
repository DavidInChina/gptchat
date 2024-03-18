package m;

import D1.AbstractC0363m;
import D1.C0358j0;
import D1.J0;
import D1.Z;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2082q;
import com.openai.chatgpt.R;
import g.RunnableC3111d;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k6.AbstractC4194d;
import l.AbstractC4308a;
import l8.AbstractC4344b;
import livekit.org.webrtc.MediaStreamTrack;
import nf.AbstractC4828h;
import o1.AbstractC4892g;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import q.AbstractC5234s0;
import q.AbstractC5236t0;
import q.C5212h;
import q.C5222m;
import q.C5231q0;
import q.C5237u;
import q.C5243x;
import q.C5247z;
import q.E1;
import q.G1;
import q.v1;
import q.z1;
import w.C6049A;

/* renamed from: m.H  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class LayoutInflater$Factory2C4511H extends AbstractC4537q implements p.m, LayoutInflater.Factory2 {

    /* renamed from: n1  reason: collision with root package name */
    public static final C6049A f38612n1 = new C6049A(0);

    /* renamed from: o1  reason: collision with root package name */
    public static final int[] f38613o1 = {16842836};

    /* renamed from: p1  reason: collision with root package name */
    public static final boolean f38614p1 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: q1  reason: collision with root package name */
    public static final boolean f38615q1 = true;

    /* renamed from: A0  reason: collision with root package name */
    public ActionBarContextView f38616A0;

    /* renamed from: B0  reason: collision with root package name */
    public PopupWindow f38617B0;

    /* renamed from: C0  reason: collision with root package name */
    public r f38618C0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f38621F0;

    /* renamed from: G0  reason: collision with root package name */
    public ViewGroup f38622G0;

    /* renamed from: H0  reason: collision with root package name */
    public TextView f38623H0;

    /* renamed from: I0  reason: collision with root package name */
    public View f38624I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f38625J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f38626K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f38627L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f38628M0;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f38629N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f38630O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f38631P0;

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f38632Q0;

    /* renamed from: R0  reason: collision with root package name */
    public C4510G[] f38633R0;

    /* renamed from: S0  reason: collision with root package name */
    public C4510G f38634S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f38635T0;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f38636U0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f38637V0;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f38638W0;

    /* renamed from: X0  reason: collision with root package name */
    public Configuration f38639X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final int f38640Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public int f38641Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f38642a1;
    public boolean b1;

    /* renamed from: c1  reason: collision with root package name */
    public C4506C f38643c1;

    /* renamed from: d1  reason: collision with root package name */
    public C4506C f38644d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f38645e1;

    /* renamed from: f1  reason: collision with root package name */
    public int f38646f1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f38647h1;

    /* renamed from: i1  reason: collision with root package name */
    public Rect f38648i1;

    /* renamed from: j1  reason: collision with root package name */
    public Rect f38649j1;

    /* renamed from: k1  reason: collision with root package name */
    public C4514K f38650k1;

    /* renamed from: l1  reason: collision with root package name */
    public OnBackInvokedDispatcher f38651l1;

    /* renamed from: m1  reason: collision with root package name */
    public OnBackInvokedCallback f38652m1;

    /* renamed from: o0  reason: collision with root package name */
    public final Object f38653o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Context f38654p0;

    /* renamed from: q0  reason: collision with root package name */
    public Window f38655q0;

    /* renamed from: r0  reason: collision with root package name */
    public C4505B f38656r0;

    /* renamed from: s0  reason: collision with root package name */
    public final AbstractC4533m f38657s0;

    /* renamed from: t0  reason: collision with root package name */
    public W f38658t0;

    /* renamed from: u0  reason: collision with root package name */
    public androidx.appcompat.view.k f38659u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f38660v0;

    /* renamed from: w0  reason: collision with root package name */
    public AbstractC5234s0 f38661w0;

    /* renamed from: x0  reason: collision with root package name */
    public C4538s f38662x0;

    /* renamed from: y0  reason: collision with root package name */
    public C4539t f38663y0;

    /* renamed from: z0  reason: collision with root package name */
    public androidx.appcompat.view.c f38664z0;

    /* renamed from: D0  reason: collision with root package name */
    public C0358j0 f38619D0 = null;

    /* renamed from: E0  reason: collision with root package name */
    public final boolean f38620E0 = true;
    public final r g1 = new r(this, 0);

    public LayoutInflater$Factory2C4511H(Context context, Window window, AbstractC4533m abstractC4533m, Object obj) {
        AbstractActivityC4532l abstractActivityC4532l = null;
        this.f38640Y0 = -100;
        this.f38654p0 = context;
        this.f38657s0 = abstractC4533m;
        this.f38653o0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AbstractActivityC4532l) {
                        abstractActivityC4532l = (AbstractActivityC4532l) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC4532l != null) {
                this.f38640Y0 = ((LayoutInflater$Factory2C4511H) abstractActivityC4532l.n()).f38640Y0;
            }
        }
        if (this.f38640Y0 == -100) {
            C6049A c6049a = f38612n1;
            Integer num = (Integer) c6049a.get(this.f38653o0.getClass().getName());
            if (num != null) {
                this.f38640Y0 = num.intValue();
                c6049a.remove(this.f38653o0.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C5243x.d();
    }

    public static y1.k o(Context context) {
        y1.k kVar;
        y1.k kVar2;
        Locale locale;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (kVar = AbstractC4537q.f38782h0) == null) {
            return null;
        }
        y1.k z10 = z(context.getApplicationContext().getResources().getConfiguration());
        y1.m mVar = kVar.f50327a;
        if (i10 >= 24) {
            if (mVar.isEmpty()) {
                kVar2 = y1.k.f50326b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i11 = 0; i11 < z10.f50327a.size() + mVar.size(); i11++) {
                    if (i11 < mVar.size()) {
                        locale = mVar.get(i11);
                    } else {
                        locale = z10.f50327a.get(i11 - mVar.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                }
                kVar2 = y1.k.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (mVar.isEmpty()) {
            kVar2 = y1.k.f50326b;
        } else {
            kVar2 = y1.k.b(mVar.get(0).toString());
        }
        if (!kVar2.f50327a.isEmpty()) {
            return kVar2;
        }
        return z10;
    }

    public static Configuration s(Context context, int i10, y1.k kVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (kVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                y.d(configuration2, kVar);
            } else {
                y1.m mVar = kVar.f50327a;
                AbstractC4542w.b(configuration2, mVar.get(0));
                AbstractC4542w.a(configuration2, mVar.get(0));
            }
        }
        return configuration2;
    }

    public static y1.k z(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return y.b(configuration);
        }
        return y1.k.b(x.a(configuration.locale));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [m.G, java.lang.Object] */
    public final C4510G A(int i10) {
        Object[] objArr = this.f38633R0;
        if (objArr == null || objArr.length <= i10) {
            C4510G[] c4510gArr = new C4510G[i10 + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, c4510gArr, 0, objArr.length);
            }
            this.f38633R0 = c4510gArr;
            objArr = c4510gArr;
        }
        C4510G c4510g = objArr[i10];
        if (c4510g == 0) {
            ?? obj = new Object();
            obj.f38596a = i10;
            obj.f38609n = false;
            objArr[i10] = obj;
            return obj;
        }
        return c4510g;
    }

    public final void B() {
        v();
        if (this.f38627L0 && this.f38658t0 == null) {
            Object obj = this.f38653o0;
            if (obj instanceof Activity) {
                this.f38658t0 = new W((Activity) obj, this.f38628M0);
            } else if (obj instanceof Dialog) {
                this.f38658t0 = new W((Dialog) obj);
            }
            W w10 = this.f38658t0;
            if (w10 != null) {
                w10.r1(this.f38647h1);
            }
        }
    }

    public final void C(int i10) {
        this.f38646f1 = (1 << i10) | this.f38646f1;
        if (!this.f38645e1) {
            View decorView = this.f38655q0.getDecorView();
            WeakHashMap weakHashMap = Z.f3247a;
            D1.H.m(decorView, this.g1);
            this.f38645e1 = true;
        }
    }

    public final int D(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f38644d1 == null) {
                            this.f38644d1 = new C4506C(this, context);
                        }
                        return this.f38644d1.e();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return y(context).e();
            }
        }
        return i10;
    }

    public final boolean E() {
        AbstractC5236t0 abstractC5236t0;
        v1 v1Var;
        p.q qVar;
        boolean z10 = this.f38635T0;
        this.f38635T0 = false;
        C4510G A10 = A(0);
        if (A10.f38608m) {
            if (!z10) {
                r(A10, true);
            }
            return true;
        }
        androidx.appcompat.view.c cVar = this.f38664z0;
        if (cVar != null) {
            cVar.a();
            return true;
        }
        B();
        W w10 = this.f38658t0;
        if (w10 == null || (abstractC5236t0 = w10.f38716p) == null || (v1Var = ((z1) abstractC5236t0).f43598a.f24592S0) == null || v1Var.f43571Z == null) {
            return false;
        }
        v1 v1Var2 = ((z1) abstractC5236t0).f43598a.f24592S0;
        if (v1Var2 == null) {
            qVar = null;
        } else {
            qVar = v1Var2.f43571Z;
        }
        if (qVar != null) {
            qVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
        if (r3 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0172, code lost:
        if (r3.f41597k0.getCount() > 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(C4510G c4510g, KeyEvent keyEvent) {
        int i10;
        Context context;
        ViewGroup.LayoutParams layoutParams;
        if (!c4510g.f38608m && !this.f38638W0) {
            int i11 = c4510g.f38596a;
            Context context2 = this.f38654p0;
            if (i11 == 0 && (context2.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
            Window.Callback callback = this.f38655q0.getCallback();
            if (callback != null && !callback.onMenuOpened(i11, c4510g.f38603h)) {
                r(c4510g, true);
                return;
            }
            WindowManager windowManager = (WindowManager) context2.getSystemService("window");
            if (windowManager == null || !H(c4510g, keyEvent)) {
                return;
            }
            C4509F c4509f = c4510g.f38600e;
            if (c4509f != null && !c4510g.f38609n) {
                View view = c4510g.f38602g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    c4510g.f38607l = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams2.gravity = c4510g.f38598c;
                    layoutParams2.windowAnimations = c4510g.f38599d;
                    windowManager.addView(c4510g.f38600e, layoutParams2);
                    c4510g.f38608m = true;
                    if (i11 != 0) {
                        J();
                        return;
                    }
                    return;
                }
            } else {
                if (c4509f == null) {
                    B();
                    W w10 = this.f38658t0;
                    if (w10 != null) {
                        context = w10.p1();
                    } else {
                        context = null;
                    }
                    if (context != null) {
                        context2 = context;
                    }
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme newTheme = context2.getResources().newTheme();
                    newTheme.setTo(context2.getTheme());
                    newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
                    int i12 = typedValue.resourceId;
                    if (i12 != 0) {
                        newTheme.applyStyle(i12, true);
                    }
                    newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
                    int i13 = typedValue.resourceId;
                    if (i13 != 0) {
                        newTheme.applyStyle(i13, true);
                    } else {
                        newTheme.applyStyle(2131952186, true);
                    }
                    androidx.appcompat.view.f fVar = new androidx.appcompat.view.f(context2, 0);
                    fVar.getTheme().setTo(newTheme);
                    c4510g.f38605j = fVar;
                    TypedArray obtainStyledAttributes = fVar.obtainStyledAttributes(AbstractC4308a.f37673j);
                    c4510g.f38597b = obtainStyledAttributes.getResourceId(86, 0);
                    c4510g.f38599d = obtainStyledAttributes.getResourceId(1, 0);
                    obtainStyledAttributes.recycle();
                    c4510g.f38600e = new C4509F(this, c4510g.f38605j);
                    c4510g.f38598c = 81;
                } else if (c4510g.f38609n && c4509f.getChildCount() > 0) {
                    c4510g.f38600e.removeAllViews();
                }
                View view2 = c4510g.f38602g;
                if (view2 != null) {
                    c4510g.f38601f = view2;
                } else {
                    if (c4510g.f38603h != null) {
                        if (this.f38663y0 == null) {
                            this.f38663y0 = new C4539t(this);
                        }
                        C4539t c4539t = this.f38663y0;
                        if (c4510g.f38604i == null) {
                            p.k kVar = new p.k(c4510g.f38605j);
                            c4510g.f38604i = kVar;
                            kVar.f41596j0 = c4539t;
                            p.o oVar = c4510g.f38603h;
                            oVar.b(kVar, oVar.f41605a);
                        }
                        p.k kVar2 = c4510g.f38604i;
                        C4509F c4509f2 = c4510g.f38600e;
                        if (kVar2.f41595i0 == null) {
                            kVar2.f41595i0 = (ExpandedMenuView) kVar2.f41593Z.inflate(R.layout.abc_expanded_menu_layout, (ViewGroup) c4509f2, false);
                            if (kVar2.f41597k0 == null) {
                                kVar2.f41597k0 = new p.j(kVar2);
                            }
                            kVar2.f41595i0.setAdapter((ListAdapter) kVar2.f41597k0);
                            kVar2.f41595i0.setOnItemClickListener(kVar2);
                        }
                        ExpandedMenuView expandedMenuView = kVar2.f41595i0;
                        c4510g.f38601f = expandedMenuView;
                    }
                    c4510g.f38609n = true;
                    return;
                }
                if (c4510g.f38601f != null) {
                    if (c4510g.f38602g == null) {
                        p.k kVar3 = c4510g.f38604i;
                        if (kVar3.f41597k0 == null) {
                            kVar3.f41597k0 = new p.j(kVar3);
                        }
                    }
                    ViewGroup.LayoutParams layoutParams3 = c4510g.f38601f.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    c4510g.f38600e.setBackgroundResource(c4510g.f38597b);
                    ViewParent parent = c4510g.f38601f.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(c4510g.f38601f);
                    }
                    c4510g.f38600e.addView(c4510g.f38601f, layoutParams3);
                    if (!c4510g.f38601f.hasFocus()) {
                        c4510g.f38601f.requestFocus();
                    }
                }
                c4510g.f38609n = true;
                return;
            }
            i10 = -2;
            c4510g.f38607l = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams22.gravity = c4510g.f38598c;
            layoutParams22.windowAnimations = c4510g.f38599d;
            windowManager.addView(c4510g.f38600e, layoutParams22);
            c4510g.f38608m = true;
            if (i11 != 0) {
            }
        }
    }

    public final boolean G(C4510G c4510g, int i10, KeyEvent keyEvent) {
        p.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!c4510g.f38606k && !H(c4510g, keyEvent)) || (oVar = c4510g.f38603h) == null) {
            return false;
        }
        return oVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean H(C4510G c4510g, KeyEvent keyEvent) {
        boolean z10;
        int i10;
        boolean z11;
        AbstractC5234s0 abstractC5234s0;
        AbstractC5234s0 abstractC5234s02;
        AbstractC5234s0 abstractC5234s03;
        Resources.Theme theme;
        AbstractC5234s0 abstractC5234s04;
        if (this.f38638W0) {
            return false;
        }
        if (c4510g.f38606k) {
            return true;
        }
        C4510G c4510g2 = this.f38634S0;
        if (c4510g2 != null && c4510g2 != c4510g) {
            r(c4510g2, false);
        }
        Window.Callback callback = this.f38655q0.getCallback();
        int i11 = c4510g.f38596a;
        if (callback != null) {
            c4510g.f38602g = callback.onCreatePanelView(i11);
        }
        if (i11 != 0 && i11 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (abstractC5234s04 = this.f38661w0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) abstractC5234s04;
            actionBarOverlayLayout.k();
            ((z1) actionBarOverlayLayout.f24490l0).f43609l = true;
        }
        if (c4510g.f38602g == null) {
            p.o oVar = c4510g.f38603h;
            if (oVar == null || c4510g.f38610o) {
                if (oVar == null) {
                    Context context = this.f38654p0;
                    if ((i11 == 0 || i11 == 108) && this.f38661w0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            androidx.appcompat.view.f fVar = new androidx.appcompat.view.f(context, 0);
                            fVar.getTheme().setTo(theme);
                            context = fVar;
                        }
                    }
                    p.o oVar2 = new p.o(context);
                    oVar2.f41609e = this;
                    p.o oVar3 = c4510g.f38603h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(c4510g.f38604i);
                        }
                        c4510g.f38603h = oVar2;
                        p.k kVar = c4510g.f38604i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f41605a);
                        }
                    }
                    if (c4510g.f38603h == null) {
                        return false;
                    }
                }
                if (z10 && (abstractC5234s03 = this.f38661w0) != null) {
                    if (this.f38662x0 == null) {
                        this.f38662x0 = new C4538s(this);
                    }
                    ((ActionBarOverlayLayout) abstractC5234s03).l(c4510g.f38603h, this.f38662x0);
                }
                c4510g.f38603h.w();
                if (!callback.onCreatePanelMenu(i11, c4510g.f38603h)) {
                    p.o oVar4 = c4510g.f38603h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(c4510g.f38604i);
                        }
                        c4510g.f38603h = null;
                    }
                    if (z10 && (abstractC5234s02 = this.f38661w0) != null) {
                        ((ActionBarOverlayLayout) abstractC5234s02).l(null, this.f38662x0);
                    }
                    return false;
                }
                c4510g.f38610o = false;
            }
            c4510g.f38603h.w();
            Bundle bundle = c4510g.f38611p;
            if (bundle != null) {
                c4510g.f38603h.s(bundle);
                c4510g.f38611p = null;
            }
            if (!callback.onPreparePanel(0, c4510g.f38602g, c4510g.f38603h)) {
                if (z10 && (abstractC5234s0 = this.f38661w0) != null) {
                    ((ActionBarOverlayLayout) abstractC5234s0).l(null, this.f38662x0);
                }
                c4510g.f38603h.v();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            c4510g.f38603h.setQwertyMode(z11);
            c4510g.f38603h.v();
        }
        c4510g.f38606k = true;
        c4510g.f38607l = false;
        this.f38634S0 = c4510g;
        return true;
    }

    public final void I() {
        if (!this.f38621F0) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f38651l1 != null && (A(0).f38608m || this.f38664z0 != null)) {
                z10 = true;
            }
            if (z10 && this.f38652m1 == null) {
                this.f38652m1 = AbstractC4504A.b(this.f38651l1, this);
            } else if (!z10 && (onBackInvokedCallback = this.f38652m1) != null) {
                AbstractC4504A.c(this.f38651l1, onBackInvokedCallback);
            }
        }
    }

    public final int K(J0 j02, Rect rect) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        boolean z12 = true;
        int i14 = 0;
        if (j02 != null) {
            i10 = j02.d();
        } else if (rect != null) {
            i10 = rect.top;
        } else {
            i10 = 0;
        }
        ActionBarContextView actionBarContextView = this.f38616A0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f38616A0.getLayoutParams();
            if (this.f38616A0.isShown()) {
                if (this.f38648i1 == null) {
                    this.f38648i1 = new Rect();
                    this.f38649j1 = new Rect();
                }
                Rect rect2 = this.f38648i1;
                Rect rect3 = this.f38649j1;
                if (j02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(j02.b(), j02.d(), j02.c(), j02.a());
                }
                ViewGroup viewGroup = this.f38622G0;
                Method method = G1.f43293a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i15 = rect2.top;
                int i16 = rect2.left;
                int i17 = rect2.right;
                ViewGroup viewGroup2 = this.f38622G0;
                WeakHashMap weakHashMap = Z.f3247a;
                J0 a5 = D1.O.a(viewGroup2);
                if (a5 == null) {
                    i11 = 0;
                } else {
                    i11 = a5.b();
                }
                if (a5 == null) {
                    i12 = 0;
                } else {
                    i12 = a5.c();
                }
                if (marginLayoutParams.topMargin == i15 && marginLayoutParams.leftMargin == i16 && marginLayoutParams.rightMargin == i17) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i15;
                    marginLayoutParams.leftMargin = i16;
                    marginLayoutParams.rightMargin = i17;
                    z11 = true;
                }
                Context context = this.f38654p0;
                if (i15 > 0 && this.f38624I0 == null) {
                    View view = new View(context);
                    this.f38624I0 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = i12;
                    this.f38622G0.addView(this.f38624I0, -1, layoutParams);
                } else {
                    View view2 = this.f38624I0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i18 = marginLayoutParams2.height;
                        int i19 = marginLayoutParams.topMargin;
                        if (i18 != i19 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != i12) {
                            marginLayoutParams2.height = i19;
                            marginLayoutParams2.leftMargin = i11;
                            marginLayoutParams2.rightMargin = i12;
                            this.f38624I0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f38624I0;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    View view4 = this.f38624I0;
                    if ((D1.H.g(view4) & 8192) != 0) {
                        Object obj = AbstractC5042g.f41723a;
                        i13 = AbstractC5039d.a(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        Object obj2 = AbstractC5042g.f41723a;
                        i13 = AbstractC5039d.a(context, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(i13);
                }
                if (!this.f38629N0 && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f38616A0.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view5 = this.f38624I0;
        if (view5 != null) {
            if (!z10) {
                i14 = 8;
            }
            view5.setVisibility(i14);
        }
        return i10;
    }

    @Override // m.AbstractC4537q
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f38654p0);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C4511H)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // m.AbstractC4537q
    public final void c() {
        String str;
        this.f38636U0 = true;
        m(false, true);
        x();
        Object obj = this.f38653o0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = r9.y.v0(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                W w10 = this.f38658t0;
                if (w10 == null) {
                    this.f38647h1 = true;
                } else {
                    w10.r1(true);
                }
            }
            synchronized (AbstractC4537q.f38787m0) {
                AbstractC4537q.e(this);
                AbstractC4537q.f38786l0.add(new WeakReference(this));
            }
        }
        this.f38639X0 = new Configuration(this.f38654p0.getResources().getConfiguration());
        this.f38637V0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // m.AbstractC4537q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        C4506C c4506c;
        C4506C c4506c2;
        if (this.f38653o0 instanceof Activity) {
            synchronized (AbstractC4537q.f38787m0) {
                AbstractC4537q.e(this);
            }
        }
        if (this.f38645e1) {
            this.f38655q0.getDecorView().removeCallbacks(this.g1);
        }
        this.f38638W0 = true;
        if (this.f38640Y0 != -100) {
            Object obj = this.f38653o0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f38612n1.put(this.f38653o0.getClass().getName(), Integer.valueOf(this.f38640Y0));
                c4506c = this.f38643c1;
                if (c4506c != null) {
                    c4506c.a();
                }
                c4506c2 = this.f38644d1;
                if (c4506c2 == null) {
                    c4506c2.a();
                    return;
                }
                return;
            }
        }
        f38612n1.remove(this.f38653o0.getClass().getName());
        c4506c = this.f38643c1;
        if (c4506c != null) {
        }
        c4506c2 = this.f38644d1;
        if (c4506c2 == null) {
        }
    }

    @Override // m.AbstractC4537q
    public final boolean f(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f38631P0 && i10 == 108) {
            return false;
        }
        if (this.f38627L0 && i10 == 1) {
            this.f38627L0 = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f38655q0.requestFeature(i10);
                            }
                            I();
                            this.f38628M0 = true;
                            return true;
                        }
                        I();
                        this.f38627L0 = true;
                        return true;
                    }
                    I();
                    this.f38629N0 = true;
                    return true;
                }
                I();
                this.f38626K0 = true;
                return true;
            }
            I();
            this.f38625J0 = true;
            return true;
        }
        I();
        this.f38631P0 = true;
        return true;
    }

    @Override // m.AbstractC4537q
    public final void g(int i10) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f38622G0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f38654p0).inflate(i10, viewGroup);
        this.f38656r0.b(this.f38655q0.getCallback());
    }

    @Override // m.AbstractC4537q
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f38622G0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f38656r0.b(this.f38655q0.getCallback());
    }

    @Override // p.m
    public final boolean i(p.o oVar, MenuItem menuItem) {
        int i10;
        C4510G c4510g;
        Window.Callback callback = this.f38655q0.getCallback();
        if (callback != null && !this.f38638W0) {
            p.o k10 = oVar.k();
            C4510G[] c4510gArr = this.f38633R0;
            if (c4510gArr != null) {
                i10 = c4510gArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    c4510g = c4510gArr[i11];
                    if (c4510g != null && c4510g.f38603h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    c4510g = null;
                    break;
                }
            }
            if (c4510g != null) {
                return callback.onMenuItemSelected(c4510g.f38596a, menuItem);
            }
        }
        return false;
    }

    @Override // m.AbstractC4537q
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f38622G0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f38656r0.b(this.f38655q0.getCallback());
    }

    @Override // m.AbstractC4537q
    public final void l(CharSequence charSequence) {
        this.f38660v0 = charSequence;
        AbstractC5234s0 abstractC5234s0 = this.f38661w0;
        if (abstractC5234s0 != null) {
            abstractC5234s0.setWindowTitle(charSequence);
            return;
        }
        W w10 = this.f38658t0;
        if (w10 != null) {
            w10.t1(charSequence);
            return;
        }
        TextView textView = this.f38623H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(boolean z10, boolean z11) {
        y1.k kVar;
        int i10;
        Configuration configuration;
        int i11;
        int i12;
        y1.k kVar2;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        Activity activity;
        int i14;
        if (this.f38638W0) {
            return false;
        }
        int i15 = this.f38640Y0;
        if (i15 == -100) {
            i15 = AbstractC4537q.f38781Z;
        }
        int i16 = i15;
        Context context = this.f38654p0;
        int D6 = D(context, i16);
        int i17 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        if (i17 < 33) {
            kVar = o(context);
        } else {
            kVar = null;
        }
        if (!z11 && kVar != null) {
            kVar = z(context.getResources().getConfiguration());
        }
        Configuration s10 = s(context, D6, kVar, null, false);
        boolean z15 = this.b1;
        Object obj3 = this.f38653o0;
        if (!z15 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
                configuration = this.f38639X0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                i11 = configuration.uiMode & 48;
                i12 = s10.uiMode & 48;
                y1.k z16 = z(configuration);
                if (kVar != null) {
                    kVar2 = null;
                } else {
                    kVar2 = z(s10);
                }
                if (i11 == i12) {
                    i13 = 512;
                } else {
                    i13 = 0;
                }
                if (kVar2 != null && !z16.equals(kVar2)) {
                    i13 |= 8196;
                }
                if (((~i10) & i13) != 0 && z10 && this.f38636U0 && ((f38614p1 || this.f38637V0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i18 = AbstractC4892g.f40451b;
                        if (Build.VERSION.SDK_INT >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new RunnableC3111d(8, activity));
                        }
                        z12 = true;
                        if (z12 && i13 != 0) {
                            if ((i10 & i13) == i13) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i12;
                            if (kVar2 != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    y.d(configuration2, kVar2);
                                } else {
                                    y1.m mVar = kVar2.f50327a;
                                    AbstractC4542w.b(configuration2, mVar.get(0));
                                    AbstractC4542w.a(configuration2, mVar.get(0));
                                }
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i19 = Build.VERSION.SDK_INT;
                            if (i19 < 26 && i19 < 28) {
                                if (i19 >= 24) {
                                    if (!AbstractC4828h.f40326h) {
                                        try {
                                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                            AbstractC4828h.f40325g = declaredField;
                                            declaredField.setAccessible(true);
                                        } catch (NoSuchFieldException e10) {
                                            AbstractC3612c.d("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                                        }
                                        AbstractC4828h.f40326h = true;
                                    }
                                    Field field = AbstractC4828h.f40325g;
                                    if (field != null) {
                                        try {
                                            obj = field.get(resources);
                                        } catch (IllegalAccessException e11) {
                                            AbstractC3612c.d("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                                            obj = null;
                                        }
                                        if (obj != null) {
                                            if (!AbstractC4828h.f40320b) {
                                                try {
                                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                    AbstractC4828h.f40319a = declaredField2;
                                                    declaredField2.setAccessible(true);
                                                } catch (NoSuchFieldException e12) {
                                                    AbstractC3612c.d("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                                }
                                                AbstractC4828h.f40320b = true;
                                            }
                                            Field field2 = AbstractC4828h.f40319a;
                                            if (field2 != null) {
                                                try {
                                                    obj2 = field2.get(obj);
                                                } catch (IllegalAccessException e13) {
                                                    AbstractC3612c.d("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                                }
                                            }
                                            if (obj2 != null) {
                                                AbstractC4828h.I(obj2);
                                            }
                                        }
                                    }
                                } else {
                                    if (!AbstractC4828h.f40320b) {
                                        try {
                                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                                            AbstractC4828h.f40319a = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e14) {
                                            AbstractC3612c.d("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                                        }
                                        AbstractC4828h.f40320b = true;
                                    }
                                    Field field3 = AbstractC4828h.f40319a;
                                    if (field3 != null) {
                                        try {
                                            obj2 = field3.get(resources);
                                        } catch (IllegalAccessException e15) {
                                            AbstractC3612c.d("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                                        }
                                    }
                                    if (obj2 != null) {
                                        AbstractC4828h.I(obj2);
                                    }
                                }
                            }
                            int i20 = this.f38641Z0;
                            if (i20 != 0) {
                                context.setTheme(i20);
                                z13 = true;
                                context.getTheme().applyStyle(this.f38641Z0, true);
                            } else {
                                z13 = true;
                            }
                            if (z14 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof AbstractC2086v) {
                                    if (((AbstractC2086v) activity2).h().f().a(EnumC2082q.f25377h0)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f38637V0 && !this.f38638W0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        } else {
                            z13 = z12;
                        }
                        if (z13 && (obj3 instanceof AbstractActivityC4532l)) {
                            if ((i13 & 512) != 0) {
                                ((AbstractActivityC4532l) obj3).getClass();
                            }
                            if ((i13 & 4) != 0) {
                                ((AbstractActivityC4532l) obj3).getClass();
                            }
                        }
                        if (z13 && kVar2 != null) {
                            y1.k z17 = z(context.getResources().getConfiguration());
                            if (Build.VERSION.SDK_INT < 24) {
                                y.c(z17);
                            } else {
                                Locale.setDefault(z17.f50327a.get(0));
                            }
                        }
                        if (i16 == 0) {
                            y(context).j();
                        } else {
                            C4506C c4506c = this.f38643c1;
                            if (c4506c != null) {
                                c4506c.a();
                            }
                        }
                        if (i16 == 3) {
                            if (this.f38644d1 == null) {
                                this.f38644d1 = new C4506C(this, context);
                            }
                            this.f38644d1.j();
                        } else {
                            C4506C c4506c2 = this.f38644d1;
                            if (c4506c2 != null) {
                                c4506c2.a();
                            }
                        }
                        return z13;
                    }
                }
                z12 = false;
                if (z12) {
                }
                z13 = z12;
                if (z13) {
                    if ((i13 & 512) != 0) {
                    }
                    if ((i13 & 4) != 0) {
                    }
                }
                if (z13) {
                    y1.k z172 = z(context.getResources().getConfiguration());
                    if (Build.VERSION.SDK_INT < 24) {
                    }
                }
                if (i16 == 0) {
                }
                if (i16 == 3) {
                }
                return z13;
            }
            if (i17 >= 29) {
                i14 = 269221888;
            } else if (i17 >= 24) {
                i14 = 786432;
            } else {
                i14 = 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i14);
                if (activityInfo != null) {
                    this.f38642a1 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e16) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e16);
                this.f38642a1 = 0;
            }
        }
        this.b1 = true;
        i10 = this.f38642a1;
        configuration = this.f38639X0;
        if (configuration == null) {
        }
        i11 = configuration.uiMode & 48;
        i12 = s10.uiMode & 48;
        y1.k z162 = z(configuration);
        if (kVar != null) {
        }
        if (i11 == i12) {
        }
        if (kVar2 != null) {
            i13 |= 8196;
        }
        if (((~i10) & i13) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z12 = false;
        if (z12) {
        }
        z13 = z12;
        if (z13) {
        }
        if (z13) {
        }
        if (i16 == 0) {
        }
        if (i16 == 3) {
        }
        return z13;
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f38655q0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C4505B)) {
                C4505B c4505b = new C4505B(this, callback);
                this.f38656r0 = c4505b;
                window.setCallback(c4505b);
                int[] iArr = f38613o1;
                Context context = this.f38654p0;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C5243x a5 = C5243x.a();
                    synchronized (a5) {
                        drawable = a5.f43586a.g(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f38655q0 = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f38651l1) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f38652m1) != null) {
                        AbstractC4504A.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f38652m1 = null;
                    }
                    Object obj = this.f38653o0;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f38651l1 = AbstractC4504A.a(activity);
                            J();
                            return;
                        }
                    }
                    this.f38651l1 = null;
                    J();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p(int i10, C4510G c4510g, p.o oVar) {
        if (oVar == null) {
            if (c4510g == null && i10 >= 0) {
                C4510G[] c4510gArr = this.f38633R0;
                if (i10 < c4510gArr.length) {
                    c4510g = c4510gArr[i10];
                }
            }
            if (c4510g != null) {
                oVar = c4510g.f38603h;
            }
        }
        if ((c4510g == null || c4510g.f38608m) && !this.f38638W0) {
            C4505B c4505b = this.f38656r0;
            Window.Callback callback = this.f38655q0.getCallback();
            c4505b.getClass();
            try {
                c4505b.f38585h0 = true;
                callback.onPanelClosed(i10, oVar);
            } finally {
                c4505b.f38585h0 = false;
            }
        }
    }

    public final void q(p.o oVar) {
        C5222m c5222m;
        if (this.f38632Q0) {
            return;
        }
        this.f38632Q0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f38661w0;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((z1) actionBarOverlayLayout.f24490l0).f43598a.f24598h0;
        if (actionMenuView != null && (c5222m = actionMenuView.f24505A0) != null) {
            c5222m.f();
            C5212h c5212h = c5222m.f43472y0;
            if (c5212h != null && c5212h.b()) {
                c5212h.f41506j.dismiss();
            }
        }
        Window.Callback callback = this.f38655q0.getCallback();
        if (callback != null && !this.f38638W0) {
            callback.onPanelClosed(108, oVar);
        }
        this.f38632Q0 = false;
    }

    public final void r(C4510G c4510g, boolean z10) {
        C4509F c4509f;
        AbstractC5234s0 abstractC5234s0;
        C5222m c5222m;
        if (z10 && c4510g.f38596a == 0 && (abstractC5234s0 = this.f38661w0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) abstractC5234s0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((z1) actionBarOverlayLayout.f24490l0).f43598a.f24598h0;
            if (actionMenuView != null && (c5222m = actionMenuView.f24505A0) != null && c5222m.h()) {
                q(c4510g.f38603h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f38654p0.getSystemService("window");
        if (windowManager != null && c4510g.f38608m && (c4509f = c4510g.f38600e) != null) {
            windowManager.removeView(c4509f);
            if (z10) {
                p(c4510g.f38596a, c4510g, null);
            }
        }
        c4510g.f38606k = false;
        c4510g.f38607l = false;
        c4510g.f38608m = false;
        c4510g.f38601f = null;
        c4510g.f38609n = true;
        if (this.f38634S0 == c4510g) {
            this.f38634S0 = null;
        }
        if (c4510g.f38596a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        AudioManager audioManager;
        ActionMenuView actionMenuView;
        C5222m c5222m;
        C5222m c5222m2;
        C5222m c5222m3;
        View decorView;
        Object obj = this.f38653o0;
        boolean z10 = true;
        if (((obj instanceof AbstractC0363m) || (obj instanceof DialogInterfaceC4529i)) && (decorView = this.f38655q0.getDecorView()) != null && AbstractC4344b.b0(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            C4505B c4505b = this.f38656r0;
            Window.Callback callback = this.f38655q0.getCallback();
            c4505b.getClass();
            try {
                c4505b.f38584Z = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                c4505b.f38584Z = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    C4510G A10 = A(0);
                    if (A10.f38608m) {
                        return true;
                    }
                    H(A10, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z10 = false;
                }
                this.f38635T0 = z10;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f38664z0 != null) {
                    return true;
                }
                C4510G A11 = A(0);
                AbstractC5234s0 abstractC5234s0 = this.f38661w0;
                Context context = this.f38654p0;
                if (abstractC5234s0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) abstractC5234s0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((z1) actionBarOverlayLayout.f24490l0).f43598a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f24598h0) != null && actionMenuView.f24516z0 && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f38661w0;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((z1) actionBarOverlayLayout2.f24490l0).f43598a.f24598h0;
                        if (actionMenuView2 != null && (c5222m2 = actionMenuView2.f24505A0) != null && c5222m2.h()) {
                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f38661w0;
                            actionBarOverlayLayout3.k();
                            ActionMenuView actionMenuView3 = ((z1) actionBarOverlayLayout3.f24490l0).f43598a.f24598h0;
                            if (actionMenuView3 == null || (c5222m3 = actionMenuView3.f24505A0) == null || !c5222m3.f()) {
                                return true;
                            }
                        } else if (this.f38638W0 || !H(A11, keyEvent)) {
                            return true;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f38661w0;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((z1) actionBarOverlayLayout4.f24490l0).f43598a.f24598h0;
                            if (actionMenuView4 == null || (c5222m = actionMenuView4.f24505A0) == null || !c5222m.l()) {
                                return true;
                            }
                        }
                        audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        if (audioManager == null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        AbstractC3612c.r("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                }
                boolean z11 = A11.f38608m;
                if (!z11 && !A11.f38607l) {
                    if (!A11.f38606k) {
                        return true;
                    }
                    if (A11.f38610o) {
                        A11.f38606k = false;
                        if (!H(A11, keyEvent)) {
                            return true;
                        }
                    }
                    F(A11, keyEvent);
                } else {
                    r(A11, true);
                    if (!z11) {
                        return true;
                    }
                }
                audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager == null) {
                }
            }
        } else if (E()) {
            return true;
        }
        return false;
    }

    public final void u(int i10) {
        C4510G A10 = A(i10);
        if (A10.f38603h != null) {
            Bundle bundle = new Bundle();
            A10.f38603h.t(bundle);
            if (bundle.size() > 0) {
                A10.f38611p = bundle;
            }
            A10.f38603h.w();
            A10.f38603h.clear();
        }
        A10.f38610o = true;
        A10.f38609n = true;
        if ((i10 == 108 || i10 == 0) && this.f38661w0 != null) {
            C4510G A11 = A(0);
            A11.f38606k = false;
            H(A11, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f38621F0) {
            int[] iArr = AbstractC4308a.f37673j;
            Context context2 = this.f38654p0;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    f(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    f(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    f(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    f(10);
                }
                this.f38630O0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                x();
                this.f38655q0.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f38631P0) {
                    if (this.f38630O0) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f38628M0 = false;
                        this.f38627L0 = false;
                    } else if (this.f38627L0) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new androidx.appcompat.view.f(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        AbstractC5234s0 abstractC5234s0 = (AbstractC5234s0) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f38661w0 = abstractC5234s0;
                        abstractC5234s0.setWindowCallback(this.f38655q0.getCallback());
                        if (this.f38628M0) {
                            ((ActionBarOverlayLayout) this.f38661w0).j(109);
                        }
                        if (this.f38625J0) {
                            ((ActionBarOverlayLayout) this.f38661w0).j(2);
                        }
                        if (this.f38626K0) {
                            ((ActionBarOverlayLayout) this.f38661w0).j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.f38629N0 ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    C.b bVar = new C.b(0, this);
                    WeakHashMap weakHashMap = Z.f3247a;
                    D1.N.u(viewGroup, bVar);
                    if (this.f38661w0 == null) {
                        this.f38623H0 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = G1.f43293a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f38655q0.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f38655q0.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C4539t(this));
                    this.f38622G0 = viewGroup;
                    Object obj = this.f38653o0;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f38660v0;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        AbstractC5234s0 abstractC5234s02 = this.f38661w0;
                        if (abstractC5234s02 != null) {
                            abstractC5234s02.setWindowTitle(charSequence);
                        } else {
                            W w10 = this.f38658t0;
                            if (w10 != null) {
                                w10.t1(charSequence);
                            } else {
                                TextView textView = this.f38623H0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f38622G0.findViewById(16908290);
                    View decorView = this.f38655q0.getDecorView();
                    contentFrameLayout2.f24527n0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = Z.f3247a;
                    if (D1.K.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f38621F0 = true;
                    C4510G A10 = A(0);
                    if (!this.f38638W0 && A10.f38603h == null) {
                        C(108);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb2.append(this.f38627L0);
                sb2.append(", windowActionBarOverlay: ");
                sb2.append(this.f38628M0);
                sb2.append(", android:windowIsFloating: ");
                sb2.append(this.f38630O0);
                sb2.append(", windowActionModeOverlay: ");
                sb2.append(this.f38629N0);
                sb2.append(", windowNoTitle: ");
                throw new IllegalArgumentException(AbstractC4194d.w(sb2, this.f38631P0, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r6.h() != false) goto L20;
     */
    @Override // p.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(p.o oVar) {
        ActionMenuView actionMenuView;
        boolean z10;
        C5222m c5222m;
        C5222m c5222m2;
        C5222m c5222m3;
        AbstractC5234s0 abstractC5234s0 = this.f38661w0;
        if (abstractC5234s0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) abstractC5234s0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((z1) actionBarOverlayLayout.f24490l0).f43598a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f24598h0) != null && actionMenuView.f24516z0) {
                if (ViewConfiguration.get(this.f38654p0).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f38661w0;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((z1) actionBarOverlayLayout2.f24490l0).f43598a.f24598h0;
                    if (actionMenuView2 != null) {
                        C5222m c5222m4 = actionMenuView2.f24505A0;
                        if (c5222m4 != null) {
                            if (c5222m4.f43473z0 == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f38655q0.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f38661w0;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((z1) actionBarOverlayLayout3.f24490l0).f43598a.f24598h0;
                if (actionMenuView3 != null && (c5222m3 = actionMenuView3.f24505A0) != null && c5222m3.h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f38661w0;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((z1) actionBarOverlayLayout4.f24490l0).f43598a.f24598h0;
                    if (actionMenuView4 != null && (c5222m2 = actionMenuView4.f24505A0) != null) {
                        c5222m2.f();
                    }
                    if (!this.f38638W0) {
                        callback.onPanelClosed(108, A(0).f38603h);
                        return;
                    }
                    return;
                } else if (callback != null && !this.f38638W0) {
                    if (this.f38645e1 && (1 & this.f38646f1) != 0) {
                        View decorView = this.f38655q0.getDecorView();
                        r rVar = this.g1;
                        decorView.removeCallbacks(rVar);
                        rVar.run();
                    }
                    C4510G A10 = A(0);
                    p.o oVar2 = A10.f38603h;
                    if (oVar2 != null && !A10.f38610o && callback.onPreparePanel(0, A10.f38602g, oVar2)) {
                        callback.onMenuOpened(108, A10.f38603h);
                        ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f38661w0;
                        actionBarOverlayLayout5.k();
                        ActionMenuView actionMenuView5 = ((z1) actionBarOverlayLayout5.f24490l0).f43598a.f24598h0;
                        if (actionMenuView5 != null && (c5222m = actionMenuView5.f24505A0) != null) {
                            c5222m.l();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        C4510G A11 = A(0);
        A11.f38609n = true;
        r(A11, false);
        F(A11, null);
    }

    public final void x() {
        if (this.f38655q0 == null) {
            Object obj = this.f38653o0;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f38655q0 != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final AbstractC4508E y(Context context) {
        if (this.f38643c1 == null) {
            if (U3.u.f17490j0 == null) {
                Context applicationContext = context.getApplicationContext();
                U3.u.f17490j0 = new U3.u(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f38643c1 = new C4506C(this, U3.u.f17490j0);
        }
        return this.f38643c1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:
        if (r10.equals("ImageButton") == false) goto L23;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View view2;
        if (this.f38650k1 == null) {
            int[] iArr = AbstractC4308a.f37673j;
            Context context2 = this.f38654p0;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f38650k1 = new C4514K();
            } else {
                try {
                    this.f38650k1 = (C4514K) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f38650k1 = new C4514K();
                }
            }
        }
        C4514K c4514k = this.f38650k1;
        int i10 = E1.f43272a;
        c4514k.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37688y, 0, 0);
        char c10 = 4;
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context fVar = (resourceId == 0 || ((context instanceof androidx.appcompat.view.f) && ((androidx.appcompat.view.f) context).f24355a == resourceId)) ? context : new androidx.appcompat.view.f(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                c10 = '\uffff';
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                c10 = '\uffff';
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                c10 = '\uffff';
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                c10 = '\uffff';
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                c10 = '\uffff';
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                c10 = '\uffff';
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                c10 = '\uffff';
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                c10 = '\uffff';
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                c10 = '\uffff';
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                c10 = '\uffff';
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                c10 = '\uffff';
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                c10 = '\uffff';
                break;
            default:
                c10 = '\uffff';
                break;
        }
        View view3 = null;
        switch (c10) {
            case 0:
                view2 = new q.I(fVar, attributeSet);
                break;
            case 1:
                view2 = new C5237u(fVar, attributeSet);
                break;
            case 2:
                view2 = new q.E(fVar, attributeSet);
                break;
            case 3:
                view2 = c4514k.e(fVar, attributeSet);
                break;
            case 4:
                view2 = new q.B(fVar, attributeSet, R.attr.imageButtonStyle);
                break;
            case 5:
                view2 = new q.K(fVar, attributeSet);
                break;
            case 6:
                view2 = new q.W(fVar, attributeSet);
                break;
            case 7:
                view2 = c4514k.d(fVar, attributeSet);
                break;
            case '\b':
                view2 = new C5231q0(fVar, attributeSet);
                break;
            case '\t':
                view2 = new q.D(fVar, attributeSet, 0);
                break;
            case '\n':
                view2 = c4514k.a(fVar, attributeSet);
                break;
            case 11:
                view2 = c4514k.c(fVar, attributeSet);
                break;
            case '\f':
                view2 = new C5247z(fVar, attributeSet);
                break;
            case '\r':
                view2 = c4514k.b(fVar, attributeSet);
                break;
            default:
                view2 = null;
                break;
        }
        if (view2 == null && context != fVar) {
            Object[] objArr = c4514k.f38677a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = fVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i11 = 0;
                    while (true) {
                        String[] strArr = C4514K.f38675g;
                        if (i11 < 3) {
                            View f6 = c4514k.f(fVar, str, strArr[i11]);
                            if (f6 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view3 = f6;
                            } else {
                                i11++;
                            }
                        }
                    }
                } else {
                    View f10 = c4514k.f(fVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view3 = f10;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            view2 = view3;
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = Z.f3247a;
                if (D1.G.a(view2)) {
                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, C4514K.f38671c);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        view2.setOnClickListener(new View$OnClickListenerC4513J(view2, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = fVar.obtainStyledAttributes(attributeSet, C4514K.f38672d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z10 = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = Z.f3247a;
                    new D1.D(R.id.tag_accessibility_heading, 3).g(view2, Boolean.valueOf(z10));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = fVar.obtainStyledAttributes(attributeSet, C4514K.f38673e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    Z.m(view2, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = fVar.obtainStyledAttributes(attributeSet, C4514K.f38674f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z11 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = Z.f3247a;
                    new D1.D(R.id.tag_screen_reader_focusable, 0).g(view2, Boolean.valueOf(z11));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return view2;
    }
}
