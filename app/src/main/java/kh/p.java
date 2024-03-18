package kh;

import A.B0;
import E0.C0453l;
import Ng.F;
import Ng.H;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import l0.AbstractC4309a;
import mh.C4686p;
import mh.C4687q;
import mh.P;
import mh.u;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5254f;

/* loaded from: classes.dex */
public final class p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37572Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ P f37573Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f37574h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(P p10, m mVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37573Z = p10;
        this.f37574h0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new p(this.f37573Z, this.f37574h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5254f c5254f;
        Object obj2;
        Object obj3;
        Object obj4 = EnumC5000a.f41328Y;
        int i10 = this.f37572Y;
        Object obj5 = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Z0.k kVar = (Z0.k) ((e) this.f37574h0).f37552b.getValue();
            if (kVar != null) {
                c5254f = new C5254f(H.z(kVar.f22804a));
            } else {
                c5254f = null;
            }
            if (c5254f == null) {
                obj2 = u.f39508a;
            } else {
                long j6 = C5254f.f43638c;
                long j10 = c5254f.f43640a;
                if (j10 == j6) {
                    obj2 = mh.t.f39507a;
                } else {
                    obj2 = new C4687q(j10, C0453l.f4076d, AbstractC4309a.f37690a);
                }
            }
            this.f37572Y = 1;
            C4686p c4686p = (C4686p) this.f37573Z;
            if (!AbstractC3557B.K(c4686p.i(), obj2)) {
                c4686p.f39490j.setValue(obj2);
                if (c4686p.k()) {
                    obj3 = c4686p.f39497q.a(B0.f16h0, new AbstractC5163j(2, null), this);
                }
                obj3 = obj5;
            }
            obj3 = obj5;
            if (obj3 == obj4) {
                return obj4;
            }
        }
        return obj5;
    }
}
