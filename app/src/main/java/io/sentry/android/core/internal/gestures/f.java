package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.EnumC3642e1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.r1;
import java.util.Collections;
import xe.C6431t;

/* loaded from: classes2.dex */
public final class f implements Window.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public final Window.Callback f34128Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Window.Callback f34129Z;

    /* renamed from: h0  reason: collision with root package name */
    public final e f34130h0;

    /* renamed from: i0  reason: collision with root package name */
    public final GestureDetectorCompat f34131i0;

    /* renamed from: j0  reason: collision with root package name */
    public final r1 f34132j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C6431t f34133k0;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xe.t] */
    public f(Window.Callback callback, Context context, e eVar, SentryAndroidOptions sentryAndroidOptions) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(context, eVar);
        ?? obj = new Object();
        this.f34128Y = callback;
        this.f34129Z = callback;
        this.f34130h0 = eVar;
        this.f34132j0 = sentryAndroidOptions;
        this.f34131i0 = gestureDetectorCompat;
        this.f34133k0 = obj;
    }

    public final void a(MotionEvent motionEvent) {
        String str;
        ((GestureDetector) this.f34131i0.f24927a.f8729Y).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            e eVar = this.f34130h0;
            View b10 = eVar.b("onUp");
            U7.b bVar = eVar.f34127g;
            io.sentry.internal.gestures.c cVar = (io.sentry.internal.gestures.c) bVar.f17506d;
            if (b10 != null && cVar != null) {
                d dVar = (d) bVar.f17505c;
                d dVar2 = d.Unknown;
                if (dVar == dVar2) {
                    eVar.f34123c.getLogger().f(EnumC3642e1.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                    return;
                }
                float x10 = motionEvent.getX() - bVar.f17503a;
                float y10 = motionEvent.getY() - bVar.f17504b;
                if (Math.abs(x10) > Math.abs(y10)) {
                    if (x10 > 0.0f) {
                        str = "right";
                    } else {
                        str = "left";
                    }
                } else if (y10 > 0.0f) {
                    str = "down";
                } else {
                    str = "up";
                }
                eVar.a(cVar, (d) bVar.f17505c, Collections.singletonMap("direction", str), motionEvent);
                eVar.d(cVar, (d) bVar.f17505c);
                bVar.f17506d = null;
                bVar.f17505c = dVar2;
                bVar.f17503a = 0.0f;
                bVar.f17504b = 0.0f;
            }
        }
    }

    /* renamed from: b */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f34128Y.onActionModeFinished(actionMode);
    }

    /* renamed from: c */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f34128Y.onActionModeStarted(actionMode);
    }

    /* renamed from: d */
    public final void onAttachedToWindow() {
        this.f34128Y.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f34128Y.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f34128Y.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f34128Y.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f34128Y.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        r1 r1Var;
        if (motionEvent != null) {
            this.f34133k0.getClass();
            try {
                a(MotionEvent.obtain(motionEvent));
            } finally {
                if (r1Var != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.f34128Y.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f34128Y.dispatchTrackballEvent(motionEvent);
    }

    /* renamed from: e */
    public final void onContentChanged() {
        this.f34128Y.onContentChanged();
    }

    /* renamed from: f */
    public final void onDetachedFromWindow() {
        this.f34128Y.onDetachedFromWindow();
    }

    /* renamed from: g */
    public final void onPanelClosed(int i10, Menu menu) {
        this.f34128Y.onPanelClosed(i10, menu);
    }

    /* renamed from: h */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f34128Y.onWindowAttributesChanged(layoutParams);
    }

    /* renamed from: i */
    public final void onWindowFocusChanged(boolean z10) {
        this.f34128Y.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f34128Y.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.f34128Y.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f34128Y.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return this.f34128Y.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f34128Y.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f34128Y.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f34128Y.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f34128Y.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f34128Y.onWindowStartingActionMode(callback, i10);
    }
}
