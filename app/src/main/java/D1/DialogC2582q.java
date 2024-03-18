package d1;

import D1.AbstractC0362l0;
import D1.AbstractC0364m0;
import H0.Z0;
import K4.J;
import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c1.AbstractC2279d;
import com.openai.chatgpt.R;
import g.C3104C;
import g.C3105D;
import g.DialogC3123p;
import id.AbstractC3557B;
import java.util.UUID;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* renamed from: d1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC2582q extends DialogC3123p {

    /* renamed from: i0  reason: collision with root package name */
    public AbstractC6216a f27889i0;

    /* renamed from: j0  reason: collision with root package name */
    public C2580o f27890j0;

    /* renamed from: k0  reason: collision with root package name */
    public final View f27891k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C2579n f27892l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f27893m0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogC2582q(AbstractC6216a abstractC6216a, C2580o c2580o, View view, Z0.l lVar, Z0.b bVar, UUID uuid) {
        super(new ContextThemeWrapper(r1, r3), 0);
        int i10;
        ViewGroup viewGroup;
        Context context = view.getContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && !c2580o.f27888e) {
            i10 = R.style.FloatingDialogWindowTheme;
        } else {
            i10 = R.style.DialogWindowTheme;
        }
        this.f27889i0 = abstractC6216a;
        this.f27890j0 = c2580o;
        this.f27891k0 = view;
        float f6 = 8;
        Window window = getWindow();
        if (window != null) {
            this.f27893m0 = window.getAttributes().softInputMode & 240;
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            boolean z10 = this.f27890j0.f27888e;
            if (i11 >= 30) {
                AbstractC0364m0.a(window, z10);
            } else {
                AbstractC0362l0.a(window, z10);
            }
            C2579n c2579n = new C2579n(getContext(), window);
            c2579n.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            c2579n.setClipChildren(false);
            c2579n.setElevation(bVar.R(f6));
            c2579n.setOutlineProvider(new Z0(1));
            this.f27892l0 = c2579n;
            View decorView = window.getDecorView();
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                e(viewGroup);
            }
            setContentView(c2579n);
            J.Z(c2579n, J.A(view));
            AbstractC2279d.w(c2579n, AbstractC2279d.n(view));
            AbstractC5260f.N(c2579n, AbstractC5260f.t(view));
            g(this.f27889i0, this.f27890j0, lVar);
            C3104C c3104c = this.f30986h0;
            C2566a c2566a = new C2566a(this, 1);
            AbstractC3557B.c0("<this>", c3104c);
            c3104c.a(this, new C3105D(c2566a, true));
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }

    public static final void e(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C2579n) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) childAt;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    public final void g(AbstractC6216a abstractC6216a, C2580o c2580o, Z0.l lVar) {
        int i10;
        Window window;
        this.f27889i0 = abstractC6216a;
        this.f27890j0 = c2580o;
        EnumC2588w enumC2588w = c2580o.f27886c;
        boolean b10 = AbstractC2575j.b(this.f27891k0);
        int ordinal = enumC2588w.ordinal();
        int i11 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    b10 = false;
                } else {
                    throw new RuntimeException();
                }
            } else {
                b10 = true;
            }
        }
        Window window2 = getWindow();
        AbstractC3557B.Z(window2);
        if (b10) {
            i10 = 8192;
        } else {
            i10 = -8193;
        }
        window2.setFlags(i10, 8192);
        int ordinal2 = lVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i11 = 1;
            } else {
                throw new RuntimeException();
            }
        }
        C2579n c2579n = this.f27892l0;
        c2579n.setLayoutDirection(i11);
        boolean z10 = c2580o.f27887d;
        if (z10 && !c2579n.f27882r0 && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        c2579n.f27882r0 = z10;
        if (Build.VERSION.SDK_INT < 31) {
            if (c2580o.f27888e) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f27893m0);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f27890j0.f27885b) {
            this.f27889i0.mo122invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
