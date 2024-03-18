package De;

import L.C0878y;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.C1209l;
import java.nio.charset.Charset;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import xe.C6417f;

/* loaded from: classes.dex */
public final class f implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f3602Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6417f f3603Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Charset f3604h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Je.a f3605i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f3606j0;

    public f(C1209l c1209l, C6417f c6417f, Charset charset, Je.a aVar, Object obj) {
        this.f3602Y = c1209l;
        this.f3603Z = c6417f;
        this.f3604h0 = charset;
        this.f3605i0 = aVar;
        this.f3606j0 = obj;
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        Object b10 = this.f3602Y.b(new C0878y(abstractC1207j, this.f3603Z, this.f3604h0, this.f3605i0, this.f3606j0, 1), abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return y.f36177a;
    }
}
