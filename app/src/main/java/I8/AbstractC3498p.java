package i8;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: i8.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3498p {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f32814a;

    /* renamed from: b  reason: collision with root package name */
    public final C3497o f32815b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f32816c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f32817d;

    public AbstractC3498p(C3497o c3497o) {
        this.f32814a = c3497o.f32795h0;
        this.f32815b = c3497o;
        this.f32816c = c3497o.getContext();
        this.f32817d = c3497o.f32801n0;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public E1.d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof C3494l;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f32815b.f(false);
    }

    public abstract void r();

    public void a() {
    }

    public void b() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(E1.p pVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }
}
