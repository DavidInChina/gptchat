package g;

import K4.J;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.S;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import q1.AbstractC5260f;

/* renamed from: g.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC3123p extends Dialog implements AbstractC2086v, AbstractC3106E, A3.f {

    /* renamed from: Y  reason: collision with root package name */
    public C2088x f30984Y;

    /* renamed from: Z  reason: collision with root package name */
    public final A3.e f30985Z = new A3.e(this);

    /* renamed from: h0  reason: collision with root package name */
    public final C3104C f30986h0 = new C3104C(new RunnableC3111d(2, this));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3123p(Context context, int i10) {
        super(context, i10);
        AbstractC3557B.c0("context", context);
    }

    public static void b(DialogC3123p dialogC3123p) {
        AbstractC3557B.c0("this$0", dialogC3123p);
        super.onBackPressed();
    }

    @Override // g.AbstractC3106E
    public final C3104C a() {
        return this.f30986h0;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC3557B.c0("view", view);
        d();
        super.addContentView(view, layoutParams);
    }

    public final C2088x c() {
        C2088x c2088x = this.f30984Y;
        if (c2088x == null) {
            C2088x c2088x2 = new C2088x(this);
            this.f30984Y = c2088x2;
            return c2088x2;
        }
        return c2088x;
    }

    public final void d() {
        Window window = getWindow();
        AbstractC3557B.Z(window);
        View decorView = window.getDecorView();
        AbstractC3557B.b0("window!!.decorView", decorView);
        J.Z(decorView, this);
        Window window2 = getWindow();
        AbstractC3557B.Z(window2);
        View decorView2 = window2.getDecorView();
        AbstractC3557B.b0("window!!.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC3557B.Z(window3);
        View decorView3 = window3.getDecorView();
        AbstractC3557B.b0("window!!.decorView", decorView3);
        AbstractC5260f.N(decorView3, this);
    }

    @Override // A3.f
    public final A3.d f() {
        return this.f30985Z.f645b;
    }

    @Override // androidx.lifecycle.AbstractC2086v
    public final S h() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f30986h0.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC3557B.b0("onBackInvokedDispatcher", onBackInvokedDispatcher);
            C3104C c3104c = this.f30986h0;
            c3104c.getClass();
            c3104c.f30932e = onBackInvokedDispatcher;
            c3104c.d(c3104c.f30934g);
        }
        this.f30985Z.b(bundle);
        c().k(EnumC2081p.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC3557B.b0("super.onSaveInstanceState()", onSaveInstanceState);
        this.f30985Z.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        c().k(EnumC2081p.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().k(EnumC2081p.ON_DESTROY);
        this.f30984Y = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC3557B.c0("view", view);
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC3557B.c0("view", view);
        d();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }
}
