package p;

import D1.Z;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a  reason: collision with root package name */
    public final Context f41497a;

    /* renamed from: b  reason: collision with root package name */
    public final o f41498b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f41499c;

    /* renamed from: d  reason: collision with root package name */
    public final int f41500d;

    /* renamed from: e  reason: collision with root package name */
    public final int f41501e;

    /* renamed from: f  reason: collision with root package name */
    public View f41502f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f41504h;

    /* renamed from: i  reason: collision with root package name */
    public B f41505i;

    /* renamed from: j  reason: collision with root package name */
    public x f41506j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f41507k;

    /* renamed from: g  reason: collision with root package name */
    public int f41503g = 8388611;

    /* renamed from: l  reason: collision with root package name */
    public final y f41508l = new y(this);

    public A(int i10, int i11, Context context, View view, o oVar, boolean z10) {
        this.f41497a = context;
        this.f41498b = oVar;
        this.f41502f = view;
        this.f41499c = z10;
        this.f41500d = i10;
        this.f41501e = i11;
    }

    public final x a() {
        x xVar;
        if (this.f41506j == null) {
            Context context = this.f41497a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            z.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                xVar = new View$OnKeyListenerC5033i(this.f41497a, this.f41502f, this.f41500d, this.f41501e, this.f41499c);
            } else {
                View view = this.f41502f;
                xVar = new H(this.f41500d, this.f41501e, this.f41497a, view, this.f41498b, this.f41499c);
            }
            xVar.l(this.f41498b);
            xVar.r(this.f41508l);
            xVar.n(this.f41502f);
            xVar.e(this.f41505i);
            xVar.o(this.f41504h);
            xVar.p(this.f41503g);
            this.f41506j = xVar;
        }
        return this.f41506j;
    }

    public final boolean b() {
        x xVar = this.f41506j;
        if (xVar != null && xVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f41506j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f41507k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        x a5 = a();
        a5.s(z11);
        if (z10) {
            int i12 = this.f41503g;
            View view = this.f41502f;
            WeakHashMap weakHashMap = Z.f3247a;
            if ((Gravity.getAbsoluteGravity(i12, D1.I.d(view)) & 7) == 5) {
                i10 -= this.f41502f.getWidth();
            }
            a5.q(i10);
            a5.t(i11);
            int i13 = (int) ((this.f41497a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a5.f41671Y = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a5.f();
    }
}
