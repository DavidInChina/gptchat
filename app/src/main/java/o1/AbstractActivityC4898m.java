package o1;

import D1.AbstractC0363m;
import a1.C1915c;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2082q;
import l8.AbstractC4344b;

/* renamed from: o1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC4898m extends Activity implements AbstractC2086v, AbstractC0363m {

    /* renamed from: Y  reason: collision with root package name */
    public C2088x f40465Y;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && AbstractC4344b.b0(decorView, keyEvent)) {
            return true;
        }
        return AbstractC4344b.c0(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && AbstractC4344b.b0(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // D1.AbstractC0363m
    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.N.f25303Z;
        C1915c.p(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        EnumC2082q enumC2082q = EnumC2082q.f25377h0;
        C2088x c2088x = this.f40465Y;
        c2088x.getClass();
        c2088x.j("markState");
        c2088x.m(enumC2082q);
        super.onSaveInstanceState(bundle);
    }
}
