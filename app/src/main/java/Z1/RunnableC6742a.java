package z1;

import K4.C0813a;
import K4.C0816d;
import K4.C0822j;
import K4.G;
import K4.H;
import L3.C0892d;
import M3.F;
import M3.w;
import U3.p;
import U3.q;
import U3.s;
import U3.u;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import r1.AbstractC5355b;
import v7.I;
import v7.J;
import x3.C6270B;
import x3.y;

/* renamed from: z1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6742a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51435Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f51436Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f51437h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f51438i0;

    public /* synthetic */ RunnableC6742a(C0816d c0816d, com.revenuecat.purchases.google.usecase.a aVar, C0813a c0813a) {
        this.f51435Y = 5;
        this.f51436Z = c0816d;
        this.f51437h0 = aVar;
        this.f51438i0 = c0813a;
    }

    public final void a() {
        try {
            ((W3.i) this.f51436Z).j(b());
        } catch (Throwable th2) {
            ((W3.i) this.f51436Z).k(th2);
        }
    }

    public final List b() {
        S s10;
        String str;
        byte[] bArr;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte[] bArr2;
        s u10 = ((F) this.f51437h0).f11519h.u();
        String str2 = (String) this.f51438i0;
        u10.getClass();
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str2 == null) {
            a5.s0(1);
        } else {
            a5.b(1, str2);
        }
        y yVar = u10.f17474a;
        yVar.b();
        yVar.c();
        try {
            Cursor t12 = A7.b.t1(yVar, a5, true);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (t12.moveToNext()) {
                String string = t12.getString(0);
                if (((ArrayList) hashMap.get(string)) == null) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = t12.getString(0);
                if (((ArrayList) hashMap2.get(string2)) == null) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            t12.moveToPosition(-1);
            u10.b(hashMap);
            u10.a(hashMap2);
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(0)) {
                    str = null;
                } else {
                    str = t12.getString(0);
                }
                int e12 = A7.b.e1(t12.getInt(1));
                if (t12.isNull(2)) {
                    bArr = null;
                } else {
                    bArr = t12.getBlob(2);
                }
                L3.g a10 = L3.g.a(bArr);
                int i10 = t12.getInt(3);
                int i11 = t12.getInt(4);
                long j6 = t12.getLong(13);
                long j10 = t12.getLong(14);
                long j11 = t12.getLong(15);
                int b1 = A7.b.b1(t12.getInt(16));
                long j12 = t12.getLong(17);
                long j13 = t12.getLong(18);
                int i12 = t12.getInt(19);
                long j14 = t12.getLong(20);
                int i13 = t12.getInt(21);
                int c12 = A7.b.c1(t12.getInt(5));
                if (t12.getInt(6) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (t12.getInt(7) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (t12.getInt(8) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (t12.getInt(9) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                long j15 = t12.getLong(10);
                long j16 = t12.getLong(11);
                if (t12.isNull(12)) {
                    bArr2 = null;
                } else {
                    bArr2 = t12.getBlob(12);
                }
                C0892d c0892d = new C0892d(c12, z10, z11, z12, z13, j15, j16, A7.b.e0(bArr2));
                ArrayList arrayList2 = (ArrayList) hashMap.get(t12.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) hashMap2.get(t12.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new p(str, e12, a10, j6, j10, j11, c0892d, i10, b1, j12, j13, i12, i11, j14, i13, arrayList3, arrayList4));
            }
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
            t12.close();
            a5.j();
            return (List) q.f17449x.apply(arrayList);
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = null;
        Object obj = null;
        Bundle bundle2 = null;
        switch (this.f51435Y) {
            case 0:
                Typeface typeface = (Typeface) this.f51437h0;
                AbstractC5355b abstractC5355b = (AbstractC5355b) ((F4.a) this.f51436Z).f5033Z;
                if (abstractC5355b != null) {
                    abstractC5355b.f(typeface);
                    return;
                }
                return;
            case 1:
                ((C1.a) this.f51436Z).accept(this.f51437h0);
                return;
            case 2:
                try {
                    obj = ((Callable) this.f51436Z).call();
                } catch (Exception unused) {
                }
                ((Handler) this.f51438i0).post(new RunnableC6742a(this, (C1.a) this.f51437h0, obj, 1));
                return;
            case 3:
                ((M3.q) this.f51436Z).j((w) this.f51437h0, (u) this.f51438i0);
                return;
            case 4:
                a();
                return;
            case 5:
                G g10 = ((C0816d) this.f51436Z).f9404f;
                C0822j c0822j = H.f9362k;
                ((u) g10).S(K4.F.b(24, 4, c0822j));
                ((com.revenuecat.purchases.google.usecase.a) this.f51437h0).d(c0822j, ((C0813a) this.f51438i0).c());
                return;
            case 6:
                I i10 = (I) this.f51438i0;
                if (i10.f47284Z > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) this.f51436Z;
                    Bundle bundle3 = i10.f47285h0;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle((String) this.f51437h0);
                    }
                    lifecycleCallback.c(bundle);
                }
                if (((I) this.f51438i0).f47284Z >= 2) {
                    ((LifecycleCallback) this.f51436Z).f();
                }
                if (((I) this.f51438i0).f47284Z >= 3) {
                    ((LifecycleCallback) this.f51436Z).d();
                }
                if (((I) this.f51438i0).f47284Z >= 4) {
                    ((LifecycleCallback) this.f51436Z).g();
                }
                if (((I) this.f51438i0).f47284Z >= 5) {
                    ((LifecycleCallback) this.f51436Z).getClass();
                    return;
                }
                return;
            case 7:
                J j6 = (J) this.f51438i0;
                if (j6.b1 > 0) {
                    LifecycleCallback lifecycleCallback2 = (LifecycleCallback) this.f51436Z;
                    Bundle bundle4 = j6.f47287c1;
                    if (bundle4 != null) {
                        bundle2 = bundle4.getBundle((String) this.f51437h0);
                    }
                    lifecycleCallback2.c(bundle2);
                }
                if (((J) this.f51438i0).b1 >= 2) {
                    ((LifecycleCallback) this.f51436Z).f();
                }
                if (((J) this.f51438i0).b1 >= 3) {
                    ((LifecycleCallback) this.f51436Z).d();
                }
                if (((J) this.f51438i0).b1 >= 4) {
                    ((LifecycleCallback) this.f51436Z).g();
                }
                if (((J) this.f51438i0).b1 >= 5) {
                    ((LifecycleCallback) this.f51436Z).getClass();
                    return;
                }
                return;
            default:
                if (((View) this.f51437h0) != null) {
                    ((Q7.c) this.f51438i0).getClass();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC6742a(Object obj, Object obj2, Object obj3, int i10) {
        this.f51435Y = i10;
        this.f51438i0 = obj;
        this.f51436Z = obj2;
        this.f51437h0 = obj3;
    }

    public RunnableC6742a(M3.q qVar, w wVar, u uVar) {
        this.f51435Y = 3;
        AbstractC3557B.c0("processor", qVar);
        this.f51436Z = qVar;
        this.f51437h0 = wVar;
        this.f51438i0 = uVar;
    }

    public RunnableC6742a(F f6, String str) {
        this.f51435Y = 4;
        this.f51437h0 = f6;
        this.f51438i0 = str;
        this.f51436Z = new Object();
    }
}
