package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.A1;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import io.sentry.O0;
import io.sentry.w1;
import io.sentry.z1;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import xe.C6431t;

/* loaded from: classes2.dex */
public final class z extends O0 implements AbstractC3656j0 {

    /* renamed from: A0  reason: collision with root package name */
    public Map f34674A0;

    /* renamed from: u0  reason: collision with root package name */
    public String f34675u0;

    /* renamed from: v0  reason: collision with root package name */
    public Double f34676v0;

    /* renamed from: w0  reason: collision with root package name */
    public Double f34677w0;

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f34678x0;

    /* renamed from: y0  reason: collision with root package name */
    public final HashMap f34679y0;

    /* renamed from: z0  reason: collision with root package name */
    public A f34680z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ArrayList arrayList, HashMap hashMap, A a5) {
        super(new s((UUID) null));
        Double valueOf = Double.valueOf(0.0d);
        ArrayList arrayList2 = new ArrayList();
        this.f34678x0 = arrayList2;
        HashMap hashMap2 = new HashMap();
        this.f34679y0 = hashMap2;
        this.f34675u0 = "";
        this.f34676v0 = valueOf;
        this.f34677w0 = null;
        arrayList2.addAll(arrayList);
        hashMap2.putAll(hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f34679y0.putAll(((v) it.next()).f34639q0);
        }
        this.f34680z0 = a5;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34675u0 != null) {
            c3636c1.n("transaction");
            c3636c1.t(this.f34675u0);
        }
        c3636c1.n("start_timestamp");
        BigDecimal valueOf = BigDecimal.valueOf(this.f34676v0.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        c3636c1.v(h10, valueOf.setScale(6, roundingMode));
        if (this.f34677w0 != null) {
            c3636c1.n(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            c3636c1.v(h10, BigDecimal.valueOf(this.f34677w0.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.f34678x0;
        if (!arrayList.isEmpty()) {
            c3636c1.n("spans");
            c3636c1.v(h10, arrayList);
        }
        c3636c1.n("type");
        c3636c1.t("transaction");
        HashMap hashMap = this.f34679y0;
        if (!hashMap.isEmpty()) {
            c3636c1.n("measurements");
            c3636c1.v(h10, hashMap);
        }
        c3636c1.n("transaction_info");
        c3636c1.v(h10, this.f34680z0);
        C6431t.p(this, c3636c1, h10);
        Map map = this.f34674A0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34674A0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }

    public z(w1 w1Var) {
        super(w1Var.f34802a);
        this.f34678x0 = new ArrayList();
        this.f34679y0 = new HashMap();
        z1 z1Var = w1Var.f34803b;
        this.f34676v0 = Double.valueOf(z1Var.f34859a.d() / 1.0E9d);
        this.f34677w0 = Double.valueOf(z1Var.f34859a.c(z1Var.f34860b) / 1.0E9d);
        this.f34675u0 = w1Var.f34806e;
        Iterator it = w1Var.f34804c.iterator();
        while (it.hasNext()) {
            z1 z1Var2 = (z1) it.next();
            Boolean bool = Boolean.TRUE;
            U3.n nVar = z1Var2.f34861c.f33717i0;
            if (bool.equals(nVar == null ? null : (Boolean) nVar.f17426Y)) {
                this.f34678x0.add(new v(z1Var2));
            }
        }
        C3676c c3676c = this.f33837Z;
        c3676c.putAll(w1Var.f34817p);
        A1 a12 = z1Var.f34861c;
        c3676c.b(new A1(a12.f33714Y, a12.f33715Z, a12.f33716h0, a12.f33718j0, a12.f33719k0, a12.f33717i0, a12.f33720l0, a12.f33722n0));
        Iterator it2 = a12.f33721m0.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            a((String) entry.getKey(), (String) entry.getValue());
        }
        ConcurrentHashMap concurrentHashMap = z1Var.f34868j;
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (this.f33850t0 == null) {
                    this.f33850t0 = new HashMap();
                }
                this.f33850t0.put(str, value);
            }
        }
        this.f34680z0 = new A(w1Var.f34815n.apiName());
    }
}
