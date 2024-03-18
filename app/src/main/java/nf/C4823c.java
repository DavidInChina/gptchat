package nf;

import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.n;

/* renamed from: nf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4823c extends o implements n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4823c f40312Z = new C4823c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4823c f40313h0 = new C4823c(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40314Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4823c(int i10) {
        super(2);
        this.f40314Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        C4824d c4824d;
        switch (this.f40314Y) {
            case 0:
                String str = (String) obj;
                AbstractC4829i abstractC4829i = (AbstractC4829i) obj2;
                AbstractC3557B.c0("acc", str);
                AbstractC3557B.c0("element", abstractC4829i);
                if (str.length() == 0) {
                    return abstractC4829i.toString();
                }
                return str + ", " + abstractC4829i;
            default:
                AbstractC4831k abstractC4831k = (AbstractC4831k) obj;
                AbstractC4829i abstractC4829i2 = (AbstractC4829i) obj2;
                AbstractC3557B.c0("acc", abstractC4831k);
                AbstractC3557B.c0("element", abstractC4829i2);
                AbstractC4831k minusKey = abstractC4831k.minusKey(abstractC4829i2.getKey());
                C4832l c4832l = C4832l.f40334Y;
                if (minusKey != c4832l) {
                    C4826f c4826f = C4826f.f40317Y;
                    AbstractC4827g abstractC4827g = (AbstractC4827g) minusKey.get(c4826f);
                    if (abstractC4827g == null) {
                        c4824d = new C4824d(abstractC4829i2, minusKey);
                    } else {
                        AbstractC4831k minusKey2 = minusKey.minusKey(c4826f);
                        if (minusKey2 == c4832l) {
                            return new C4824d(abstractC4827g, abstractC4829i2);
                        }
                        c4824d = new C4824d(abstractC4827g, new C4824d(abstractC4829i2, minusKey2));
                    }
                    return c4824d;
                }
                return abstractC4829i2;
        }
    }
}
