package dh;

import bh.C2211a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class U extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28421Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ KSerializer f28422Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ KSerializer f28423h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(KSerializer kSerializer, KSerializer kSerializer2, int i10) {
        super(1);
        this.f28421Y = i10;
        this.f28422Z = kSerializer;
        this.f28423h0 = kSerializer2;
    }

    public final void a(C2211a c2211a) {
        kf.v vVar = kf.v.f37483Y;
        int i10 = this.f28421Y;
        KSerializer kSerializer = this.f28423h0;
        KSerializer kSerializer2 = this.f28422Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$buildSerialDescriptor", c2211a);
                c2211a.a(SubscriberAttributeKt.JSON_NAME_KEY, kSerializer2.getDescriptor(), vVar, false);
                c2211a.a("value", kSerializer.getDescriptor(), vVar, false);
                return;
            default:
                AbstractC3557B.c0("$this$buildClassSerialDescriptor", c2211a);
                c2211a.a("first", kSerializer2.getDescriptor(), vVar, false);
                c2211a.a("second", kSerializer.getDescriptor(), vVar, false);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f28421Y) {
            case 0:
                a((C2211a) obj);
                return yVar;
            default:
                a((C2211a) obj);
                return yVar;
        }
    }
}
