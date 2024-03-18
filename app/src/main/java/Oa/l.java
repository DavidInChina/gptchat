package oa;

import Qg.AbstractC1206i;
import Qg.C1209l;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6171F;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f41125Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4972C f41126Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f41127h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f41128i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ List f41129j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ String f41130k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ boolean f41131l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ L9.E f41132m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ String f41133n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ String f41134o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ List f41135p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f41136q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ String f41137r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C4972C c4972c, String str, String str2, List list, String str3, boolean z10, L9.E e10, String str4, String str5, List list2, kotlin.jvm.internal.x xVar, String str6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f41126Z = c4972c;
        this.f41127h0 = str;
        this.f41128i0 = str2;
        this.f41129j0 = list;
        this.f41130k0 = str3;
        this.f41131l0 = z10;
        this.f41132m0 = e10;
        this.f41133n0 = str4;
        this.f41134o0 = str5;
        this.f41135p0 = list2;
        this.f41136q0 = xVar;
        this.f41137r0 = str6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new l(this.f41126Z, this.f41127h0, this.f41128i0, this.f41129j0, this.f41130k0, this.f41131l0, this.f41132m0, this.f41133n0, this.f41134o0, this.f41135p0, this.f41136q0, this.f41137r0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C6171F c6171f;
        AbstractC1206i abstractC1206i;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f41125Y;
        C4972C c4972c = this.f41126Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C4975F c4975f = c4972c.f41048c;
            kotlin.jvm.internal.x xVar = this.f41136q0;
            d9.h hVar = new d9.h(9, xVar);
            c4975f.getClass();
            String str = this.f41128i0;
            AbstractC3557B.c0("parentMessageId", str);
            List<C2969F> list = this.f41129j0;
            AbstractC3557B.c0("messages", list);
            String str2 = this.f41130k0;
            AbstractC3557B.c0("model", str2);
            L9.E e10 = this.f41132m0;
            AbstractC3557B.c0("action", e10);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
            for (C2969F c2969f : list) {
                arrayList.add(Ad.l.h1(c2969f));
            }
            String str3 = this.f41134o0;
            if (str3 != null) {
                c6171f = new C6171F(str3);
            } else {
                c6171f = null;
            }
            String str4 = this.f41133n0;
            List list2 = this.f41135p0;
            String str5 = this.f41127h0;
            L9.B b10 = new L9.B(str5, e10, str, arrayList, str2, this.f41131l0, str4, c6171f, list2);
            if (((com.openai.experiment.G) c4975f.f41083c).c(ExperimentKey.ConversationTokensEnabled.INSTANCE)) {
                abstractC1206i = new C1209l(new C4974E(c4975f, str5, str, b10, hVar, null));
            } else {
                abstractC1206i = c4975f.f41081a.b(b10, null, hVar);
            }
            y.F f6 = new y.F(c4972c, this.f41137r0, xVar, 1);
            this.f41125Y = 1;
            if (abstractC1206i.b(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        if (!(c4972c.f41059n.getValue() instanceof T9.f)) {
            c4972c.f41059n.setValue(T9.i.f16976a);
        }
        c4972c.f41062q = null;
        return jf.y.f36177a;
    }
}
