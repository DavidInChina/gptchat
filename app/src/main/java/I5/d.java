package I5;

import A.C0007a0;
import G0.C0571a;
import L.C0840c;
import Lg.m;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.y;
import kf.q;
import kf.t;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import w.C6068o;

/* loaded from: classes2.dex */
public final class d implements G5.d {

    /* renamed from: r0  reason: collision with root package name */
    public static final Lg.i f8067r0 = new Lg.i("\\d+");

    /* renamed from: Y  reason: collision with root package name */
    public final File f8068Y;

    /* renamed from: Z  reason: collision with root package name */
    public final G5.e f8069Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5091c f8070h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5.c f8071i0;

    /* renamed from: j0  reason: collision with root package name */
    public final a f8072j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f8073k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f8074l0;

    /* renamed from: m0  reason: collision with root package name */
    public File f8075m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f8076n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f8077o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C6068o f8078p0 = new C6068o(RCHTTPStatusCodes.BAD_REQUEST);

    /* renamed from: q0  reason: collision with root package name */
    public long f8079q0;

    public d(File file, G5.e eVar, AbstractC5091c abstractC5091c, C5.c cVar) {
        this.f8068Y = file;
        this.f8069Z = eVar;
        this.f8070h0 = abstractC5091c;
        this.f8071i0 = cVar;
        this.f8072j0 = new a(this, abstractC5091c);
        double d10 = eVar.f6055a;
        this.f8073k0 = AbstractC4344b.Z0(1.05d * d10);
        this.f8074l0 = AbstractC4344b.Z0(d10 * 0.95d);
    }

    public static File d(File file) {
        return new File(android.gov.nist.core.a.g(file.getPath(), "_metadata"));
    }

    public static boolean e(File file, long j6) {
        long j10;
        long currentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        AbstractC3557B.b0("file.name", name);
        Long X12 = m.X1(name);
        if (X12 != null) {
            j10 = X12.longValue();
        } else {
            j10 = 0;
        }
        if (j10 >= currentTimeMillis - j6) {
            return true;
        }
        return false;
    }

    @Override // G5.d
    public final File J(Set set) {
        Object obj = null;
        if (!f()) {
            return null;
        }
        c();
        this.f8079q0 = System.currentTimeMillis();
        Iterator it = g().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            File file = (File) next;
            if (!set.contains(file) && !e(file, this.f8073k0)) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }

    @Override // G5.d
    public final File K() {
        if (!f()) {
            return null;
        }
        return this.f8068Y;
    }

    public final File a(boolean z10) {
        File file = new File(this.f8068Y, String.valueOf(System.currentTimeMillis()));
        File file2 = this.f8075m0;
        long j6 = this.f8077o0;
        if (file2 != null) {
            this.f8071i0.N(file2, new C5.a(j6, this.f8076n0, z10));
        }
        this.f8075m0 = file;
        this.f8076n0 = 1L;
        this.f8077o0 = System.currentTimeMillis();
        this.f8078p0.c(file, y.f36177a);
        return file;
    }

    public final long b(File file, boolean z10) {
        AbstractC5091c abstractC5091c = this.f8070h0;
        if (!AbstractC4344b.g0(file, abstractC5091c)) {
            return 0L;
        }
        long D02 = AbstractC4344b.D0(file, abstractC5091c);
        this.f8078p0.d(file);
        if (!AbstractC4344b.a0(file, abstractC5091c)) {
            return 0L;
        }
        if (z10) {
            this.f8071i0.O(file, C5.g.f2695j);
        }
        return D02;
    }

    public final void c() {
        Kg.e eVar = new Kg.e(Kg.m.h1(t.V1(g()), new C0840c(System.currentTimeMillis() - this.f8069Z.f6059e, 3)));
        while (eVar.hasNext()) {
            File file = (File) eVar.next();
            AbstractC5091c abstractC5091c = this.f8070h0;
            if (AbstractC4344b.a0(file, abstractC5091c)) {
                this.f8071i0.O(file, C5.f.f2694j);
            }
            this.f8078p0.d(file);
            if (AbstractC4344b.g0(d(file), abstractC5091c)) {
                AbstractC4344b.a0(d(file), abstractC5091c);
            }
        }
    }

