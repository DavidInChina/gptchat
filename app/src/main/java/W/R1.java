package W;

import H0.AbstractC0666a;
import Z.AbstractC1725n;
import Z.C1724m0;
import Z.C1741v0;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import c1.AbstractC2279d;
import com.openai.chatgpt.R;
import d1.EnumC2588w;
import id.AbstractC3557B;
import java.util.UUID;
import nf.AbstractC4828h;
import q1.AbstractC5260f;
import wf.AbstractC6216a;
import z.C6675O;

/* loaded from: classes2.dex */
public final class R1 extends AbstractC0666a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: p0  reason: collision with root package name */
    public final P1 f19595p0;

    /* renamed from: q0  reason: collision with root package name */
    public final AbstractC6216a f19596q0;

    /* renamed from: r0  reason: collision with root package name */
    public final View f19597r0;

    /* renamed from: s0  reason: collision with root package name */
    public Object f19598s0;

    /* renamed from: t0  reason: collision with root package name */
    public final WindowManager f19599t0;

    /* renamed from: u0  reason: collision with root package name */
    public final WindowManager.LayoutParams f19600u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C1724m0 f19601v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f19602w0;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
        if (r4 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R1(P1 p12, AbstractC6216a abstractC6216a, View view, UUID uuid) {
        super(view.getContext());
        WindowManager.LayoutParams layoutParams;
        this.f19595p0 = p12;
        this.f19596q0 = abstractC6216a;
        this.f19597r0 = view;
        setId(16908290);
        K4.J.Z(this, K4.J.A(view));
        AbstractC2279d.w(this, AbstractC2279d.n(view));
        AbstractC5260f.N(this, AbstractC5260f.t(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        boolean z10 = false;
        setClipChildren(false);
        Object systemService = view.getContext().getSystemService("window");
        AbstractC3557B.a0("null cannot be cast to non-null type android.view.WindowManager", systemService);
        this.f19599t0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        layoutParams2.gravity = 8388691;
        layoutParams2.type = 1000;
        layoutParams2.width = getContext().getResources().getDisplayMetrics().widthPixels;
        layoutParams2.height = -1;
        layoutParams2.format = -3;
        layoutParams2.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        layoutParams2.token = view.getApplicationWindowToken();
        layoutParams2.flags = (layoutParams2.flags & (-163841)) | 512;
        EnumC2588w enumC2588w = p12.f19543a;
        ViewGroup.LayoutParams layoutParams3 = view.getRootView().getLayoutParams();
        if (layoutParams3 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams3;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null && (layoutParams.flags & 8192) != 0) {
            z10 = true;
        }
        int ordinal = enumC2588w.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                layoutParams2.flags &= -8193;
            }
            layoutParams2.flags |= 8192;
        }
        if (!p12.f19544b) {
            layoutParams2.flags |= 8;
        } else {
            layoutParams2.flags &= -9;
        }
        this.f19600u0 = layoutParams2;
        this.f19601v0 = AbstractC4828h.Z(V0.f19740b, Z.o1.f22665a);
    }

    @Override // H0.AbstractC0666a
    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-463309699);
        if ((i10 & 6) == 0) {
            if (rVar.i(this)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && rVar.B()) {
            rVar.P();
        } else {
            ((wf.n) this.f19601v0.getValue()).invoke(rVar, 0);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6675O(this, i10, 5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f19595p0.f19545c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f19596q0.mo122invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // H0.AbstractC0666a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f19602w0;
    }

    public final void h(Z0.l lVar) {
        int i10;
        int ordinal = lVar.ordinal();
        if (ordinal != 0) {
            i10 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    @Override // H0.AbstractC0666a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19595p0.f19545c && Build.VERSION.SDK_INT >= 33) {
            if (this.f19598s0 == null) {
                this.f19598s0 = Q1.a(this.f19596q0);
            }
            Q1.b(this, this.f19598s0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            Q1.c(this, this.f19598s0);
        }
        this.f19598s0 = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i10) {
    }
}
