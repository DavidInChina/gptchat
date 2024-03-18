package A2;

import E2.C0492y;
import java.util.HashMap;
import s2.AbstractC5530A;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;

/* renamed from: A2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0069m implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f571Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f572Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f573h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f574i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f575j0;

    public /* synthetic */ RunnableC0069m(Object obj, int i10, long j6, long j10, int i11) {
        this.f571Y = i11;
        this.f575j0 = obj;
        this.f572Z = i10;
        this.f573h0 = j6;
        this.f574i0 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0492y c0492y;
        int i10 = this.f571Y;
        Object obj = this.f575j0;
        switch (i10) {
            case 0:
                int i11 = AbstractC5530A.f45131a;
                z2.w wVar = (z2.w) ((SurfaceHolder$CallbackC6500C) ((U3.l) obj).f17424h0).f50334Y.f50379r;
                final C6757b M10 = wVar.M();
                final int i12 = this.f572Z;
                final long j6 = this.f573h0;
                final long j10 = this.f574i0;
                wVar.N(M10, 1011, new s2.m(M10, i12, j6, j10, 0) { // from class: z2.k

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51511Y;

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ C6757b f51512Z;

                    /* renamed from: h0  reason: collision with root package name */
                    public final /* synthetic */ int f51513h0;

                    /* renamed from: i0  reason: collision with root package name */
                    public final /* synthetic */ long f51514i0;

                    {
                        this.f51511Y = r7;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        long j11;
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51511Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                C6752A c6752a = (C6752A) abstractC6758c;
                                c6752a.getClass();
                                C6757b c6757b = this.f51512Z;
                                C0492y c0492y2 = c6757b.f51494d;
                                if (c0492y2 != null) {
                                    String d10 = c6752a.f51463b.d(c6757b.f51492b, c0492y2);
                                    HashMap hashMap = c6752a.f51469h;
                                    Long l10 = (Long) hashMap.get(d10);
                                    HashMap hashMap2 = c6752a.f51468g;
                                    Long l11 = (Long) hashMap2.get(d10);
                                    long j12 = 0;
                                    if (l10 == null) {
                                        j11 = 0;
                                    } else {
                                        j11 = l10.longValue();
                                    }
                                    hashMap.put(d10, Long.valueOf(j11 + this.f51514i0));
                                    if (l11 != null) {
                                        j12 = l11.longValue();
                                    }
                                    hashMap2.put(d10, Long.valueOf(j12 + this.f51513h0));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                z2.w wVar2 = (z2.w) ((I2.b) obj).f7960b;
                z2.v vVar = wVar2.f51539i0;
                if (vVar.f51531b.isEmpty()) {
                    c0492y = null;
                } else {
                    c0492y = (C0492y) M3.H.R(vVar.f51531b);
                }
                final C6757b J10 = wVar2.J(c0492y);
                final int i13 = this.f572Z;
                final long j11 = this.f573h0;
                final long j12 = this.f574i0;
                wVar2.N(J10, 1006, new s2.m(J10, i13, j11, j12, 1) { // from class: z2.k

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51511Y;

                    /* renamed from: Z  reason: collision with root package name */
                    public final /* synthetic */ C6757b f51512Z;

                    /* renamed from: h0  reason: collision with root package name */
                    public final /* synthetic */ int f51513h0;

                    /* renamed from: i0  reason: collision with root package name */
                    public final /* synthetic */ long f51514i0;

                    {
                        this.f51511Y = r7;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        long j112;
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51511Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                C6752A c6752a = (C6752A) abstractC6758c;
                                c6752a.getClass();
                                C6757b c6757b = this.f51512Z;
                                C0492y c0492y2 = c6757b.f51494d;
                                if (c0492y2 != null) {
                                    String d10 = c6752a.f51463b.d(c6757b.f51492b, c0492y2);
                                    HashMap hashMap = c6752a.f51469h;
                                    Long l10 = (Long) hashMap.get(d10);
                                    HashMap hashMap2 = c6752a.f51468g;
                                    Long l11 = (Long) hashMap2.get(d10);
                                    long j122 = 0;
                                    if (l10 == null) {
                                        j112 = 0;
                                    } else {
                                        j112 = l10.longValue();
                                    }
                                    hashMap.put(d10, Long.valueOf(j112 + this.f51514i0));
                                    if (l11 != null) {
                                        j122 = l11.longValue();
                                    }
                                    hashMap2.put(d10, Long.valueOf(j122 + this.f51513h0));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
