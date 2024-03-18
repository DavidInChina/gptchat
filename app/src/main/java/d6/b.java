package d6;

import F.s;
import F5.h;
import F5.j;
import G5.i;
import I5.k;
import I8.u;
import Lg.n;
import M3.H;
import g.RunnableC3111d;
import id.AbstractC3557B;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5274d;
import uf.AbstractC5917j;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: Y  reason: collision with root package name */
    public final ExecutorService f28010Y;

    /* renamed from: Z  reason: collision with root package name */
    public final h f28011Z;

    /* renamed from: h0  reason: collision with root package name */
    public final h f28012h0;

    /* renamed from: i0  reason: collision with root package name */
    public final h f28013i0;

    /* renamed from: j0  reason: collision with root package name */
    public final h f28014j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC5091c f28015k0;

    /* renamed from: l0  reason: collision with root package name */
    public final I5.e f28016l0;

    /* renamed from: m0  reason: collision with root package name */
    public final G5.f f28017m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f28018n0;

    /* renamed from: o0  reason: collision with root package name */
    public final File f28019o0;

    /* renamed from: p0  reason: collision with root package name */
    public u f28020p0;

    /* renamed from: q0  reason: collision with root package name */
    public q5.g f28021q0;

    /* renamed from: r0  reason: collision with root package name */
    public C5274d f28022r0;

    /* renamed from: s0  reason: collision with root package name */
    public e f28023s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f28024t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f28025u0;

    public b(File file, ExecutorService executorService, f fVar, j jVar, E5.d dVar, P5.d dVar2, AbstractC5091c abstractC5091c, k kVar, i iVar, String str) {
        this.f28010Y = executorService;
        this.f28011Z = fVar;
        this.f28012h0 = jVar;
        this.f28013i0 = dVar;
        this.f28014j0 = dVar2;
        this.f28015k0 = abstractC5091c;
        this.f28016l0 = kVar;
        this.f28017m0 = iVar;
        this.f28018n0 = str;
        this.f28019o0 = new File(file, "ndk_crash_reports_v2");
    }

    public final void a() {
        File file = this.f28019o0;
        AbstractC5091c abstractC5091c = this.f28015k0;
        if (AbstractC4344b.g0(file, abstractC5091c)) {
            try {
                File[] E02 = AbstractC4344b.E0(file, abstractC5091c);
                if (E02 != null) {
                    for (File file2 : E02) {
                        AbstractC5917j.Z(file2);
                    }
                }
            } catch (Throwable th2) {
                P4.a.l0(this.f28015k0, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new X0.b(20, this), th2, 48);
            }
        }
    }

    public final void b() {
        RunnableC3111d runnableC3111d = new RunnableC3111d(28, this);
        H.w0(this.f28010Y, "NDK crash check", this.f28015k0, runnableC3111d);
    }

    public final String c(File file, G5.f fVar) {
        byte[] bArr = (byte[]) fVar.a(file);
        if (bArr.length == 0) {
            return null;
        }
        String str = new String(bArr, Lg.a.f11131a);
        if (n.Z1(str, "\\u0000", false) || n.Z1(str, "\u0000", false)) {
            P4.a.m0(this.f28015k0, 5, EnumC5090b.f42740h0, new s(file, str, bArr, 8), null, false, 56);
        }
        return str;
    }

    public final String d(File file, I5.e eVar) {
        byte[] i02;
        List<t5.d> a5 = eVar.a(file);
        if (a5.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(a5, 10));
        for (t5.d dVar : a5) {
            arrayList.add(dVar.f45751a);
        }
        i02 = P4.a.i0(arrayList, new byte[0], new byte[0], new byte[0], this.f28015k0);
        return new String(i02, Lg.a.f11131a);
    }

    @Override // d6.d
    public final void i(r5.d dVar, c cVar) {
        AbstractC3557B.c0("sdkCore", dVar);
        Q1.n nVar = new Q1.n(this, dVar, cVar, 15);
        H.w0(this.f28010Y, "NDK crash report ", this.f28015k0, nVar);
    }
}
