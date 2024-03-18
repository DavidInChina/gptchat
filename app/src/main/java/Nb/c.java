package nb;

import Ad.l;
import Ng.F;
import Ng.Q;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.InputStream;
import java.net.URL;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f40167Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f40168Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f40169h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g f40170i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f40171j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, g gVar, boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f40168Z = str;
        this.f40169h0 = str2;
        this.f40170i0 = gVar;
        this.f40171j0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new c(this.f40168Z, this.f40169h0, this.f40170i0, this.f40171j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40167Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            String v22 = Lg.n.v2("file-service://", this.f40168Z);
            EnumC4806a[] enumC4806aArr = EnumC4806a.f40164Y;
            String concat = v22.concat(".webp");
            InputStream openStream = new URL(this.f40169h0).openStream();
            try {
                AbstractC3557B.Z(openStream);
                byte[] n22 = AbstractC3557B.n2(openStream);
                l.S(openStream, null);
                C4807b c4807b = new C4807b(0, n22);
                this.f40167Y = 1;
                g gVar = this.f40170i0;
                gVar.f40184b.getClass();
                obj = l.n1(this, Q.f12906c, new f(gVar, concat, null, c4807b, this.f40171j0));
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } finally {
            }
        }
        return obj;
    }
}
