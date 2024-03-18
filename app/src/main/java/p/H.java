package p;

import D1.Z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import q.A0;
import q.N0;
import q.T0;

/* loaded from: classes.dex */
public final class H extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: Z  reason: collision with root package name */
    public final Context f41510Z;

    /* renamed from: h0  reason: collision with root package name */
    public final o f41511h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l f41512i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f41513j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f41514k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f41515l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f41516m0;

    /* renamed from: n0  reason: collision with root package name */
    public final T0 f41517n0;

    /* renamed from: q0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f41520q0;

    /* renamed from: r0  reason: collision with root package name */
    public View f41521r0;

    /* renamed from: s0  reason: collision with root package name */
    public View f41522s0;

    /* renamed from: t0  reason: collision with root package name */
    public B f41523t0;

    /* renamed from: u0  reason: collision with root package name */
    public ViewTreeObserver f41524u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f41525v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f41526w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f41527x0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f41529z0;

    /* renamed from: o0  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC5029e f41518o0 = new ViewTreeObserver$OnGlobalLayoutListenerC5029e(1, this);

    /* renamed from: p0  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC5030f f41519p0 = new View$OnAttachStateChangeListenerC5030f(1, this);

    /* renamed from: y0  reason: collision with root package name */
    public int f41528y0 = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [q.N0, q.T0] */
    public H(int i10, int i11, Context context, View view, o oVar, boolean z10) {
        this.f41510Z = context;
        this.f41511h0 = oVar;
        this.f41513j0 = z10;
        this.f41512i0 = new l(oVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f41515l0 = i10;
        this.f41516m0 = i11;
        Resources resources = context.getResources();
        this.f41514k0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f41521r0 = view;
        this.f41517n0 = new N0(context, null, i10, i11);
        oVar.b(this, context);
    }

    @Override // p.G
    public final boolean a() {
        if (!this.f41525v0 && this.f41517n0.f43320E0.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // p.C
    public final void b(o oVar, boolean z10) {
        if (oVar != this.f41511h0) {
            return;
        }
        dismiss();
        B b10 = this.f41523t0;
        if (b10 != null) {
            b10.b(oVar, z10);
        }
    }

    @Override // p.C
    public final boolean d() {
        return false;
    }

    @Override // p.G
    public final void dismiss() {
        if (a()) {
            this.f41517n0.dismiss();
        }
    }

    @Override // p.C
    public final void e(B b10) {
        this.f41523t0 = b10;
    }

    @Override // p.G
    public final void f() {
        View view;
        boolean z10;
        Rect rect;
        if (!a()) {
            if (!this.f41525v0 && (view = this.f41521r0) != null) {
                this.f41522s0 = view;
                T0 t02 = this.f41517n0;
                t02.f43320E0.setOnDismissListener(this);
                t02.f43336u0 = this;
                t02.f43319D0 = true;
                t02.f43320E0.setFocusable(true);
                View view2 = this.f41522s0;
                if (this.f41524u0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f41524u0 = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f41518o0);
                }
                view2.addOnAttachStateChangeListener(this.f41519p0);
                t02.f43335t0 = view2;
                t02.f43332q0 = this.f41528y0;
                boolean z11 = this.f41526w0;
                Context context = this.f41510Z;
                l lVar = this.f41512i0;
                if (!z11) {
                    this.f41527x0 = x.m(lVar, context, this.f41514k0);
                    this.f41526w0 = true;
                }
                t02.q(this.f41527x0);
                t02.f43320E0.setInputMethodMode(2);
                Rect rect2 = this.f41671Y;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                t02.f43318C0 = rect;
                t02.f();
                A0 a02 = t02.f43323h0;
                a02.setOnKeyListener(this);
                if (this.f41529z0) {
                    o oVar = this.f41511h0;
                    if (oVar.f41617m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) a02, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(oVar.f41617m);
                        }
                        frameLayout.setEnabled(false);
                        a02.addHeaderView(frameLayout, null, false);
                    }
                }
                t02.o(lVar);
                t02.f();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p.C
    public final void g() {
        this.f41526w0 = false;
        l lVar = this.f41512i0;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // p.G
    public final A0 h() {
        return this.f41517n0.f43323h0;
    }

    @Override // p.C
    public final boolean i(I i10) {
        if (i10.hasVisibleItems()) {
            View view = this.f41522s0;
            A a5 = new A(this.f41515l0, this.f41516m0, this.f41510Z, view, i10, this.f41513j0);
            B b10 = this.f41523t0;
            a5.f41505i = b10;
            x xVar = a5.f41506j;
            if (xVar != null) {
                xVar.e(b10);
            }
            boolean u10 = x.u(i10);
            a5.f41504h = u10;
            x xVar2 = a5.f41506j;
            if (xVar2 != null) {
                xVar2.o(u10);
            }
            a5.f41507k = this.f41520q0;
            this.f41520q0 = null;
            this.f41511h0.c(false);
            T0 t02 = this.f41517n0;
            int i11 = t02.f43326k0;
            int n10 = t02.n();
            int i12 = this.f41528y0;
            View view2 = this.f41521r0;
            WeakHashMap weakHashMap = Z.f3247a;
            if ((Gravity.getAbsoluteGravity(i12, D1.I.d(view2)) & 7) == 5) {
                i11 += this.f41521r0.getWidth();
            }
            if (!a5.b()) {
                if (a5.f41502f != null) {
                    a5.d(i11, n10, true, true);
                }
            }
            B b11 = this.f41523t0;
            if (b11 != null) {
                b11.A(i10);
            }
            return true;
        }
        return false;
    }

    @Override // p.x
    public final void n(View view) {
        this.f41521r0 = view;
    }

    @Override // p.x
    public final void o(boolean z10) {
        this.f41512i0.f41600h0 = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f41525v0 = true;
        this.f41511h0.c(true);
        ViewTreeObserver viewTreeObserver = this.f41524u0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f41524u0 = this.f41522s0.getViewTreeObserver();
            }
            this.f41524u0.removeGlobalOnLayoutListener(this.f41518o0);
            this.f41524u0 = null;
        }
        this.f41522s0.removeOnAttachStateChangeListener(this.f41519p0);
        PopupWindow.OnDismissListener onDismissListener = this.f41520q0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p.x
    public final void p(int i10) {
        this.f41528y0 = i10;
    }

    @Override // p.x
    public final void q(int i10) {
        this.f41517n0.f43326k0 = i10;
    }

    @Override // p.x
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f41520q0 = onDismissListener;
    }

    @Override // p.x
    public final void s(boolean z10) {
        this.f41529z0 = z10;
    }

    @Override // p.x
    public final void t(int i10) {
        this.f41517n0.k(i10);
    }

    @Override // p.x
    public final void l(o oVar) {
    }
}
