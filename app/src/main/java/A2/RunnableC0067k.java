package A2;

import s2.AbstractC5530A;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;

/* renamed from: A2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0067k implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f564Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f565Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f566h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f567i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f568j0;

    public /* synthetic */ RunnableC0067k(Object obj, String str, long j6, long j10, int i10) {
        this.f564Y = i10;
        this.f568j0 = obj;
        this.f565Z = str;
        this.f566h0 = j6;
        this.f567i0 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f564Y;
        Object obj = this.f568j0;
        switch (i10) {
            case 0:
                int i11 = AbstractC5530A.f45131a;
                z2.w wVar = (z2.w) ((SurfaceHolder$CallbackC6500C) ((U3.l) obj).f17424h0).f50334Y.f50379r;
                final C6757b M10 = wVar.M();
                final String str = this.f565Z;
                final long j6 = this.f567i0;
                final long j10 = this.f566h0;
                wVar.N(M10, 1008, new s2.m(M10, str, j6, j10, 1) { // from class: z2.q

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51523Y;

                    {
                        this.f51523Y = r7;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51523Y) {
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
                J2.w wVar2 = (J2.w) obj;
                wVar2.getClass();
                int i12 = AbstractC5530A.f45131a;
                z2.w wVar3 = (z2.w) ((SurfaceHolder$CallbackC6500C) wVar2.f8837b).f50334Y.f50379r;
                final C6757b M11 = wVar3.M();
                final String str2 = this.f565Z;
                final long j11 = this.f567i0;
                final long j12 = this.f566h0;
                wVar3.N(M11, 1016, new s2.m(M11, str2, j11, j12, 0) { // from class: z2.q

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51523Y;

                    {
                        this.f51523Y = r7;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51523Y) {
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
