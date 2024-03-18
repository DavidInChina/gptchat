package M3;

import L3.C0889a;
import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import id.AbstractC3557B;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import m.ExecutorC4519P;
import m.RunnableC4517N;
import q.RunnableC5216j;
import x3.C6270B;

/* loaded from: classes2.dex */
public final class J implements Runnable {

    /* renamed from: w0  reason: collision with root package name */
    public static final String f11545w0 = L3.s.f("WorkerWrapper");

    /* renamed from: Y  reason: collision with root package name */
    public final Context f11546Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f11547Z;

    /* renamed from: h0  reason: collision with root package name */
    public final U3.q f11548h0;

    /* renamed from: i0  reason: collision with root package name */
    public L3.r f11549i0;

    /* renamed from: j0  reason: collision with root package name */
    public final X3.b f11550j0;

    /* renamed from: l0  reason: collision with root package name */
    public final C0889a f11552l0;

    /* renamed from: m0  reason: collision with root package name */
    public final R4.a f11553m0;

    /* renamed from: n0  reason: collision with root package name */
    public final T3.a f11554n0;

    /* renamed from: o0  reason: collision with root package name */
    public final WorkDatabase f11555o0;

    /* renamed from: p0  reason: collision with root package name */
    public final U3.s f11556p0;

    /* renamed from: q0  reason: collision with root package name */
    public final U3.c f11557q0;

    /* renamed from: r0  reason: collision with root package name */
    public final List f11558r0;

    /* renamed from: s0  reason: collision with root package name */
    public String f11559s0;

    /* renamed from: k0  reason: collision with root package name */
    public L3.q f11551k0 = new L3.n();

    /* renamed from: t0  reason: collision with root package name */
    public final W3.i f11560t0 = new Object();

    /* renamed from: u0  reason: collision with root package name */
    public final W3.i f11561u0 = new Object();

