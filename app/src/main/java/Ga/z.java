package Ga;

import Df.AbstractC0405d;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import eh.AbstractC2911k;
import id.AbstractC3557B;
import te.C5760d;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6256Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5760d f6257Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(C5760d c5760d, int i10) {
        super(2);
        this.f6256Y = i10;
        this.f6257Z = c5760d;
    }

    public final void a(String str, kotlinx.serialization.json.b bVar) {
        int i10 = this.f6256Y;
        C5760d c5760d = this.f6257Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                AbstractC3557B.c0("jsonElement", bVar);
                if (bVar instanceof kotlinx.serialization.json.d) {
                    R4.b.L1(c5760d, str, AbstractC2911k.e((kotlinx.serialization.json.d) bVar));
                    return;
                }
                AbstractC0405d b10 = kotlin.jvm.internal.C.f37623a.b(bVar.getClass());
                throw new IllegalArgumentException(("Not implemented for non-primitive type " + b10).toString());
            case 1:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                AbstractC3557B.c0("jsonElement", bVar);
                if (bVar instanceof kotlinx.serialization.json.d) {
                    R4.b.L1(c5760d, str, AbstractC2911k.e((kotlinx.serialization.json.d) bVar));
                    return;
                }
                AbstractC0405d b11 = kotlin.jvm.internal.C.f37623a.b(bVar.getClass());
                throw new IllegalArgumentException(("Not implemented for non-primitive type " + b11).toString());
            default:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                AbstractC3557B.c0("jsonElement", bVar);
                if (bVar instanceof kotlinx.serialization.json.d) {
                    R4.b.L1(c5760d, str, AbstractC2911k.e((kotlinx.serialization.json.d) bVar));
                    return;
                }
                AbstractC0405d b12 = kotlin.jvm.internal.C.f37623a.b(bVar.getClass());
                throw new IllegalArgumentException(("Not implemented for non-primitive type " + b12).toString());
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f6256Y) {
            case 0:
                a((String) obj, (kotlinx.serialization.json.b) obj2);
                return yVar;
            case 1:
                a((String) obj, (kotlinx.serialization.json.b) obj2);
                return yVar;
            default:
                a((String) obj, (kotlinx.serialization.json.b) obj2);
                return yVar;
        }
    }
}
