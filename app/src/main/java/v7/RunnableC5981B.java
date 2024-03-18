package v7;

import t7.C5680b;
import w7.AbstractC6134f;

/* renamed from: v7.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5981B implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47265Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f47266Z;

    public /* synthetic */ RunnableC5981B(int i10, Object obj) {
        this.f47265Y = i10;
        this.f47266Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f47265Y;
        Object obj = this.f47266Z;
        switch (i10) {
            case 0:
                ((BinderC5982C) obj).f47274g.b(new C5680b(4));
                return;
            case 1:
                ((s) obj).e();
                return;
            default:
                AbstractC6134f abstractC6134f = ((r) obj).f47327a.f47329b;
                abstractC6134f.c(abstractC6134f.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
        }
    }
}
