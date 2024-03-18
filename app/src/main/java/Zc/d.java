package Zc;

import De.i;
import Df.H;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.o;
import me.M;
import oe.C4993b;
import oe.C4994c;
import oe.C4995d;
import qe.C5316h;
import qe.q;
import wf.k;
import xe.AbstractC6414c;
import xe.AbstractC6418g;
import xe.AbstractC6435x;
import xe.C6417f;

/* loaded from: classes2.dex */
public final class d extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f23673Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f23674h0 = new d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final d f23675i0 = new d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final d f23676j0 = new d(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23677Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f23677Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC6418g abstractC6418g;
        y yVar = y.f36177a;
        switch (this.f23677Y) {
            case 0:
                C4995d c4995d = (C4995d) obj;
                AbstractC3557B.c0("$this$install", c4995d);
                C6417f c6417f = AbstractC6414c.f49880a;
                i iVar = new i(md.b.f39132a);
                AbstractC3557B.c0("contentType", c6417f);
                if (AbstractC3557B.K(c6417f, c6417f)) {
                    abstractC6418g = oe.k.f41327a;
                } else {
                    abstractC6418g = new C4994c(c6417f);
                }
                c4995d.f41305b.add(new C4993b(iVar, c6417f, abstractC6418g));
                return yVar;
            case 1:
                String str = (String) obj;
                AbstractC3557B.c0("header", str);
                List list = AbstractC6435x.f49956a;
                return Boolean.valueOf(AbstractC3557B.K(str, SIPHeaderNames.AUTHORIZATION));
            case 2:
                C5316h c5316h = (C5316h) obj;
                AbstractC3557B.c0("$this$install", c5316h);
                c5316h.f44095b.add(new q("***"));
                c5316h.f44096c = new Cf.h(1);
                return yVar;
            default:
                M m10 = (M) obj;
                AbstractC3557B.c0("$this$install", m10);
                Mg.a aVar = Mg.b.f12127Z;
                Long valueOf = Long.valueOf(Mg.b.e(H.x0(60, Mg.d.f12134i0)));
                M.a(valueOf);
                m10.f39177c = valueOf;
                return yVar;
        }
    }
}
