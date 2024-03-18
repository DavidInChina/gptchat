package h;

import H0.C0714y;
import Mf.B;
import U.n;
import Z.AbstractC1710f0;
import jf.y;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: h.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3280f extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31660Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f31661Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f31662h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3280f(Object obj, boolean z10, int i10) {
        super(0);
        this.f31660Y = i10;
        this.f31662h0 = obj;
        this.f31661Z = z10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        y yVar = y.f36177a;
        int i10 = this.f31660Y;
        boolean z10 = this.f31661Z;
        Object obj = this.f31662h0;
        switch (i10) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                return Boolean.valueOf(z10 || ((n) obj).f17369e.h() > 0.5f);
            case 2:
                mo122invoke();
                return yVar;
            case 3:
                mo122invoke();
                return yVar;
            default:
                return new Lf.i((B) obj, z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3280f(boolean z10, Object obj, int i10) {
        super(0);
        this.f31660Y = i10;
        this.f31661Z = z10;
        this.f31662h0 = obj;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f31660Y;
        Object obj = this.f31662h0;
        boolean z10 = this.f31661Z;
        switch (i10) {
            case 0:
                C3283i c3283i = (C3283i) obj;
                c3283i.f30995a = z10;
                AbstractC6216a abstractC6216a = c3283i.f30997c;
                if (abstractC6216a == null) {
                    return;
                }
                abstractC6216a.mo122invoke();
                return;
            case 1:
            default:
                if (!z10) {
                    return;
                }
                ((AbstractC1710f0) obj).setValue(Boolean.TRUE);
                return;
            case 2:
                C0714y c0714y = (C0714y) obj;
                if (z10) {
                    c0714y.clearFocus();
                    return;
                } else {
                    c0714y.requestFocus();
                    return;
                }
        }
    }
}
