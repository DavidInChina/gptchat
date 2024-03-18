package V3;

import M3.J;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final M3.q f18360Y;

    /* renamed from: Z  reason: collision with root package name */
    public final M3.w f18361Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f18362h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f18363i0;

    public o(M3.q qVar, M3.w wVar, boolean z10, int i10) {
        AbstractC3557B.c0("processor", qVar);
        AbstractC3557B.c0("token", wVar);
        this.f18360Y = qVar;
        this.f18361Z = wVar;
        this.f18362h0 = z10;
        this.f18363i0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        J b10;
        if (this.f18362h0) {
            M3.q qVar = this.f18360Y;
            M3.w wVar = this.f18361Z;
            int i10 = this.f18363i0;
            qVar.getClass();
            String str = wVar.f11607a.f17418a;
            synchronized (qVar.f11594k) {
                b10 = qVar.b(str);
            }
            z10 = M3.q.e(str, b10, i10);
        } else {
            z10 = this.f18360Y.k(this.f18361Z, this.f18363i0);
        }
        L3.s d10 = L3.s.d();
        String f6 = L3.s.f("StopWorkRunnable");
        d10.a(f6, "StopWorkRunnable for " + this.f18361Z.f11607a.f17418a + "; Processor.stopWork = " + z10);
    }
}
