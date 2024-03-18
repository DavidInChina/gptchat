package F5;

import M3.H;
import V1.RunnableC1466g;
import id.AbstractC3557B;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import kf.t;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5271a;
import s3.r;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: Y  reason: collision with root package name */
    public final ExecutorService f5040Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G5.d f5041Z;

    /* renamed from: h0  reason: collision with root package name */
    public final G5.d f5042h0;

    /* renamed from: i0  reason: collision with root package name */
    public final I5.f f5043i0;

    /* renamed from: j0  reason: collision with root package name */
    public final G5.g f5044j0;

    /* renamed from: k0  reason: collision with root package name */
    public final G5.c f5045k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC5091c f5046l0;

    /* renamed from: m0  reason: collision with root package name */
    public final G5.e f5047m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C5.c f5048n0;

    /* renamed from: o0  reason: collision with root package name */
    public final LinkedHashSet f5049o0 = new LinkedHashSet();

    /* renamed from: p0  reason: collision with root package name */
    public final Object f5050p0 = new Object();

    public f(ExecutorService executorService, G5.d dVar, G5.d dVar2, I5.k kVar, G5.i iVar, G5.c cVar, AbstractC5091c abstractC5091c, G5.e eVar, C5.c cVar2) {
        AbstractC3557B.c0("grantedOrchestrator", dVar);
        AbstractC3557B.c0("pendingOrchestrator", dVar2);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        AbstractC3557B.c0("metricsDispatcher", cVar2);
        this.f5040Y = executorService;
        this.f5041Z = dVar;
        this.f5042h0 = dVar2;
        this.f5043i0 = kVar;
        this.f5044j0 = iVar;
        this.f5045k0 = cVar;
        this.f5046l0 = abstractC5091c;
        this.f5047m0 = eVar;
        this.f5048n0 = cVar2;
    }

    @Override // F5.l
    public final void I(C5271a c5271a, boolean z10, r rVar) {
        G5.d dVar;
        AbstractC3557B.c0("datadogContext", c5271a);
        int ordinal = c5271a.f43908n.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    dVar = this.f5042h0;
                } else {
                    throw new RuntimeException();
                }
            } else {
                dVar = null;
            }
        } else {
            dVar = this.f5041Z;
        }
        RunnableC1466g runnableC1466g = new RunnableC1466g(this, dVar, z10, rVar, 1);
        H.w0(this.f5040Y, "Data write", this.f5046l0, runnableC1466g);
    }

    @Override // F5.l
    public final void c(d dVar, H h10, boolean z10) {
        Object obj;
        e eVar;
        AbstractC3557B.c0("batchId", dVar);
        synchronized (this.f5049o0) {
            try {
                Iterator it = this.f5049o0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        File file = ((e) obj).f5038a;
                        AbstractC3557B.c0("file", file);
                        String absolutePath = file.getAbsolutePath();
                        AbstractC3557B.b0("absolutePath", absolutePath);
                        if (AbstractC3557B.K(absolutePath, dVar.f5037a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                eVar = (e) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (eVar == null) {
            return;
        }
        if (z10) {
            File file2 = eVar.f5038a;
            G5.c cVar = this.f5045k0;
            boolean a5 = cVar.a(file2);
            EnumC5090b enumC5090b = EnumC5090b.f42739Z;
            if (a5) {
                this.f5048n0.O(file2, h10);
            } else {
                P4.a.m0(this.f5046l0, 4, enumC5090b, new u5.e(file2, 2), null, false, 56);
            }
            File file3 = eVar.f5039b;
            if (file3 != null && AbstractC4344b.g0(file3, this.f5046l0) && !cVar.a(file3)) {
                P4.a.m0(this.f5046l0, 4, enumC5090b, new u5.e(file3, 3), null, false, 56);
            }
        }
        synchronized (this.f5049o0) {
            this.f5049o0.remove(eVar);
        }
    }

    @Override // F5.l
    public final c w() {
        synchronized (this.f5049o0) {
            try {
                G5.d dVar = this.f5041Z;
                LinkedHashSet<e> linkedHashSet = this.f5049o0;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(linkedHashSet, 10));
                for (e eVar : linkedHashSet) {
                    arrayList.add(eVar.f5038a);
                }
                File J10 = dVar.J(t.P2(arrayList));
                byte[] bArr = null;
                if (J10 == null) {
                    return null;
                }
                File s10 = this.f5041Z.s(J10);
                this.f5049o0.add(new e(J10, s10));
                String absolutePath = J10.getAbsolutePath();
                AbstractC3557B.b0("absolutePath", absolutePath);
                d dVar2 = new d(absolutePath);
                if (s10 != null && AbstractC4344b.g0(s10, this.f5046l0)) {
                    bArr = (byte[]) this.f5044j0.a(s10);
                }
                return new c(dVar2, this.f5043i0.a(J10), bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
