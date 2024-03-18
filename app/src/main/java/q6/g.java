package q6;

import Lg.n;
import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.w;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import v6.C5977a;
import wf.k;

/* loaded from: classes2.dex */
public final class g implements Window.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5092d f43963Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Window.Callback f43964Z;

    /* renamed from: h0  reason: collision with root package name */
    public final U3.e f43965h0;

    /* renamed from: i0  reason: collision with root package name */
    public final y6.f f43966i0;

    /* renamed from: j0  reason: collision with root package name */
    public final k f43967j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C5977a[] f43968k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC5091c f43969l0;

    /* renamed from: m0  reason: collision with root package name */
    public final WeakReference f43970m0;

    public g(Window window, AbstractC5092d abstractC5092d, Window.Callback callback, U3.e eVar, y6.f fVar, C5977a[] c5977aArr, AbstractC5091c abstractC5091c) {
        f fVar2 = f.f43962Y;
        AbstractC3557B.c0("window", window);
        AbstractC3557B.c0("sdkCore", abstractC5092d);
        AbstractC3557B.c0("interactionPredicate", fVar);
        AbstractC3557B.c0("targetAttributesProviders", c5977aArr);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f43963Y = abstractC5092d;
        this.f43964Z = callback;
        this.f43965h0 = eVar;
        this.f43966i0 = fVar;
        this.f43967j0 = fVar2;
        this.f43968k0 = c5977aArr;
        this.f43969l0 = abstractC5091c;
        this.f43970m0 = new WeakReference(window);
    }

    public final void a(NullPointerException nullPointerException) {
        String message = nullPointerException.getMessage();
        if (message != null && n.Z1(message, "Parameter specified as non-null is null", false)) {
            P4.a.m0(this.f43969l0, 5, EnumC5090b.f42739Z, C5278c.f43949l0, nullPointerException, false, 48);
            return;
        }
        throw nullPointerException;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f43964Z.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window window;
        View currentFocus;
        if (keyEvent == null) {
            P4.a.l0(this.f43969l0, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), C5278c.f43946i0, null, 56);
        } else {
            int keyCode = keyEvent.getKeyCode();
            AbstractC5092d abstractC5092d = this.f43963Y;
            y6.f fVar = this.f43966i0;
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                fVar.getClass();
                i6.b.a(abstractC5092d).l(i6.d.f32726j0, "back", w.f37484Y);
            } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1 && (window = (Window) this.f43970m0.get()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                LinkedHashMap c12 = AbstractC4268D.c1(new C3959i("action.target.classname", AbstractC4828h.p0(currentFocus)), new C3959i("action.target.resource_id", AbstractC4828h.k0(window.getContext(), currentFocus.getId())));
                for (C5977a c5977a : this.f43968k0) {
                    c5977a.getClass();
                    C5977a.a(currentFocus, c12);
                }
                AbstractC4828h.j0(fVar, currentFocus);
                i6.b.a(abstractC5092d).l(i6.d.f32725i0, "", c12);
            }
        }
        try {
            return this.f43964Z.dispatchKeyEvent(keyEvent);
        } catch (NullPointerException e10) {
            a(e10);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f43964Z.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f43964Z.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        if (motionEvent != null) {
            MotionEvent motionEvent2 = (MotionEvent) this.f43967j0.invoke(motionEvent);
            try {
                try {
                    this.f43965h0.z(motionEvent2);
                } catch (Exception e10) {
                    P4.a.l0(this.f43969l0, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), C5278c.f43947j0, e10, 48);
                }
            } finally {
                motionEvent2.recycle();
            }
        } else {
            P4.a.l0(this.f43969l0, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), C5278c.f43948k0, null, 56);
        }
        try {
            return this.f43964Z.dispatchTouchEvent(motionEvent);
        } catch (NullPointerException e11) {
            a(e11);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f43964Z.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f43964Z.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f43964Z.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f43964Z.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f43964Z.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC3557B.c0("p1", menu);
        return this.f43964Z.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f43964Z.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f43964Z.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Context context;
        AbstractC3557B.c0("item", menuItem);
        Window window = (Window) this.f43970m0.get();
        if (window != null) {
            context = window.getContext();
        } else {
            context = null;
        }
        LinkedHashMap c12 = AbstractC4268D.c1(new C3959i("action.target.classname", menuItem.getClass().getCanonicalName()), new C3959i("action.target.resource_id", AbstractC4828h.k0(context, menuItem.getItemId())), new C3959i("action.target.title", menuItem.getTitle()));
        i6.f a5 = i6.b.a(this.f43963Y);
        i6.d dVar = i6.d.f32722Y;
        AbstractC4828h.j0(this.f43966i0, menuItem);
        a5.l(dVar, "", c12);
        try {
            return this.f43964Z.onMenuItemSelected(i10, menuItem);
        } catch (NullPointerException e10) {
            a(e10);
            return true;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        AbstractC3557B.c0("p1", menu);
        return this.f43964Z.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        AbstractC3557B.c0("p1", menu);
        this.f43964Z.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC3557B.c0("p2", menu);
        return this.f43964Z.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f43964Z.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f43964Z.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.f43964Z.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f43964Z.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f43964Z.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f43964Z.onWindowStartingActionMode(callback, i10);
    }
}
