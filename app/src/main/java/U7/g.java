package u7;

import U3.u;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import s3.z;
import v7.C5980A;
import v7.C5983a;
import v7.C5987e;
import v7.E;
import v7.s;
import v7.v;
import v7.y;
import w.C6060g;
import w7.AbstractC6134f;
import w7.C6132d;
import w7.C6138j;
import w7.C6139k;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f46456a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46457b;

    /* renamed from: c  reason: collision with root package name */
    public final u f46458c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC5846b f46459d;

    /* renamed from: e  reason: collision with root package name */
    public final C5983a f46460e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f46461f;

    /* renamed from: g  reason: collision with root package name */
    public final int f46462g;

    /* renamed from: h  reason: collision with root package name */
    public final v f46463h;

    /* renamed from: i  reason: collision with root package name */
    public final f8.e f46464i;

    /* renamed from: j  reason: collision with root package name */
    public final C5987e f46465j;

    public g(Context context, u uVar, AbstractC5846b abstractC5846b, C5850f c5850f) {
        String str;
        A7.b.l0(context, "Null context is not permitted.");
        A7.b.l0(uVar, "Api must not be null.");
        A7.b.l0(c5850f, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        A7.b.l0(applicationContext, "The provided context did not have an application context.");
        this.f46456a = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.f46457b = str;
        this.f46458c = uVar;
        this.f46459d = abstractC5846b;
        this.f46461f = c5850f.f46455b;
        this.f46460e = new C5983a(uVar, abstractC5846b, str);
        this.f46463h = new v(this);
        C5987e e10 = C5987e.e(applicationContext);
        this.f46465j = e10;
        this.f46462g = e10.f47308m0.getAndIncrement();
        this.f46464i = c5850f.f46454a;
        H7.d dVar = e10.f47313r0;
        dVar.sendMessage(dVar.obtainMessage(7, this));
    }

    public final z a() {
        z zVar = new z(5);
        zVar.f45394a = null;
        Set emptySet = Collections.emptySet();
        if (((C6060g) zVar.f45395b) == null) {
            zVar.f45395b = new C6060g();
        }
        ((C6060g) zVar.f45395b).addAll(emptySet);
        Context context = this.f46456a;
        zVar.f45397d = context.getClass().getName();
        zVar.f45396c = context.getPackageName();
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final N7.m b(int i10, v7.l lVar) {
        y yVar;
        long j6;
        long j10;
        N7.f fVar = new N7.f();
        C5987e c5987e = this.f46465j;
        c5987e.getClass();
        int i11 = lVar.f47318d;
        final H7.d dVar = c5987e.f47313r0;
        N7.m mVar = fVar.f12723a;
        if (i11 != 0) {
            if (c5987e.a()) {
                C6139k c6139k = C6138j.a().f48175a;
                C5983a c5983a = this.f46460e;
                boolean z10 = true;
                if (c6139k != null) {
                    if (c6139k.f48177Z) {
                        s sVar = (s) c5987e.f47310o0.get(c5983a);
                        if (sVar != null) {
                            AbstractC6134f abstractC6134f = sVar.f47329b;
                            if (abstractC6134f instanceof AbstractC6134f) {
                                if (abstractC6134f.f48159u != null && !abstractC6134f.q()) {
                                    C6132d a5 = y.a(sVar, abstractC6134f, i11);
                                    if (a5 != null) {
                                        sVar.f47339l++;
                                        z10 = a5.f48118h0;
                                    }
                                }
                            }
                        }
                        z10 = c6139k.f48178h0;
                    }
                }
                if (z10) {
                    j6 = System.currentTimeMillis();
                } else {
                    j6 = 0;
                }
                if (z10) {
                    j10 = SystemClock.elapsedRealtime();
                } else {
                    j10 = 0;
                }
                yVar = new y(c5987e, i11, c5983a, j6, j10);
                if (yVar != null) {
                    dVar.getClass();
                    Executor executor = new Executor() { // from class: v7.p
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            dVar.post(runnable);
                        }
                    };
                    mVar.getClass();
                    mVar.f12736b.i(new N7.i(executor, yVar));
                    mVar.i();
                }
            }
            yVar = null;
            if (yVar != null) {
            }
        }
        dVar.sendMessage(dVar.obtainMessage(4, new C5980A(new E(i10, lVar, fVar, this.f46464i), c5987e.f47309n0.get(), this)));
        return mVar;
    }
}
