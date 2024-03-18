package lh;

import Ng.C1057d0;
import android.graphics.BitmapRegionDecoder;
import com.google.android.gms.internal.play_billing.N;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: lh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4484c implements y {

    /* renamed from: a  reason: collision with root package name */
    public static final C4484c f38464a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    @Override // lh.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z zVar, AbstractC4825e abstractC4825e) {
        C4483b c4483b;
        int i10;
        C1057d0 c1057d0;
        kh.c cVar;
        kh.l lVar;
        if (abstractC4825e instanceof C4483b) {
            c4483b = (C4483b) abstractC4825e;
            int i11 = c4483b.f38463l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4483b.f38463l0 = i11 - Integer.MIN_VALUE;
                Object obj = c4483b.f38461j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4483b.f38463l0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kh.c cVar2 = c4483b.f38460i0;
                        kh.l lVar2 = c4483b.f38459h0;
                        C1057d0 c1057d02 = c4483b.f38458Z;
                        z zVar2 = c4483b.f38457Y;
                        N.B0(obj);
                        cVar = cVar2;
                        zVar = zVar2;
                        lVar = lVar2;
                        c1057d0 = c1057d02;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    final AtomicInteger atomicInteger = new AtomicInteger();
                    C1057d0 c1057d03 = new C1057d0(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: Ng.H0

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ int f12883a = 1;

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ String f12884b = "AndroidImageRegionDecoder";

                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            int i12 = this.f12883a;
                            String str = this.f12884b;
                            if (i12 != 1) {
                                str = str + '-' + atomicInteger.incrementAndGet();
                            }
                            Thread thread = new Thread(runnable, str);
                            thread.setDaemon(true);
                            return thread;
                        }
                    }));
                    kh.l lVar3 = zVar.f38523b;
                    C4482a c4482a = new C4482a(zVar, null);
                    c4483b.f38457Y = zVar;
                    c4483b.f38458Z = c1057d03;
                    c4483b.f38459h0 = lVar3;
                    kh.c cVar3 = zVar.f38524c;
                    c4483b.f38460i0 = cVar3;
                    c4483b.f38463l0 = 1;
                    Object n12 = Ad.l.n1(c4483b, c1057d03, c4482a);
                    if (n12 == enumC5000a) {
                        return enumC5000a;
                    }
                    lVar = lVar3;
                    obj = n12;
                    c1057d0 = c1057d03;
                    cVar = cVar3;
                }
                return new C4488g(lVar, cVar, (BitmapRegionDecoder) obj, zVar.f38525d, c1057d0);
            }
        }
        c4483b = new C4483b(this, abstractC4825e);
        Object obj2 = c4483b.f38461j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4483b.f38463l0;
        if (i10 == 0) {
        }
        return new C4488g(lVar, cVar, (BitmapRegionDecoder) obj2, zVar.f38525d, c1057d0);
    }
}