    public final boolean f() {
        if (AbstractC4344b.g0(this.f8068Y, this.f8070h0)) {
            if (this.f8068Y.isDirectory()) {
                File file = this.f8068Y;
                AbstractC5091c abstractC5091c = this.f8070h0;
                AbstractC3557B.c0("<this>", file);
                AbstractC3557B.c0("internalLogger", abstractC5091c);
                if (((Boolean) AbstractC4344b.a1(file, Boolean.FALSE, abstractC5091c, G5.a.f6043h0)).booleanValue()) {
                    return true;
                }
                P4.a.l0(this.f8070h0, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new c(this, 0), null, 56);
                return false;
            }
            P4.a.l0(this.f8070h0, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new c(this, 1), null, 56);
            return false;
        }
        synchronized (this.f8068Y) {
            if (AbstractC4344b.g0(this.f8068Y, this.f8070h0)) {
                return true;
            }
            if (AbstractC4344b.M0(this.f8068Y, this.f8070h0)) {
                return true;
            }
            P4.a.l0(this.f8070h0, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new c(this, 2), null, 56);
            return false;
        }
    }

    public final List g() {
        File file = this.f8068Y;
        AbstractC3557B.c0("<this>", file);
        a aVar = this.f8072j0;
        AbstractC3557B.c0("filter", aVar);
        AbstractC5091c abstractC5091c = this.f8070h0;
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        File[] fileArr = (File[]) AbstractC4344b.a1(file, null, abstractC5091c, new C0571a(20, aVar));
        if (fileArr == null) {
            fileArr = new File[0];
        }
        File[] fileArr2 = fileArr;
        if (fileArr2.length != 0) {
            Object[] copyOf = Arrays.copyOf(fileArr2, fileArr2.length);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            fileArr2 = (Comparable[]) copyOf;
            q.w3(fileArr2);
        }
        return q.Q2(fileArr2);
    }

    @Override // G5.d
    public final File s(File file) {
        boolean K10 = AbstractC3557B.K(file.getParent(), this.f8068Y.getPath());
        EnumC5090b enumC5090b = EnumC5090b.f42740h0;
        EnumC5090b enumC5090b2 = EnumC5090b.f42739Z;
        if (!K10) {
            P4.a.l0(this.f8070h0, 2, AbstractC4344b.G0(enumC5090b2, enumC5090b), new C0007a0(file, 24, this), null, 56);
        }
        String name = file.getName();
        AbstractC3557B.b0("file.name", name);
        if (f8067r0.b(name)) {
            return d(file);
        }
        P4.a.l0(this.f8070h0, 5, AbstractC4344b.G0(enumC5090b2, enumC5090b), new u5.e(file, 19), null, 56);
        return null;
    }

    @Override // G5.d
    public final File v(boolean z10) {
        boolean z11;
        boolean z12 = true;
        File file = null;
        if (!f()) {
            return null;
        }
        G5.e eVar = this.f8069Z;
        int i10 = ((System.currentTimeMillis() - this.f8079q0) > eVar.f6061g ? 1 : ((System.currentTimeMillis() - this.f8079q0) == eVar.f6061g ? 0 : -1));
        AbstractC5091c abstractC5091c = this.f8070h0;
        if (i10 > 0) {
            c();
            List<File> g10 = g();
            long j6 = 0;
            for (File file2 : g10) {
                j6 += AbstractC4344b.D0(file2, abstractC5091c);
            }
            long j10 = eVar.f6060f;
            long j11 = j6 - j10;
            if (j11 > 0) {
                P4.a.l0(this.f8070h0, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new b(j6, j10, j11), null, 56);
                for (File file3 : g10) {
                    if (j11 > 0) {
                        j11 = (j11 - b(file3, true)) - b(d(file3), false);
                    }
                }
            }
            this.f8079q0 = System.currentTimeMillis();
        }
        if (!z10) {
            File file4 = (File) t.p2(g());
            if (file4 != null) {
                File file5 = this.f8075m0;
                long j12 = this.f8076n0;
                if (AbstractC3557B.K(file5, file4)) {
                    boolean e10 = e(file4, this.f8074l0);
                    if (AbstractC4344b.D0(file4, abstractC5091c) < eVar.f6056b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j12 >= eVar.f6058d) {
                        z12 = false;
                    }
                    if (e10 && z11 && z12) {
                        this.f8076n0 = j12 + 1;
                        this.f8077o0 = System.currentTimeMillis();
                        file = file4;
                    }
                }
            }
            if (file == null) {
                return a(false);
            }
            return file;
        }
        return a(true);
    }
}
