package rb;

import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3959i;
import wd.C6182c0;
import yf.AbstractC6583a;

/* renamed from: rb.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5415e extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5415e f44676Z = new C5415e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5415e f44677h0 = new C5415e(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44678Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5415e(int i10) {
        super(1);
        this.f44678Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        String str;
        switch (this.f44678Y) {
            case 0:
                C3959i c3959i = (C3959i) obj;
                AbstractC3557B.c0("it", c3959i);
                C2969F c2969f = (C2969F) c3959i.f36156Z;
                if (c2969f != null) {
                    str = c2969f.f30008a;
                } else {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                return new C6182c0(str);
            default:
                List<C2969F> list = (List) obj;
                AbstractC3557B.c0("messages", list);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                for (C2969F c2969f2 : list) {
                    arrayList.add(new C6182c0(c2969f2.f30008a));
                }
                return kf.t.P2(arrayList);
        }
    }
}
