package m;

import D1.C0358j0;
import D1.Z;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import w.C6049A;

/* renamed from: m.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4505B extends WindowCallbackWrapper {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f38583Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f38584Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f38585h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater$Factory2C4511H f38586i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4505B(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H, Window.Callback callback) {
        super(callback);
        this.f38586i0 = layoutInflater$Factory2C4511H;
    }

    public final void b(Window.Callback callback) {
        try {
            this.f38583Y = true;
            callback.onContentChanged();
        } finally {
            this.f38583Y = false;
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f38584Z) {
            return a().dispatchKeyEvent(keyEvent);
        }
        if (!this.f38586i0.t(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        V v10;
        p.o oVar;
        boolean z10;
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38586i0;
        layoutInflater$Factory2C4511H.B();
        W w10 = layoutInflater$Factory2C4511H.f38658t0;
        if (w10 != null && (v10 = w10.f38720t) != null && (oVar = v10.f38697i0) != null) {
            if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            oVar.setQwertyMode(z10);
            if (oVar.performShortcut(keyCode, keyEvent, 0)) {
                return true;
            }
        }
        C4510G c4510g = layoutInflater$Factory2C4511H.f38634S0;
        if (c4510g != null && layoutInflater$Factory2C4511H.G(c4510g, keyEvent.getKeyCode(), keyEvent)) {
            C4510G c4510g2 = layoutInflater$Factory2C4511H.f38634S0;
            if (c4510g2 == null) {
                return true;
            }
            c4510g2.f38607l = true;
            return true;
        }
        if (layoutInflater$Factory2C4511H.f38634S0 == null) {
            C4510G A10 = layoutInflater$Factory2C4511H.A(0);
            layoutInflater$Factory2C4511H.H(A10, keyEvent);
            boolean G10 = layoutInflater$Factory2C4511H.G(A10, keyEvent.getKeyCode(), keyEvent);
            A10.f38606k = false;
            if (G10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f38583Y) {
            a().onContentChanged();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof p.o)) {
            return false;
        }
        return super.onCreatePanelMenu(i10, menu);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return super.onCreatePanelView(i10);
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        super.onMenuOpened(i10, menu);
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38586i0;
        if (i10 == 108) {
            layoutInflater$Factory2C4511H.B();
            W w10 = layoutInflater$Factory2C4511H.f38658t0;
            if (w10 != null && true != w10.f38723w) {
                w10.f38723w = true;
                ArrayList arrayList = w10.f38724x;
                if (arrayList.size() > 0) {
                    AbstractC2469q0.p(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            layoutInflater$Factory2C4511H.getClass();
        }
        return true;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f38585h0) {
            a().onPanelClosed(i10, menu);
            return;
        }
        super.onPanelClosed(i10, menu);
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38586i0;
        if (i10 == 108) {
            layoutInflater$Factory2C4511H.B();
            W w10 = layoutInflater$Factory2C4511H.f38658t0;
            if (w10 != null && w10.f38723w) {
                w10.f38723w = false;
                ArrayList arrayList = w10.f38724x;
                if (arrayList.size() > 0) {
                    AbstractC2469q0.p(arrayList.get(0));
                    throw null;
                }
            }
        } else if (i10 == 0) {
            C4510G A10 = layoutInflater$Factory2C4511H.A(i10);
            if (A10.f38608m) {
                layoutInflater$Factory2C4511H.r(A10, false);
            }
        } else {
            layoutInflater$Factory2C4511H.getClass();
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        p.o oVar;
        if (menu instanceof p.o) {
            oVar = (p.o) menu;
        } else {
            oVar = null;
        }
        if (i10 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f41628x = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
        if (oVar != null) {
            oVar.f41628x = false;
        }
        return onPreparePanel;
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        p.o oVar = this.f38586i0.A(0).f38603h;
        if (oVar != null) {
            super.onProvideKeyboardShortcuts(list, oVar, i10);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e2  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, U3.i] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.appcompat.view.g, java.lang.Object, androidx.appcompat.view.c, p.m] */
    @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        boolean z10;
        ViewGroup viewGroup;
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38586i0;
        if (layoutInflater$Factory2C4511H.f38620E0 && i10 == 0) {
            Context context = layoutInflater$Factory2C4511H.f38654p0;
            ?? obj = new Object();
            obj.f17415Z = context;
            obj.f17414Y = callback;
            obj.f17416h0 = new ArrayList();
            obj.f17417i0 = new C6049A(0);
            androidx.appcompat.view.c cVar = layoutInflater$Factory2C4511H.f38664z0;
            if (cVar != null) {
                cVar.a();
            }
            C4541v c4541v = new C4541v(layoutInflater$Factory2C4511H, obj);
            layoutInflater$Factory2C4511H.B();
            W w10 = layoutInflater$Factory2C4511H.f38658t0;
            if (w10 != null) {
                V v10 = w10.f38720t;
                if (v10 != null) {
                    v10.a();
                }
                w10.f38714n.setHideOnContentScrollEnabled(false);
                w10.f38717q.e();
                V v11 = new V(w10, w10.f38717q.getContext(), c4541v);
                p.o oVar = v11.f38697i0;
                oVar.w();
                try {
                    if (v11.f38698j0.j(v11, oVar)) {
                        w10.f38720t = v11;
                        v11.g();
                        w10.f38717q.c(v11);
                        w10.o1(true);
                    } else {
                        v11 = null;
                    }
                    layoutInflater$Factory2C4511H.f38664z0 = v11;
                } finally {
                    oVar.v();
                }
            }
            if (layoutInflater$Factory2C4511H.f38664z0 == null) {
                C0358j0 c0358j0 = layoutInflater$Factory2C4511H.f38619D0;
                if (c0358j0 != null) {
                    c0358j0.b();
                }
                androidx.appcompat.view.c cVar2 = layoutInflater$Factory2C4511H.f38664z0;
                if (cVar2 != null) {
                    cVar2.a();
                }
                if (layoutInflater$Factory2C4511H.f38657s0 != null) {
                    boolean z11 = layoutInflater$Factory2C4511H.f38638W0;
                }
                if (layoutInflater$Factory2C4511H.f38616A0 == null) {
                    boolean z12 = layoutInflater$Factory2C4511H.f38630O0;
                    Context context2 = layoutInflater$Factory2C4511H.f38654p0;
                    if (z12) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context2.getTheme();
                        theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = context2.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            androidx.appcompat.view.f fVar = new androidx.appcompat.view.f(context2, 0);
                            fVar.getTheme().setTo(newTheme);
                            context2 = fVar;
                        }
                        layoutInflater$Factory2C4511H.f38616A0 = new ActionBarContextView(context2, null);
                        PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                        layoutInflater$Factory2C4511H.f38617B0 = popupWindow;
                        H1.n.d(popupWindow, 2);
                        layoutInflater$Factory2C4511H.f38617B0.setContentView(layoutInflater$Factory2C4511H.f38616A0);
                        layoutInflater$Factory2C4511H.f38617B0.setWidth(-1);
                        context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                        layoutInflater$Factory2C4511H.f38616A0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                        layoutInflater$Factory2C4511H.f38617B0.setHeight(-2);
                        layoutInflater$Factory2C4511H.f38618C0 = new r(layoutInflater$Factory2C4511H, 1);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflater$Factory2C4511H.f38622G0.findViewById(R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            layoutInflater$Factory2C4511H.B();
                            W w11 = layoutInflater$Factory2C4511H.f38658t0;
                            Context p12 = w11 != null ? w11.p1() : null;
                            if (p12 != null) {
                                context2 = p12;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                            layoutInflater$Factory2C4511H.f38616A0 = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (layoutInflater$Factory2C4511H.f38616A0 != null) {
                    C0358j0 c0358j02 = layoutInflater$Factory2C4511H.f38619D0;
                    if (c0358j02 != null) {
                        c0358j02.b();
                    }
                    layoutInflater$Factory2C4511H.f38616A0.e();
                    Context context3 = layoutInflater$Factory2C4511H.f38616A0.getContext();
                    ActionBarContextView actionBarContextView = layoutInflater$Factory2C4511H.f38616A0;
                    ?? obj2 = new Object();
                    obj2.f24360h0 = context3;
                    obj2.f24361i0 = actionBarContextView;
                    obj2.f24362j0 = c4541v;
                    p.o oVar2 = new p.o(actionBarContextView.getContext());
                    oVar2.f41616l = 1;
                    obj2.f24365m0 = oVar2;
                    oVar2.f41609e = obj2;
                    if (c4541v.f38795Y.j(obj2, oVar2)) {
                        obj2.g();
                        layoutInflater$Factory2C4511H.f38616A0.c(obj2);
                        layoutInflater$Factory2C4511H.f38664z0 = obj2;
                        if (layoutInflater$Factory2C4511H.f38621F0 && (viewGroup = layoutInflater$Factory2C4511H.f38622G0) != null) {
                            WeakHashMap weakHashMap = Z.f3247a;
                            if (D1.K.c(viewGroup)) {
                                z10 = true;
                                if (!z10) {
                                    layoutInflater$Factory2C4511H.f38616A0.setAlpha(0.0f);
                                    C0358j0 a5 = Z.a(layoutInflater$Factory2C4511H.f38616A0);
                                    a5.a(1.0f);
                                    layoutInflater$Factory2C4511H.f38619D0 = a5;
                                    a5.d(new C4540u(1, layoutInflater$Factory2C4511H));
                                } else {
                                    layoutInflater$Factory2C4511H.f38616A0.setAlpha(1.0f);
                                    layoutInflater$Factory2C4511H.f38616A0.setVisibility(0);
                                    if (layoutInflater$Factory2C4511H.f38616A0.getParent() instanceof View) {
                                        WeakHashMap weakHashMap2 = Z.f3247a;
                                        D1.L.c((View) layoutInflater$Factory2C4511H.f38616A0.getParent());
                                    }
                                }
                                if (layoutInflater$Factory2C4511H.f38617B0 != null) {
                                    layoutInflater$Factory2C4511H.f38655q0.getDecorView().post(layoutInflater$Factory2C4511H.f38618C0);
                                }
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                        if (layoutInflater$Factory2C4511H.f38617B0 != null) {
                        }
                    } else {
                        layoutInflater$Factory2C4511H.f38664z0 = null;
                    }
                }
                layoutInflater$Factory2C4511H.J();
                layoutInflater$Factory2C4511H.f38664z0 = layoutInflater$Factory2C4511H.f38664z0;
            }
            layoutInflater$Factory2C4511H.J();
            androidx.appcompat.view.c cVar3 = layoutInflater$Factory2C4511H.f38664z0;
            if (cVar3 == null) {
                return null;
            }
            return obj.u(cVar3);
        }
        return super.onWindowStartingActionMode(callback, i10);
    }
}
