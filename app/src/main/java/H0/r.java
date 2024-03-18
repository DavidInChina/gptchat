package H0;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import b0.C2104h;
import wf.AbstractC6216a;
import y0.C6488a;
import z0.C6738a;
import z0.C6739b;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6996Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0714y f6997Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C0714y c0714y, int i10) {
        super(1);
        this.f6996Y = i10;
        this.f6997Z = c0714y;
    }

    public final void a(AbstractC6216a abstractC6216a) {
        Looper looper;
        int i10 = this.f6996Y;
        C0714y c0714y = this.f6997Z;
        switch (i10) {
            case 1:
                C2104h c2104h = c0714y.f7124r1;
                if (!c2104h.g(abstractC6216a)) {
                    c2104h.b(abstractC6216a);
                    return;
                }
                return;
            default:
                Handler handler = c0714y.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    abstractC6216a.mo122invoke();
                    return;
                }
                Handler handler2 = c0714y.getHandler();
                if (handler2 != null) {
                    handler2.post(new RunnableC0712x(abstractC6216a, 0));
                    return;
                }
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        p0.c cVar;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f6996Y;
        boolean z10 = true;
        int i11 = 1;
        C0714y c0714y = this.f6997Z;
        switch (i10) {
            case 0:
                int i12 = ((C6488a) obj).f50319a;
                if (i12 == 1) {
                    z10 = c0714y.isInTouchMode();
                } else if (i12 == 2) {
                    if (c0714y.isInTouchMode()) {
                        z10 = c0714y.requestFocusFromTouch();
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                a((AbstractC6216a) obj);
                return yVar;
            case 2:
                KeyEvent keyEvent = ((C6739b) obj).f51432a;
                c0714y.getClass();
                long b10 = androidx.compose.ui.input.key.a.b(keyEvent);
                if (C6738a.a(b10, C6738a.f51424h)) {
                    if (keyEvent.isShiftPressed()) {
                        i11 = 2;
                    }
                    cVar = new p0.c(i11);
                } else if (C6738a.a(b10, C6738a.f51422f)) {
                    cVar = new p0.c(4);
                } else if (C6738a.a(b10, C6738a.f51421e)) {
                    cVar = new p0.c(3);
                } else if (C6738a.a(b10, C6738a.f51419c) || C6738a.a(b10, C6738a.f51427k)) {
                    cVar = new p0.c(5);
                } else if (C6738a.a(b10, C6738a.f51420d) || C6738a.a(b10, C6738a.f51428l)) {
                    cVar = new p0.c(6);
                } else if (C6738a.a(b10, C6738a.f51423g) || C6738a.a(b10, C6738a.f51425i) || C6738a.a(b10, C6738a.f51429m)) {
                    cVar = new p0.c(7);
                } else if (C6738a.a(b10, C6738a.f51418b) || C6738a.a(b10, C6738a.f51426j)) {
                    cVar = new p0.c(8);
                } else {
                    cVar = null;
                }
                if (cVar != null && r.f.w(androidx.compose.ui.input.key.a.c(keyEvent), 2)) {
                    return Boolean.valueOf(((p0.g) c0714y.getFocusOwner()).b(cVar.f41675a));
                }
                return Boolean.FALSE;
            default:
                a((AbstractC6216a) obj);
                return yVar;
        }
    }
}
