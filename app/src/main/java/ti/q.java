package ti;

import D1.C0373t;
import K4.J;
import android.gov.nist.core.Separators;
import java.util.ArrayList;
import k6.AbstractC4194d;
import p3.H;
import wi.s;
import wi.u;
import wi.w;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class q extends yi.a {

    /* renamed from: a  reason: collision with root package name */
    public final u f46315a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final m f46316b = new m();

    @Override // yi.a
    public final void a(xi.d dVar) {
        m mVar = this.f46316b;
        ArrayList arrayList = mVar.f46299b;
        arrayList.add(dVar);
        if (mVar.f46298a != 6) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(dVar);
            H h10 = new H(arrayList2);
            while (h10.f()) {
                int f6 = AbstractC6708l.f(mVar.f46298a);
                if (f6 != 0) {
                    if (f6 != 1) {
                        if (f6 != 2) {
                            if (f6 != 3) {
                                if (f6 == 4) {
                                    C0373t n10 = h10.n();
                                    if (J.X(h10, mVar.f46304g)) {
                                        mVar.f46305h.append(h10.e(n10, h10.n()).e());
                                        if (!h10.f()) {
                                            mVar.f46305h.append('\n');
                                        } else {
                                            h10.j();
                                            h10.p();
                                            if (!h10.f()) {
                                                mVar.f46306i = true;
                                                mVar.a();
                                                arrayList.clear();
                                                mVar.f46298a = 1;
                                            }
                                        }
                                    }
                                    mVar.f46298a = 6;
                                    return;
                                }
                                throw new IllegalStateException("Unknown parsing state: ".concat(AbstractC4194d.K(mVar.f46298a)));
                            }
                            h10.p();
                            if (!h10.f()) {
                                mVar.f46298a = 1;
                            } else {
                                mVar.f46304g = (char) 0;
                                char m10 = h10.m();
                                if (m10 != '\"' && m10 != '\'') {
                                    if (m10 == '(') {
                                        mVar.f46304g = ')';
                                    }
                                } else {
                                    mVar.f46304g = m10;
                                }
                                if (mVar.f46304g != 0) {
                                    mVar.f46298a = 5;
                                    mVar.f46305h = new StringBuilder();
                                    h10.j();
                                    if (!h10.f()) {
                                        mVar.f46305h.append('\n');
                                    }
                                } else {
                                    mVar.a();
                                    mVar.f46298a = 1;
                                }
                            }
                        } else {
                            h10.p();
                            C0373t n11 = h10.n();
                            if (J.V(h10)) {
                                String e10 = h10.e(n11, h10.n()).e();
                                if (e10.startsWith(Separators.LESS_THAN)) {
                                    e10 = e10.substring(1, e10.length() - 1);
                                }
                                mVar.f46303f = e10;
                                int p10 = h10.p();
                                if (!h10.f()) {
                                    mVar.f46306i = true;
                                    arrayList.clear();
                                } else if (p10 == 0) {
                                }
                                mVar.f46298a = 4;
                            }
                            mVar.f46298a = 6;
                            return;
                        }
                    } else {
                        C0373t n12 = h10.n();
                        if (J.W(h10)) {
                            mVar.f46302e.append(h10.e(n12, h10.n()).e());
                            if (!h10.f()) {
                                mVar.f46302e.append('\n');
                            } else if (h10.k(']') && h10.k(':') && mVar.f46302e.length() <= 999 && !vi.a.a(mVar.f46302e.toString()).isEmpty()) {
                                mVar.f46298a = 3;
                                h10.p();
                            }
                        }
                        mVar.f46298a = 6;
                        return;
                    }
                } else {
                    h10.p();
                    if (!h10.k('[')) {
                        mVar.f46298a = 6;
                        return;
                    }
                    mVar.f46298a = 2;
                    mVar.f46302e = new StringBuilder();
                    if (!h10.f()) {
                        mVar.f46302e.append('\n');
                    }
                }
            }
        }
    }

    @Override // yi.a
    public final void b(w wVar) {
        this.f46316b.f46301d.add(wVar);
    }

    @Override // yi.a
    public final void e() {
        m mVar = this.f46316b;
        ArrayList arrayList = mVar.f46299b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        boolean isEmpty = arrayList2.isEmpty();
        u uVar = this.f46315a;
        if (isEmpty) {
            uVar.i();
        } else {
            uVar.g(mVar.f46301d);
        }
    }

    @Override // yi.a
    public final wi.a f() {
        return this.f46315a;
    }

    @Override // yi.a
    public final void h(l lVar) {
        ArrayList arrayList = this.f46316b.f46299b;
        Q3.j jVar = new Q3.j(6);
        jVar.f14418b.addAll(arrayList);
        if (!jVar.f14418b.isEmpty()) {
            lVar.e(jVar, this.f46315a);
        }
    }

    @Override // yi.a
    public final a i(yi.d dVar) {
        f fVar = (f) dVar;
        if (!fVar.f46265i) {
            return a.a(fVar.f46259c);
        }
        return null;
    }
}
