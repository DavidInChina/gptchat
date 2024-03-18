package Ce;

import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.C1209l;
import io.ktor.utils.io.x;
import java.nio.charset.Charset;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class d implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3086Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f3087Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Charset f3088h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Je.a f3089i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ x f3090j0;

    public /* synthetic */ d(C1209l c1209l, Charset charset, Je.a aVar, x xVar, int i10) {
        this.f3086Y = i10;
        this.f3087Z = c1209l;
        this.f3088h0 = charset;
        this.f3089i0 = aVar;
        this.f3090j0 = xVar;
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f3086Y;
        AbstractC1206i abstractC1206i = this.f3087Z;
        switch (i10) {
            case 0:
                Object b10 = abstractC1206i.b(new c(abstractC1207j, this.f3088h0, this.f3089i0, this.f3090j0, 0), abstractC4825e);
                if (b10 == EnumC5000a.f41328Y) {
                    return b10;
                }
                return yVar;
            default:
                Object b11 = abstractC1206i.b(new c(abstractC1207j, this.f3088h0, this.f3089i0, this.f3090j0, 1), abstractC4825e);
                if (b11 == EnumC5000a.f41328Y) {
                    return b11;
                }
                return yVar;
        }
    }
}
