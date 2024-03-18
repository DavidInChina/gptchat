package m;

import V1.AbstractActivityC1483y;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c1.AbstractC2279d;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import o1.AbstractC4886a;
import o1.AbstractC4892g;
import o1.AbstractC4902q;
import q.C5243x;
import q.E1;
import q.z1;
import q1.AbstractC5260f;
import y1.AbstractC6492b;

/* renamed from: m.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC4532l extends AbstractActivityC1483y implements AbstractC4533m {

    /* renamed from: E0  reason: collision with root package name */
    public LayoutInflater$Factory2C4511H f38777E0;

    public AbstractActivityC4532l() {
        this.f30969j0.f645b.c("androidx:appcompat", new C4530j(this));
        j(new C4531k(this));
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        layoutInflater$Factory2C4511H.v();
        ((ViewGroup) layoutInflater$Factory2C4511H.f38622G0.findViewById(16908290)).addView(view, layoutParams);
        layoutInflater$Factory2C4511H.f38656r0.b(layoutInflater$Factory2C4511H.f38655q0.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        layoutInflater$Factory2C4511H.f38636U0 = true;
        int i18 = layoutInflater$Factory2C4511H.f38640Y0;
        if (i18 == -100) {
            i18 = AbstractC4537q.f38781Z;
        }
        int D6 = layoutInflater$Factory2C4511H.D(context, i18);
        if (AbstractC4537q.b(context) && AbstractC4537q.b(context)) {
            if (AbstractC6492b.a()) {
                if (!AbstractC4537q.f38785k0) {
                    AbstractC4537q.f38780Y.execute(new RunnableC4534n(context, 0));
                }
            } else {
                synchronized (AbstractC4537q.f38788n0) {
                    try {
                        y1.k kVar = AbstractC4537q.f38782h0;
                        if (kVar == null) {
                            if (AbstractC4537q.f38783i0 == null) {
                                AbstractC4537q.f38783i0 = y1.k.b(A7.b.u1(context));
                            }
                            if (!AbstractC4537q.f38783i0.f50327a.isEmpty()) {
                                AbstractC4537q.f38782h0 = AbstractC4537q.f38783i0;
                            }
                        } else if (!kVar.equals(AbstractC4537q.f38783i0)) {
                            y1.k kVar2 = AbstractC4537q.f38782h0;
                            AbstractC4537q.f38783i0 = kVar2;
                            A7.b.r1(context, kVar2.f50327a.a());
                        }
                    } finally {
                    }
                }
            }
        }
        y1.k o10 = LayoutInflater$Factory2C4511H.o(context);
        Configuration configuration = null;
        if (LayoutInflater$Factory2C4511H.f38615q1 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflater$Factory2C4511H.s(context, D6, o10, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof androidx.appcompat.view.f) {
            try {
                ((androidx.appcompat.view.f) context).a(LayoutInflater$Factory2C4511H.s(context, D6, o10, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflater$Factory2C4511H.f38614p1) {
            int i19 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f6 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f6 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i20 = configuration3.mcc;
                    int i21 = configuration4.mcc;
                    if (i20 != i21) {
                        configuration.mcc = i21;
                    }
                    int i22 = configuration3.mnc;
                    int i23 = configuration4.mnc;
                    if (i22 != i23) {
                        configuration.mnc = i23;
                    }
                    if (i19 >= 24) {
                        y.a(configuration3, configuration4, configuration);
                    } else if (!C1.b.a(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i24 = configuration3.touchscreen;
                    int i25 = configuration4.touchscreen;
                    if (i24 != i25) {
                        configuration.touchscreen = i25;
                    }
                    int i26 = configuration3.keyboard;
                    int i27 = configuration4.keyboard;
                    if (i26 != i27) {
                        configuration.keyboard = i27;
                    }
                    int i28 = configuration3.keyboardHidden;
                    int i29 = configuration4.keyboardHidden;
                    if (i28 != i29) {
                        configuration.keyboardHidden = i29;
                    }
                    int i30 = configuration3.navigation;
                    int i31 = configuration4.navigation;
                    if (i30 != i31) {
                        configuration.navigation = i31;
                    }
                    int i32 = configuration3.navigationHidden;
                    int i33 = configuration4.navigationHidden;
                    if (i32 != i33) {
                        configuration.navigationHidden = i33;
                    }
                    int i34 = configuration3.orientation;
                    int i35 = configuration4.orientation;
                    if (i34 != i35) {
                        configuration.orientation = i35;
                    }
                    int i36 = configuration3.screenLayout & 15;
                    int i37 = configuration4.screenLayout & 15;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 192;
                    int i39 = configuration4.screenLayout & 192;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 48;
                    int i41 = configuration4.screenLayout & 48;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    int i42 = configuration3.screenLayout & 768;
                    int i43 = configuration4.screenLayout & 768;
                    if (i42 != i43) {
                        configuration.screenLayout |= i43;
                    }
                    if (i19 >= 26) {
                        i10 = configuration3.colorMode;
                        int i44 = i10 & 3;
                        i11 = configuration4.colorMode;
                        if (i44 != (i11 & 3)) {
                            i16 = configuration.colorMode;
                            i17 = configuration4.colorMode;
                            configuration.colorMode = i16 | (i17 & 3);
                        }
                        i12 = configuration3.colorMode;
                        int i45 = i12 & 12;
                        i13 = configuration4.colorMode;
                        if (i45 != (i13 & 12)) {
                            i14 = configuration.colorMode;
                            i15 = configuration4.colorMode;
                            configuration.colorMode = i14 | (i15 & 12);
                        }
                    }
                    int i46 = configuration3.uiMode & 15;
                    int i47 = configuration4.uiMode & 15;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.uiMode & 48;
                    int i49 = configuration4.uiMode & 48;
                    if (i48 != i49) {
                        configuration.uiMode |= i49;
                    }
                    int i50 = configuration3.screenWidthDp;
                    int i51 = configuration4.screenWidthDp;
                    if (i50 != i51) {
                        configuration.screenWidthDp = i51;
                    }
                    int i52 = configuration3.screenHeightDp;
                    int i53 = configuration4.screenHeightDp;
                    if (i52 != i53) {
                        configuration.screenHeightDp = i53;
                    }
                    int i54 = configuration3.smallestScreenWidthDp;
                    int i55 = configuration4.smallestScreenWidthDp;
                    if (i54 != i55) {
                        configuration.smallestScreenWidthDp = i55;
                    }
                    int i56 = configuration3.densityDpi;
                    int i57 = configuration4.densityDpi;
                    if (i56 != i57) {
                        configuration.densityDpi = i57;
                    }
                }
            }
            Configuration s10 = LayoutInflater$Factory2C4511H.s(context, D6, o10, configuration, true);
            androidx.appcompat.view.f fVar = new androidx.appcompat.view.f(context, 2131952198);
            fVar.a(s10);
            try {
                if (context.getTheme() != null) {
                    AbstractC2279d.v(fVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = fVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflater$Factory2C4511H) n()).B();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // o1.AbstractActivityC4898m, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflater$Factory2C4511H) n()).B();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        layoutInflater$Factory2C4511H.v();
        return layoutInflater$Factory2C4511H.f38655q0.findViewById(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        if (layoutInflater$Factory2C4511H.f38659u0 == null) {
            layoutInflater$Factory2C4511H.B();
            W w10 = layoutInflater$Factory2C4511H.f38658t0;
            if (w10 != null) {
                context = w10.p1();
            } else {
                context = layoutInflater$Factory2C4511H.f38654p0;
            }
            layoutInflater$Factory2C4511H.f38659u0 = new androidx.appcompat.view.k(context);
        }
        return layoutInflater$Factory2C4511H.f38659u0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = E1.f43272a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        if (layoutInflater$Factory2C4511H.f38658t0 != null) {
            layoutInflater$Factory2C4511H.B();
            layoutInflater$Factory2C4511H.f38658t0.getClass();
            layoutInflater$Factory2C4511H.C(0);
        }
    }

    public final AbstractC4537q n() {
        if (this.f38777E0 == null) {
            ExecutorC4518O executorC4518O = AbstractC4537q.f38780Y;
            this.f38777E0 = new LayoutInflater$Factory2C4511H(this, null, this, this);
        }
        return this.f38777E0;
    }

    public final void o() {
        K4.J.Z(getWindow().getDecorView(), this);
        AbstractC2279d.w(getWindow().getDecorView(), this);
        AbstractC5260f.N(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC3557B.c0("<this>", decorView);
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        if (layoutInflater$Factory2C4511H.f38627L0 && layoutInflater$Factory2C4511H.f38621F0) {
            layoutInflater$Factory2C4511H.B();
            W w10 = layoutInflater$Factory2C4511H.f38658t0;
            if (w10 != null) {
                w10.s1(w10.f38712l.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        C5243x a5 = C5243x.a();
        Context context = layoutInflater$Factory2C4511H.f38654p0;
        synchronized (a5) {
            a5.f43586a.k(context);
        }
        layoutInflater$Factory2C4511H.f38639X0 = new Configuration(layoutInflater$Factory2C4511H.f38654p0.getResources().getConfiguration());
        layoutInflater$Factory2C4511H.m(false, false);
    }

    @Override // V1.AbstractActivityC1483y, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // V1.AbstractActivityC1483y, g.AbstractActivityC3122o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent t02;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        layoutInflater$Factory2C4511H.B();
        W w10 = layoutInflater$Factory2C4511H.f38658t0;
        if (menuItem.getItemId() == 16908332 && w10 != null && (((z1) w10.f38716p).f43599b & 4) != 0 && (t02 = r9.y.t0(this)) != null) {
            if (AbstractC4902q.c(this, t02)) {
                o1.S s10 = new o1.S(this);
                Intent t03 = r9.y.t0(this);
                if (t03 == null) {
                    t03 = r9.y.t0(this);
                }
                if (t03 != null) {
                    ComponentName component = t03.getComponent();
                    if (component == null) {
                        component = t03.resolveActivity(((Context) s10.f40450h0).getPackageManager());
                    }
                    s10.f(component);
                    ((ArrayList) s10.f40449Z).add(t03);
                }
                s10.r();
                try {
                    int i11 = AbstractC4892g.f40451b;
                    AbstractC4886a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            AbstractC4902q.b(this, t02);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflater$Factory2C4511H) n()).v();
    }

    @Override // V1.AbstractActivityC1483y, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        layoutInflater$Factory2C4511H.B();
        W w10 = layoutInflater$Factory2C4511H.f38658t0;
        if (w10 != null) {
            w10.f38707E = true;
        }
    }

    @Override // V1.AbstractActivityC1483y, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((LayoutInflater$Factory2C4511H) n()).m(true, false);
    }

    @Override // V1.AbstractActivityC1483y, android.app.Activity
    public final void onStop() {
        super.onStop();
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = (LayoutInflater$Factory2C4511H) n();
        layoutInflater$Factory2C4511H.B();
        W w10 = layoutInflater$Factory2C4511H.f38658t0;
        if (w10 != null) {
            w10.f38707E = false;
            androidx.appcompat.view.m mVar = w10.f38706D;
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        n().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflater$Factory2C4511H) n()).B();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity
    public final void setContentView(int i10) {
        o();
        n().g(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((LayoutInflater$Factory2C4511H) n()).f38641Z0 = i10;
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity
    public void setContentView(View view) {
        o();
        n().h(view);
    }

    @Override // g.AbstractActivityC3122o, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        n().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
