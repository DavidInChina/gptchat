package A2;

import s2.AbstractC5530A;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;

/* renamed from: A2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0071o implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f579Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U3.l f580Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ R4.a f581h0;

    public /* synthetic */ RunnableC0071o(U3.l lVar, R4.a aVar, int i10) {
        this.f579Y = i10;
        this.f580Z = lVar;
        this.f581h0 = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f579Y;
        final R4.a aVar = this.f581h0;
        U3.l lVar = this.f580Z;
        switch (i10) {
            case 0:
                int i11 = AbstractC5530A.f45131a;
                z2.w wVar = (z2.w) ((SurfaceHolder$CallbackC6500C) lVar.f17424h0).f50334Y.f50379r;
                final C6757b M10 = wVar.M();
                wVar.N(M10, 1031, new s2.m(M10, aVar, 0) { // from class: z2.l

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51515Y;

                    {
                        this.f51515Y = r3;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj;
                        switch (this.f51515Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                abstractC6758c.getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                int i12 = AbstractC5530A.f45131a;
                z2.w wVar2 = (z2.w) ((SurfaceHolder$CallbackC6500C) lVar.f17424h0).f50334Y.f50379r;
                final C6757b M11 = wVar2.M();
                wVar2.N(M11, 1032, new s2.m(M11, aVar, 1) { // from class: z2.l

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51515Y;

                    {
                        this.f51515Y = r3;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj;
                        switch (this.f51515Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                abstractC6758c.getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