    /* renamed from: v0  reason: collision with root package name */
    public volatile int f11562v0 = -256;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, W3.i] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, W3.i] */
    public J(I i10) {
        this.f11546Y = (Context) i10.f11536a;
        this.f11550j0 = (X3.b) i10.f11539d;
        this.f11554n0 = (T3.a) i10.f11538c;
        U3.q qVar = (U3.q) i10.f11542g;
        this.f11548h0 = qVar;
        this.f11547Z = qVar.f17450a;
        this.f11549i0 = (L3.r) i10.f11537b;
        C0889a c0889a = (C0889a) i10.f11540e;
        this.f11552l0 = c0889a;
        this.f11553m0 = c0889a.f10686c;
        WorkDatabase workDatabase = (WorkDatabase) i10.f11541f;
        this.f11555o0 = workDatabase;
        this.f11556p0 = workDatabase.u();
        this.f11557q0 = workDatabase.p();
        this.f11558r0 = (List) i10.f11543h;
    }

    public final void a(L3.q qVar) {
        boolean z10 = qVar instanceof L3.p;
        U3.q qVar2 = this.f11548h0;
        String str = f11545w0;
        if (z10) {
            L3.s d10 = L3.s.d();
            d10.e(str, "Worker result SUCCESS for " + this.f11559s0);
            if (qVar2.c()) {
                d();
                return;
            }
            U3.c cVar = this.f11557q0;
            String str2 = this.f11547Z;
            U3.s sVar = this.f11556p0;
            WorkDatabase workDatabase = this.f11555o0;
            workDatabase.c();
            try {
                sVar.v(3, str2);
                sVar.u(str2, ((L3.p) this.f11551k0).f10724a);
                this.f11553m0.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = cVar.p(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (sVar.i(str3) == 5 && cVar.v(str3)) {
                        L3.s d11 = L3.s.d();
                        d11.e(str, "Setting status to enqueued for " + str3);
                        sVar.v(1, str3);
                        sVar.t(currentTimeMillis, str3);
                    }
                }
                workDatabase.n();
                workDatabase.j();
                e(false);
            } catch (Throwable th2) {
                workDatabase.j();
                e(false);
                throw th2;
            }
        } else if (qVar instanceof L3.o) {
            L3.s d12 = L3.s.d();
            d12.e(str, "Worker result RETRY for " + this.f11559s0);
            c();
        } else {
            L3.s d13 = L3.s.d();
            d13.e(str, "Worker result FAILURE for " + this.f11559s0);
            if (qVar2.c()) {
                d();
            } else {
                g();
            }
        }
    }

    public final void b() {
        if (!h()) {
            this.f11555o0.c();
            try {
                int i10 = this.f11556p0.i(this.f11547Z);
                this.f11555o0.t().b(this.f11547Z);
                if (i10 == 0) {
                    e(false);
                } else if (i10 == 2) {
                    a(this.f11551k0);
                } else if (!E9.f.j(i10)) {
                    this.f11562v0 = -512;
                    c();
                }
                this.f11555o0.n();
                this.f11555o0.j();
            } catch (Throwable th2) {
                this.f11555o0.j();
                throw th2;
            }
        }
    }

    public final void c() {
        String str = this.f11547Z;
        U3.s sVar = this.f11556p0;
        WorkDatabase workDatabase = this.f11555o0;
        workDatabase.c();
        try {
            sVar.v(1, str);
            this.f11553m0.getClass();
            sVar.t(System.currentTimeMillis(), str);
            sVar.r(this.f11548h0.f17471v, str);
            sVar.q(-1L, str);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f11547Z;
        U3.s sVar = this.f11556p0;
        WorkDatabase workDatabase = this.f11555o0;
        workDatabase.c();
        try {
            this.f11553m0.getClass();
            sVar.t(System.currentTimeMillis(), str);
            sVar.v(1, str);
            sVar.s(str);
            sVar.r(this.f11548h0.f17471v, str);
            sVar.o(str);
            sVar.q(-1L, str);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final void e(boolean z10) {
        this.f11555o0.c();
        try {
            if (!this.f11555o0.u().n()) {
                V3.l.a(this.f11546Y, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f11556p0.v(1, this.f11547Z);
                this.f11556p0.w(this.f11562v0, this.f11547Z);
                this.f11556p0.q(-1L, this.f11547Z);
            }
            this.f11555o0.n();
            this.f11555o0.j();
            this.f11560t0.j(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f11555o0.j();
            throw th2;
        }
    }

    public final void f() {
        U3.s sVar = this.f11556p0;
        String str = this.f11547Z;
        int i10 = sVar.i(str);
        String str2 = f11545w0;
        if (i10 == 2) {
            L3.s d10 = L3.s.d();
            d10.a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        L3.s d11 = L3.s.d();
        StringBuilder s10 = android.gov.nist.core.a.s("Status for ", str, " is ");
        s10.append(E9.f.R(i10));
        s10.append(" ; not doing any work");
        d11.a(str2, s10.toString());
        e(false);
    }

    public final void g() {
        String str = this.f11547Z;
        WorkDatabase workDatabase = this.f11555o0;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                U3.s sVar = this.f11556p0;
                if (!isEmpty) {
                    String str2 = (String) linkedList.remove();
                    if (sVar.i(str2) != 6) {
                        sVar.v(4, str2);
                    }
                    linkedList.addAll(this.f11557q0.p(str2));
                } else {
                    L3.g gVar = ((L3.n) this.f11551k0).f10723a;
                    sVar.r(this.f11548h0.f17471v, str);
                    sVar.u(str, gVar);
                    workDatabase.n();
                    return;
                }
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f11562v0 == -256) {
            return false;
        }
        L3.s d10 = L3.s.d();
        String str = f11545w0;
        d10.a(str, "Work interrupted for " + this.f11559s0);
        int i10 = this.f11556p0.i(this.f11547Z);
        if (i10 == 0) {
            e(false);
        } else {
            e(!E9.f.j(i10));
        }
        return true;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        L3.g gVar;
        boolean z10;
        L3.k kVar;
        S s10;
        byte[] bArr;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f11547Z;
        sb2.append(str);
        sb2.append(", tags={ ");
        List<String> list = this.f11558r0;
        boolean z11 = true;
        for (String str2 : list) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.f11559s0 = sb2.toString();
        U3.q qVar = this.f11548h0;
        if (!h()) {
            WorkDatabase workDatabase = this.f11555o0;
            workDatabase.c();
            try {
                int i10 = qVar.f17451b;
                String str3 = qVar.f17452c;
                String str4 = f11545w0;
                if (i10 != 1) {
                    f();
                    workDatabase.n();
                    L3.s.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                } else {
                    if (qVar.c() || (qVar.f17451b == 1 && qVar.f17460k > 0)) {
                        this.f11553m0.getClass();
                        if (System.currentTimeMillis() < qVar.a()) {
                            L3.s.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                            e(true);
                            workDatabase.n();
                        }
                    }
                    workDatabase.n();
                    workDatabase.j();
                    boolean c10 = qVar.c();
                    U3.s sVar = this.f11556p0;
                    C0889a c0889a = this.f11552l0;
                    if (c10) {
                        gVar = qVar.f17454e;
                    } else {
                        c0889a.f10688e.getClass();
                        String str5 = qVar.f17453d;
                        AbstractC3557B.c0("className", str5);
                        String str6 = L3.l.f10721a;
                        try {
                            Object newInstance = Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            AbstractC3557B.a0("null cannot be cast to non-null type androidx.work.InputMerger", newInstance);
                            kVar = (L3.k) newInstance;
                        } catch (Exception e10) {
                            L3.s.d().c(L3.l.f10721a, "Trouble instantiating ".concat(str5), e10);
                            kVar = null;
                        }
                        if (kVar == null) {
                            L3.s.d().b(str4, "Could not create Input Merger ".concat(str5));
                            g();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(qVar.f17454e);
                        sVar.getClass();
                        S d10 = L0.d();
                        if (d10 != null) {
                            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
                        } else {
                            s10 = null;
                        }
                        C6270B a5 = C6270B.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str == null) {
                            a5.s0(1);
                        } else {
                            a5.b(1, str);
                        }
                        x3.y yVar = sVar.f17474a;
                        yVar.b();
                        Cursor t12 = A7.b.t1(yVar, a5, false);
                        try {
                            ArrayList arrayList2 = new ArrayList(t12.getCount());
                            while (t12.moveToNext()) {
                                if (t12.isNull(0)) {
                                    bArr = null;
                                } else {
                                    bArr = t12.getBlob(0);
                                }
                                arrayList2.add(L3.g.a(bArr));
                            }
                            t12.close();
                            if (s10 != null) {
                                s10.b();
                            }
                            a5.j();
                            arrayList.addAll(arrayList2);
                            gVar = kVar.a(arrayList);
                        } catch (Throwable th2) {
                            t12.close();
                            if (s10 != null) {
                                s10.b();
                            }
                            a5.j();
                            throw th2;
                        }
                    }
                    UUID fromString = UUID.fromString(str);
                    ExecutorService executorService = c0889a.f10684a;
                    T3.a aVar = this.f11554n0;
                    X3.b bVar = this.f11550j0;
                    V3.s sVar2 = new V3.s(workDatabase, aVar, bVar);
                    ?? obj = new Object();
                    obj.f25519a = fromString;
                    obj.f25520b = gVar;
                    new HashSet(list);
                    obj.f25521c = qVar.f17460k;
                    obj.f25522d = executorService;
                    obj.f25523e = bVar;
                    L3.E e11 = c0889a.f10687d;
                    obj.f25524f = e11;
                    if (this.f11549i0 == null) {
                        Context context = this.f11546Y;
                        e11.getClass();
                        this.f11549i0 = L3.E.a(context, str3, obj);
                    }
                    L3.r rVar = this.f11549i0;
                    if (rVar == null) {
                        L3.s.d().b(str4, "Could not create Worker " + str3);
                        g();
                    } else if (rVar.f10728i0) {
                        L3.s.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                        g();
                    } else {
                        rVar.f10728i0 = true;
                        workDatabase.c();
                        try {
                            if (sVar.i(str) == 1) {
                                sVar.v(2, str);
                                sVar.p(str);
                                sVar.w(-256, str);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            workDatabase.n();
                            if (z10) {
                                if (!h()) {
                                    V3.r rVar2 = new V3.r(this.f11546Y, this.f11548h0, this.f11549i0, sVar2, this.f11550j0);
                                    bVar.f21782d.execute(rVar2);
                                    W3.i iVar = rVar2.f18368Y;
                                    RunnableC4517N runnableC4517N = new RunnableC4517N(this, 20, iVar);
                                    ExecutorC4519P executorC4519P = new ExecutorC4519P(1);
                                    W3.i iVar2 = this.f11561u0;
                                    iVar2.a(runnableC4517N, executorC4519P);
                                    iVar.a(new RunnableC5216j(this, 8, iVar), bVar.f21782d);
                                    iVar2.a(new RunnableC5216j(this, 9, this.f11559s0), bVar.f21779a);
                                    return;
                                }
                                return;
                            }
                            f();
                        } finally {
                        }
                    }
                }
            } finally {
                workDatabase.j();
            }
        }
    }
}
