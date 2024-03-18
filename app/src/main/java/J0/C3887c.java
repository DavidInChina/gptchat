package j0;

import b0.C2099c;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jf.C3959i;

/* renamed from: j0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3887c extends AbstractC3893i {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f35873o = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public final wf.k f35874f;

    /* renamed from: g  reason: collision with root package name */
    public final wf.k f35875g;

    /* renamed from: h  reason: collision with root package name */
    public int f35876h;

    /* renamed from: i  reason: collision with root package name */
    public C2099c f35877i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f35878j;

    /* renamed from: k  reason: collision with root package name */
    public n f35879k = n.f35909j0;

    /* renamed from: l  reason: collision with root package name */
    public int[] f35880l = f35873o;

    /* renamed from: m  reason: collision with root package name */
    public int f35881m = 1;

    /* renamed from: n  reason: collision with root package name */
    public boolean f35882n;

    public C3887c(int i10, n nVar, wf.k kVar, wf.k kVar2) {
        super(i10, nVar);
        this.f35874f = kVar;
        this.f35875g = kVar2;
    }

    public void A(C2099c c2099c) {
        this.f35877i = c2099c;
    }

    public C3887c B(wf.k kVar, wf.k kVar2) {
        C3888d c3888d;
        if (!this.f35894c) {
            if (this.f35882n && this.f35895d < 0) {
                throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
            }
            y(d());
            Object obj = p.f35918b;
            synchronized (obj) {
                int i10 = p.f35920d;
                p.f35920d = i10 + 1;
                p.f35919c = p.f35919c.M(i10);
                n e10 = e();
                r(e10.M(i10));
                c3888d = new C3888d(i10, p.d(d() + 1, i10, e10), p.j(true, kVar, this.f35874f), p.a(kVar2, this.f35875g), this);
            }
            if (!this.f35882n && !this.f35894c) {
                int d10 = d();
                synchronized (obj) {
                    int i11 = p.f35920d;
                    p.f35920d = i11 + 1;
                    q(i11);
                    p.f35919c = p.f35919c.M(d());
                }
                r(p.d(d10 + 1, d(), e()));
            }
            return c3888d;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    @Override // j0.AbstractC3893i
    public final void b() {
        p.f35919c = p.f35919c.s(d()).r(this.f35879k);
    }

    @Override // j0.AbstractC3893i
    public void c() {
        if (!this.f35894c) {
            this.f35894c = true;
            synchronized (p.f35918b) {
                int i10 = this.f35895d;
                if (i10 >= 0) {
                    p.t(i10);
                    this.f35895d = -1;
                }
            }
            l();
        }
    }

    @Override // j0.AbstractC3893i
    public final wf.k f() {
        return this.f35874f;
    }

    @Override // j0.AbstractC3893i
    public boolean g() {
        return false;
    }

    @Override // j0.AbstractC3893i
    public int h() {
        return this.f35876h;
    }

    @Override // j0.AbstractC3893i
    public final wf.k i() {
        return this.f35875g;
    }

    @Override // j0.AbstractC3893i
    public void k() {
        this.f35881m++;
    }

    @Override // j0.AbstractC3893i
    public void l() {
        int i10 = this.f35881m;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f35881m = i11;
            if (i11 == 0 && !this.f35882n) {
                C2099c w10 = w();
                if (w10 != null) {
                    if (!this.f35882n) {
                        A(null);
                        int d10 = d();
                        Object[] objArr = w10.f25559Z;
                        int i12 = w10.f25558Y;
                        for (int i13 = 0; i13 < i12; i13++) {
                            Object obj = objArr[i13];
                            AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
                            for (AbstractC3884I r10 = ((AbstractC3882G) obj).r(); r10 != null; r10 = r10.f35855b) {
                                int i14 = r10.f35854a;
                                if (i14 == d10 || kf.t.X1(this.f35879k, Integer.valueOf(i14))) {
                                    r10.f35854a = 0;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
                    }
                }
                a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("no pending nested snapshots".toString());
    }

    @Override // j0.AbstractC3893i
    public void m() {
        if (!this.f35882n && !this.f35894c) {
            u();
        }
    }

    @Override // j0.AbstractC3893i
    public void n(AbstractC3882G abstractC3882G) {
        C2099c w10 = w();
        if (w10 == null) {
            w10 = new C2099c();
            A(w10);
        }
        w10.add(abstractC3882G);
    }

    @Override // j0.AbstractC3893i
    public final void o() {
        int length = this.f35880l.length;
        for (int i10 = 0; i10 < length; i10++) {
            p.t(this.f35880l[i10]);
        }
        int i11 = this.f35895d;
        if (i11 >= 0) {
            p.t(i11);
            this.f35895d = -1;
        }
    }

    @Override // j0.AbstractC3893i
    public void s(int i10) {
        this.f35876h = i10;
    }

    @Override // j0.AbstractC3893i
    public AbstractC3893i t(wf.k kVar) {
        C3889e c3889e;
        if (!this.f35894c) {
            if (this.f35882n && this.f35895d < 0) {
                throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
            }
            int d10 = d();
            y(d());
            Object obj = p.f35918b;
            synchronized (obj) {
                int i10 = p.f35920d;
                p.f35920d = i10 + 1;
                p.f35919c = p.f35919c.M(i10);
                c3889e = new C3889e(i10, p.d(d10 + 1, i10, e()), kVar, this);
            }
            if (!this.f35882n && !this.f35894c) {
                int d11 = d();
                synchronized (obj) {
                    int i11 = p.f35920d;
                    p.f35920d = i11 + 1;
                    q(i11);
                    p.f35919c = p.f35919c.M(d());
                }
                r(p.d(d11 + 1, d(), e()));
            }
            return c3889e;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    public final void u() {
        y(d());
        if (!this.f35882n && !this.f35894c) {
            int d10 = d();
            synchronized (p.f35918b) {
                int i10 = p.f35920d;
                p.f35920d = i10 + 1;
                q(i10);
                p.f35919c = p.f35919c.M(d());
            }
            r(p.d(d10 + 1, d(), e()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[LOOP:0: B:33:0x0099->B:34:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7 A[LOOP:1: B:39:0x00b5->B:40:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L4.a v() {
        HashMap hashMap;
        C2099c c2099c;
        int size;
        int i10;
        int size2;
        int i11;
        C2099c w10 = w();
        if (w10 != null) {
            AtomicReference atomicReference = p.f35925i;
            hashMap = p.b((C3887c) atomicReference.get(), this, p.f35919c.s(((C3886b) atomicReference.get()).f35893b));
        } else {
            hashMap = null;
        }
        List list = kf.v.f37483Y;
        synchronized (p.f35918b) {
            try {
                p.c(this);
                if (w10 != null && w10.f25558Y != 0) {
                    C3886b c3886b = (C3886b) p.f35925i.get();
                    L4.a x10 = x(p.f35920d, hashMap, p.f35919c.s(c3886b.f35893b));
                    if (!AbstractC3557B.K(x10, C3895k.f35897j)) {
                        return x10;
                    }
                    b();
                    p.u(c3886b, o.f35915h0);
                    c2099c = c3886b.f35877i;
                    A(null);
                    c3886b.f35877i = null;
                    list = p.f35923g;
                    this.f35882n = true;
                    if (c2099c != null && !c2099c.isEmpty()) {
                        size2 = list.size();
                        for (i11 = 0; i11 < size2; i11++) {
                            ((wf.n) list.get(i11)).invoke(c2099c, this);
                        }
                    }
                    if (w10 != null && !w10.isEmpty()) {
                        size = list.size();
                        for (i10 = 0; i10 < size; i10++) {
                            ((wf.n) list.get(i10)).invoke(w10, this);
                        }
                    }
                    synchronized (p.f35918b) {
                        try {
                            o();
                            p.f();
                            if (c2099c != null) {
                                Object[] objArr = c2099c.f25559Z;
                                int i12 = c2099c.f25558Y;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    Object obj = objArr[i13];
                                    AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
                                    p.p((AbstractC3882G) obj);
                                }
                            }
                            if (w10 != null) {
                                Object[] objArr2 = w10.f25559Z;
                                int i14 = w10.f25558Y;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    Object obj2 = objArr2[i15];
                                    AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj2);
                                    p.p((AbstractC3882G) obj2);
                                }
                            }
                            ArrayList arrayList = this.f35878j;
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i16 = 0; i16 < size3; i16++) {
                                    p.p((AbstractC3882G) arrayList.get(i16));
                                }
                            }
                            this.f35878j = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return C3895k.f35897j;
                }
                b();
                C3886b c3886b2 = (C3886b) p.f35925i.get();
                p.u(c3886b2, o.f35915h0);
                c2099c = c3886b2.f35877i;
                if (c2099c != null && !c2099c.isEmpty()) {
                    list = p.f35923g;
                    this.f35882n = true;
                    if (c2099c != null) {
                        size2 = list.size();
                        while (i11 < size2) {
                        }
                    }
                    if (w10 != null) {
                        size = list.size();
                        while (i10 < size) {
                        }
                    }
                    synchronized (p.f35918b) {
                    }
                }
                c2099c = null;
                this.f35882n = true;
                if (c2099c != null) {
                }
                if (w10 != null) {
                }
                synchronized (p.f35918b) {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public C2099c w() {
        return this.f35877i;
    }

    public final L4.a x(int i10, HashMap hashMap, n nVar) {
        n nVar2;
        AbstractC3884I r10;
        AbstractC3884I abstractC3884I;
        C3959i c3959i;
        n I10 = e().M(d()).I(this.f35879k);
        C2099c w10 = w();
        AbstractC3557B.Z(w10);
        Object[] objArr = w10.f25559Z;
        int i11 = w10.f25558Y;
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (i12 < i11) {
            Object obj = objArr[i12];
            AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
            AbstractC3882G abstractC3882G = (AbstractC3882G) obj;
            AbstractC3884I r11 = abstractC3882G.r();
            AbstractC3884I r12 = p.r(r11, i10, nVar);
            if (r12 == null || (r10 = p.r(r11, d(), I10)) == null || AbstractC3557B.K(r12, r10)) {
                nVar2 = I10;
            } else {
                nVar2 = I10;
                AbstractC3884I r13 = p.r(r11, d(), e());
                if (r13 != null) {
                    if (hashMap == null || (abstractC3884I = (AbstractC3884I) hashMap.get(r12)) == null) {
                        abstractC3884I = abstractC3882G.s(r10, r12, r13);
                    }
                    if (abstractC3884I == null) {
                        return new C3894j(this);
                    }
                    if (!AbstractC3557B.K(abstractC3884I, r13)) {
                        if (AbstractC3557B.K(abstractC3884I, r12)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new C3959i(abstractC3882G, r12.b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(abstractC3882G);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!AbstractC3557B.K(abstractC3884I, r10)) {
                                c3959i = new C3959i(abstractC3882G, abstractC3884I);
                            } else {
                                c3959i = new C3959i(abstractC3882G, r10.b());
                            }
                            arrayList.add(c3959i);
                        }
                    }
                } else {
                    p.q();
                    throw null;
                }
            }
            i12++;
            I10 = nVar2;
        }
        if (arrayList != null) {
            u();
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C3959i c3959i2 = (C3959i) arrayList.get(i13);
                AbstractC3882G abstractC3882G2 = (AbstractC3882G) c3959i2.f36155Y;
                AbstractC3884I abstractC3884I2 = (AbstractC3884I) c3959i2.f36156Z;
                abstractC3884I2.f35854a = d();
                synchronized (p.f35918b) {
                    abstractC3884I2.f35855b = abstractC3882G2.r();
                    abstractC3882G2.y(abstractC3884I2);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                w10.remove((AbstractC3882G) arrayList2.get(i14));
            }
            ArrayList arrayList3 = this.f35878j;
            if (arrayList3 != null) {
                arrayList2 = kf.t.w2(arrayList2, arrayList3);
            }
            this.f35878j = arrayList2;
        }
        return C3895k.f35897j;
    }

    public final void y(int i10) {
        synchronized (p.f35918b) {
            this.f35879k = this.f35879k.M(i10);
        }
    }

    public final void z(n nVar) {
        synchronized (p.f35918b) {
            this.f35879k = this.f35879k.I(nVar);
        }
    }
}
