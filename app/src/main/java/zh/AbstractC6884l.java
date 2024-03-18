package zh;

import Bh.AbstractC0241e;
import Bh.AbstractC0263p;
import Bh.C0244f0;
import Bh.C0247h;
import Bh.W;
import Eh.AbstractC0512k;
import Qh.AbstractC1243v;
import Qh.C1242u;
import java.util.List;
import rh.AbstractC5496c;
import rh.C5494a;
import rh.C5498e;
import wh.C6247l;
import yh.AbstractC6643w;
import yh.l1;
import z.AbstractC6708l;

/* renamed from: zh.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6884l extends AbstractC6886n {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0263p f52132a;

    /* renamed from: b  reason: collision with root package name */
    public final C0247h f52133b;

    /* renamed from: c  reason: collision with root package name */
    public final W f52134c;

    /* renamed from: d  reason: collision with root package name */
    public final C0244f0 f52135d;

    /* renamed from: e  reason: collision with root package name */
    public final Fh.F f52136e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC5496c f52137f;

    /* renamed from: g  reason: collision with root package name */
    public final ph.f f52138g;

    /* renamed from: h  reason: collision with root package name */
    public final Gh.b f52139h;

    /* renamed from: i  reason: collision with root package name */
    public final Fh.n f52140i;

    /* renamed from: j  reason: collision with root package name */
    public final int f52141j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0512k f52142k;

    /* renamed from: l  reason: collision with root package name */
    public final Bh.H f52143l;

    /* renamed from: m  reason: collision with root package name */
    public final int f52144m;

    /* renamed from: n  reason: collision with root package name */
    public final Q f52145n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC0241e f52146o;

    /* renamed from: p  reason: collision with root package name */
    public final AbstractC1243v f52147p;

    /* renamed from: q  reason: collision with root package name */
    public final List f52148q;

    public AbstractC6884l(AbstractC0263p abstractC0263p, C0247h c0247h, W w10, C0244f0 c0244f0, Fh.F f6, AbstractC5496c abstractC5496c, ph.f fVar, Gh.b bVar, Fh.n nVar, int i10, AbstractC0512k abstractC0512k, Bh.H h10, int i11, Q q10, AbstractC0241e abstractC0241e, AbstractC1243v abstractC1243v, List list) {
        this.f52132a = abstractC0263p;
        this.f52133b = c0247h;
        this.f52134c = w10;
        this.f52135d = c0244f0;
        this.f52136e = f6;
        this.f52137f = abstractC5496c;
        this.f52138g = fVar;
        this.f52139h = bVar;
        this.f52140i = nVar;
        this.f52141j = i10;
        this.f52142k = abstractC0512k;
        this.f52143l = h10;
        this.f52144m = i11;
        this.f52145n = q10;
        this.f52146o = abstractC0241e;
        this.f52147p = abstractC1243v;
        this.f52148q = list;
    }

    @Override // zh.AbstractC6869C
    public final v a(String str, AbstractC6643w abstractC6643w, int i10) {
        return new C6881i(this, new C6247l(str, i10, abstractC6643w));
    }

    @Override // zh.AbstractC6869C
    public final AbstractC6869C b(l1 l1Var) {
        return i(this.f52132a.Q0(l1Var), this.f52133b, this.f52134c, this.f52135d, this.f52136e, this.f52137f, this.f52138g, this.f52139h, this.f52140i, this.f52141j, this.f52142k, this.f52143l, this.f52144m, this.f52145n, this.f52146o, this.f52147p, this.f52148q);
    }

    @Override // zh.AbstractC6869C
    public final s c(C1242u c1242u) {
        return new C6883k(this, c1242u);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC6884l abstractC6884l = (AbstractC6884l) obj;
        if (AbstractC6708l.c(this.f52141j, abstractC6884l.f52141j) && AbstractC6708l.c(this.f52144m, abstractC6884l.f52144m) && this.f52132a.equals(abstractC6884l.f52132a) && this.f52133b.equals(abstractC6884l.f52133b) && this.f52134c.equals(abstractC6884l.f52134c) && this.f52135d.equals(abstractC6884l.f52135d) && this.f52136e.equals(abstractC6884l.f52136e) && this.f52137f.equals(abstractC6884l.f52137f) && this.f52138g.equals(abstractC6884l.f52138g) && this.f52139h.equals(abstractC6884l.f52139h) && this.f52140i.equals(abstractC6884l.f52140i) && this.f52142k.equals(abstractC6884l.f52142k) && this.f52143l.equals(abstractC6884l.f52143l) && this.f52145n.equals(abstractC6884l.f52145n) && this.f52146o.equals(abstractC6884l.f52146o) && this.f52147p.equals(abstractC6884l.f52147p) && this.f52148q.equals(abstractC6884l.f52148q)) {
            return true;
        }
        return false;
    }

    @Override // zh.AbstractC6869C
    public final AbstractC6869C f(C5498e c5498e) {
        return i(this.f52132a, this.f52133b, this.f52134c, this.f52135d, this.f52136e, new C5494a(this.f52137f, c5498e), this.f52138g, this.f52139h, this.f52140i, this.f52141j, this.f52142k, this.f52143l, this.f52144m, this.f52145n, this.f52146o, this.f52147p, this.f52148q);
    }

    public int hashCode() {
        int hashCode = this.f52132a.hashCode();
        int hashCode2 = this.f52133b.hashCode();
        int hashCode3 = this.f52134c.hashCode();
        int hashCode4 = this.f52135d.hashCode();
        int hashCode5 = this.f52136e.hashCode();
        int hashCode6 = this.f52137f.hashCode();
        int hashCode7 = this.f52139h.hashCode();
        int hashCode8 = this.f52140i.hashCode();
        int d10 = AbstractC6708l.d(this.f52141j, (hashCode8 + ((hashCode7 + ((((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (getClass().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f52138g.f43205Y) * 31)) * 31)) * 31, 31);
        int hashCode9 = this.f52143l.hashCode();
        int d11 = AbstractC6708l.d(this.f52144m, (hashCode9 + ((this.f52142k.hashCode() + d10) * 31)) * 31, 31);
        int hashCode10 = this.f52146o.hashCode();
        int hashCode11 = this.f52147p.hashCode();
        return this.f52148q.hashCode() + ((hashCode11 + ((hashCode10 + ((this.f52145n.hashCode() + d11) * 31)) * 31)) * 31);
    }

    public abstract AbstractC6869C i(AbstractC0263p abstractC0263p, C0247h c0247h, W w10, C0244f0 c0244f0, Fh.F f6, AbstractC5496c abstractC5496c, ph.f fVar, Gh.b bVar, Fh.n nVar, int i10, AbstractC0512k abstractC0512k, Bh.H h10, int i11, Q q10, AbstractC0241e abstractC0241e, AbstractC1243v abstractC1243v, List list);

    public final AbstractC6869C j(String str) {
        return i(this.f52132a.n0(str), this.f52133b, this.f52134c, this.f52135d, this.f52136e, this.f52137f, this.f52138g, this.f52139h, this.f52140i, this.f52141j, this.f52142k, this.f52143l, this.f52144m, this.f52145n, this.f52146o, this.f52147p, this.f52148q);
    }
}
