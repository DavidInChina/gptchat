package Gc;

import Ec.o;
import Me.h;
import Ra.l;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ue.C5906a;
import ue.g;
import ve.C6043l;
import wf.n;
import xe.AbstractC6430s;
import xe.AbstractC6435x;
import xe.C6396A;
import xe.C6433v;
import ze.C6849h;
import ze.C6850i;

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6260Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6261Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ o f6262h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ File f6263i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, File file, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6262h0 = oVar;
        this.f6263i0 = file;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        a aVar = new a(this.f6262h0, this.f6263i0, abstractC4825e);
        aVar.f6261Z = obj;
        return aVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6260Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f6261Z;
            l lVar = new l(this.f6262h0, 29, this.f6263i0);
            C5906a c5906a = new C5906a();
            lVar.invoke(c5906a);
            ArrayList arrayList = c5906a.f46713a;
            ue.e[] eVarArr = (ue.e[]) arrayList.toArray(new ue.e[0]);
            ue.e[] eVarArr2 = (ue.e[]) Arrays.copyOf(eVarArr, eVarArr.length);
            AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, eVarArr2);
            ArrayList arrayList2 = new ArrayList();
            for (ue.e eVar : eVarArr2) {
                String str = eVar.f46724a;
                C6433v c6433v = new C6433v();
                List list = AbstractC6435x.f49956a;
                Set set = AbstractC6430s.f49952a;
                AbstractC3557B.c0("<this>", str);
                if (AbstractC6430s.a(str)) {
                    str = AbstractC6430s.b(str);
                }
                c6433v.f(SIPHeaderNames.CONTENT_DISPOSITION, "form-data; name=".concat(str));
                c6433v.g(eVar.f46726c);
                Object obj3 = eVar.f46725b;
                if (obj3 instanceof String) {
                    obj2 = new C6850i((String) obj3, ue.d.f46720Y, c6433v.n());
                } else if (obj3 instanceof Number) {
                    obj2 = new C6850i(obj3.toString(), ue.d.f46721Z, c6433v.n());
                } else if (obj3 instanceof Boolean) {
                    obj2 = new C6850i(obj3.toString(), ue.d.f46722h0, c6433v.n());
                } else if (obj3 instanceof byte[]) {
                    c6433v.f(SIPHeaderNames.CONTENT_LENGTH, String.valueOf(((byte[]) obj3).length));
                    obj2 = new C6849h(new R5.c(9, obj3), ue.d.f46723i0, c6433v.n());
                } else if (obj3 instanceof Me.d) {
                    c6433v.f(SIPHeaderNames.CONTENT_LENGTH, String.valueOf(((Me.d) obj3).m()));
                    obj2 = new C6849h(new R5.c(10, obj3), new R5.c(11, obj3), c6433v.n());
                } else if (obj3 instanceof h) {
                    throw new IllegalStateException(("Can't use [Input] as part of form: " + obj3 + ". Consider using [InputProvider] instead.").toString());
                } else {
                    throw new IllegalStateException(("Unknown form content type: " + obj3).toString());
                }
                arrayList2.add(obj2);
            }
            C5760d c5760d = new C5760d();
            c5760d.c(C6396A.f49812c);
            c5760d.f46128d = new g(arrayList2);
            c5760d.b(null);
            P4.a.Q0(c5760d, "transcribe");
            C6043l c6043l = new C6043l(c5760d, dVar);
            this.f6260Y = 1;
            obj = c6043l.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
