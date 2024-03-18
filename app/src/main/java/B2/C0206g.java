package B2;

import android.os.Handler;
import g.RunnableC3111d;
import s2.AbstractC5530A;

/* renamed from: B2.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0206g implements p {

    /* renamed from: Y  reason: collision with root package name */
    public final n f1776Y;

    /* renamed from: Z  reason: collision with root package name */
    public k f1777Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1778h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0207h f1779i0;

    public C0206g(C0207h c0207h, n nVar) {
        this.f1779i0 = c0207h;
        this.f1776Y = nVar;
    }

    @Override // B2.p
    public final void release() {
        Handler handler = this.f1779i0.f1802y0;
        handler.getClass();
        AbstractC5530A.F(handler, new RunnableC3111d(15, this));
    }
}
