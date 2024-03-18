package Ra;

import Qg.F0;
import Uc.C1425j;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.P;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import id.C3556A;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jf.C3959i;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import r9.y;
import rc.C5476z;
import ua.C5870a;
import wd.q0;
import x9.C6383b;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class o extends Ad.g {

    /* renamed from: j  reason: collision with root package name */
    public final xd.f f15227j;

    /* renamed from: k  reason: collision with root package name */
    public final g f15228k;

    /* renamed from: l  reason: collision with root package name */
    public final String f15229l;

    /* renamed from: m  reason: collision with root package name */
    public final String f15230m;

    /* renamed from: n  reason: collision with root package name */
    public final String f15231n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(P p10, xd.f fVar, g gVar) {
        super(new k(y.W0(Fe.c.a(r2)), null, null, new C3556A()));
        C1425j c1425j = C1425j.f17681i;
        String str = (String) p10.b("encodedSandboxUrl");
        if (str != null) {
            this.f15227j = fVar;
            this.f15228k = gVar;
            String str2 = (String) p10.b(ParameterNames.ID);
            if (str2 != null) {
                this.f15229l = str2;
                String str3 = (String) p10.b("encodedSandboxUrl");
                if (str3 != null) {
                    this.f15230m = Fe.c.a(str3);
                    String str4 = (String) p10.b("messageId");
                    if (str4 != null) {
                        this.f15231n = str4;
                        h(new m(this, null));
                        return;
                    }
                    throw new IllegalStateException("No message id provided".toString());
                }
                throw new IllegalStateException("No sandbox url provided".toString());
            }
            throw new IllegalStateException("No conversation id provided".toString());
        }
        throw new IllegalStateException("No sandbox url provided".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(o oVar, q0 q0Var, AbstractC4825e abstractC4825e) {
        n nVar;
        int i10;
        oVar.getClass();
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i11 = nVar.f15226i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f15226i0 = i11 - Integer.MIN_VALUE;
                Object obj = nVar.f15224Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = nVar.f15226i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        oVar = nVar.f15223Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (!(q0Var.f48450a instanceof CancellationException)) {
                        nVar.f15223Y = oVar;
                        nVar.f15226i0 = 1;
                        if (((C5476z) oVar.f15227j).a(q0Var, nVar) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                }
                oVar.g(Ad.o.f825a);
                return jf.y.f36177a;
            }
        }
        nVar = new n(oVar, abstractC4825e);
        Object obj2 = nVar.f15224Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = nVar.f15226i0;
        if (i10 == 0) {
        }
        oVar.g(Ad.o.f825a);
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        Object value;
        ArrayList arrayList;
        d dVar = (d) iVar;
        AbstractC3557B.c0("intent", dVar);
        if (dVar instanceof c) {
            C3556A c3556a = ((c) dVar).f15189a;
            g gVar = this.f15228k;
            String str = this.f15229l;
            String str2 = this.f15231n;
            String str3 = this.f15230m;
            gVar.getClass();
            AbstractC3557B.c0("conversationId", str);
            AbstractC3557B.c0("messageId", str2);
            AbstractC3557B.c0("sandboxUrl", str3);
            AbstractC3557B.c0("selectionState", c3556a);
            gVar.f15203f = new C3959i(new t(str, str2, str3), c3556a);
            String m22 = kf.t.m2(kf.q.h3(new String[]{gVar.d(R.plurals.selected_row, c3556a.f33076b.size()), gVar.d(R.plurals.selected_column, c3556a.f33075a.size()), gVar.d(R.plurals.selected_cell, c3556a.f33077c.size())}), ", ", null, null, null, 62);
            Aa.j jVar = gVar.f15201d;
            C1425j c1425j = C1425j.f17681i;
            Aa.e eVar = new Aa.e(str2, m22, C1425j.o1(str, str2, str3), AbstractC4344b.G0(new q(str, str2, str3), new r(str, str2, str3)));
            C5870a c5870a = (C5870a) jVar;
            synchronized (c5870a) {
                F0 f02 = c5870a.f46506b;
                do {
                    value = f02.getValue();
                    List list = (List) value;
                    arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    boolean z10 = false;
                    for (Object obj : list) {
                        Aa.f fVar = (Aa.f) obj;
                        AbstractC3557B.c0("a", fVar);
                        if (AbstractC3557B.K(((Aa.e) fVar).f735a, eVar.f735a)) {
                            z10 = true;
                            obj = eVar;
                        }
                        arrayList.add(obj);
                    }
                    if (!z10) {
                        arrayList = kf.t.x2(eVar, arrayList);
                    }
                } while (!f02.e(value, arrayList));
            }
            l(new C6383b(23, c3556a));
        }
    }
}
