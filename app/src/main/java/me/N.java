package me;

import Ng.AbstractC1073l0;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import xe.C6405J;

/* loaded from: classes2.dex */
public final class N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39178Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Long f39179Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5760d f39180h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1073l0 f39181i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Long l10, C5760d c5760d, AbstractC1073l0 abstractC1073l0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39179Z = l10;
        this.f39180h0 = c5760d;
        this.f39181i0 = abstractC1073l0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new N(this.f39179Z, this.f39180h0, this.f39181i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39178Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            long longValue = this.f39179Z.longValue();
            this.f39178Y = 1;
            if (R4.b.p0(longValue, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        C5760d c5760d = this.f39180h0;
        AbstractC3557B.c0("request", c5760d);
        C6405J c6405j = c5760d.f46125a;
        c6405j.a();
        StringBuilder sb2 = new StringBuilder(256);
        P4.a.i(c6405j, sb2);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("appendTo(StringBuilder(256)).toString()", sb3);
        O o10 = P.f39182d;
        Map map = (Map) c5760d.f46130f.d(je.f.f36131a);
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get(o10);
        } else {
            obj2 = null;
        }
        M m10 = (M) obj2;
        if (m10 != null) {
            obj3 = m10.f39175a;
        }
        StringBuilder s10 = android.gov.nist.core.a.s("Request timeout has expired [url=", sb3, ", request_timeout=");
        if (obj3 == null) {
            obj3 = "unknown";
        }
        s10.append(obj3);
        s10.append(" ms]");
        IOException iOException = new IOException(s10.toString());
        Q.f39187a.c("Request timeout: " + c6405j);
        String message = iOException.getMessage();
        AbstractC3557B.Z(message);
        this.f39181i0.k(A7.b.g(message, iOException));
        return jf.y.f36177a;
    }
}
