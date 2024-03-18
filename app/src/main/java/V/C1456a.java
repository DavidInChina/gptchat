package V;

import G0.J;
import Ng.F;
import Z.AbstractC1710f0;
import Z.C1724m0;
import Z.G0;
import Z.l1;
import Z.o1;
import android.view.View;
import android.view.ViewGroup;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5352p;
import t0.AbstractC5646e;
import z.C6672L;

/* renamed from: V.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1456a extends u implements G0 {

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f17904Z;

    /* renamed from: h0  reason: collision with root package name */
    public final float f17905h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l1 f17906i0;

    /* renamed from: j0  reason: collision with root package name */
    public final l1 f17907j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ViewGroup f17908k0;

    /* renamed from: l0  reason: collision with root package name */
    public r f17909l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1724m0 f17910m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C1724m0 f17911n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f17912o0 = C5254f.f43637b;

    /* renamed from: p0  reason: collision with root package name */
    public int f17913p0 = -1;

    /* renamed from: q0  reason: collision with root package name */
    public final C6672L f17914q0 = new C6672L(10, this);

    public C1456a(boolean z10, float f6, AbstractC1710f0 abstractC1710f0, AbstractC1710f0 abstractC1710f02, ViewGroup viewGroup) {
        super(z10, abstractC1710f02);
        this.f17904Z = z10;
        this.f17905h0 = f6;
        this.f17906i0 = abstractC1710f0;
        this.f17907j0 = abstractC1710f02;
        this.f17908k0 = viewGroup;
        o1 o1Var = o1.f22665a;
        this.f17910m0 = AbstractC4828h.Z(null, o1Var);
        this.f17911n0 = AbstractC4828h.Z(Boolean.TRUE, o1Var);
    }

    @Override // Z.G0
    public final void a() {
        h();
    }

    @Override // A.AbstractC0042s0
    public final void b(AbstractC5646e abstractC5646e) {
        int i10;
        J j6 = (J) abstractC5646e;
        this.f17912o0 = j6.f5596Y.g();
        float f6 = this.f17905h0;
        if (Float.isNaN(f6)) {
            i10 = AbstractC4344b.Y0(q.a(abstractC5646e, this.f17904Z, j6.f5596Y.g()));
        } else {
            i10 = j6.a0(f6);
        }
        this.f17913p0 = i10;
        long j10 = ((r0.r) this.f17906i0.getValue()).f44265a;
        float f10 = ((h) this.f17907j0.getValue()).f17935d;
        j6.a();
        f(abstractC5646e, f6, j10);
        AbstractC5352p a5 = ((J) abstractC5646e).f5596Y.f45612Z.a();
        ((Boolean) this.f17911n0.getValue()).booleanValue();
        t tVar = (t) this.f17910m0.getValue();
        if (tVar != null) {
            tVar.e(j6.f5596Y.g(), this.f17913p0, j10, f10);
            tVar.draw(AbstractC5340d.a(a5));
        }
    }

    @Override // Z.G0
    public final void c() {
        h();
    }

    @Override // V.u
    public final void e(D.p pVar, F f6) {
        Object obj;
        t tVar;
        r rVar = this.f17909l0;
        r rVar2 = rVar;
        if (rVar == null) {
            ViewGroup viewGroup = this.f17908k0;
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof r) {
                    this.f17909l0 = (r) childAt;
                    break;
                }
                i10++;
            }
            if (this.f17909l0 == null) {
                r rVar3 = new r(viewGroup.getContext());
                viewGroup.addView(rVar3);
                this.f17909l0 = rVar3;
            }
            r rVar4 = this.f17909l0;
            AbstractC3557B.Z(rVar4);
            rVar2 = rVar4;
        }
        s sVar = rVar2.f17968k0;
        t tVar2 = (t) sVar.f17970a.get(this);
        if (tVar2 == null) {
            ArrayList arrayList = rVar2.f17967j0;
            AbstractC3557B.c0("<this>", arrayList);
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.remove(0);
            }
            t tVar3 = (t) obj;
            HashMap hashMap = sVar.f17970a;
            tVar2 = tVar3;
            if (tVar3 == null) {
                int i11 = rVar2.f17969l0;
                ArrayList arrayList2 = rVar2.f17966i0;
                if (i11 > AbstractC4344b.u0(arrayList2)) {
                    View view = new View(rVar2.getContext());
                    rVar2.addView(view);
                    arrayList2.add(view);
                    tVar = view;
                } else {
                    t tVar4 = (t) arrayList2.get(rVar2.f17969l0);
                    C1456a c1456a = (C1456a) sVar.f17971b.get(tVar4);
                    tVar = tVar4;
                    if (c1456a != null) {
                        c1456a.f17910m0.setValue(null);
                        t tVar5 = (t) hashMap.get(c1456a);
                        if (tVar5 != null) {
                            C1456a c1456a2 = (C1456a) sVar.f17971b.remove(tVar5);
                        }
                        hashMap.remove(c1456a);
                        tVar4.c();
                        tVar = tVar4;
                    }
                }
                int i12 = rVar2.f17969l0;
                if (i12 < rVar2.f17965h0 - 1) {
                    rVar2.f17969l0 = i12 + 1;
                    tVar2 = tVar;
                } else {
                    rVar2.f17969l0 = 0;
                    tVar2 = tVar;
                }
            }
            hashMap.put(this, tVar2);
            sVar.f17971b.put(tVar2, this);
        }
        tVar2.b(pVar, this.f17904Z, this.f17912o0, this.f17913p0, ((r0.r) this.f17906i0.getValue()).f44265a, ((h) this.f17907j0.getValue()).f17935d, this.f17914q0);
        this.f17910m0.setValue(tVar2);
    }

    @Override // V.u
    public final void g(D.p pVar) {
        t tVar = (t) this.f17910m0.getValue();
        if (tVar != null) {
            tVar.d();
        }
    }

    public final void h() {
        r rVar = this.f17909l0;
        if (rVar != null) {
            this.f17910m0.setValue(null);
            s sVar = rVar.f17968k0;
            t tVar = (t) sVar.f17970a.get(this);
            if (tVar != null) {
                tVar.c();
                HashMap hashMap = sVar.f17970a;
                t tVar2 = (t) hashMap.get(this);
                if (tVar2 != null) {
                    C1456a c1456a = (C1456a) sVar.f17971b.remove(tVar2);
                }
                hashMap.remove(this);
                rVar.f17967j0.add(tVar);
            }
        }
    }

    @Override // Z.G0
    public final void d() {
    }
}
