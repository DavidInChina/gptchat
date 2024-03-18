package W5;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.y;
import kf.x;
import kotlin.jvm.internal.o;
import q5.C5271a;
import q5.C5274d;
import q5.g;
import t5.AbstractC5676b;
import wf.n;

/* loaded from: classes.dex */
public final class b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ c f20737Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f20738Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Map f20739h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Long f20740i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f20741j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ g f20742k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C5274d f20743l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, LinkedHashMap linkedHashMap, Long l10, String str2, g gVar, C5274d c5274d) {
        super(2);
        this.f20737Y = cVar;
        this.f20738Z = str;
        this.f20739h0 = linkedHashMap;
        this.f20740i0 = l10;
        this.f20741j0 = str2;
        this.f20742k0 = gVar;
        this.f20743l0 = c5274d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        C5271a c5271a = (C5271a) obj;
        AbstractC5676b abstractC5676b = (AbstractC5676b) obj2;
        AbstractC3557B.c0("datadogContext", c5271a);
        AbstractC3557B.c0("eventBatchWriter", abstractC5676b);
        c cVar = this.f20737Y;
        X5.a aVar = cVar.f20749f;
        String name = Thread.currentThread().getName();
        x xVar = x.f37485Y;
        long longValue = this.f20740i0.longValue();
        AbstractC3557B.b0("name", name);
        cVar.f20746c.e(abstractC5676b, P4.a.M(aVar, 9, this.f20738Z, null, this.f20739h0, xVar, longValue, name, c5271a, true, this.f20741j0, false, false, this.f20742k0, this.f20743l0, 16384));
        return y.f36177a;
    }
}
