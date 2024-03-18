package cg;

import L0.v;
import id.AbstractC3557B;
import jf.y;
import sg.EnumC5626c;

/* renamed from: cg.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2417h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26634Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f26635Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2417h(String str, int i10) {
        super(1);
        this.f26634Y = i10;
        this.f26635Z = str;
    }

    public final String a(String str) {
        int i10 = this.f26634Y;
        String str2 = this.f26635Z;
        switch (i10) {
            case 4:
                AbstractC3557B.c0("line", str);
                return str2 + str;
            default:
                AbstractC3557B.c0("it", str);
                if (Lg.n.n2(str)) {
                    if (str.length() < str2.length()) {
                        return str2;
                    }
                    return str;
                }
                return android.gov.nist.core.a.g(str2, str);
        }
    }

    public final void c(C2424o c2424o) {
        int i10 = this.f26634Y;
        String str = this.f26635Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$function", c2424o);
                c2424o.a(str, AbstractC2418i.f26637b, AbstractC2418i.f26638c);
                return;
            case 1:
                AbstractC3557B.c0("$this$function", c2424o);
                c2424o.b(str, AbstractC2418i.f26636a);
                return;
            case 2:
                AbstractC3557B.c0("$this$function", c2424o);
                c2424o.a(str, AbstractC2418i.f26637b);
                c2424o.c(EnumC5626c.BOOLEAN);
                return;
            default:
                AbstractC3557B.c0("$this$function", c2424o);
                C2412c c2412c = AbstractC2418i.f26637b;
                c2424o.a(str, c2412c);
                c2424o.a(str, c2412c);
                c2424o.c(EnumC5626c.BOOLEAN);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f26634Y) {
            case 0:
                c((C2424o) obj);
                return yVar;
            case 1:
                c((C2424o) obj);
                return yVar;
            case 2:
                c((C2424o) obj);
                return yVar;
            case 3:
                c((C2424o) obj);
                return yVar;
            case 4:
                return a((String) obj);
            case 5:
                return a((String) obj);
            default:
                v vVar = (v) obj;
                AbstractC3557B.c0("$this$semantics", vVar);
                L0.t.d(vVar, this.f26635Z);
                L0.t.e(vVar, 5);
                return yVar;
        }
    }
}
