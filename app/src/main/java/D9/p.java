package d9;

import android.gov.nist.core.Separators;
import cg.AbstractC2418i;
import cg.C2412c;
import cg.C2424o;
import id.AbstractC3557B;
import jf.y;
import s3.C5538A;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28163Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f28164Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f28165h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, String str, String str2) {
        super(1);
        this.f28163Y = i10;
        this.f28164Z = str;
        this.f28165h0 = str2;
    }

    public final void a(C2424o c2424o) {
        int i10 = this.f28163Y;
        String str = this.f28165h0;
        String str2 = this.f28164Z;
        switch (i10) {
            case 1:
                AbstractC3557B.c0("$this$function", c2424o);
                C2412c c2412c = AbstractC2418i.f26637b;
                c2424o.a(str2, c2412c);
                C2412c c2412c2 = AbstractC2418i.f26636a;
                c2424o.a(str, c2412c, c2412c, c2412c2, c2412c2);
                c2424o.b(str2, c2412c2);
                return;
            case 2:
                AbstractC3557B.c0("$this$function", c2424o);
                C2412c c2412c3 = AbstractC2418i.f26637b;
                c2424o.a(str2, c2412c3);
                c2424o.a(str, c2412c3, c2412c3, c2412c3);
                c2424o.b(str2, c2412c3);
                return;
            case 3:
                AbstractC3557B.c0("$this$function", c2424o);
                C2412c c2412c4 = AbstractC2418i.f26637b;
                c2424o.a(str2, c2412c4);
                C2412c c2412c5 = AbstractC2418i.f26636a;
                c2424o.a(str, c2412c4, c2412c4, AbstractC2418i.f26638c, c2412c5);
                c2424o.b(str2, c2412c5);
                return;
            case 4:
                AbstractC3557B.c0("$this$function", c2424o);
                C2412c c2412c6 = AbstractC2418i.f26637b;
                c2424o.a(str2, c2412c6);
                C2412c c2412c7 = AbstractC2418i.f26638c;
                c2424o.a(str2, c2412c7);
                C2412c c2412c8 = AbstractC2418i.f26636a;
                c2424o.a(str, c2412c6, c2412c7, c2412c7, c2412c8);
                c2424o.b(str2, c2412c8);
                return;
            case 5:
                AbstractC3557B.c0("$this$function", c2424o);
                C2412c c2412c9 = AbstractC2418i.f26638c;
                c2424o.a(str2, c2412c9);
                c2424o.b(str, AbstractC2418i.f26637b, c2412c9);
                return;
            default:
                AbstractC3557B.c0("$this$function", c2424o);
                c2424o.a(str2, AbstractC2418i.f26636a);
                c2424o.b(str, AbstractC2418i.f26637b, AbstractC2418i.f26638c);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f28163Y) {
            case 0:
                C5538A c5538a = (C5538A) obj;
                AbstractC3557B.c0("$this$navDeepLink", c5538a);
                c5538a.f45207b = "https://" + this.f28164Z + Separators.SLASH + this.f28165h0;
                return yVar;
            case 1:
                a((C2424o) obj);
                return yVar;
            case 2:
                a((C2424o) obj);
                return yVar;
            case 3:
                a((C2424o) obj);
                return yVar;
            case 4:
                a((C2424o) obj);
                return yVar;
            case 5:
                a((C2424o) obj);
                return yVar;
            default:
                a((C2424o) obj);
                return yVar;
        }
    }
}
