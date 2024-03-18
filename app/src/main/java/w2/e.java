package w2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k6.AbstractC4194d;
import p2.Y;
import s2.AbstractC5530A;
import v2.AbstractC5969h;
import v2.C5961A;
import v2.E;
import v2.F;

/* loaded from: classes.dex */
public final class e implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6084b f47663a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5969h f47664b;

    /* renamed from: c  reason: collision with root package name */
    public final E f47665c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC5969h f47666d;

    /* renamed from: e  reason: collision with root package name */
    public final i f47667e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f47668f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f47669g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f47670h;

    /* renamed from: i  reason: collision with root package name */
    public Uri f47671i;

    /* renamed from: j  reason: collision with root package name */
    public v2.l f47672j;

    /* renamed from: k  reason: collision with root package name */
    public v2.l f47673k;

    /* renamed from: l  reason: collision with root package name */
    public AbstractC5969h f47674l;

    /* renamed from: m  reason: collision with root package name */
    public long f47675m;

    /* renamed from: n  reason: collision with root package name */
    public long f47676n;

    /* renamed from: o  reason: collision with root package name */
    public long f47677o;

    /* renamed from: p  reason: collision with root package name */
    public u f47678p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f47679q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f47680r;

    /* renamed from: s  reason: collision with root package name */
    public long f47681s;

    public e(AbstractC6084b abstractC6084b, AbstractC5969h abstractC5969h, AbstractC5969h abstractC5969h2, d dVar, int i10) {
        boolean z10;
        boolean z11;
        Y y10 = i.f47687H;
        this.f47663a = abstractC6084b;
        this.f47664b = abstractC5969h2;
        this.f47667e = y10;
        boolean z12 = true;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47668f = z10;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47669g = z11;
        this.f47670h = (i10 & 4) == 0 ? false : z12;
        E e10 = null;
        if (abstractC5969h != null) {
            this.f47666d = abstractC5969h;
            this.f47665c = dVar != null ? new E(abstractC5969h, dVar) : e10;
            return;
        }
        this.f47666d = C5961A.f47033a;
        this.f47665c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:3:0x0005, B:6:0x0013, B:7:0x0019, B:8:0x002a, B:13:0x0038, B:14:0x0039, B:16:0x0046, B:20:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x006b, B:35:0x0076, B:37:0x007c, B:40:0x0081, B:42:0x0091, B:45:0x0099, B:46:0x00a0, B:49:0x00a5, B:52:0x00ad, B:53:0x00b1, B:54:0x00b3, B:58:0x00bd, B:61:0x00c3, B:9:0x002b, B:11:0x0033, B:12:0x0036), top: B:69:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:3:0x0005, B:6:0x0013, B:7:0x0019, B:8:0x002a, B:13:0x0038, B:14:0x0039, B:16:0x0046, B:20:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x006b, B:35:0x0076, B:37:0x007c, B:40:0x0081, B:42:0x0091, B:45:0x0099, B:46:0x00a0, B:49:0x00a5, B:52:0x00ad, B:53:0x00b1, B:54:0x00b3, B:58:0x00bd, B:61:0x00c3, B:9:0x002b, B:11:0x0033, B:12:0x0036), top: B:69:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:3:0x0005, B:6:0x0013, B:7:0x0019, B:8:0x002a, B:13:0x0038, B:14:0x0039, B:16:0x0046, B:20:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x006b, B:35:0x0076, B:37:0x007c, B:40:0x0081, B:42:0x0091, B:45:0x0099, B:46:0x00a0, B:49:0x00a5, B:52:0x00ad, B:53:0x00b1, B:54:0x00b3, B:58:0x00bd, B:61:0x00c3, B:9:0x002b, B:11:0x0033, B:12:0x0036), top: B:69:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:3:0x0005, B:6:0x0013, B:7:0x0019, B:8:0x002a, B:13:0x0038, B:14:0x0039, B:16:0x0046, B:20:0x0052, B:23:0x0059, B:26:0x0066, B:29:0x006b, B:35:0x0076, B:37:0x007c, B:40:0x0081, B:42:0x0091, B:45:0x0099, B:46:0x00a0, B:49:0x00a5, B:52:0x00ad, B:53:0x00b1, B:54:0x00b3, B:58:0x00bd, B:61:0x00c3, B:9:0x002b, B:11:0x0033, B:12:0x0036), top: B:69:0x0005 }] */
    @Override // v2.AbstractC5969h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(v2.l lVar) {
        p pVar;
        String str;
        boolean z10;
        int i10;
        long j6;
        long j10;
        AbstractC6084b abstractC6084b = this.f47663a;
        try {
            ((Y) this.f47667e).getClass();
            String str2 = lVar.f47102h;
            long j11 = lVar.f47100f;
            if (str2 == null) {
                str2 = lVar.f47095a.toString();
            }
            v2.k a5 = lVar.a();
            a5.f47091h = str2;
            v2.l a10 = a5.a();
            this.f47672j = a10;
            Uri uri = a10.f47095a;
            t tVar = (t) abstractC6084b;
            synchronized (tVar) {
                l h10 = tVar.f47724c.h(str2);
                if (h10 != null) {
                    pVar = h10.f47700e;
                } else {
                    pVar = p.f47713c;
                }
            }
            byte[] bArr = (byte[]) pVar.f47715b.get("exo_redir");
            Uri uri2 = null;
            if (bArr != null) {
                str = new String(bArr, w8.e.f48221c);
            } else {
                str = null;
            }
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f47671i = uri;
            this.f47676n = j11;
            boolean z11 = this.f47669g;
            long j12 = lVar.f47101g;
            if ((!z11 || !this.f47679q) && (!this.f47670h || j12 != -1)) {
                z10 = false;
                this.f47680r = z10;
                if (!z10) {
                    this.f47677o = -1L;
                } else {
                    long k10 = AbstractC4194d.k(((t) abstractC6084b).g(str2));
                    this.f47677o = k10;
                    if (k10 != -1) {
                        long j13 = k10 - j11;
                        this.f47677o = j13;
                        if (j13 < 0) {
                            throw new v2.i(2008);
                        }
                    }
                }
                i10 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
                if (i10 != 0) {
                    long j14 = this.f47677o;
                    if (j14 == -1) {
                        j10 = j12;
                    } else {
                        j10 = Math.min(j14, j12);
                    }
                    this.f47677o = j10;
                }
                j6 = this.f47677o;
                if (j6 <= 0 || j6 == -1) {
                    q(a10, false);
                }
                if (i10 != 0) {
                    return this.f47677o;
                }
                return j12;
            }
            z10 = true;
            this.f47680r = z10;
            if (!z10) {
            }
            i10 = (j12 > (-1L) ? 1 : (j12 == (-1L) ? 0 : -1));
            if (i10 != 0) {
            }
            j6 = this.f47677o;
            if (j6 <= 0) {
            }
            q(a10, false);
            if (i10 != 0) {
            }
        } catch (Throwable th2) {
            if (this.f47674l == this.f47664b || (th2 instanceof C6083a)) {
                this.f47679q = true;
            }
            throw th2;
        }
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        this.f47672j = null;
        this.f47671i = null;
        this.f47676n = 0L;
        try {
            p();
        } catch (Throwable th2) {
            if (this.f47674l == this.f47664b || (th2 instanceof C6083a)) {
                this.f47679q = true;
            }
            throw th2;
        }
    }

    @Override // v2.AbstractC5969h
    public final void g(F f6) {
        f6.getClass();
        this.f47664b.g(f6);
        this.f47666d.g(f6);
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return this.f47671i;
    }

    @Override // v2.AbstractC5969h
    public final Map j() {
        boolean z10;
        if (this.f47674l == this.f47664b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return this.f47666d.j();
        }
        return Collections.emptyMap();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [v2.h, w2.u, v2.l] */
    public final void p() {
        AbstractC6084b abstractC6084b = this.f47663a;
        AbstractC5969h abstractC5969h = this.f47674l;
        if (abstractC5969h == null) {
            return;
        }
        try {
            abstractC5969h.close();
        } finally {
            this.f47673k = null;
            this.f47674l = null;
            u uVar = this.f47678p;
            if (uVar != null) {
                ((t) abstractC6084b).j(uVar);
                this.f47678p = null;
            }
        }
    }

    public final void q(v2.l lVar, boolean z10) {
        u uVar;
        v2.l lVar2;
        AbstractC5969h abstractC5969h;
        long j6;
        Uri uri;
        boolean z11;
        String str = lVar.f47102h;
        int i10 = AbstractC5530A.f45131a;
        Uri uri2 = null;
        if (this.f47680r) {
            uVar = null;
        } else if (this.f47668f) {
            try {
                AbstractC6084b abstractC6084b = this.f47663a;
                long j10 = this.f47676n;
                long j11 = this.f47677o;
                t tVar = (t) abstractC6084b;
                synchronized (tVar) {
                    tVar.d();
                    while (true) {
                        uVar = tVar.m(j10, j11, str);
                        if (uVar != null) {
                            break;
                        }
                        tVar.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            uVar = ((t) this.f47663a).m(this.f47676n, this.f47677o, str);
        }
        if (uVar == null) {
            abstractC5969h = this.f47666d;
            v2.k a5 = lVar.a();
            a5.f47089f = this.f47676n;
            a5.f47090g = this.f47677o;
            lVar2 = a5.a();
        } else if (uVar.f47691i0) {
            Uri fromFile = Uri.fromFile(uVar.f47692j0);
            long j12 = uVar.f47689Z;
            long j13 = this.f47676n - j12;
            long j14 = uVar.f47690h0 - j13;
            long j15 = this.f47677o;
            if (j15 != -1) {
                j14 = Math.min(j14, j15);
            }
            v2.k a10 = lVar.a();
            a10.f47084a = fromFile;
            a10.f47085b = j12;
            a10.f47089f = j13;
            a10.f47090g = j14;
            lVar2 = a10.a();
            abstractC5969h = this.f47664b;
        } else {
            long j16 = uVar.f47690h0;
            if (j16 == -1) {
                j16 = this.f47677o;
            } else {
                long j17 = this.f47677o;
                if (j17 != -1) {
                    j16 = Math.min(j16, j17);
                }
            }
            v2.k a11 = lVar.a();
            a11.f47089f = this.f47676n;
            a11.f47090g = j16;
            lVar2 = a11.a();
            abstractC5969h = this.f47665c;
            if (abstractC5969h == null) {
                abstractC5969h = this.f47666d;
                ((t) this.f47663a).j(uVar);
                uVar = null;
            }
        }
        if (!this.f47680r && abstractC5969h == this.f47666d) {
            j6 = this.f47676n + 102400;
        } else {
            j6 = Long.MAX_VALUE;
        }
        this.f47681s = j6;
        boolean z12 = false;
        if (z10) {
            if (this.f47674l == this.f47666d) {
                z11 = true;
            } else {
                z11 = false;
            }
            Gi.e.n(z11);
            if (abstractC5969h == this.f47666d) {
                return;
            }
            try {
                p();
            } catch (Throwable th2) {
                if (!uVar.f47691i0) {
                    ((t) this.f47663a).j(uVar);
                }
                throw th2;
            }
        }
        if (uVar != null && (!uVar.f47691i0)) {
            this.f47678p = uVar;
        }
        this.f47674l = abstractC5969h;
        this.f47673k = lVar2;
        this.f47675m = 0L;
        long a12 = abstractC5969h.a(lVar2);
        U3.l lVar3 = new U3.l(5, 0);
        if (lVar2.f47101g == -1 && a12 != -1) {
            this.f47677o = a12;
            lVar3.h("exo_len", Long.valueOf(this.f47676n + a12));
        }
        if (this.f47674l == this.f47664b) {
            z12 = true;
        }
        if (!z12) {
            this.f47671i = abstractC5969h.getUri();
            if (!lVar.f47095a.equals(uri)) {
                uri2 = this.f47671i;
            }
            if (uri2 == null) {
                ((List) lVar3.f17424h0).add("exo_redir");
                ((Map) lVar3.f17423Z).remove("exo_redir");
            } else {
                lVar3.h("exo_redir", uri2.toString());
            }
        }
        if (this.f47674l == this.f47665c) {
            ((t) this.f47663a).c(lVar3, str);
        }
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        boolean z10;
        int i12;
        AbstractC5969h abstractC5969h = this.f47664b;
        if (i11 == 0) {
            return 0;
        }
        if (this.f47677o == 0) {
            return -1;
        }
        v2.l lVar = this.f47672j;
        lVar.getClass();
        v2.l lVar2 = this.f47673k;
        lVar2.getClass();
        try {
            if (this.f47676n >= this.f47681s) {
                q(lVar, true);
            }
            AbstractC5969h abstractC5969h2 = this.f47674l;
            abstractC5969h2.getClass();
            int read = abstractC5969h2.read(bArr, i10, i11);
            if (read != -1) {
                long j6 = read;
                this.f47676n += j6;
                this.f47675m += j6;
                long j10 = this.f47677o;
                if (j10 != -1) {
                    this.f47677o = j10 - j6;
                }
                return read;
            }
            AbstractC5969h abstractC5969h3 = this.f47674l;
            if (abstractC5969h3 == abstractC5969h) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i12 = read;
                long j11 = lVar2.f47101g;
                if (j11 == -1 || this.f47675m < j11) {
                    String str = lVar.f47102h;
                    int i13 = AbstractC5530A.f45131a;
                    this.f47677o = 0L;
                    if (abstractC5969h3 == this.f47665c) {
                        U3.l lVar3 = new U3.l(5, 0);
                        lVar3.h("exo_len", Long.valueOf(this.f47676n));
                        ((t) this.f47663a).c(lVar3, str);
                        return i12;
                    }
                    return i12;
                }
            } else {
                i12 = read;
            }
            long j12 = this.f47677o;
            if (j12 <= 0 && j12 != -1) {
                return i12;
            }
            p();
            q(lVar, false);
            return read(bArr, i10, i11);
        } catch (Throwable th2) {
            if (this.f47674l == abstractC5969h || (th2 instanceof C6083a)) {
                this.f47679q = true;
            }
            throw th2;
        }
    }
}
